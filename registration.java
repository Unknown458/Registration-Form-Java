import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * registration
 */
public class registration implements ActionListener {

  String dates[] = { "1", "2", "3", "4", "5",
      "6", "7", "8", "9", "10",
      "11", "12", "13", "14", "15",
      "16", "17", "18", "19", "20",
      "21", "22", "23", "24", "25",
      "26", "27", "28", "29", "30",
      "31" };

  String months[] = { "Jan", "feb", "Mar", "Apr",
      "May", "Jun", "July", "Aug",
      "Sup", "Oct", "Nov", "Dec" };

  String years[] = { "1995", "1996", "1997", "1998",
      "1999", "2000", "2001", "2002",
      "2003", "2004", "2005", "2006",
      "2007", "2008", "2009", "2010",
      "2011", "2012", "2013", "2014",
      "2015", "2016", "2017", "2018",
      "2019", "2020", "2021", "2022", "2023", "2024" };

      JFrame f ;
      JLabel title;
      JLabel name;
      JLabel mobile;
      JLabel gender;
      JLabel dob;
      JLabel address;
      JTextField f1, f2;
      JRadioButton male, female;
      JComboBox<String> date, month, year;
      JTextArea area, allarea;
      JCheckBox box;
      JButton submit, reset;
      JLabel info;

 public registration() {
     f = new JFrame("Registration Form");
    title = new JLabel("Registration Form");
    title.setBounds(300, 30, 300, 30);
    title.setFont(new Font("Arial", Font.PLAIN, 30));

     name = new JLabel("Name");
    name.setBounds(100, 100, 100, 20);
    name.setFont(new Font("Arial", Font.PLAIN, 20));

     mobile = new JLabel("Mobile");
    mobile.setBounds(100, 150, 100, 20);
    mobile.setFont(new Font("Arial", Font.PLAIN, 20));

     gender = new JLabel("Gender");
    gender.setBounds(100, 200, 100, 20);
    gender.setFont(new Font("Arial", Font.PLAIN, 20));

     dob = new JLabel("DOB");
    dob.setBounds(100, 250, 100, 20);
    dob.setFont(new Font("Arial", Font.PLAIN, 20));

     address = new JLabel("Address");
    address.setBounds(100, 300, 100, 20);
    address.setFont(new Font("Arial", Font.PLAIN, 20));

    f1 = new JTextField();
    f1.setBounds(200, 100, 150, 20);
    f1.setFont(new Font("Arial", Font.PLAIN, 15));

     f2 = new JTextField();
    f2.setBounds(200, 150, 150, 20);
    f2.setFont(new Font("Arial", Font.PLAIN, 15));

     male = new JRadioButton("Male");
    male.setBounds(200, 200, 75, 20);
    male.setFont(new Font("Arial", Font.PLAIN, 15));

     female = new JRadioButton("Female");
    female.setBounds(275, 200, 75, 20);
    female.setFont(new Font("Arial", Font.PLAIN, 15));

    ButtonGroup bg = new ButtonGroup();
    bg.add(female);
    bg.add(male);

     date = new JComboBox<>(dates);
    date.setBounds(200, 250, 50, 20);
    date.setFont(new Font("Arial", Font.PLAIN, 15));

    month = new JComboBox<>(months);
    month.setBounds(255, 250, 60, 20);
    month.setFont(new Font("Arial", Font.PLAIN, 15));

    year = new JComboBox<>(years);
    year.setBounds(320, 250, 60, 20);
    year.setFont(new Font("Arial", Font.PLAIN, 15));

     area = new JTextArea();
    area.setBounds(200, 300, 200, 75);
    area.setFont(new Font("Arial", Font.PLAIN, 15));

     box = new JCheckBox("Accept Term And Conditions.");
    box.setBounds(150, 400, 250, 20);
    box.setFont(new Font("Arial", Font.PLAIN, 15));

     submit = new JButton("Submit");
    submit.setBounds(150, 450, 100, 20);
    submit.addActionListener(this);
    submit.setFont(new Font("Arial", Font.PLAIN, 15));

     reset = new JButton("Reset");
    reset.setBounds(270, 450, 100, 20);
    reset.addActionListener(this);
    reset.setFont(new Font("Arial", Font.PLAIN, 15));

     info = new JLabel("");
    info.setBounds(100, 500, 500, 25);

    info.setFont(new Font("Arial", Font.PLAIN, 15));

    allarea = new JTextArea();
    allarea.setBounds(520, 100, 300, 300);
    allarea.setFont(new Font("Arial", Font.PLAIN, 15));

    f.add(title);
    f.add(name);
    f.add(mobile);
    f.add(gender);
    f.add(dob);
    f.add(address);
    f.add(f1);
    f.add(f2);
    f.add(male);
    f.add(female);
    f.add(date);
    f.add(month);
    f.add(year);
    f.add(area);
    f.add(box);
    f.add(submit);
    f.add(reset);
    f.add(info);
    f.add(allarea);
    f.setBounds(300, 90, 900, 600);
    f.setLayout(null);
    f.setVisible(true);
  }

  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == submit) {
      if (box.isSelected()) {
        String data1;
        String data = "Name : "
            + f1.getText() + "\n"
            + "Mobile : "
            + f2.getText() + "\n";
        if (male.isSelected())
          data1 = "Gender : Male"
              + "\n";
        else
          data1 = "Gender : Female"
              + "\n";
        String data2 = "DOB : "
            + (String) date.getSelectedItem()
            + "/" + (String) month.getSelectedItem()
            + "/" + (String) year.getSelectedItem()
            + "\n";

        String data3 = "Address : " + area.getText();
        allarea.setText(data + data1 + data2 + data3);
        allarea.setEditable(false);
        info.setText("Registration Successfully..");
      } else {
        allarea.setText("");

        info.setText("Please accept the"
            + " terms & conditions..");
      }
    }

    else if (e.getSource() == reset) {
      String def = "";
      f1.setText(def);
      area.setText(def);
      f2.setText(def);
      info.setText(def);
      allarea.setText(def);
      box.setSelected(false);
      date.setSelectedIndex(0);
      month.setSelectedIndex(0);
      year.setSelectedIndex(0);

    }
  }

  public static void main(String[] args) {
    new registration();
  }

}