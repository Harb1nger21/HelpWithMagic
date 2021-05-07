package Project;

import javax.swing.*;
import java.awt.*;

import lombok.RequiredArgsConstructor;
@RequiredArgsConstructor
public class TitleText extends JComponent {
    private String text;
    private int size;

    public TitleText(String text, int size) {
        this.text = text;
        this.size = size;
    }

    @Override
    protected void paintComponent(Graphics g){
        Font font = new Font("Times New Roman", Font.BOLD,size);
        Graphics2D g2 = (Graphics2D)g;
        g2.setFont(font);
        g2.drawString(text, 100,20);
    }
}
