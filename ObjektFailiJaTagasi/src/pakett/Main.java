package pakett;

import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Insets;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Main {


	public static void main(String[] args) throws Exception {
		INI_EditoriGraafika.INI_EditoriKuvamine();
		
		String tekstiFail=""+GLOBAL.ProgramRunLocation+GLOBAL.INI_FailiNimi;
		GLOBAL.INI_FailiStringideJada[0]="<0>{Pealkiri}";
		GLOBAL.INI_FailiStringideJada[1]="<1>{tanja}";
		GLOBAL.INI_FailiStringideJada[2]="<2>{juku}";
		GLOBAL.INI_FailiStringideJada[3]="<3>{kusti}";
		GLOBAL.INI_FailiStringideJada[4]="<4>{minna}";
		GLOBAL.INI_FailiStringideJada[5]="<5>{klaara}";
		
		failitegevused.kirjutaYleStringJadaTekstFaili(tekstiFail, GLOBAL.INI_FailiStringideJada);
		
		boolean failiOlemasoluKontroll=failitegevused.kontrolliTekstFailiOlemasolu(tekstiFail+"vale");
		System.out.println("Faili olemasolu kontrolli tagasiside: "+failiOlemasoluKontroll);
	//	failitegevused.lisaStringTekstFaili(tekstiFail,"<65>{Aus lugu, ei midagi salajast}");
		
		
		failitegevused.loeStringiJadaTekstFailist(tekstiFail);
		int i=0;
		while(i<GLOBAL.INI_FailisKasutatudRidadeArv){
			System.out.println(GLOBAL.INI_FailiStringideJada[i]);
			i++;
		}
		int valitudString=3;
		String yksString=failitegevused.loeStringTekstFailist(tekstiFail, valitudString);
		System.out.println("String "+valitudString+" tekstifailist: "+yksString);
		
		
		
		//System.out.println("lisati string faili: "+tekstiFail);
		
	//	String hakkimine=Funktsioonid.stringiHakkimine("<63>{muu jutt}", "{", "}");
	//	System.out.println(hakkimine);
		
		try {
			 Funktsioonid.lisaTudeng(30, "Miki","tavatudeng");
			 Funktsioonid.lisaTTYTudeng(17, "Gollum","ttytudeng",158,"Mehhatroonika III-kursus");
			 Funktsioonid.lisaTudeng(33, "Pluuto","tavatudeng");
			 

			 Funktsioonid.TudengiListObjekti();
			 failitegevused.kirjutaKursusFaili();
			 failitegevused.loeKursusFailist();

			Funktsioonid.suvalinekuvamineTEST();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		
		
		
		
	}

 
	
	
		
		
		
	
	
	}
	
	
	
	
	


