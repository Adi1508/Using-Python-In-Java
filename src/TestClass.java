import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TestClass {
	public static void main(String[] args) {
		try {
			Process p = Runtime.getRuntime().exec("python test.py");
			BufferedReader in = new BufferedReader(new InputStreamReader(
					p.getInputStream()));
			StringBuffer buf = new StringBuffer("");
			// for reading one line
			String line = null;
			System.out.println(p);
			// keep reading till readLine returns null
			while ((line = in.readLine()) != null) {
				// keep appending last line read to buffer
				System.out.println(line);
				buf.append(line);
			}
			System.out.println(buf.length());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
