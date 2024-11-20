import java.sql.*;
public class InsertBook {
	public static void insert() throws Exception {
		String url ="jdbc:mysql://127.0.0.1:3306/booksfield";
		String username ="root";
		String password ="2003";
		String Query ="insert into data values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Connection con = DriverManager.getConnection(url, username, password);
		PreparedStatement pst= con.prepareStatement(Query);
		pst.setInt(1,2014);
		pst.setString(2,"Mahabharat");
		pst.setString(3,"Vyasa");
		pst.setLong(4,9781612681140L);
		pst.setString(5,"Real Story");
		pst.setString(6,"TV");
		pst.setDate(7,java.sql.Date.valueOf("1990-04-10"));
		pst.setInt(8,1000);
		pst.setInt(9,400000);
		pst.setString(10,"Tamil");
		pst.setInt(11,1000);
		pst.setString(12,"paperback");
		pst.setString(13,"The Mahabharata is an ancient Indian epic where the main story revolves around two branches of a family - the Pandavas and Kauravas - who, in the Kurukshetra War, battle for the throne of Hastinapura. Interwoven into this narrative are several smaller stories about people dead or living, and philosophical discourses.");
		pst.setString(14, "\"C:\\Users\\Arjun\\OneDrive\\Pictures\\mahabharat.jpg\"");
		pst.executeUpdate();
		con.close();
		System.out.println("Data inserted");
	}
	public static void main(String[] args) throws Exception {
		insert();
		
	}
	
	

}
