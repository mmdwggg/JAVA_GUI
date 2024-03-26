package visit;

import DATA.DATA;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class viscouv extends JFrame {
    JTable jt;
    JScrollPane js;
    public viscouv(){
        super("课程信息");
        Container con=getContentPane();
        setSize(1000,800);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        Vector<String> col=new Vector<>();
        col.addElement("课程名");
        col.addElement("课程号");
        col.addElement("学分");
        col.addElement("课时");
        col.addElement("开课时间");
        Vector<Vector<Object>> data=new Vector<>();
        int i;
        for (i=0; i< DATA.getCourses().size(); i++){
            Vector<Object> d=new Vector<>();
            d.addElement(DATA.getCourses().get(i).getName());
            d.addElement(DATA.getCourses().get(i).getNum());
            d.addElement(DATA.getCourses().get(i).getScores());
            d.addElement(DATA.getCourses().get(i).getTime());
            d.addElement(DATA.getCourses().get(i).getStart());
            data.addElement(d);
        }
        DefaultTableModel tm=new DefaultTableModel();
        tm.setDataVector(data,col);
        jt=new JTable(tm);
        js=new JScrollPane(jt);
        con.add(js);
    }
}