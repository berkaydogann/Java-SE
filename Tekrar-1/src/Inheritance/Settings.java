package Inheritance;

import javax.swing.*;
import java.awt.*;

public class Settings extends JFrame {

    public Settings() {
        setTitle("");
        setBackground(null);
    }

    @Override
    public void setTitle(String title) {
        super.setTitle("Main app");
    }

    @Override
    public void setBackground(Color bgColor) {
        this.getContentPane().setBackground(Color.darkGray);
    }
}
