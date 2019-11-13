import java.io.*;
import java.net.*;

class calclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",12233);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
                System.out.println("Press 1 for additin");
		System.out.println("Press 2 for Sub");
		System.out.println("Press 3 for Mult");
		System.out.println("Press 4 for Div");
		System.out.println("Enter your choice");
		int a=Integer.parseInt(br.readLine());
	        
	       	bw.write(String.valueOf(a));
	        bw.newLine();
		bw.flush();

		System.out.println("Enter first no:");
	        String str1=br.readLine();

		System.out.println("Enter second no:");
	        String str2=br.readLine();
		
	        bw.write(str1);
	        bw.newLine();
		bw.flush();
		bw.write(str2);
	        bw.newLine();
		bw.flush();
		System.out.println("Message From Server :");
		System.out.println("Result is: "+brr.readLine());
		br.close();
		bw.close();
		brr.close();
		s.close();

}

}
		