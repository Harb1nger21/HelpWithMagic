package project.frame.components.buttons;

import project.frame.components.table.TableModel;
import project.frame.components.lables.Category;
import project.model.Magician;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static project.utils.Sizes.*;

//Кнопка номинации конкурса
//Отображает список участников в номинации
//Отображает название активной таблицы

public class NominationButton extends AbstractButton {
    private final List<Magician> magicians = new ArrayList<>();
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
    public List<Magician> getMagicians(){
        return magicians;
    }
    public Nomination getNomination(){
        return nomination;
    }

    private void addActionListener() {
        super.addActionListener(e -> {
            setVariables();
            label.setText(NominationButton.super.getText());
            table.setListOfMagicians(magicians);
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