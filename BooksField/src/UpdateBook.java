import java.sql.*;
public class UpdateBook {
	public static void update() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/booksfield";
		String username = "root";
		String password = "2003";
		String Query = "update data set book_title='Mahabharatham' where book_id=2014";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		System.out.println("Data Updated");
		
	}
	
	public static void main(String[] args) throws Exception {
		update();
		
	}

}
