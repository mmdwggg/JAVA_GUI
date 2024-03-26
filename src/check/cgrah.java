package check;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cgrah implements ActionListener {
    private cgrav x;
    public cgrah(cgrav x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("按课程号查找".equals(text)){
            new cgranumv(x);
        }else if ("按学号查找".equals(text)){
            new cgraidv(x);
        }else if ("按成绩查找".equals(text)){
            new cgragv(x);
        }  else if ("返回".equals(text)) {
            x.dispose();
            new cview();
        }
    }
}
