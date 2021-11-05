package Project.Frame.Components.Buttons;

import Project.Frame.Components.TableModel;
import Project.model.Magician;
import Project.Frame.Components.Nomination;

import javax.swing.*;
import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class SaveButton extends AbstractChangeButton {
    private final TableModel table;
    private static Nomination nomination = Nomination.STAGE;

    public SaveButton(TableModel table) {
        super("Сохранить");
        this.table = table;
        addActionListener();
    }

    public static void setNomination(Nomination nomination) {
        SaveButton.nomination = nomination;
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
        String dir = ".\\magicians\\" + LocalDate.now().getYear() + "\\" + nomination.name();
        new File(dir).mkdirs();
        return new File(dir,
                number + ". " + magician.getFirstName() + " " + magician.getSecondName());
    }
}