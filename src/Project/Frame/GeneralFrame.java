package Project.Frame;

import Project.Frame.Components.*;

import javax.swing.*;
import java.awt.*;

//Главный фрейм

public class GeneralFrame extends JFrame {

    public GeneralFrame() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        int desktopWidth = dimension.width;
        int desktopHeight = dimension.height;
        int step = 170;
        int buttonWidth = 160;
        int buttonHeight = 20;
        int startX = (desktopWidth - (step * 4 + buttonWidth)) / 2;
        int startY = 50;

        setBounds(0, 0, desktopWidth, desktopHeight);
        setTitle("Help With Magic");

        JLabel rau = new JLabel("Конгресс Российской Ассоциации Иллюзионистов");
        rau.setFont(new Font("Times New Roman", Font.BOLD, 30));
        rau.setBounds((desktopWidth - 650) / 2, 20, 700, 20);
        add(rau);

        TableOfMagicians tableOfMagicians = new TableOfMagicians();
        JTable jTable = new JTable(tableOfMagicians);
        JScrollPane scroll = new JScrollPane(jTable);
        jTable.setPreferredScrollableViewportSize(new Dimension(1200, 100));
        add(scroll);
        scroll.setBounds(startX, startY * 3, desktopWidth - startX * 2, desktopHeight - 250);

        JLabel magicCategory = new JLabel();
        magicCategory.setBounds(startX + step * 2, startY * 2 + startY / 2, 500, 20);
        magicCategory.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(magicCategory);

        NominationButton one_trick = new NominationButton("Шоу Момент", tableOfMagicians, magicCategory);
        NominationButton micromagic = new NominationButton("Микромагия", tableOfMagicians, magicCategory);
        NominationButton kidsStage = new NominationButton("Детская Магия", tableOfMagicians, magicCategory);
        NominationButton kidsMicromagic = new NominationButton("Детская Микромагия", tableOfMagicians, magicCategory);
        NominationButton stage = new NominationButton("Сценическая Магия", tableOfMagicians, magicCategory);

        stage.setBounds(startX, startY, buttonWidth, buttonHeight);
        micromagic.setBounds(startX + step, startY, buttonWidth, buttonHeight);
        kidsStage.setBounds(startX + step * 2, startY, buttonWidth, buttonHeight);
        kidsMicromagic.setBounds(startX + step * 3, startY, buttonWidth, buttonHeight);
        one_trick.setBounds(startX + step * 4, startY, buttonWidth, buttonHeight);

        add(one_trick);
        add(stage);
        add(micromagic);
        add(kidsStage);
        add(kidsMicromagic);

        JLabel labelFirstName = new JLabel("Имя");
        JLabel labelSecondName = new JLabel("Фамилия");
        JLabel labelCountry = new JLabel("Страна");
        JLabel labelCity = new JLabel("Город");
        JLabel labelPhoneNumber = new JLabel("Номер телефона");

        labelFirstName.setBounds(startX, startY + startY / 2, buttonWidth, buttonHeight);
        labelSecondName.setBounds(startX + step, startY + startY / 2, buttonWidth, buttonHeight);
        labelCountry.setBounds(startX + step * 2, startY + startY / 2, buttonWidth, buttonHeight);
        labelCity.setBounds(startX + step * 3, startY + startY / 2, buttonWidth, buttonHeight);
        labelPhoneNumber.setBounds(startX + step * 4, startY + startY / 2, buttonWidth, buttonHeight);

        add(labelFirstName);
        add(labelSecondName);
        add(labelCountry);
        add(labelCity);
        add(labelPhoneNumber);

        JTextField firstName = new JTextField();
        JTextField secondName = new JTextField();
        JTextField country = new JTextField();
        JTextField city = new JTextField();
        JTextField phoneNumber = new JTextField();

        firstName.setBounds(startX, startY * 2, buttonWidth, buttonHeight);
        secondName.setBounds(startX + step, startY * 2, buttonWidth, buttonHeight);
        country.setBounds(startX + step * 2, startY * 2, buttonWidth, buttonHeight);
        city.setBounds(startX + step * 3, startY * 2, buttonWidth, buttonHeight);
        phoneNumber.setBounds(startX + step * 4, startY * 2, buttonWidth, buttonHeight);

        add(firstName);
        add(secondName);
        add(country);
        add(city);
        add(phoneNumber);

        MagicMouseListener mouseListener = new MagicMouseListener(jTable);
        jTable.addMouseListener(mouseListener);

        AddButton addMagician = new AddButton("Добавить", firstName, secondName, country, city, phoneNumber, tableOfMagicians);
        addMagician.setBounds(startX + step * 5, startY * 3, buttonWidth, buttonHeight);
        add(addMagician);

        DeleteButton deleteMagician = new DeleteButton("Удалить", tableOfMagicians, mouseListener);
        deleteMagician.setBounds(startX + step * 5, startY * 3 + 30, buttonWidth, buttonHeight);
        add(deleteMagician);

        SortButton sortMagician = new SortButton("Сортировать", tableOfMagicians);
        sortMagician.setBounds(startX + step * 5, startY * 3 + 60, buttonWidth, buttonHeight);
        add(sortMagician);

        revalidate();
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

}