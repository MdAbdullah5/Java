// jdbc InsertRec.java
import java.sql.*; 
import java.util.*;
class InsertRec
{ 
 public static void main(String [] args) throws Exception 
{ 
Class.forName("oracle.jdbc.driver.OracleDriver");// step1  
 System.out.println("Driver loaded..."); 
 Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system"); //step2
 System.out.println("Connection is established..."); 
 String sql="INSERT INTO student VALUES(150,'bvrao','IT')"; // step3
 Statement st=con.createStatement(); 
 int n=st.executeUpdate(sql); //step4
 System.out.println(n+ "row(s) created"); 
 st.close(); // close step5
 con.close(); //close step5
 System.out.println("connection is closed"); 
} 
}
