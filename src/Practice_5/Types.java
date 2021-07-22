package Practice_5;

public enum Types {
    SSD("SSD"),
    HDD("HDD");

    private String type;

    Types(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Types{" +
                "type='" + type + '\'' +
                '}';
    }
}
