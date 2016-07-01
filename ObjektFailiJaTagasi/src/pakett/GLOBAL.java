package pakett;

import java.util.ArrayList;
import java.util.List;

public class GLOBAL {
	
	public int test = 3;
	public static List<Student> students= new ArrayList<>();
	public static Course course=new Course();
	public static Student tudeng=new Student();
	public static String failiaadress="D:\\Asjad\\Desktop\\tudengifail.txt";//(System.getProperty("user.home")+"\\Desktop\\"+"tudengifail.txt");
	public static String ProgramRunLocation=(System.getProperty("user.dir")+"\\");
	public static String INI_FailiNimi="SelleProgrammiINIFailiNimi.ini";
	public static int INI_FailiRidadeArv=50;
	public static int INI_FailisKasutatudRidadeArv=0;
	public static String[] INI_FailiStringideJada=new String[INI_FailiRidadeArv];
}
