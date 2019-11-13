import java.io.*;
import java.net.*;

class numclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",11234);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));

	        System.out.println("Enter Full Name:");
	        String str1=br.readLine();

	        bw.write(str1);
	        bw.newLine();
		bw.flush();

                System.out.println("Message From Server :");
		String str=brr.readLine();
		System.out.println(str);
             
br.close();
bw.close();
brr.close();
s.close();

}


}
		