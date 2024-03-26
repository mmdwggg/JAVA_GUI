package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cgragh implements ActionListener {
    private cgragv x;
    public cgragh(cgragv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String min1=x.getA2().getText();
            int min=Integer.parseInt(min1);
            String max1=x.getB2().getText();
            int max=Integer.parseInt(max1);
            new cgragl(min,max);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
            x.getB2().setText("");
        }
    }
}
