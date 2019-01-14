/**
 * @Author Mason Caird
 * @Version Final Version
 */

import java.awt.EventQueue;
import java.awt.event.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

import Structure_Sim_City.bassPerson;
import Structure_Sim_City.kid;
import Structure_Sim_City.police;
import Structure_Sim_City.teacher;
import java.awt.Component;
import javax.swing.Box;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.JPanel;

public class city implements MouseMotionListener, ActionListener {
	
	// These are components that are used across the city.Java file.
	// They are placed here so I can access them universaly.
	private JFrame frame;
	private JLabel labelSchool;
	private JLabel labelCityHall;
	Point diffDrag;
	JPanel panel;
	JLabel [] labelPolice = new JLabel[5];
	JLabel [] labelkid = new JLabel[5];
	JLabel [] labelTeacher = new JLabel[4];
	JButton buttonSchool;
	JButton buttonCityHall;
	JTextArea textArea_1;
	JTextArea textArea_2;
	
	// To have a base foundation to print people
	final int n = 300;
	
	// ARRAY LIST OF CERTAIN PEOPLE
	ArrayList<bassPerson> studentPeople = new ArrayList<bassPerson> (); 
	ArrayList<bassPerson> policePeople = new ArrayList<bassPerson> ();
	ArrayList<bassPerson> teacherPeople = new ArrayList<bassPerson> ();
	ArrayList<bassPerson> populationPeople = new ArrayList<bassPerson>();
	ArrayList<String> peopleInSchool = new ArrayList <String> ();
	ArrayList<String> peopleInCityHall = new ArrayList <String> ();
	
	// To Run the program
	
	/**
	 * This function will run the the program CityJava.
	 * @param args
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					city window = new city();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	/**
	 * This will initialize the mechanics of the Program.
	 * ArraysLists, perform actions, Mouse Listener, etc.
	 */
	public city() { initialize(); }

