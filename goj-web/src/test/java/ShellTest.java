import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ShellTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		// String shpath = "/Users/tangjunkai/Desktop/a.sh"; // 程序路径
		//
		// Process process = null;
		//
		// String command1 = "chmod 777 " + shpath;
		// process = Runtime.getRuntime().exec(command1);
		// process.waitFor();
		//
		// String command2 = "/bin/sh " + shpath;
		// Runtime.getRuntime().exec(command2).waitFor();

		Process process = null;
		List<String> processList = new ArrayList<String>();
		try {
			process = Runtime.getRuntime().exec("ps -aux");
			BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
			String line = "";
			while ((line = input.readLine()) != null) {
				processList.add(line);
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		for (String line : processList) {
			System.out.println(line);
		}
	}
}
