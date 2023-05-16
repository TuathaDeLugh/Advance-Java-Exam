import java.awt.Canvas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JCheckBox;
import javax.swing.JFrame;




public class exam3 extends JFrame {
    
    private JCheckBox c1;
    private JCheckBox c2;
    private JCheckBox c3;
    
    Canvas c;
    
    public exam3()
    {
      super("hello");
        c=new Canvas();
        c.setSize(30,30);
         c.setBackground(Color.black);
        
        add(c);
        setLayout(new FlowLayout());
        
        setSize(300,300);
        setVisible(true);
        
        c1=new JCheckBox("blue");
        c2=new JCheckBox("red");
        c3=new JCheckBox("green");
        
        add(c1);
        add(c2);
        add(c3);
        
        Handler h=new Handler();
        
        c1.addItemListener(h);
        c2.addItemListener(h);
        c3.addItemListener(h);
       
    }
   
    
private class Handler extends Canvas implements ItemListener
{

    Color color;
        @Override
        public void itemStateChanged(ItemEvent e) {
            
            
            if(c1.isSelected() && c2.isSelected())
            {
                color=Color.MAGENTA;
                update(color);
            }
            else if(c1.isSelected())
            {
                color=Color.BLUE;
                update(color);
            }
            else if(c3.isSelected())
            {
                color=Color.GREEN;
                update(color);
            }
            else if(c2.isSelected())
            {
                color=Color.red;
                update(color);
            }
            
        }
        
        public void update(Color ccc)
        {
                c.setBackground(ccc);
        }
    
}

         public static void main(String args[])
        {
              exam3 j=new exam3();
     }



}