package project.dao;

<<<<<<< HEAD
public class ProjectDAO {
<<<<<<< HEAD
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDrivet");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
>>>>>>> branch 'master' of https://github.com/Jung0322/Project.git

public class ProjectDAO {
	
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	// 드라이브 연결
	public static Connection getConnection() {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "c##scott";
		String password = "tiger";
		
		Connection con = null;
		
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return con;
	}
	
	
	
	
>>>>>>> branch 'master' of https://github.com/Jung0322/Project.git
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





