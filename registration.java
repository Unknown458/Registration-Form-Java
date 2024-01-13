import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class registration  implements ActionListener {
JFrame c;
JButton submit,reset;
JLabel title,name,mobile,gender,dob,address;
JCheckBox box;
JRadioButton male,female;
JComboBox date,month,year;
JTextArea addressta,containerta;
JTextField nametf,mobiletf;

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
};

public registration(){
    
    c= new JFrame("Registearion Form");
      c.setBounds(300,90,900,600);
      c.setResizable(false);
          
      c.setLayout(null);
      c.setVisible(true);
    
    title = new JLabel("Registration Form");
  
  title.setFont(new Font("Arial", Font.PLAIN, 32));
  title.setSize(300,30);
  title.setLocation(300,30);
  c.add(title);
  
  name= new JLabel("Name");
  name.setFont(new Font("Arial", Font.PLAIN, 20));
  name.setBounds(100,100,100,20);
  c.add(name);

   nametf=new JTextField();
   nametf.setFont(new Font("Arial", Font.PLAIN, 15));
   nametf.setBounds(200,100,190,20);
   c.add(nametf);

  mobile= new JLabel("Mobile");
  mobile.setFont(new Font("Arial", Font.PLAIN, 20));
  mobile.setBounds(100,150,100,20);
  c.add(mobile);

  mobiletf = new JTextField();
  nametf.setFont(new Font("Arial", Font.PLAIN, 15));
  nametf.setBounds(200,150,190,20);
  c.add(mobiletf);

 gender= new JLabel("Gender");
 gender.setFont(new Font("Arial", Font.PLAIN, 20));
 gender.setBounds(100,200,100,20);
 c.add(gender);

 male= new JRadioButton("Male");
 male.setBounds(200,200,75,20);
 male.setFont(new Font("Arial", Font.PLAIN, 15));
 c.add(male);

 female = new JRadioButton("Female");
female.setBounds(250,200,75,20);
female.setFont(new Font("Arial", Font.PLAIN, 15));
c.add(female);

dob= new JLabel("DOB");
dob.setFont(new Font("Arial", Font.PLAIN, 20));
dob.setBounds(100,250,100,20);
c.add(dob);

date= new JComboBox<>(dates);
date.setFont(new Font("Arial", Font.PLAIN, 15));

date.setBounds(200,250,50,20);
c.add(date);

month = new JComboBox<>(months);
month.setFont(new Font("Arial", Font.PLAIN, 15));
month.setBounds(250,250,50,20);
c.add(month);

year = new JComboBox<>(years);
year.setFont(new Font("Arial", Font.PLAIN, 15));
year.setBounds(300,250,50,20);
c.add(year);


address= new JLabel("Address");
address.setFont(new Font("Arial", Font.PLAIN, 20));
address.setBounds(100,300,100,20);
c.add(address);

addressta= new JTextArea();
addressta.setBounds(200,300,100,50);
addressta.setFont(new Font("Arial", Font.PLAIN, 15));
c.add(addressta);

box= new JCheckBox("Accept Term And Condition.");
box.setBounds(150,400,250,20);
box.setFont(new Font("Arial", Font.PLAIN,15));
c.add(box);

submit = new JButton("Submit");
submit.setBounds(150,450,100,20);
submit.setFont(new Font("Arial", Font.PLAIN, 15));
c.add(submit);

reset= new JButton("Reset");
reset.setBounds(270,450,100,20);
reset.setFont(new Font("Arial", Font.PLAIN, 15));
c.add(reset);

containerta= new JTextArea();
containerta.setBounds(500,175,200,75);
containerta.setFont(new Font("Arial", Font.PLAIN, 15));
c.add(containerta);


}
public void actionPerformed(ActionEvent e)
{
  if(e.getSource() == submit){
    if(box.isSelected()){
        String data1;
        String data = "Name : " + nametf.getText() + "\n" + "Mobile : " +mobiletf.getText() + "\n";
        if(male.isSelected()){
        data1 = "Gender : Male" + "\n";
        }
        else{
        data1 = "Gender : Female" + "\n";
        }

        String data2 = "DOB : " + (String)date.getSelectedItem() + "/" + (String)month.getSelectedItem() + "/" + (String)year.getSelectedItem() + "\n";

        String data3 = "Address : " + addressta.getText();
        containerta.setText(data+data1+data2+data3);
         containerta.setEditable(false);
        
    }
    else
    {
        containerta.setText("");

    }
  }
  else if (e.getSource() == reset);{
    String def = "";
    nametf.setText((def));
    addressta.setText(def);
    mobiletf.setText(def);
    date.setSelectedIndex(0);
    month.setSelectedIndex(0);
    year.setSelectedIndex(0);
  
  }
}

public static void main(String[] args) throws Exception{
    new registration();
}



    
}