	private void initialize() {
		
		/**
		 * StudentPeople are Arraylists with type [@bassPerson]
		 *  arrayList of Students.
		 * @see [@bassPerson]
		 * @see [@kid]
		 */
		studentPeople.add(new kid("Mason Caird", 17, "(868)-856-8576", "Crunch", 3));
		studentPeople.add(new kid("Chady Lagoo", 16, "(587)-857-2347", "Smarties", 6));
		studentPeople.add(new kid("Daniel Tucker", 20, "(509)-954-3354", "Coca-Cola", 42));
		studentPeople.add(new kid("Kylee Shepard",16, "(857)-856-1783", "Human Souls", 11));
		studentPeople.add(new kid("Ty Warner", 19, "(509)-981-2224","Kit Kats", 12));
		
		/**
		 * policePeople are Arraylists with type [@bassPerson]
		 *  arrayList of policePeople.
		 * @see [@bassPerson]
		 * @see [@police]
		 */
		
		policePeople.add(new police("Angelica Pickels", 45, "(345)-523-9614", police.policeRole.Patrol, 96234)); 
		policePeople.add(new police("Will Smith", 48, "(360)-253-4112", police.policeRole.Sargent, 14231)); 
        policePeople.add(new police("Kevin Hart", 34, "(509)-234-1421", police.policeRole.Captain, 14123)); 
        policePeople.add(new police("Princess Lia", 23, "(509)-212-1523", police.policeRole.Patrol, 12323)); 
        policePeople.add(new police("Casey Sweet", 43, "(413)-253-2513", police.policeRole.Chief, 11973));
        
        /**
		 * People are Arraylists with type [@bassPerson]
		 * arrayList of teacherPeople.
		 * @see [@bassPerson]
		 * @see [@teacher]
		 */
        
        teacherPeople.add(new teacher("Anakin Skywalker", 42, "(232)-234-1112", 10, "PHd Health Science",49846));
        teacherPeople.add(new teacher("Martha Stewart", 63, "(509)-233-2534", 7, "BA in Culinary",79844));
        teacherPeople.add(new teacher("Pete Tucker", 37, "(509)-978-7546", 12, "PHd in Computer Science",69868));
        teacherPeople.add(new teacher("Lady Gaga", 36, "(509)-974-2685", 11, "AA in Music",54683));
        
        // Making the Frame
		
		frame = new JFrame("Masons SimCity");
		frame.setResizable(false);
		frame.setBounds(100, 100, 1057, 700);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		// Making the panel for the window so the mouse can grab and click
		
		panel = new JPanel();
		panel.setBounds(0, 0, 1041, 661);
		frame.getContentPane().add(panel);
		panel.addMouseMotionListener(this);
		panel.setLayout(null);
		
		// I used for loops to create my JLabels. In each for loop, the objects are being added to the
		// thre arrayList (labelPolice, labelTeacher, labelkid) and prints out the Jlabel
		
		// POLICE
		for (int i = 0; i < labelPolice.length; i++) {
			labelPolice[i] = new JLabel("Police");
			labelPolice[i].setBounds(325+(i*15),272,30,51);
			if (i % 2 == 0) {labelPolice[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\police.png"));}
			else {labelPolice[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\police1.png"));}
			panel.add(labelPolice[i]);
		}
		
		// TEACHER
		for (int i = 0; i < labelTeacher.length; i++) {
			labelTeacher[i] = new JLabel("Teacher");
			labelTeacher[i].setBounds(415+(i*15),272,30,51);
			if (i % 2 == 0) {labelTeacher[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\teacher.png"));}
			else {labelTeacher[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\teacher1.png"));}
			panel.add(labelTeacher[i]);
		}
		
		// KID. This makes all the kids
		for (int i = 0; i < labelkid.length; i++ ) {
			labelkid[i] = new JLabel("kid");
			labelkid[i].setBounds(242+(i*15),254,30,51);
			if (i % 2 == 0) {labelkid[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\kid1.png"));}
			else {labelkid[i].setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\kid2.png"));}
			panel.add(labelkid[i]);
		}
		
		// JCOMPONENTS ON THE JPANEL. DESIGNED FROM THE INTERFACE ON ECLIPSE
		
		// TEXT AREA_1
		textArea_1 = new JTextArea();
		textArea_1.setEditable(false);
		textArea_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textArea_1.setWrapStyleWord(true);
		textArea_1.setBounds(10, 66, 221, 242);
		panel.add(textArea_1);
		textArea_1.setBackground(Color.LIGHT_GRAY);
		textArea_1.setLineWrap(true);
		
		// TEXT AREA_2
		textArea_2 = new JTextArea();
		textArea_2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		textArea_2.setEditable(false);
		textArea_2.setBounds(10, 352, 219, 290);
		panel.add(textArea_2);
		textArea_2.setLineWrap(true);
		textArea_2.setBackground(Color.LIGHT_GRAY);
		
		// LABEL OF CITYHALL
		labelCityHall = new JLabel("");
		labelCityHall.setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\cityHall.png"));
		labelCityHall.setBounds(261, 47, 379, 166);
		panel.add(labelCityHall);
		
		// CITY HALL
		buttonCityHall = new JButton("Press for Occupants");
		buttonCityHall.setBackground(new Color(204, 204, 204));
		buttonCityHall.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		buttonCityHall.addActionListener(this);
		buttonCityHall.addMouseMotionListener(this);
		
		// LABEL OF SCHOOL
		labelSchool = new JLabel("School");
		labelSchool.setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\school.png"));
		labelSchool.setBounds(621, 60, 399, 445);
		panel.add(labelSchool);
		buttonCityHall.setBounds(353, 18, 212, 31);
		panel.add(buttonCityHall);
		
		// CURRENT OCCUPANT LABEL
		JLabel lblNewLabel_1 = new JLabel("Current Occupants");
		lblNewLabel_1.setBounds(10, 319, 219, 22);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		
		// VERTICAL STRUT
		Component verticalStrut = Box.createVerticalStrut(20);
		verticalStrut.setBounds(70, 2, 17, 31);
		panel.add(verticalStrut);
		
		// SCHOOL
		buttonSchool = new JButton("Press for Occupants");
		buttonSchool.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 15));
		buttonSchool.setBackground(new Color(204, 204, 204));
		buttonSchool.setBounds(808, 18, 212, 31);
		buttonSchool.addActionListener(this);
		buttonSchool.addMouseMotionListener(this);
		panel.add(buttonSchool);
		
		// STATS LABEL
		JLabel lblNewLabel = new JLabel("Building / Person Stats");
		lblNewLabel.setBounds(10, 33, 241, 33);
		panel.add(lblNewLabel);
		lblNewLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		
		// CITY MAP
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setBounds(241, 33, 790, 606);
		panel.add(lblNewLabel_2);
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\mcaird22\\Desktop\\HWcity\\src\\city.png"));
		
		// CTY NAME LABEL
		JLabel lblCityname = new JLabel("Dudesville");
		lblCityname.setBounds(0, 0, 241, 33);
		panel.add(lblCityname);
		lblCityname.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 28));
		lblCityname.setHorizontalAlignment(SwingConstants.CENTER);
		
		// AUthor Label
		JLabel lblNewLabel_3 = new JLabel("by Mason Caird");
		lblNewLabel_3.setBounds(10, 647, 88, 14);
		panel.add(lblNewLabel_3);
		
	}

	/**
	 * When a person is clicked and dragged, they will display information to textArea_1
	 * and they become a label for relocation on the JPanel.
	 * @Param mouseEvent e
	 * @Override
	 */
	public void mouseDragged(MouseEvent e) {
		System.out.println("Dragging");
		JLabel label = null;
		for (int i = 0; i< labelPolice.length; i++)
			if (labelPolice[i].getBounds().contains(e.getPoint())) {
				textArea_1.setText(policePeople.get(i).toDisplay());
				label = labelPolice[i]; 
		}
		for (int i = 0; i< labelkid.length; i++)
			if (labelkid[i].getBounds().contains(e.getPoint())) {
				textArea_1.setText(studentPeople.get(i).toDisplay());
				label = labelkid[i];
		}
		for (int i = 0; i < labelTeacher.length; i++) {
			if(labelTeacher[i].getBounds().contains(e.getPoint())) {
				textArea_1.setText(teacherPeople.get(i).toDisplay());
				label = labelTeacher[i];
			}
		}
		
		// If statement will be used to drag the Jlabel acroos the screen
		if (label != null ) {
			if(diffDrag == null) 
				diffDrag = new Point(e.getX() - label.getBounds().x, e.getY() - label.getBounds().y);
			label.setBounds(e.getX() - diffDrag.x, e.getY()-diffDrag.y, label.getBounds().width, label.getBounds().height);
			System.out.printf("Moved label to <%d, %d>", e.getX() - diffDrag.x, e.getY()-diffDrag.y);
	
		}
	}
	
	
	// When the schoolButton is clicked, do this.
	/**
	 * ActionPerformed is executed once SchoolButton or CityhallButton is pushed.
	 * textArea_1 and textArea_2 will be used to display the occupants and the buildings information
	 * @param ActionEvent e
	 * @Override
	 */
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == buttonSchool) {
			peopleInSchool.clear(); // Clear is executed to prevent duplicated names
			textArea_1.setText(""); // This is to make sure nothing will be textArea_1 when getting information about School Building
			Structure_Sim_City.school school =  new Structure_Sim_City.school("Dudesville High School", "3.14 Eyes On blvd", 23);
			textArea_1.setText(school.displayBuidling());
			
			// Every if statement carries the school label parameter and determines if a jlabel is inside.
			for (int i = 0; i < labelkid.length; i++) {
				if ((labelkid[i].getX() > 791 && labelkid[i].getX() < 992 && labelkid[i].getY() > 46 && labelkid[i].getY() < 501)) {
					peopleInSchool.add(studentPeople.get(i).getName());
				}
			}	
			for (int i = 0; i < labelTeacher.length; i++) {
				if ((labelTeacher[i].getX() > 791 && labelTeacher[i].getX() < 992 && labelTeacher[i].getY() > 46 && labelTeacher[i].getY() < 501)) {
					peopleInSchool.add(teacherPeople.get(i).getName());
				}
			}
			for (int i = 0; i < labelPolice.length; i++) {
				if ((labelPolice[i].getX() > 791 && labelPolice[i].getX() < 992 && labelPolice[i].getY() > 46 && labelPolice[i].getY() < 501)) {
					peopleInSchool.add(policePeople.get(i).getName());
				}
			}
			
			// lblSchool is used to store strings of names who are in School
			String lblSchool = "";
			for (int i = 0; i < peopleInSchool.size(); i++) {
				lblSchool += "Name: " + peopleInSchool.get(i).toString() + "\n";
			}
			textArea_2.setText(lblSchool);
			
			// if nothing is in arrayList PeopleInSchool
			if (peopleInSchool.isEmpty()) { textArea_2.setText("No Occupants"); }
		}
		
		// if the citHallbutton is clicked, do this.
		else if (e.getSource() == buttonCityHall) {
			peopleInCityHall.clear();
			textArea_1.setText("");
			Structure_Sim_City.cityHall cityhall = new Structure_Sim_City.cityHall("Dudesville City Hall", "911 Emergency Stop rd", 12);
			textArea_1.setText(cityhall.displayBuidling());
			
			 // Every if statement carries the cityHall label parameter and determines if a jlabel is inside.
			for (int i = 0; i < labelkid.length; i++) {
				if ((labelkid[i].getX() > 311 && labelkid[i].getX() < 624) && (labelkid[i].getY() > 46 && labelkid[i].getY() < 212) ) {
					peopleInCityHall.add(studentPeople.get(i).getName());
				}
			}
			for (int i = 0; i < labelTeacher.length; i++) {
				if ((labelTeacher[i].getX() > 311 && labelTeacher[i].getX() < 624) && (labelTeacher[i].getY() > 46 && labelTeacher[i].getY() < 212) ) {
					peopleInCityHall.add(teacherPeople.get(i).getName());
				}
			}
			for (int i = 0; i < labelPolice.length; i++) {
				if ((labelPolice[i].getX() > 311 && labelPolice[i].getX() < 624) && (labelPolice[i].getY() > 46 && labelPolice[i].getY() < 212) ) {
					peopleInCityHall.add(policePeople.get(i).getName());
				}	
			}
			
			// lblSchool is used to store strings of names who are in School
			String lblCityHall = "";
			for (int i = 0; i < peopleInCityHall.size(); i++) {
				lblCityHall += "Name: " + peopleInCityHall.get(i).toString() + "\n";
			}
			textArea_2.setText(lblCityHall);
			
			// if nothing is in arrayList PeopleInCityHall
			if (peopleInCityHall.isEmpty()) { textArea_2.setText("No Occupants"); }
		}
	}
	
	/**
	 * @param MouseEvent e
	 * @Override
	 */
	public void mouseMoved(MouseEvent e) {
		diffDrag = null;
	}
}
