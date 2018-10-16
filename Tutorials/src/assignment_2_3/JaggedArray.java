package assignment_2_3;

public class JaggedArray {

	public static void main(String[] args) {
		
		String[][] tutorial1 = new String[5][4];
		
		tutorial1[0][0] = "Student Name";
		tutorial1[0][1] = "Tutorial 1";
		tutorial1[0][2] = "Tutorial 2";
		tutorial1[0][3] = "Tutorial 3";
		tutorial1[1][0] = "Tony";
		tutorial1[1][1] = "JAVA";
		tutorial1[1][1] = "C";
		tutorial1[1][1] = "C++";
		tutorial1[2][0] = "Thomas";
		tutorial1[2][1] = "JAVA";
		tutorial1[2][2] = "UNIX";
		tutorial1[2][3] = "";
		tutorial1[3][0] = "Dinil";
		tutorial1[3][1] = "Linux";
		tutorial1[3][2] = "Oracle";
		tutorial1[4][0] = "Delvin";
		tutorial1[4][1] = "RDBMS";
		tutorial1[4][2] = "C#";
		tutorial1[4][3] = "ORACLE";
	
		
		
		System.out.printf("The courses completed by" + tutorial1[4][0] +"are" + tutorial1[4][1]+ tutorial1[4][2]+ tutorial1[4][3]);

	}

}
