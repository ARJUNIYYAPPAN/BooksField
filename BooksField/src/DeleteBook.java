import java.sql.*;
public class DeleteBook {
	public static void delete() throws Exception {
		String url = "jdbc:mysql://127.0.0.1:3306/booksfield";
		String username = "root";
		String password = "2003";
		String Query = "delete from data where book_id=";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst = con.prepareStatement(Query);
		pst.executeUpdate();
		con.close();
		System.out.println("Data Deleted");
		
	}
	public static void main(String[] args) throws Exception {
		delete();
		
	}

}
