package pakett;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class start {
	public static void startimine() throws Exception {
		String failiaadress=(System.getProperty("user.home")+"\\Desktop\\"+"tudengifail.txt");	
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(
                new FileOutputStream(failiaadress));
objectOutputStream.writeObject(new Date());
objectOutputStream.writeBoolean(true);
objectOutputStream.writeFloat(1.0f);
objectOutputStream.writeObject(GLOBAL.course);
objectOutputStream.flush();
objectOutputStream.close();
ObjectInputStream objectInputStream = new ObjectInputStream(
        new FileInputStream(failiaadress));
Date date = (Date) objectInputStream.readObject();
System.out.println("kuupäev      :"+date);
System.out.println("boolean      :"+objectInputStream.readBoolean());
System.out.println("float        :"+objectInputStream.readFloat());
Course readCourse = (Course) objectInputStream.readObject();
GLOBAL.course=readCourse;
objectInputStream.close();
	}

}