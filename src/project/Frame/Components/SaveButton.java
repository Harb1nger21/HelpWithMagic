package project.Frame.Components;

import project.model.Magician;
import project.model.Nomination;

import javax.swing.*;
import java.io.*;
import java.util.List;

public class SaveButton extends JButton {
    private final TableOfMagicians table;
    private Nomination nomination = Nomination.STAGE;

    public SaveButton(String text, TableOfMagicians table) {
        super(text);
        this.table = table;
        addActionListener();
    }

    public void setNomination(Nomination nomination) {
        this.nomination = nomination;
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            List<Magician> magicians = table.getListOfMagicians();
            int number = 0;
            for (Magician magician : magicians) {
                number++;
                File file = createFile(number, magician);
                try {
                    file.createNewFile();
                } catch (IOException ignored) {
                }
                try {
                    writeMagician(magician, new BufferedOutputStream(new FileOutputStream(file)));
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    private void writeMagician(Magician magician, OutputStream os) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(os)) {
            oos.writeObject(magician);
        }
    }

    private File createFile(int number, Magician magician) {
        String dir = ".\\magicians\\" + nomination.name();
        new File(dir).mkdirs();
        return new File(dir,
                number + ". " + magician.getFirstName() + " " + magician.getSecondName());
    }
}
