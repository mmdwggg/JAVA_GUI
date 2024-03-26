package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cstusexh implements ActionListener {
    private cstusexv x;
    public cstusexh(cstusexv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String sex=x.getA2().getText();
            new cstusexl(sex);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
