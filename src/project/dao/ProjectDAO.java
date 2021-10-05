package project.dao;

public class ProjectDAO {
	
	static {
		try {
			Class.forName("oracle.jdbc.OracleDrivet");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	} 
		
		private void syso() {
			int arr[][]= {
					
					{38,32},
					{47,54,57},
					{37,78,58,49}
			};
			System.out.println("행"+arr.length);
			System.out.println("열1"+arr[0].length);
			System.out.println("열2"+arr[1].length);
			System.out.println("열3"+arr[2].length);
			
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					System.out.printf("%d", arr[i][j]);
				}
			}
		}
}
