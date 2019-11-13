import java.io.*;
import java.net.*;

class palinserver
{
	public static void main(String ars[])throws Exception
	{
		ServerSocket s1=new ServerSocket(12233);
		System.out.println("Server wating for client .....");
		Socket s=s1.accept();
		
		System.out.println("Client accepted");
		BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
while(true)
{
		System.out.println("Message from Client ");
                String str=brr.readLine();
		int k=str.length();
		System.out.println(str);
		int left=0,right=k-1;int flag=1;
		while(left<=right)
		{
		if(str.charAt(left)!=(str.charAt(right)))
		{
		flag=0;
		break;
		}
		else
		{
		left++;right--;
		}
		}
		if(flag==1)
		str="....PALINDROME...";
		else
		str="..NOT PALINDROME";
		bw.write(str);
		bw.newLine();
		bw.flush();
}
		
	}
}