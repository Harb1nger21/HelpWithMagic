package Project.Frame.Components;

public enum Nomination {
    ONE_TRICK("Шоу Момент"),
    STAGE("Сценическая Магия"),
    MICROMAGIC("Микромагия"),
    KIDS_STAGE("Детская Магия"),
    KIDS_MICROMAGIC("Детская Микромагия");

    private final String title;

    Nomination(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}