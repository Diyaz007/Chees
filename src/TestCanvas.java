import java.awt.*;

public class TestCanvas extends Canvas {
    public TestCanvas() {
    }
    @Override
    public void paint(Graphics graphics) {
        int counterX = 0;
        int counterY = 0;
        String[] cc = {"a","b","c","d","e","f","g","h"};
        String[] a = {"1","2","3","4","5","6","7","8"};
        int counterCC = 0;
        int counterA = 0;
        int x = 30;
        int y = 12;
        int x1 = 418;
        int y1 = 45;
        for (int i = 15; i <= 365; i+=50) {
            for (int j = 10; j <= 360; j+=50) {
                if ((counterY % 2 == 0 && counterX % 2 != 0) ||
                        (counterX % 2 == 0 && counterY % 2 != 0)) {
                    if(counterCC < cc.length){
                        graphics.setColor(Color.BLACK);
                    graphics.drawString(cc[counterCC], x, y);}
                    graphics.setColor(Color.GRAY);
                    graphics.fillRect(j, i, 50, 50);
                    if (counterX != 3 && counterX != 4 && counterX < 3) {
                        graphics.setColor(Color.WHITE);
                        graphics.fillOval(j + 5, i + 5, 40, 40);
                        graphics.setColor(Color.BLACK);
                        graphics.drawOval(j + 5, i + 5, 40, 40);
                    }
                    else if(counterX != 3 && counterX != 4 && counterX > 4){
                        graphics.setColor(Color.BLACK);
                        graphics.fillOval(j + 5, i + 5, 40, 40);
                        graphics.setColor(Color.WHITE);
                        graphics.drawOval(j + 5, i + 5,40, 40);
                    }
                } else {
                    if(counterCC <cc.length){
                        graphics.setColor(Color.BLACK);
                        graphics.drawString(cc[counterCC], x, y);}
                    graphics.setColor(Color.BLACK);
                    graphics.drawRect(j, i, 50, 50);
                }
                counterCC++;
                x = x + 50;
                counterY++;
            }
            counterX++;
            graphics.setColor(Color.BLACK);
            graphics.drawString(a[counterA], x1, y1);
            y1 = y1 + 50;
            counterA++;
        }
    }
}
