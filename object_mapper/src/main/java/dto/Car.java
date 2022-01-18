package dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Car {

    private String name;

    @JsonProperty("car_name")
    private String carName;

    @JsonProperty("TYPE")
    private String type;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", carName='" + carName + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
