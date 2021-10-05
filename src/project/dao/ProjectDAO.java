package project.dao;

public class ProjectDAO {
<<<<<<< HEAD
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDrivet");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} 
		
=======

	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {			
			e.printStackTrace();
		}
	}
	
	
	
>>>>>>> branch 'master' of https://github.com/Jung0322/Project.git
}
