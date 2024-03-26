package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cstunameh implements ActionListener {
    private cstunamev x;
    public cstunameh(cstunamev x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String name=x.getA2().getText();
            new cstunamel(name);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
