package com.gzu.taurus.goj.controller;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gzu.taurus.goj.bll.bo.problem.interfaces.SubmitBO;
import com.gzu.taurus.goj.common.enums.Submit.Verdict;
import com.gzu.taurus.goj.dal.dataobject.problem.SubmitDO;

@Service
public class Shell {
	@Autowired
	private SubmitBO submitBO;

	public static void main(String[] args) throws IOException, InterruptedException {
		String command = "/bin/sh /Users/tangjunkai/Desktop/a.sh";
		Process p = Runtime.getRuntime().exec(command);

		OutputStreamWriter w = new OutputStreamWriter(p.getOutputStream());
		BufferedWriter bw = new BufferedWriter(w);
		bw.write("hello world");
		bw.close();

		InputStreamReader r = new InputStreamReader(p.getInputStream());
		BufferedReader br = new BufferedReader(r);
		String line = null;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}

	public void judge(Long id) {
		String filePath = "/Users/tangjunkai/Desktop/SourceCode/" + id + ".cpp";
		String fileOutPath = "/Users/tangjunkai/Desktop/SourceCode/" + id + ".out";

		SubmitDO submitDB = submitBO.getSubmit(new SubmitDO(id));

		String code = submitDB.getSource_code();

		File f = new File(filePath);
		try {
			f.createNewFile();
			BufferedWriter bw = new BufferedWriter(new FileWriter(f));
			bw.write(code);
			bw.close();

			int cmdcode = Runtime.getRuntime().exec("g++ " + filePath).waitFor();

			if (cmdcode != 0) {
				submitBO.modifySubmitVerdict(id, Verdict.Compile_Error);
				return;
			}

			cmdcode = Runtime.getRuntime().exec("g++ " + filePath + " -o " + fileOutPath).waitFor();

			if (cmdcode != 0) {
				submitBO.modifySubmitVerdict(id, Verdict.Wrong_Answer);
			} else {
				submitBO.modifySubmitVerdict(id, Verdict.Accepted);
			}
			return;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}