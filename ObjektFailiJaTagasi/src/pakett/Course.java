package pakett;

import java.io.Serializable;
import java.util.List;
/*
 * 
 * Siin luuakse objekt, mis sisaldab teiste objektide listi lisaks oma väärtustele
 * 
 * 
 */
@SuppressWarnings("serial")
public class Course implements Serializable {
    String name;
    List<Student> students;           // Luuakse objektide(tudengid tüüpi) list

    public void setName(String name) {	//objektile omistatakse String tüüpi väärtus ... hetkel nimi
        this.name = name;
    }

    public void setStudents(List<Student> students) {   //kohalik list saab väljast saadetud listi sisu
        this.students = students;
    }

    public String getName() {			// siin saab väljast pärija omale käesoleva objekti string väärtuse teada... hetkel nimi
        return name;
    }

    public List<Student> getStudents() {      //siin saab väljast pärija antud objekti sees oleva teise listi kätte
        return students;
    }
    
    public Course() {
    	
    }
    
    public Course(List<?> students) {
    	
    }
}