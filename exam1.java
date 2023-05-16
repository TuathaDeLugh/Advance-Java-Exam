import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;





// <applet code="practical2" width="500" height="400">
// </applet>

public class exam1 extends Applet{
    public void init()
    {
        super.init();
        setSize(350,350);
    }
    public void paint(Graphics s)
    {
        for(int i=0;i<10;i++)
        {
       s.setColor(Color.red);
       s.fillOval(100, i*50, 50, 50);
    }
        
    }
    

}
