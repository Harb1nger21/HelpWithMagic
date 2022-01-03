package project.frame.components.lables;

public enum LabelsType {
    NAME("Имя"),
    SECOND_NAME("Фамилия"),
    COUNTRY("Страна"),
    CITY("Город"),
    PHONE("Телефон"),
    LOT_NUMBER("Жеребьевка");

    private final String title;

    LabelsType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}