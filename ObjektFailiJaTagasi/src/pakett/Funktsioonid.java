package pakett;

public class Funktsioonid {
	

	
public static void lisaTudeng(int vanus, String nimi,String tyyp){
	Student student = new Student();
	student.setTyyp(tyyp);
	student.setAge(vanus);
	student.setName(nimi);
	GLOBAL.students.add(student);
	
}

public static void lisaTTYTudeng(int vanus, String nimi,String tyyp,int iQ,String ttylisainfo){
	TTYTudeng student = new TTYTudeng();
	student.setTyyp(tyyp);
	student.setAge(vanus);
	student.setName(nimi);
	student.setIQ(iQ);
	student.setTtylisainfo(ttylisainfo);
	GLOBAL.students.add(student);
	
} 

public static void TudengiListObjekti(){
	
	GLOBAL.course.setName("Java progemine");


	GLOBAL.course.setStudents(GLOBAL.students);
}
public static void suvalinekuvamineTEST(){
	int lugeja=0;
	int kursuseListiSuurus=GLOBAL.course.students.size();
	System.out.println("Kursuse suurus: "+kursuseListiSuurus);
	String tuvastatudTudengiTyyp="";
	System.out.println("kursus       :"+GLOBAL.course.getName());
	while(lugeja<kursuseListiSuurus){
		GLOBAL.tudeng=GLOBAL.course.students.get(lugeja);
		tuvastatudTudengiTyyp=tudengiTyybiTuvastamine();
		System.out.println();
		System.out.print(tuvastatudTudengiTyyp);
		System.out.println(" Tudeng: "+lugeja);
		
		if(tuvastatudTudengiTyyp.equalsIgnoreCase("tavatudeng")){tavaTudengiKuvamine();}
		if(tuvastatudTudengiTyyp.equalsIgnoreCase("ttytudeng")){ttyTudengiKuvamine();}
		
		lugeja++;
	}
	
}
public static String tudengiTyybiTuvastamine(){
	
	return GLOBAL.tudeng.getTyyp();
}

public static void tavaTudengiKuvamine(){
	System.out.println("Vanus: "+GLOBAL.tudeng.getAge());
	System.out.println("Nimi : "+GLOBAL.tudeng.getName());
	
}

public static void ttyTudengiKuvamine(){
System.out.println("Vanus: "+GLOBAL.tudeng.getAge());
System.out.println("Nimi : "+GLOBAL.tudeng.getName());
TTYTudeng tt = (TTYTudeng) GLOBAL.tudeng;
System.out.println("IQ : "+ tt.getIQ());
System.out.println(tt.toString());
System.out.println(tt.getTtylisainfo());
}

public static String stringiHakkimine(String sisendString, String Lipp1, String Lipp2){             // testitud : OK
	String tagasiside="";
	int asukoht1=0;
	int asukoht2=0;
	
	if(sisendString.indexOf(Lipp1)!= -1){
		if(sisendString.indexOf(Lipp2)!= -1){
			asukoht1=sisendString.indexOf(Lipp1);   //leian viimase koha enne Lipp1  
			asukoht2=sisendString.indexOf(Lipp2);   //leian viimase koha enne Lipp2
			tagasiside=sisendString.substring(asukoht1, (asukoht2+1));
		  
		}else{System.out.println("Funktsioonid.stringiHakkimine: Lipp2 ei leitud");}
	}else{System.out.println("Funktsioonid.stringiHakkimine: Lipp1 ei leitud");}
	
	
	return tagasiside;
}


}
