import javax.swing.*;

public class ImageMover implements Runnable {
    private JLabel labelImage;
    private int x, y;
    private int xDirection;
    private int yDirection;
    private int xMax, yMax;

    public ImageMover(JLabel labelImage, int x, int y, int xDirection, int yDirection, int xMax, int yMax)
    {
        this.labelImage = labelImage;
        this.x = x;
        this.y = y;
        this.xDirection = xDirection;
        this.yDirection = yDirection;
        this.xMax = xMax;
        this.yMax = yMax;
    }

    public void run()
    {
        while(true) {
            x += xDirection;
            y += yDirection;

            if(x < 0 || x > xMax - labelImage.getWidth())
                xDirection *= -1;

            if(y < 0 || y > yMax - labelImage.getHeight())
                yDirection *= -1;

            SwingUtilities.invokeLater(() -> {
                labelImage.setLocation(x, y);
            });

            try {
                Thread.sleep(3);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
