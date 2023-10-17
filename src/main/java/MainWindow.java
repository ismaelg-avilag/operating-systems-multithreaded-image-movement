import javax.swing.*;

public class MainWindow {
    private JLabel labelImage1;
    private JLabel labelImage2;
    private JLabel labelTitle;
    private JPanel mainPanel;

    MainWindow()
    {

    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Práctica Hilos - 1");
        frame.setContentPane(new MainWindow().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

}
