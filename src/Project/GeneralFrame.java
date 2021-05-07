package Project;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class GeneralFrame extends JFrame {
    Toolkit toolkit = Toolkit.getDefaultToolkit();
    Dimension dimension = toolkit.getScreenSize();
    int desktopWidth = dimension.width;
    int desktopHeight = dimension.height;
    static JPanel jPanel = new JPanel();

    public GeneralFrame() {
        setBounds(desktopWidth / 4, desktopHeight / 4, desktopWidth , desktopHeight );
        setTitle("Help With Magic");
        add(new TitleText("Российская Ассоциация Иллюзионистов", 20));
        add(jPanel);


        JButton one_trick = new JButton(new MagicAction());
        one_trick.setText("Шоу Момент");
        JButton stage = new JButton(new MagicAction());
        stage.setText("Сценическая Магия");
        JButton micromagic = new JButton(new MagicAction());
        micromagic.setText("Микромагия");
        JButton kidsStage = new JButton(new MagicAction());
        kidsStage.setText("Детская Магия");
        JButton kidsMicromagic = new JButton(new MagicAction());
        kidsMicromagic.setText("Детская Микромагия");

        jPanel.add(one_trick);
        jPanel.add(stage);
        jPanel.add(micromagic);
        jPanel.add(kidsStage);
        jPanel.add(kidsMicromagic);

        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {

            }
        });

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    private static class MagicAction extends AbstractAction{

        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.BLUE);
        }
    }
}