package project.frame.components.buttons;

import project.frame.GeneralFrame;
import project.model.Magician;
import project.word.WordPage;

import java.io.*;
import java.util.List;

public class SaveButton extends AbstractChangeButton {
    private static Nomination nomination = Nomination.STAGE;
    private static boolean save = false;

    public SaveButton() {
        super("Сохранить");
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            for (NominationButton button : GeneralFrame.getNomButtons()) {
                nomination = button.getNomination();
                try {
                    createFile(button.getMagicians());
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
        save = true;
    }

    public boolean isSave() {
        return save;
    }

    public static void setSaveFalse() {
        save = false;
    }

    private void createFile(List<Magician> magicians) throws IOException {
        if (magicians.size() != 0) {
            WordPage page = new WordPage();
            page.createWord("wings.docx", "кулисы.docx", nomination, magicians);
            page.createWord("host_judges.docx", "ведущий.docx", nomination, magicians);
            page.createWord("sound_light.docx", "звук_свет.docx",nomination,magicians);
            //создать файл с формами жюри(рус)
            //создать файл с формами жюри(англ)
        }
    }
}