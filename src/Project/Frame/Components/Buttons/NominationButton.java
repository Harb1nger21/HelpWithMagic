package Project.Frame.Components.Buttons;

import Project.Frame.Components.Table.TableModel;
import Project.Frame.Components.Lables.Category;
import Project.model.Magician;

import javax.swing.*;
import java.util.ArrayList;

import static Project.utils.Sizes.*;

//Кнопка номинации конкурса
//Отображает список участников в номинации
//Отображает название активной таблицы

public class NominationButton extends AbstractButton {
    private final ArrayList<Magician> magicians = new ArrayList<>();
    private TableModel table;
    private JLabel label;
    private final Nomination nomination;
    private static int count = 0;

    public NominationButton(Nomination nomination) {
        super(nomination.getTitle());
        this.nomination = nomination;
        setVariables();
        addActionListener();
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            setVariables();
            label.setText(NominationButton.super.getText());
            table.setListOfMagicians(magicians);
            SaveButton.setNomination(nomination);
            table.fireTableDataChanged();
        });
    }

    private void setVariables() {
        table = TableModel.getInstance();
        table.setListOfMagicians(magicians);
        label = Category.getInstance();
        label.setText(nomination.getTitle());
    }

    @Override
    protected int getPointX() {
        return START_X + STEP * count++;
    }

    @Override
    protected int getPointY() {
        return START_Y;
    }
}