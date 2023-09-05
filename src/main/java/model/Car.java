package model;



public class Car {
    private long id;
    private String model;
    private String colour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(long id, String model, String colour) {
        this.id = id;
        this.model = model;
        this.colour = colour;
    }


}
