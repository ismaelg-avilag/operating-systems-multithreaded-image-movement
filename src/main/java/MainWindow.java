import javax.swing.*;

public class MainWindow {
    private JLabel labelImage1;
    private JLabel labelImage2;
    private JLabel labelTitle;
    private JPanel mainPanel;

    MainWindow()
    {
        Thread thread1 = new Thread(new ImageMover(labelImage1, 50, 200, 2, 0));
        Thread thread2 = new Thread(new ImageMover(labelImage2, 50, 200, 0, 2));

        thread1.start();
        thread2.start();
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
