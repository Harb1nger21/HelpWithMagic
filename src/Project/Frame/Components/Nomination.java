package Project.Frame.Components;

public enum Nomination {
    ONE_TRICK("Шоу Момент"),
    KIDS_MICROMAGIC("Детская Микромагия"),
    MICROMAGIC("Микромагия"),
    KIDS_STAGE("Детская Магия"),
    STAGE("Сценическая Магия");

    private final String title;

    Nomination(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}