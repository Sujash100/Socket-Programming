import java.io.*;
import java.net.*;

class strrevclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",12233);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
while(true)
{
	        System.out.println("Enter a String to check: ");
	        String str=br.readLine();
if(str.equals("bye"))
{
s.close();
break;
}
else
{
	        bw.write(str);
	        bw.newLine();
		bw.flush();
                System.out.println("Message From Server :");
                str=brr.readLine();
		System.out.println(str);

}
}

br.close();
bw.close();
brr.close();	
	}
}
		