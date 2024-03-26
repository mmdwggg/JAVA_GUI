package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ccounumh implements ActionListener {
    private ccounumv x;
    public ccounumh(ccounumv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String num=x.getA2().getText();
            new ccounuml(num);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
