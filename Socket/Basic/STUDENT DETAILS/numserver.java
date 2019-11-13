import java.io.*;
import java.net.*;
import java.sql.*;

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


		String roll=(brr.readLine());
		String name=(brr.readLine());
		String pno=(brr.readLine());
		String cname=(brr.readLine());


	Connection con=null;
	String str="";
	try{
	Class.forName("oracle.jdbc.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","scott","tiger");
	PreparedStatement pst=con.prepareStatement("insert into student_detail values(?,?,?,?)");
	pst.setString(1,roll);
	pst.setString(2,name);
	pst.setString(3,pno);
	pst.setString(4,cname);
        int t=pst.executeUpdate();
	if(t>0)
	str="Inserted Successfully";
	con.close();
	}
	catch(Exception e){}
		

                bw.write(str);
		bw.newLine();
		bw.flush();

		
	}
}