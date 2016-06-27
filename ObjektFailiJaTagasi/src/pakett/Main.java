package pakett;

public class Main {


	public static void main(String[] args) {
	
		

		
		
		
		try {
			 Funktsioonid.lisaTudeng(30, "Miki","tavatudeng");
			 Funktsioonid.lisaTTYTudeng(17, "Gollum","ttytudeng",158,"Mehhatroonika III-kursus");
			 Funktsioonid.lisaTudeng(33, "Pluuto","tavatudeng");
			 
		//	 GLOBAL.students.get(1).toString();
			 
			 Funktsioonid.TudengiListObjekti();
			 failitegevused.kirjutaKursusFaili();
			 failitegevused.loeKursusFailist();
			//failitegevused.kirjutamineJaLugemine();
			Funktsioonid.suvalinekuvamineTEST();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
