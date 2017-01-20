package localize;

public enum Locale {
    IN("India"), AUS("Australia");

    private String value;

    Locale(final String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}