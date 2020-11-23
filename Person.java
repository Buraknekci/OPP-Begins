
public class Person {
    private String firsName;
    private String lastName;
    private int age;

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String setFirstName() {
        return firsName;
    }

    public String setLastName() {
        return lastName;
    }

    public int setAge() {
        if (age < 0 || age > 100) {
            return 0;
        } else {
            return age;
        }


    }

    public boolean isTeen() {
        if (age > 12 || age < 20) {
            return true;
        } else {
            return false;
        }
    }

    public String getFullName() {
        if (firsName.isEmpty() && lastName.isEmpty()) {
            return "";
        } else if (lastName.isEmpty()) {
            return firsName;
        } else if (firsName.isEmpty()) {
            return lastName;
        } else {
            return firsName + lastName;
        }
    }

}
