import java.io.*;
import java.net.*;

class numserver
{
	public static void main(String ars[])throws IOException
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client ...");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
		
		String str="";
		String str1=brr.readLine();
		int n=Integer.parseInt(str1);
		numserver ob= new numserver();
		int k=ob.krisnamurti(n);
		
		if(n==k)
		str="It is a Krishnamurti Number";
		else
		str="It is Not a Krishnamurti Number";
		bw.write(str);
		bw.newLine();
		bw.flush();
		System.out.println("Server stopped");
	}

int krisnamurti(int n)
{int s=0;
while(n>0)
{
s=s+fact(n%10);
n=n/10;
}
return s;
}

int fact(int d)
{
int k=1;
while(d>1)
{
k=k*d;
d--;
}
return k;
}

}