import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Shell {

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
}