import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class AwtExam extends Frame implements ActionListener
 {
    TextField tf;
    
    AwtExam()
    {
        Button b = new Button("submit");
        add(b);
        b.addActionListener(this);
       tf = new TextField();
        add(tf);


        setVisible(true);
        setLayout(new FlowLayout());
        setSize(200,200);

    }
public void actionPerformed(ActionEvent e)
{
   String s = tf.getText();
   System.out.println(s);

}

    public static void main(String[] args) {
        new AwtExam();
        
    }
}

