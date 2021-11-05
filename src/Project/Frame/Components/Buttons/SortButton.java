package Project.Frame.Components.Buttons;

import Project.Frame.Components.Table.TableModel;
import Project.model.Magician;

//Кнопка сортировки после жеребьевки

public class SortButton extends AbstractChangeButton {
    private final TableModel table = TableModel.getInstance();

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