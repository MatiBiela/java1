import javax.swing.*;

public class ObrazFrame extends JFrame{

    public ObrazFrame(){
        super("Program obrazkowy");
        JPanel mypanel = new MyPanel();
        add(mypanel);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}