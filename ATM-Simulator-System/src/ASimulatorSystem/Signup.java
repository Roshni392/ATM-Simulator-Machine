package ASimulatorSystem;
//
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import com.toedter.calendar.JDateChooser;
import java.util.*;
//
public class Signup extends JFrame implements ActionListener{
private Object setLayout;
//    
//    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15;
//    JTextField t1,t2,t3,t4,t5,t6,t7;
//    JRadioButton r1,r2,r3,r4,r5;
//    JButton b;
//    JDateChooser dateChooser;
//    
//    
//    Random ran = new Random();
//    long first4 = (ran.nextLong() % 9000L) + 1000L;
//    String first = "" + Math.abs(first4);

	long random;
	JTextField nameTextField, fnameTextField, dobTextField, emailTextField, addressTextField, cityTextField, stateTextField, pinTextField; 
	JButton next;
	JRadioButton male, female, other, married, unmarried;
	JDateChooser dateChooser;
//  
	
    Signup(){
    	
    	
    	setLayout(null);
    	
    	Random ran = new Random();
    	random = Math.abs((ran.nextLong() % 9000L) + 1000L);
    	
    	JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 38));
        formno.setBounds(140, 20, 600, 40);
        add(formno);
//        
//        setTitle("NEW ACCOUNT APPLICATION FORM");
//        
//        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ASimulatorSystem/icons/logo.jpg"));
//        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
//        ImageIcon i3 = new ImageIcon(i2);
//        JLabel l11 = new JLabel(i3);
//        l11.setBounds(20, 0, 100, 100);
//        add(l11);
//        
        
//        
        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        personalDetails.setBounds(290, 80, 400, 30);
        add(personalDetails);
//        
        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);
        
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(300, 140, 400, 30);
        add(nameTextField);
//        
        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(100, 190, 200, 80);
        add(fname);
        
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(300, 215, 400, 30);
        add(fnameTextField);
//        
        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 80);
        add(dob);
        
        dateChooser = new JDateChooser();
        dateChooser.setBounds(300, 265, 400, 30);
        dateChooser.setForeground(Color.black);
        add(dateChooser);
        
//        
        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 80);
        add(gender);
        
        male = new JRadioButton("Male");
        male.setBounds(300, 315, 60, 30);
        male.setBackground(Color.white);
        add(male);
        
        female = new JRadioButton("Female");
        female.setBounds(490, 315, 120, 30);
        female.setBackground(Color.white);
        add(female);
        
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
//        
        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 340, 200, 80);
        add(email);
        
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(300, 365, 400, 30);
        add(emailTextField);
//        
        JLabel marital = new JLabel("Marital Status:");
        marital.setFont(new Font("Raleway", Font.BOLD, 20));
        marital.setBounds(100, 390, 200, 80);
        add(marital);
        
        married = new JRadioButton("Married");
        married.setBounds(300, 415, 100, 30);
        married.setBackground(Color.white);
        add(married);
        
        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(490, 415, 100, 30);
        unmarried.setBackground(Color.white);
        add(unmarried);
        
        other = new JRadioButton("Other");
        other.setBounds(630, 415, 100, 30);
        other.setBackground(Color.white);
        add(other);
        
        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(other);
//        
        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 80);
        add(address);
        
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(300, 465, 400, 30);
        add(addressTextField);
//        
        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 80);
        add(city);
        
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(300, 515, 400, 30);
        add(cityTextField);
               
        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 80);
        add(state);
        
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(300, 565, 400, 30);
        add(stateTextField);
        
        JLabel pincode = new JLabel("Pin Code:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(100, 590, 200, 80);
        add(pincode);
        
        pinTextField = new JTextField();
        pinTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pinTextField.setBounds(300, 615, 400, 30);
        add(pinTextField);
//        
//        l13 = new JLabel("Date");
//        l13.setFont(new Font("Raleway", Font.BOLD, 14));
//        city.setBounds(100, 340, 200, 80);
//        add(city);
//        
//        l14 = new JLabel("Month");
//        l14.setFont(new Font("Raleway", Font.BOLD, 14));
//        city.setBounds(100, 340, 200, 80);
//        add(city);
//        
//        l15 = new JLabel("Year");
//        l15.setFont(new Font("Raleway", Font.BOLD, 14));
//        city.setBounds(100, 340, 200, 80);
//        add(city);
//        
//        
//        t1 = new JTextField();
//        t1.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t2 = new JTextField();
//        t2.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t3 = new JTextField();
//        t3.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t4 = new JTextField();
//        t4.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t5 = new JTextField();
//        t5.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t6 = new JTextField();
//        t6.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//        t7 = new JTextField();
//        t7.setFont(new Font("Raleway", Font.BOLD, 14));
//        
//       
//        
        next = new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);
        
