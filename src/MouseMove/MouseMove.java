package MouseMove;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class MouseMove extends JFrame implements MouseListener {
    private JPanel panel = new JPanel();
    private JLabel lab = new JLabel("(0,0)");


    public MouseMove() {
        this.setSize(600, 400);
        this.setContentPane(panel);
        panel.add(lab);

        this.setTitle("鼠标事件演示");
        this.addMouseListener(this);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void mouseClicked(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        lab.setText("(" + x + "," + y + ")");
    }


    public void mouseEntered(MouseEvent e) {
    }


    public void mouseExited(MouseEvent e) {
    }


    public void mouseReleased(MouseEvent e) {
    }


    public void mousePressed(MouseEvent e) {
    }

    public static void main(String[] args) {
        MouseMove mm = new MouseMove();
    }
}

