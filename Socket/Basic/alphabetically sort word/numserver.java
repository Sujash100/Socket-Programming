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
		numserver ob=new numserver();
for(int i=0;i<=word.length - 1;i++)
{
for(int j=0;j<=word.length-2;j++)
{
if(word[i].compareTo(word[j])<0)
{
str=word[i];
word[i]=word[j];
word[j]=str;
}
}
}
for(int i=0;i<=word.length - 1;i++)
{
str2+=word[i]+" ";
}

		bw.write(str2);
		bw.newLine();
		bw.flush();

	
}		
	
}