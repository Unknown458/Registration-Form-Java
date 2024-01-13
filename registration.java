import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class registration extends JFrame implements ActionListener {
Container c;
JButton submit,reset;
JLabel title,name,mobile,gender,dob,address,accept;
JCheckBox box;
JRadioButton male,female;
JComboBox date,month,year;
JTextArea addressta,containerta;
JTextField tf;

String dates[] = {
    "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" 
};

String months[] = {
    "jan","feb","march","apr","may","jun","july","agust","sept","oct","nov","dec"
};
String years[] = {
    "1995", "1996", "1997", "1998",
            "1999", "2000", "2001", "2002",
            "2003", "2004", "2005", "2006",
            "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014",
            "2015", "2016", "2017", "2018",
            "2019" ,"2020","2023","2024"
}

lol(){
   
    setTitle("Registration Form");
     setBounds(300,90,900,600);
     setResizable(false);
     
     c = getContentPane();
     c.setLayout(null);

  title = new JLabel("Registration Form");
  
  title.setFont(new Font("Arial", Font.PLAIN, 32));
  title.setSize(300,30);
  title.setLocation(300,30);
  c.add(title);
}



    
}