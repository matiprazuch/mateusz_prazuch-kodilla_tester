public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String [] args) {

        User anna = new User("Anna", 20);
        User betty = new User("Betty", 33);
        User carl = new User("Carl", 58);
        User david = new User("David", 13);
        User eva = new User("Eva", 18);
        User frankie = new User("Frankie", 45);

        User[] users = {anna, betty, carl, david, eva, frankie};

        System.out.println("Calculating the age average...");
        double sum = 0;
        for(double i = 0; i < users.length; i++) {
            sum += users[(int) i].age;
        }
        double ageAverage = sum / users.length;

        System.out.println("Age sum: " + sum + " Age Average: " + ageAverage);

        System.out.println("Whose age is below average?");
        for(int i = 0; i < users.length; i++) {
            if(users[i].getAge() < ageAverage) {
                System.out.println(users[i].getName() + " " + users[i].getAge());
            }
        }


    }
}