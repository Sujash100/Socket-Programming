import java.io.*;
import java.net.*;

class magicclient
{
	public static void main(String ars[])throws Exception
	{
	      Socket s=new Socket("localhost",12233);
	      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	      BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
	      BufferedReader brr=new BufferedReader(new InputStreamReader(s.getInputStream()));
              
	      System.out.println("Enter a number");
	      String str=br.readLine();
	        bw.write(str);
	        bw.newLine();
		bw.flush();
		System.out.println(brr.readLine());
		br.close();
		bw.close();
		brr.close();
		s.close();
}

}
		