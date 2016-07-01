package pakett;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.Date;

public class failitegevused {


	
	
	public static void kirjutaKursusFaili() throws Exception{                             // testitud: OK
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(GLOBAL.failiaadress));
	objectOutputStream.writeObject(new Date());
	objectOutputStream.writeBoolean(true);
	objectOutputStream.writeFloat(1.0f);
	objectOutputStream.writeObject(GLOBAL.course);
	objectOutputStream.flush();
	objectOutputStream.close();
	}
	
	
	public static void loeKursusFailist()  throws Exception{                             // testitud: OK
	ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(GLOBAL.failiaadress));
	Date date = (Date) objectInputStream.readObject();
	System.out.println("kuupäev      :"+date);
	System.out.println("boolean      :"+objectInputStream.readBoolean());
	System.out.println("float        :"+objectInputStream.readFloat());
	Course readCourse = (Course) objectInputStream.readObject();
	GLOBAL.course=readCourse;
	objectInputStream.close();	
	}
	
	public static boolean kontrolliTekstFailiOlemasolu(String kontrollitavFail){         // testitud: OK
		boolean tagasiside=true;
		try {
			BufferedReader br = new BufferedReader(new FileReader(kontrollitavFail));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			tagasiside=false;
		}
		return tagasiside;
	}
	public static void looUusTekstFail(String loodavFail){
		File f=new File(loodavFail);
		
		if (!f.exists()){
			try {
				f.createNewFile();
			} catch (IOException e) {
				System.out.println("(failitegevused.looUusTekstFail)Ei saanud faili luua!"+loodavFail);
			}
		}
	}
	public static void kirjutaYleStringJadaTekstFaili(String kirjutatavFail,String[] StringJada) throws Exception{    //testitud: OK
		FileWriter fw = new FileWriter(kirjutatavFail, false);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw);
			int i=0;
			
			    while(i<StringJada.length){
			    	out.println(StringJada[i]);
			    	i++;
			    }
			    
			    //more code
			    //out.println("more text");
			    out.close();
			    //more code
			
		
	}
	public static void lisaStringTekstFaili(String kirjutatavFail,String lisatavString) throws Exception{             // testitud: OK
		try(FileWriter fw = new FileWriter(kirjutatavFail, true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter out = new PrintWriter(bw))
			{
			    out.println(lisatavString);
			    //more code
			//    out.println("more text");
			    out.close();
			    //more code
			} catch (IOException e) {
			    //exception handling left as an exercise for the reader
			}
		
	}
	public static void loeStringiJadaTekstFailist(String FailiNimi){                                 // testitud: OK
		
		BufferedReader br= null;
		try {
			br = new BufferedReader(new FileReader(FailiNimi));
		} catch (FileNotFoundException e) {
			System.out.println("(failitegevused.loeStringJadaTekstFailist)Ei saanud faili avatud!"+FailiNimi);
		}
		String hetkelLoetav="";
		int i=0;
		int korrektneSisestus=0;
		try {
			while ((hetkelLoetav = br.readLine()) != null) {
				if(hetkelLoetav.indexOf("<")!=-1){
				GLOBAL.INI_FailiStringideJada[korrektneSisestus]=hetkelLoetav;	
				korrektneSisestus++;
				}
				i++;
			}
		} catch (IOException e) {
			System.out.println("(failitegevused.loeStringJadaTekstFailist)Ei saanud faili "+FailiNimi+" rida "+i+" loetud!");
		}
		try {
			br.close();
			GLOBAL.INI_FailisKasutatudRidadeArv=korrektneSisestus;
		} catch (IOException e) {
			System.out.println("(failitegevused.loeStringJadaTekstFailist)Ei saanud faili "+FailiNimi+" suletud!");
		}
		
		
	}
	public static String loeStringTekstFailist(String FailiNimi,int soovitavRida){            //testitud: OK
		String leid="";
		BufferedReader br= null;
		try {
			br = new BufferedReader(new FileReader(FailiNimi));
		} catch (FileNotFoundException e) {
			System.out.println("(failitegevused.loeStringTekstFailist)Ei saanud faili avatud!"+FailiNimi);
		}
		String hetkelLoetav="";
		int i=0;
		int korrektneSisestus=0;
		try {
			while ((hetkelLoetav = br.readLine()) != null) {
				if(i==soovitavRida){
					leid=hetkelLoetav;	
				
				}
				i++;
			}
		} catch (IOException e) {
			System.out.println("(failitegevused.loeStringTekstFailist)Ei saanud faili "+FailiNimi+" rida "+i+" loetud!");
		}
		try {
			br.close();
			GLOBAL.INI_FailisKasutatudRidadeArv=korrektneSisestus;
		} catch (IOException e) {
			System.out.println("(failitegevused.loeStringTekstFailist)Ei saanud faili "+FailiNimi+" suletud!");
		}
		
		
		
		
		return leid;
	}
	
	
	
	
	
}