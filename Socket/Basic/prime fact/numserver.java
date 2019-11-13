import java.io.*;
import java.net.*;

class numserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

                String str=brr.readLine();
		String str1="";
		int n=Integer.parseInt(str);
		numserver ob=new numserver();
		int i=2;
		while(n>1)
		{
		if((n%i)==0)
		{
		int k=ob.prime(i);
		if(k==0)
		{	
		str1=str1+i+" ";
		n=n/i;
		i--;
		}
		}
		i++;
		}
		bw.write(str1);
		bw.newLine();
		bw.flush();
		
		}

int prime(int n)
{
int k=0;
for(int i=2;i<n;i++)
{
if((n%i)==0)
{
k=1;
break;
}
}
return k;
}

}