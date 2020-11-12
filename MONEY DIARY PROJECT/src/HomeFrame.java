import javax.swing.*;
import java.awt.*;

public class HomeFrame extends JFrame {
    JMenuBar bar;
    JMenu file, newTransaction, viewStatistics, modifyData, setting, help;
    JMenuItem saveAs,print,logOut, exit;
    JMenuItem addIncome,addCost;
    JMenuItem viewCurrentMonthTrasactions,viewATimePeriodTransactions,viewSpecificYearTransactions, viewSpecificMonthTransactions, viewSpecificDayTransactions,viewSpecificTypeTransaction, viewAllTransactions;
    JMenuItem searchTransactionFromCurrentMonth,searchTransactionFromSpecificPeriod, searchTransactionFromSpecificYear,searchTransactionFromSpecificMonth,searchTransactionFromSpecificDay,searchTransactionFromSpecificCategory,searchTransactionFromAllData;
    JMenuItem AddIncomeCategory,AddExpensesCategory,currencySetting,themeSetting,profileSetting;

    JPanel menuPane;
    Container c;
    public HomeFrame (){}
    public HomeFrame( String userName){

        c = this.getContentPane();
        c.setLayout(new BorderLayout(20,20));

        /*menuPane = new JPanel(new FlowLayout(-2));
        menuPane.setBackground(Color.gray);
        c.add(menuPane,BorderLayout.NORTH);*/

        //menuBer
        bar = new JMenuBar();
        bar.setBackground(Color.lightGray);
        setJMenuBar(bar);

        //menu
        file = new JMenu(" File ");
        newTransaction = new JMenu(" Add New Transections ");
        viewStatistics = new JMenu(" View Transection History ");
        modifyData = new JMenu(" Modify/Delete Data ");
        setting = new JMenu(" Settings ");
        help= new JMenu(" Help ");

       //addinng menu on menubar
        bar.add(file);
        bar.add(newTransaction);
        bar.add(viewStatistics);
        bar.add(modifyData);
        bar.add(setting);
        bar.add(help);

        //MenueItem for File menu
        saveAs = new JMenuItem("Save As");
        print = new JMenuItem("Print");
        logOut = new JMenuItem("Log Out");
        exit = new JMenuItem("Exit");

        //add menuItem in fileMenue
        file.add(saveAs);
        file.add(print);
        file.add(logOut);
        file.add(exit);

        //MenueItem for  "New Transections menu"
        addIncome = new JMenuItem("Add Income");
        addCost = new JMenuItem("Add Cost");

        //add Add New Transections Items in newTransection menu
        newTransaction.add(addIncome);
        newTransaction.add(addCost);

        //MenueItem for ViewStatistics menu
        viewCurrentMonthTrasactions = new JMenuItem("View Current Month Transactions");
        viewATimePeriodTransactions = new JMenuItem("View A Time Period Transactions");
        viewSpecificYearTransactions = new JMenuItem("View Specific Year Transactions");
        viewSpecificMonthTransactions = new JMenuItem("View Specific Month Transactions");
        viewSpecificDayTransactions = new JMenuItem("View Specific Day Transactions");
        viewSpecificTypeTransaction = new JMenuItem("View Transactions On Specific Categories");
        viewAllTransactions = new JMenuItem("View All Transactions");

        //Add ViewStatistics Items in "View Transection History" menu
        viewStatistics.add(viewCurrentMonthTrasactions);
        viewStatistics.add(viewATimePeriodTransactions);
        viewStatistics.add(viewSpecificYearTransactions);
        viewStatistics.add(viewSpecificMonthTransactions);
        viewStatistics.add(viewSpecificDayTransactions);
        viewStatistics.add(viewSpecificTypeTransaction);
        viewStatistics.add(viewAllTransactions);

        //MenueItem for  modify menu
        searchTransactionFromCurrentMonth = new JMenuItem("Search Transactions From Current Month");
        searchTransactionFromSpecificPeriod = new JMenuItem("Search Transactions From Specific Period");
        searchTransactionFromSpecificYear = new JMenuItem("Search Transactions From Specific Year");
        searchTransactionFromSpecificMonth = new JMenuItem("Search Transactions From Specific Month");
        searchTransactionFromSpecificDay = new JMenuItem("Search Transactions From Specific Day");
        searchTransactionFromSpecificCategory = new JMenuItem("Search Transactions From Specific Category");
        searchTransactionFromAllData = new JMenuItem("Search Transactions From All Data");

        //Add Modify Items in "Modify/Delete Data" menu
        modifyData.add(searchTransactionFromCurrentMonth);
        modifyData.add(searchTransactionFromSpecificPeriod);
        modifyData.add(searchTransactionFromSpecificYear);
        modifyData.add(searchTransactionFromSpecificMonth);
        modifyData.add(searchTransactionFromSpecificDay);
        modifyData.add(searchTransactionFromSpecificCategory);
        modifyData.add(searchTransactionFromAllData);

        //MenueItem for Setting menu
        AddIncomeCategory = new JMenuItem("Add Income Category");
        AddExpensesCategory = new JMenuItem("Add Expense Category");
        currencySetting = new JMenuItem("Currency Settings");
        themeSetting = new JMenuItem("Theme Settings");
        profileSetting = new JMenuItem("Profile Settings");
        //Add MenueItems in "Settings" menu
        setting.add(AddIncomeCategory);
        setting.add(AddExpensesCategory);
        setting.add(currencySetting);
        setting.add(themeSetting);
        setting.add(profileSetting);

        //userName;



    }

}