//        r1 = new JRadioButton("Male");
//        r1.setFont(new Font("Raleway", Font.BOLD, 14));
//        r1.setBackground(Color.WHITE);
//        
//        r2 = new JRadioButton("Female");
//        r2.setFont(new Font("Raleway", Font.BOLD, 14));
//        r2.setBackground(Color.WHITE);
//        
//        ButtonGroup groupgender = new ButtonGroup();
//        groupgender.add(r1);
//        groupgender.add(r2);
//        
//        r3 = new JRadioButton("Married");
//        r3.setFont(new Font("Raleway", Font.BOLD, 14));
//        r3.setBackground(Color.WHITE);
//        
//        r4 = new JRadioButton("Unmarried");
//        r4.setFont(new Font("Raleway", Font.BOLD, 14));
//        r4.setBackground(Color.WHITE);
//        
//        r5 = new JRadioButton("Other");
//        r5.setFont(new Font("Raleway", Font.BOLD, 14));
//        r5.setBackground(Color.WHITE);
//        
//        ButtonGroup groupstatus = new ButtonGroup();
//        groupstatus.add(r3);
//        groupstatus.add(r4);
//        groupstatus.add(r5);
//        
//        dateChooser = new JDateChooser();
//	//dateChooser.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
//	dateChooser.setForeground(new Color(105, 105, 105));
//	dateChooser.setBounds(137, 337, 200, 29);
//	add(dateChooser);
//        
//        setLayout(null);
//        l1.setBounds(140,20,600,40);
//        add(l1);
//        
//        l2.setBounds(290,80,600,30);
//        add(l2);
//        
//        l3.setBounds(100,140,100,30);
//        add(l3);
//        
//        t1.setBounds(300,140,400,30);
//        add(t1);
//        
//        l4.setBounds(100,190,200,30);
//        add(l4);
//        
//        t2.setBounds(300,190,400,30);
//        add(t2);
//        
//        l5.setBounds(100,240,200,30);
//        add(l5);
//        
//        dateChooser.setBounds(300, 240, 400, 30);
//        
//        l6.setBounds(100,290,200,30);
//        add(l6);
//        
//        r1.setBounds(300,290,60,30);
//        add(r1);
//        
//        r2.setBounds(450,290,90,30);
//        add(r2);
//        
//        l7.setBounds(100,340,200,30);
//        add(l7);
//        
//        t3.setBounds(300,340,400,30);
//        add(t3);
//        
//        l8.setBounds(100,390,200,30);
//        add(l8);
//        
//        r3.setBounds(300,390,100,30);
//        add(r3);
//        
//        r4.setBounds(450,390,100,30);
//        add(r4);
//        
//        r5.setBounds(635,390,100,30);
//        add(r5);
//        
//        
//        
//        l9.setBounds(100,440,200,30);
//        add(l9);
//        
//        t4.setBounds(300,440,400,30);
//        add(t4);
//        
//        l10.setBounds(100,490,200,30);
//        add(l10);
//        
//        t5.setBounds(300,490,400,30);
//        add(t5);
//        
//        l11.setBounds(100,540,200,30);
//        add(l11);
//        
//        t6.setBounds(300,540,400,30);
//        add(t6);
//        
//        l12.setBounds(100,590,200,30);
//        add(l12);
//        
//        t7.setBounds(300,590,400,30);
//        add(t7);
//        
//        b.setBounds(620,660,80,30);
//        add(b);
//        
//        b.addActionListener(this); 
//        
        getContentPane().setBackground(Color.WHITE);
//        
        setSize(850,800);
        setLocation(350,10);
        setVisible(true);
    }
//    
    public void actionPerformed(ActionEvent ae){
//        
        String formno = "" + random;
        String name = nameTextField.getText();
        String fname = fnameTextField.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(male.isSelected()){ 
            gender = "Male";
        }else if(female.isSelected()){ 
            gender = "Female";
        }
//            
        String email = emailTextField.getText();
        String marital =null;
        if(married.isSelected()){ 
            marital = "Married";
        }else if(unmarried.isSelected()){ 
            marital = "Unmarried";
        }else if(other.isSelected()){ 
            marital = "Other";
        }
//           
        String address = addressTextField.getText();
        String city = cityTextField.getText();
        String state = stateTextField.getText();
        String pin = pinTextField.getText();
//        
//
        try{
        	
        	if (name.equals("")) {
        		
        		JOptionPane.showMessageDialog(null, "Name is Required");
        	} else {
        		Conn C = new Conn();
        		String query = "insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
        		C.s.executeUpdate(query);
        		
        		setVisible(false);
        		new Signup2(formno).setVisible(true);
        	}
//           
//            if(t6.getText().equals("")){
//                JOptionPane.showMessageDialog(null, "Fill all the required fields");
//            }else{
//                Conn c1 = new Conn();
//                String q1 = "insert into signup values('"formno"'+"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
//                //String q1 = "insert into signup values('fdhfdsj','hhjbxx','15-5-2000','male','fdhdhh','g','hgfhf','hfhjvj','547657','fdgdfhgf')";
//                c1.s.executeUpdate(q1);
//                
//                new Signup2(first).setVisible(true);
//                setVisible(false);
//            }
//            
        } catch (Exception e) {
             System.err.println(e);
        }
//        
    }
    
    
//    
//    
    public static void main(String[] args){
        new Signup();/*.setVisible(true);*/
    }
}
