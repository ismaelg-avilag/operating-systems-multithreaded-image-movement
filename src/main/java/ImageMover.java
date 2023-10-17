import javax.swing.*;

public class ImageMover implements Runnable {
    private JLabel labelImage;
    private int x, y;
    private int xDirection;
    private int yDirection;

    public ImageMover(JLabel labelImage, int x, int y, int xDirection, int yDirection)
    {
        this.labelImage = labelImage;
        this.x = x;
        this.y = y;
        this.xDirection = xDirection;
        this.yDirection = yDirection;
    }

    public void run()
    {
        while(true) {
            x += xDirection;
            y += xDirection;

            SwingUtilities.invokeLater(() -> {
                labelImage.setLocation(x, y);
            });

            try {
                Thread.sleep(10L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
