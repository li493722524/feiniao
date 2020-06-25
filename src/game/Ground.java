package game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

/**
 * ����
 */
class Ground {

    // ͼƬ
    BufferedImage image;
    // λ��
    int x, y;
    // ���
    int width, height;

    // ��ʼ������
    public Ground() throws Exception {
        image = ImageIO.read(getClass().getResource("/resources/ground.png"));
        width = image.getWidth();
        height = image.getHeight();
        x = 0;
        y = 500;
    }

    // �����ƶ�һ��
    public void step() {
        x--;
        if (x == -109) {
            x = 0;
        }
    }

}
