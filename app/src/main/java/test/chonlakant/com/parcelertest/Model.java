package test.chonlakant.com.parcelertest;

import org.parceler.Parcel;

@Parcel
public class Model {
    String name;
    String lastName;
    public Model(){

    }

    public Model(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
