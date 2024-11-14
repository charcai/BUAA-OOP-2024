public enum ShapeType {
    ELLIPSE("ellipse"), RHOMBUS("rhombus"), RECTANGLE("rectangle");
    private final String English;

    private ShapeType(String English) {
        this.English = English;
    }

    public String getEnglish() {
        return English;
    }
}
