public class Userrr {
    String name;
    double age;
    double height;

    public Userrr(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public double getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public String toString() {
        return "Userrr{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                '}';
    }

    public void userInfo() {
        if (this.age > 30 && this.height > 160) {
            System.out.println("User is older than 30 and higher than 160cm");
        } else {
            System.out.println("User is 30 (or younger) or 160cm (or shorter)");
        }
    }
}
