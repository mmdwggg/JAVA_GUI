package check;

import DATA.DATA;
import delect.delectview;
import delect.destuh;
import delect.destuv;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class cstuidh implements ActionListener {
    private cstuidv x;
    public cstuidh(cstuidv x){
        this.x=x;
    }


    public void actionPerformed(ActionEvent e) {
        JButton j=(JButton) e.getSource();
        String text=j.getText();
        if ("查找".equals(text)){
            String id=x.getA2().getText();
            new cstuidl(id);
            x.dispose();
        }else if ("重置".equals(text)){
            x.getA2().setText("");
        }
    }
}
