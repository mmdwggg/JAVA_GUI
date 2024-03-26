package check;

import menu.menuview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class cstuh implements ActionListener {
    private cstuv x;
    public cstuh(cstuv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("按学号查找".equals(text)){
            new cstuidv(x);
        }else if ("按姓名查找".equals(text)){
            new cstunamev(x);
        }else if ("按性别查找".equals(text)){
            new cstusexv(x);
        } else if ("按专业查找".equals(text)) {
            new cstufv(x);
        } else if ("返回".equals(text)) {
            x.dispose();
            new cview();
        }
    }
}
