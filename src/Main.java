import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;



class Project extends JFrame{
    JLabel pic;


    int x = 0;
    //Images Path In Array
    String[] list = {
            "D:/4 курс - 1с/управління ІТ/photo_2022-10-05_07-07-50.jpg",//0
            "D:/4 курс - 1с/управління ІТ/photo_2022-10-05_07-07-54.jpg",//1
            "D:/4 курс - 1с/управління ІТ/photo_2022-10-05_07-07-58.jpg",//2
            "D:/4 курс - 1с/управління ІТ/photo_2022-10-05_07-07-58.jpg",//3

    };

    public Project(){
        super("Java SlideShow");
        pic = new JLabel();
        pic.setBounds(40, 30, 700, 300);

        //Call The Function SetImageSize
        SetImageSize(3);
        //set a timer
        pic.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {
                SetImageSize(x);
                x += 1;
                if(x >= list.length )
                    x = 0;
            }
        });
        add(pic);

        setLayout(null);
        setSize(800, 400);
        getContentPane().setBackground(Color.decode("#bdb67b"));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    //create a function to resize the image
    public void SetImageSize(int i){
        ImageIcon icon = new ImageIcon(list[i]);
        Image img = icon.getImage();
        Image newImg = img.getScaledInstance(pic.getWidth(), pic.getHeight(), Image.SCALE_SMOOTH);
        ImageIcon newImc = new ImageIcon(newImg);
        pic.setIcon(newImc);
    }

    public static void main(String[] args){

        new Project();
    }
}