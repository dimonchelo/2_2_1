package hiber.model;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "Car")
public class Car implements Serializable {
    @Id
    @OneToOne
    @JoinColumn(name = "userId", referencedColumnName = "id")
    private User user;
    @Column(name = "model")
    private String model;
    @Column(name = "series")
    private int series;


    public Car() {

    }

    public Car(String model, int series, User user) {
        this.model = model;
        this.series = series;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }


    @Override
    public String toString() {
        return "Car {" +
                " model='" + model + '\'' +
                ", series=" + series +
                '}';
    }
}
