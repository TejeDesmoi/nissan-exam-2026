package domain.model;

public class Vehicle {
    //region Attributes
    private String id;
    private String model;
    private String hp;
    private String doorsNumber;
    private String color;
    //endregion
    //region GetterSetter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHp() {
        return hp;
    }

    public void setHp(String hp) {
        this.hp = hp;
    }

    public String getDoorsNumber() {
        return doorsNumber;
    }

    public void setDoorsNumber(String doorsNumber) {
        this.doorsNumber = doorsNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    //endregion
    //region Constructor

    public Vehicle(String id, String model, String hp, String doorsNumber, String color) {
        this.id = id;
        this.model = model;
        this.hp = hp;
        this.doorsNumber = doorsNumber;
        this.color = color;
    }

    //endregion
}
