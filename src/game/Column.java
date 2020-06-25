package game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * ����
 */
class Column {

    // ͼƬ
    BufferedImage image;
    // λ��
    int x, y;
    // ���
    int width, height;
    // ����֮��ķ�϶
    int gap;
    // ����֮��ľ���
    int distance;
    // ���������
    Random random = new Random();

    /**
     * ��ʼ����N������
     */
    public Column(int n) throws Exception {
        image = ImageIO.read(getClass().getResource("/resources/column.png"));
        width = image.getWidth();
        height = image.getHeight();
        gap = 144;
        distance = 245;
        x = 550 + (n - 1) * distance;
        y = random.nextInt(218) + 132;
    }

    // �����ƶ�һ��
    public void step() {
        x--;
        if (x == -width / 2) {
            x = distance * 2 - width / 2;
            y = random.nextInt(218) + 132;
        }
    }
}