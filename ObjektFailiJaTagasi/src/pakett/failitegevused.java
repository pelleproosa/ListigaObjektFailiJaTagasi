package pakett;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class failitegevused {


	
	
	public static void kirjutaKursusFaili() throws Exception{
	
	ObjectOutputStream objectOutputStream = new ObjectOutputStream(
            new FileOutputStream(GLOBAL.failiaadress));
objectOutputStream.writeObject(new Date());
objectOutputStream.writeBoolean(true);
objectOutputStream.writeFloat(1.0f);
objectOutputStream.writeObject(GLOBAL.course);
objectOutputStream.flush();
objectOutputStream.close();
	
	}
	
	
	public static void loeKursusFailist()  throws Exception{
		
		ObjectInputStream objectInputStream = new ObjectInputStream(
		        new FileInputStream(GLOBAL.failiaadress));
		Date date = (Date) objectInputStream.readObject();
		System.out.println("kuupäev      :"+date);
		System.out.println("boolean      :"+objectInputStream.readBoolean());
		System.out.println("float        :"+objectInputStream.readFloat());
		Course readCourse = (Course) objectInputStream.readObject();
		GLOBAL.course=readCourse;
		objectInputStream.close();	
		
		
	}
	
	
	
	
	
	
	
}