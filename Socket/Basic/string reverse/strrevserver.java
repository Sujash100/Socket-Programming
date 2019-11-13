import java.io.*;
import java.net.*;

class strrevserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));

		System.out.println("Message from Client ");
                String str=brr.readLine();
		String word[]=str.split(" ");
		String output="";
		strrevserver ob=new strrevserver();
for(int i=0;i<=word.length - 1;i++)
{
output+=ob.strrev(word[i])+" ";
}

		bw.write(output);
		bw.newLine();
		bw.flush();
}

String strrev(String str)
{
		char c1;
		String str2="";
		int k=str.length();
		System.out.println(str);
		int left=0,right=k-1;
		while(left<=right)
		{
		c1=(str.charAt(right));
		str2=str2+c1;
		right--;
		}
return str2;
	
}		
	
}