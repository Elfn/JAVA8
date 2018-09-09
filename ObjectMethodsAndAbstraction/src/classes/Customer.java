package classes;

/**
 * Created by Elimane on Sep, 2018, at 11:22
 */
public class Customer {

    private String id;
    private String name;
    private String surName;
    private boolean isLicensed;
    private Gender gender;


    public Customer(String id, String name, String surName, boolean isLicensed, Gender gender) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.isLicensed = isLicensed;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public boolean isLicensed() {
        return isLicensed;
    }

    public void setLicensed(boolean licensed) {
        isLicensed = licensed;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public boolean equals(Object o) {
        if (o == null || this == null) {
            return false;
        }

        if (this.id == ((Customer) o).id) {
            return true;
        }

        return false;
    }

    public int hashCode() {
        return (11 * Integer.valueOf(id)) + (13 * name.hashCode());
    }


}
