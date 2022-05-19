package main.java.BackgroundAttributes;

public class Flaws {
    Alignment alignment;

    public Flaws(Alignment alignment) {
        this.alignment = alignment;
    }

    public static Flaws getRandomFlaws() {
        Alignment alignment = Alignment.getRandomAlignment();
        return new Flaws(alignment);
    }
}
