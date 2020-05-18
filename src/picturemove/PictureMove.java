package picturemove;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PictureMove extends JFrame implements KeyListener {


    private Icon icon,icon2;
    private JLabel lab;


    public PictureMove() {

        this.setSize(1000, 800);
        this.setLocationRelativeTo(null);
        this.setTitle("键盘事件演示");
        JPanel contentPane = new JPanel(null);
        setContentPane(contentPane);


        icon = new ImageIcon("src\\sources\\1.jpg");
        lab = new JLabel(icon);
        lab.setBounds(0, 0, 200, 200);
        addKeyListener(this);

        contentPane.add(lab);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }
    @Override
    public void keyPressed(KeyEvent e) {
        icon2 = new ImageIcon("src\\sources\\2.jpg");
        lab.setIcon(icon2);
    }

    @Override
    public void keyReleased(KeyEvent e) {

        lab.setIcon(icon);

        int x = lab.getX();
        int y = lab.getY();
        if (x >= 1000) {
            lab.setBounds(0, y, 200, 200);
        } else if (x < 0) {
            lab.setBounds(800, y, 200, 200);
        } else if (y < 0) {
            lab.setBounds(x, 800, 200, 200);
        } else if (y > 800) {
            lab.setBounds(x, 0, 200, 200);
        } else {
            if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                lab.setBounds(x - 50, y, 200, 200);
            }
            if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                lab.setBounds(x + 50, y, 200, 200);
            }
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                lab.setBounds(x, y - 50, 200, 200);
            }
            if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                lab.setBounds(x, y + 50, 200, 200);
            }
        }
    }

    public static void main(String[] args) {
        PictureMove pictureMove = new PictureMove();
    }
}

