import java.io.*;
import java.net.*;
import java.sql.*;

class numserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12234);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


		String fname=(brr.readLine());
		BufferedReader content=new BufferedReader(new FileReader(fname));
		String str="";
		while((str=content.readLine())!=null)
		{
                bw.write(str);
		bw.newLine();
		bw.flush();
		}
		bw.write("!@#$%END%$#@!");
		bw.newLine();
		bw.flush();
		
	}
}