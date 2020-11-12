import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import java.awt.*;
/**
 * Created by user on 12/26/2016.
 */
abstract public class AbstractClass {
    JFrame absFrame ;
    JLabel dateLb,categoryLb,amountLb,accountLb,memoLb;
    JComboBox dayJc,monthJc,yearJc,categoryJc,accountJc;
    JTextField amountTf;
    JButton addBt,updateBt,deleteBt;
    JTable jt;
    JPanel panel1,panelForButton;
    DefaultTableModel model;
    Object[] row = new Object[3];
    Container c;
    public AbstractClass() {
        absFrame = new JFrame();
        absFrame.setVisible(true);
        absFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        absFrame.setBounds(0,0,700,500);
        c = absFrame.getContentPane();
        c.setLayout(null);
        //code for create frame for Abstract class;
        dateLb = new JLabel("Date : ");
        categoryLb = new  JLabel("Category : ");
        amountLb = new JLabel("Amount : ");
        accountLb = new JLabel("Account : ");
        memoLb = new JLabel("Memo : ");
        //code for JLabel;
        dateLb.setBounds(250,30,60,20);
        categoryLb.setBounds(250,70,80,20);
        amountLb.setBounds(250,110,80,20);
        accountLb.setBounds(250,150,80,20);
        memoLb.setBounds(250,190,60,20);
        //setBounds for JLabel;
        String[] Day_arr = new String[31];
        for (int i = 1; i <= Day_arr.length; i++) {
            Day_arr[i - 1] = Integer.toString(i);
        }
        dayJc = new JComboBox(Day_arr);

        String[] month_arr = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthJc = new JComboBox(month_arr);
        String[] year_arr = new String[101];
        for (int i = 1950; i <= 2050; i++) {
            year_arr[i - 1950] = Integer.toString(i);
        }
        yearJc = new JComboBox(year_arr);
        //JComboBox for date;
        String category[] = {"","Salary","Tution fee","Business","Poket money"};
        categoryJc = new JComboBox(category);
        //JcomboBox for category;
        String account[] = {"","Bank","Cash","BCash","cheque"};
        accountJc = new JComboBox(account);
        //JComboBox for account;
        dayJc.setBounds(320,30,50,20);
        monthJc.setBounds(380,30,60,20);
        yearJc.setBounds(450,30,70,20);
        categoryJc.setBounds(330,70,100,20);
        accountJc.setBounds(330,150,100,20);
        //setBounds for JComboBox;
        amountTf = new JTextField();
        //JTextField for amount;
        amountTf.setBounds(330,110,100,20);
        //setBounds for amount;
        addBt = new JButton("Add");
        updateBt = new JButton("Update");
        deleteBt = new JButton("Delete");
        //code for JButton;
        addBt.setBounds(250,250,60,30);
        updateBt.setBounds(330,250,100,30);
        deleteBt.setBounds(450,250,100,30);
        //setBounds for JButton;
        panel1 = new JPanel();
        panel1.setBackground(Color.gray);
       panel1.setBounds(240,20,250,200);
       // panel1 for date to memo;
        panelForButton = new JPanel();
        panelForButton.setBackground(Color.gray);
        panelForButton.setBounds(260,230,240,35);
        // JPanel for button;



        c.add(panel1);
        panel1.add(dateLb);
        panel1.add(dayJc);
        panel1.add(monthJc);
        panel1.add(yearJc);
        panel1.add(categoryLb);
        panel1.add(categoryJc);
        panel1.add(amountLb);
        panel1.add(amountTf);
        panel1.add(accountLb);
        panel1.add(accountJc);
        panel1.add(memoLb);
        c.add(panelForButton);
        panelForButton.add(addBt);
        panelForButton.add(updateBt);
        panelForButton.add(deleteBt);

    }
}
