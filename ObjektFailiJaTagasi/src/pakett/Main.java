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
	  final static boolean shouldFill = true;
	    final static boolean shouldWeightX = true;
	    final static boolean RIGHT_TO_LEFT = false;

	public static void main(String[] args) throws Exception {
		
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
		
		
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
		
		
		
		
	}
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("GridBagLayoutDemo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
        //Set up the content pane.
        addComponentsToPane(frame.getContentPane());
 
        //Display the window.
        frame.pack();
        frame.setVisible(true);
    }
    public static void addComponentsToPane(Container pane) {
        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }
 
        JButton button;
    pane.setLayout(new GridBagLayout());
    GridBagConstraints c = new GridBagConstraints();
    if (shouldFill) {
    //natural height, maximum width
    c.fill = GridBagConstraints.HORIZONTAL;
    }
 
    button = new JButton("Button 1");
    if (shouldWeightX) {
    c.weightx = 0.5;
    }
    c.fill = GridBagConstraints.HORIZONTAL;
    c.gridx = 0;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Button 2");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 1;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Button 3");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.weightx = 0.5;
    c.gridx = 2;
    c.gridy = 0;
    pane.add(button, c);
 
    button = new JButton("Long-Named Button 4");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 40;      //make this component tall
    
    c.weightx = 0.0;
    c.gridwidth = 3;
    c.gridx = 0;
    c.gridy = 1;
    pane.add(button, c);
 
    button = new JButton("5");
    c.fill = GridBagConstraints.HORIZONTAL;
    c.ipady = 0;       //reset to default
    c.weighty = 1.0;   //request any extra vertical space
    c.anchor = GridBagConstraints.PAGE_END; //bottom of space
    c.insets = new Insets(10,0,0,0);  //top padding
    c.gridx = 1;       //aligned with button 2
    c.gridwidth = 2;   //2 columns wide
    c.gridy = 2;       //third row
    pane.add(button, c);
    }
 
	
	public static void INI_EditoriKuvamine(){
		GridLayout experimentLayout = new GridLayout(0,2);
			    								
	JFrame PeaRaam = new JFrame("Raami Nimi");
	PeaRaam.setBounds (100, 100, 300, 300);
	PeaRaam.show();
	
	double size[][] =
        {{0.25, 0.25, 0.25, 0.25},
         {50, 40, 40, 40}};
	PeaRaam.setLayout(experimentLayout);
	JPanel PeaPaneel = new JPanel();
	PeaRaam.add(PeaPaneel);
	PeaRaam.setVisible(true);
	PeaRaam.pack();
	
	
	
	}
	
	
	
	
	

}
