import java.applet.Applet;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class exam2 extends Applet implements ActionListener {

    Button b;
    public void init()
    {
        b=new Button();
        b.setLabel("Start");
        b.addActionListener(this);
        add(b);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
     
      if(b.getLabel()== "Start")
        {
          b.setLabel("Stop");
      }
      else
      {
       b.setLabel("Start");
          
      }
        
        
    }
    

}
