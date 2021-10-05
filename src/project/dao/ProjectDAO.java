package project.dao;

public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDrivet");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} 
}
