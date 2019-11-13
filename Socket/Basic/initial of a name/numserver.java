import java.io.*;
import java.net.*;
import java.sql.*;

class numserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(11234);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));


		String statement=(brr.readLine());
String word[]=statement.split(" ");
		String str="";
		String str2="";
		String str3="";

for(int j=0;j<=word.length-2;j++)
{
str=word[j];
str3+=" "+str.charAt(0)+".";
}

str2=str3+" "+word[word.length-1];

		bw.write(str2);
		bw.newLine();
		bw.flush();

	
}		
	
}