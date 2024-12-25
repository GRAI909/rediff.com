import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
class rediff{
    public static void main(String arg[])
    {
        JFrame f=new JFrame("Rediff");

        JLabel L1,L2,L3,L4,L5,L6,L7,L8,L9,L10,L11,L12,L13,L14,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
        JTextField t1,t2,t3,t4,t5;
        JButton b1,b2;
        JPasswordField p1,p2;
        JCheckBox cb1;
        JComboBox cb2,cb3,cb4,cb5,cb6,cb7;
        JRadioButton r1,r2;

        Font f1=new Font("",Font.PLAIN,34);
        Font f2=new Font("",Font.PLAIN,18);

        L1=new JLabel("Home");
        L1.setBounds(3,-5,100,30);
        L1.setForeground(Color.BLUE);

        L2=new JLabel("rediff.com");
        L2.setFont(f1);
        L2.setForeground(Color.RED);
        L2.setBounds(3,15,1200,30);

        L3=new JLabel("____________________________________________________________________________________________________________________________________");
        L3.setBounds(0,30,1200,30);

        L4=new JLabel("Create a Radiffmail Account");
        L4.setFont(f2);
        L4.setBounds(20,40,600,40);

        L5=new JLabel("Full Name:");
        L5.setFont(f2);
        L5.setBounds(5,80,100,20);

        t1=new JTextField("");  
        t1.setBounds(300,80,200,25);

        l1=new JLabel("Enter your first name& last name");
        l1.setBounds(550,75,200,15);

        l2=new JLabel("Eg Sameer BhagWat");
        l2.setBounds(550,88,200,15);

        L6=new JLabel("Choose a Radiffmail ID:");
        L6.setFont(f2);
        L6.setBounds(5,115,500,20);

        t2=new JTextField("");  
        t2.setBounds(300,115,200,25);

        l3=new JLabel("@rediffmail.com");
        l3.setBounds(550,115,200,15);

        b1=new JButton(" Choose Availabitiy ");
        b1.setBounds(300,150,170,25);

        L7=new JLabel("Password:");
        L7.setFont(f2);
        L7.setBounds(5,185,500,20);

        p1=new JPasswordField();  
        p1.setBounds(300,185,200,25);

        l4=new JLabel("New Password:");
        l4.setBounds(550,150,200,15);

        l5=new JLabel("~ must contain 8-100 Chracters");
        l5.setBounds(550,180,200,15);

        l6=new JLabel("~ must contain both upper and lower case Chracters");
        l6.setBounds(550,195,300,15);

        L8=new JLabel("Retype Password:");
        L8.setFont(f2);
        L8.setBounds(5,230,500,20);

        p2=new JPasswordField();  
        p2.setBounds(300,230,200,25);

        l7=new JLabel("~ must containnumeric Chracters");
        l7.setBounds(550,220,200,15);

        l8=new JLabel("~ must contain special Chracters");
        l8.setBounds(550,235,200,15);

        L9=new JLabel("Alternate Email Address:");
        L9.setFont(f2);
        L9.setBounds(5,270,500,20);

        t3=new JTextField("");  
        t3.setBounds(300,270,200,25);

        l9=new JLabel("~ must be different from last 3 password user");
        l9.setBounds(550,265,400,15);

        l10=new JLabel("~ must not contain your username or firstname or lastname");
        l10.setBounds(550,275,400,35);

        cb1=new JCheckBox("Click if you don't have an alternate ID");
        cb1.setFont(f2);
        cb1.setBounds(300,310,600,35);

        L10=new JLabel("Mobile No.");
        L10.setFont(f2);
        L10.setBounds(5,350,500,20);

        String number[]={"+91","+1","+54","+93","+358","+355"};
        cb2=new JComboBox(number);
        cb2.setBounds(300,350,55,25);

        t4=new JTextField("");  
        t4.setBounds(360,350,170,25);

        l11=new JLabel("if you foget your password,");
        l11.setBounds(550,340,400,35);

        l12=new JLabel("recover your passwordvia text message");
        l12.setBounds(550,355,400,35);

        L11=new JLabel("Date Of Birth");
        L11.setFont(f2);
        L11.setBounds(5,385,500,20);

        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        cb3=new JComboBox(date);
        cb3.setBounds(300,385,55,25);

        String Month[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
        cb4=new JComboBox(Month);
        cb4.setBounds(370,385,100,25);

        String Year[]={"2001","2002","2003","2004","2005","2006","2007","2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019","2020","2021","2022","2023","2024","2025","2026"};
        cb5=new JComboBox(Year);
        cb5.setBounds(480,385,100,25);

        L12=new JLabel("Gender:");
        L12.setFont(f2);
        L12.setBounds(5,420,500,20);

        r1=new JRadioButton("Male");
        r1.setBounds(300,420,100,25);

        r2=new JRadioButton("Female");
        r2.setBounds(400,420,100,25);

        ButtonGroup bg=new ButtonGroup();
        bg.add(r1); bg.add(r2);

        L13=new JLabel("I live in:");
        L13.setFont(f2);
        L13.setBounds(5,470,500,20);

        String Country[]={"Country","Argentina","Bangladesh","Cambodia","Japan"};
        cb6=new JComboBox(Country);
        cb6.setBounds(300,455,100,25);

        String City[]={"City","UP","Mumbai","Delhi","Kolkata"};
        cb7=new JComboBox(City);
        cb7.setBounds(300,485,100,25);

        L14=new JLabel("Enteer the text shown above:");
        L14.setFont(f2);
        L14.setBounds(5,520,500,20);

        t5=new JTextField("");  
        t5.setBounds(300,520,170,25);

        b2=new JButton(" Create my account>>");
        b2.setBounds(300,560,170,25);

        f.add(L1);f.add(L2);f.add(L3);f.add(L4);f.add(L5);f.add(L6);f.add(L7);f.add(L8);f.add(L9);f.add(L10);f.add(L11);f.add(L12);f.add(L13);f.add(L14);

        f.add(t1);f.add(t2);f.add(t3);f.add(t4);f.add(t5);

        f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);f.add(l12);

        f.add(b1);f.add(b2);

        f.add(p1);f.add(p2);

        f.add(cb1);f.add(cb2);f.add(cb3);f.add(cb4);f.add(cb5);f.add(cb6);f.add(cb7);

        f.add(r1);f.add(r2);

        f.setSize(1200,1200);
        f.setLayout(null);
        f.setVisible(true);
    }
}