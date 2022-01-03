package project.word;

import org.apache.poi.xwpf.usermodel.*;
import project.frame.components.buttons.Nomination;
import project.model.Magician;

import java.io.*;
import java.time.LocalDate;
import java.util.List;

public class WordPage {
    private final String username = System.getProperty("user.name");
    private final String TABLE_DIR = "C:\\Users\\" + username + "\\Desktop\\Programming\\java\\myproject\\emptyTables\\";
    private final String DIR = "C:\\Users\\" + username + "\\Desktop\\magicians\\" + LocalDate.now().getYear() + "\\";

    public void createWord(String emptyWord, String newWord, Nomination nomination, List<Magician> magicians) throws IOException {
        emptyWord = TABLE_DIR + emptyWord;
        newWord = DIR + nomination.name() + "\\" + newWord;
        new File(DIR).mkdirs();
        try (InputStream is = new FileInputStream(emptyWord);
             XWPFDocument doc = new XWPFDocument(is)) {

            List<XWPFParagraph> paragraphs = doc.getParagraphs();
            for (XWPFParagraph paragraph : paragraphs) {
                for (XWPFRun run : paragraph.getRuns()) {
                    String text = run.text();
                    if (text.equals("nomination")) {
                        text = text.replace("nomination", nomination.getTitle());
                        run.setText(text, 0);
                    }
                }
            }
            for (XWPFTable table : doc.getTables()) {
                for (Magician magician : magicians) {
                    XWPFTableRow row = table.createRow();
                    for (int i = 0; i < row.getTableCells().size(); i++) {
                        switch (i) {
                            case 0 -> row.getCell(i).setText(String.valueOf(table.getRows().size() - 1));
                            case 1 -> row.getCell(i).setText(magician.getFullName());
                            case 2 -> row.getCell(i).setText(magician.getBornPlace());
                        }
                    }
                }
            }
            try (FileOutputStream out = new FileOutputStream(newWord)) {
                doc.write(out);
            }
        }
    }
}
