package Project.Frame.Components.Buttons;

import Project.Frame.Components.TableModel;
import Project.model.Magician;

//Кнопка сортировки после жеребьевки

public class SortButton extends AbstractChangeButton {
    TableModel table;

    public SortButton(TableModel table) {
        super("Сортировать");
        this.table = table;
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            table.getListOfMagicians().sort(Magician::compareTo);
            table.fireTableDataChanged();
        });
    }
}