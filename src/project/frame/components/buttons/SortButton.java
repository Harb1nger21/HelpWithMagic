package project.frame.components.buttons;

import project.model.Magician;

//Кнопка сортировки после жеребьевки

public class SortButton extends AbstractChangeButton {

    public SortButton() {
        super("Сортировать");
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().sort(Magician::compareTo);
            table.fireTableDataChanged();
        });
    }
}