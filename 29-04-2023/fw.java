import java.io.*;
class fw {
	public static void main(String[] args)
		throws IOException
	{
		String str = "Hello Universe!";
		FileWriter op = new FileWriter("/home/student/file.txt");
		op.write(str);
		System.out.println("Successfully written");
		op.close();
	}
}
