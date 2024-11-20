 import java.sql.*;
public class GetBook {
	public static void get() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/booksfield";
		String username = "root";
		String password = "2003";
		String Query = "select * from data";
		Connection con = DriverManager.getConnection(url, username, password);
		Statement smt = con.createStatement();
		ResultSet rs = smt.executeQuery(Query);
		
		while(rs.next()) {
			System.out.println("id :"+ rs.getInt(1));
			System.out.println("title :"+ rs.getString(2));
			System.out.println("author :"+ rs.getString(3));
			System.out.println("ISBN :"+ rs.getLong(4));
			System.out.println("genre :"+ rs.getString(5));
			System.out.println("publisher :"+ rs.getString(6));
			System.out.println("publicationDate :"+ rs.getDate(7));
			System.out.println("price :"+ rs.getInt(8));
			System.out.println("quantity :"+ rs.getInt(9));
			System.out.println("language :"+ rs.getString(10));
			System.out.println("pagecount :"+ rs.getInt(11));
			System.out.println("format :"+ rs.getString(12));
			System.out.println("description :"+ rs.getString(13));
			System.out.println("coverimage :"+ rs.getString(14));
			System.out.println();
			
		}
		con.close();
		System.out.println("Data Get");
	}
	public static void main(String[] args) throws Exception {
		get();
	}

}
