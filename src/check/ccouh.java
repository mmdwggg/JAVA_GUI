package check;

import menu.menuview;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ccouh implements ActionListener {
    private ccouv x;
    public ccouh(ccouv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("按课程名查找".equals(text)){
            new ccounamev(x);
        }else if ("按课程号查找".equals(text)){
            new ccounumv(x);
        }else if ("按开课时间查找".equals(text)){
            new ccoutimev(x);
        }  else if ("返回".equals(text)) {
            x.dispose();
            new cview();
        }
    }
}
