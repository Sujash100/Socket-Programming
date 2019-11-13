import java.io.*;
import java.net.*;

class magicserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String str="";
		String str1=brr.readLine();
		System.out.println("Message from client: "+str1);
		int n=Integer.parseInt(str1);
		magicserver ob=new magicserver();
		int f=ob.magic(n);
		if(f==1)
		str="Magic";
		else
		str="Not Magic";
		bw.write(str);
		bw.newLine();
		bw.flush();
		System.out.println("Server stopped");
	}
int magic(int n)
{
while(n>9)
n=sum(n);
if(n==1)
return 1;
else
return 0;
}

int sum(int n)
{
int sum=0;
while(n>0)
{
sum=sum+(n%10);
n=n/10;
}
return sum;
}
}