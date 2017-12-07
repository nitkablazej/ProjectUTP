package enums;

public enum Character {
    JAN("Od teraz jesteś Janem Śniadeckim :)"),
    JEDRZEJ("Od teraz jesteś Jędrzejem Śniadeckim :)");

    private String value;

    Character(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
