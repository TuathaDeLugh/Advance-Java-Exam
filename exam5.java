import javax.swing.*;
import java.sql.*;
import java.awt.event.*;

public class exam5 extends JFrame {
    JLabel lblName, lblSem,lblid;
    JTextField tfName, tfSem,tfid;
    JButton btnInsert,btnDelete,btnUpdate;
    exam5(){
        super("exam5");
        lblid=new JLabel("ID: ");
        lblName=new JLabel("Name: ");
        lblSem=new JLabel("Sem: ");
        
        lblid.setBounds(30, 20, 100, 25);
        lblName.setBounds(30, 50, 100, 25);
        lblSem.setBounds(30, 80, 100, 25);
        

        tfid=new JTextField(20);
        tfName=new JTextField(20);
        tfSem=new JTextField(20);
        tfid.setBounds(130, 20, 150, 25);
        tfName.setBounds(130, 50, 150, 25);
        tfSem.setBounds(130, 80, 150, 25);

        btnInsert=new JButton("INSERT");
        btnDelete=new JButton("DELETE");
        btnUpdate=new JButton("UPDATE");
        btnDelete.setBounds(260, 120, 100, 30);
        btnInsert.setBounds(20, 120, 100, 30);
        btnUpdate.setBounds(140, 120, 100, 30);

        setLayout(null);

        add(lblid);
        add(tfid);
        add(lblName);
        add(tfName);
        add(lblSem); 
        add(tfSem);
        add(btnInsert);
        add(btnUpdate);
        add(btnDelete);
        setSize(600,400);
        setVisible(true);
        
        btnInsert.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                performQuery("Insert into Student values("+tfid.getText()+",'"+tfName.getText()+"',"+tfSem.getText()+")"); 
                System.out.println("Data Inserted");
                
                
                }
                catch(Exception e1){}
            }
        });
        btnDelete.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                performQuery("delete from Student where id="+tfid.getText());
                System.out.println("Data Deleted");
                
                }
                catch(Exception e1){}
            }
        });
        btnUpdate.addActionListener(new ActionListener(){
        
            @Override
            public void actionPerformed(ActionEvent e) {
                performQuery("update Student set Name='"+tfName.getText()+"', Sem="+tfSem.getText()+" where id="+tfid.getText());
                System.out.println("Data Updated");
                
            }
        });
    }
    
    public void performQuery(String query){
        Connection con=null;
        Statement st=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", "");
            st=con.createStatement();
            st.executeUpdate(query);
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Query Not Executed \n"+e);
        }
    }
    public static void main(String[] args) {
        new exam5();
    }
}