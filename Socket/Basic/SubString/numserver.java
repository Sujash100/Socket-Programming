import java.io.*;
import java.net.*;

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
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Message from Client ");
                String str1=brr.readLine();
		String str2=brr.readLine();
		String str3="";
		if(str1.contains(str2))
		str3="Substring";
		else
		str3="Not Substring";
		bw.write(str3);
		bw.newLine();
		bw.flush();

		
}
}