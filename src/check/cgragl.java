package check;

import DATA.DATA;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.util.Vector;

public class cgragl extends JFrame {
    JTable jt;
    JScrollPane js;
    public cgragl(int min,int max){
        super("成绩信息");
        Container con=getContentPane();
        setSize(1000,800);
        setLocationRelativeTo(null);
        setResizable(true);
        setVisible(true);
        Vector<String> col=new Vector<>();
        col.addElement("课程号");
        col.addElement("学号");
        col.addElement("考试日期");
        col.addElement("成绩");
        Vector<Vector<Object>> data=new Vector<>();
        int i;
        for (i=0; i< DATA.getGrades().size(); i++){
            if (DATA.getGrades().get(i).getGrade()>=min&&DATA.getGrades().get(i).getGrade()<=max){
                Vector<Object> d=new Vector<>();
                d.addElement(DATA.getGrades().get(i).getNum());
                d.addElement(DATA.getGrades().get(i).getId());
                d.addElement(DATA.getGrades().get(i).getDay());
                d.addElement(DATA.getGrades().get(i).getGrade());
                data.addElement(d);
            }
        }
        DefaultTableModel tm=new DefaultTableModel();
        tm.setDataVector(data,col);
        jt=new JTable(tm);
        js=new JScrollPane(jt);
        con.add(js);
    }
}
