package entity;

public abstract class Toy {
    private String toyType;

    public void setToyType(String toyType) {
        this.toyType = toyType;
    }

    public String getToyType() {
        return toyType;
    }

    @Override
    public String toString() {
        return "Toy{" +
                "toyType='" + toyType + '\'' +
                '}';
    }

    public abstract void creatingToy();
}
