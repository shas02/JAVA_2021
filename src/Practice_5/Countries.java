package Practice_5;

public enum Countries {
    CHINA("China"), KOREA("Korea"), INDIA("India"), USA("USA");

    private String countrie;

    Countries(String countrie) {
        this.countrie = countrie;
    }

    public String getCountrie() {
        return countrie;
    }

    public void setCountrie(String countrie) {
        this.countrie = countrie;
    }

    @Override
    public String toString() {
        return "Countries{" +
                "countrie='" + countrie + '\'' +
                '}';
    }
}
