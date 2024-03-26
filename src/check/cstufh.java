package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cstufh implements ActionListener {
    private cstufv x;
    public cstufh(cstufv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String field=x.getA2().getText();
            new cstufl(field);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
