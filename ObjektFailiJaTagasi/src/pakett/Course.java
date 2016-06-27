package pakett;

import java.io.Serializable;
import java.util.List;
/*
 * 
 * Siin luuakse objekt, mis sisaldab teiste objektide listi lisaks oma v��rtustele
 * 
 * 
 */
@SuppressWarnings("serial")
public class Course implements Serializable {
    String name;
    List<Student> students;           // Luuakse objektide(tudengid t��pi) list

    public void setName(String name) {	//objektile omistatakse String t��pi v��rtus ... hetkel nimi
        this.name = name;
    }

    public void setStudents(List<Student> students) {   //kohalik list saab v�ljast saadetud listi sisu
        this.students = students;
    }

    public String getName() {			// siin saab v�ljast p�rija omale k�esoleva objekti string v��rtuse teada... hetkel nimi
        return name;
    }

    public List<Student> getStudents() {      //siin saab v�ljast p�rija antud objekti sees oleva teise listi k�tte
        return students;
    }
    
    public Course() {
    	
    }
    
    public Course(List<?> students) {
    	
    }
}