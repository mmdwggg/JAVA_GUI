package menu;
import DATA.DATA;
import javax.swing.*;
import java.io.IOException;
public class Main {
    public static void main(String[] args)throws IOException {
        DATA.read();
        DATA.write();
        new menuview();
    }
}