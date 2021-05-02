public class UserrrApp {
    public static void main(String[] args) {
        Userrr user1 = new Userrr("Adam", 40.5, 178);
        Userrr user2 = new Userrr("Marcin", 28.6, 156);

        Userrr[] users = {user1, user2};

        double sum = 0;
        for(double i = 0; i < users.length; i++) {
            sum += users[(int) i].getAge();
        }
        double ageAverage = sum / users.length;

        double sum2 = 0;
        for(double i = 0; i < users.length; i++) {
            sum2 += users[(int) i].getHeight();
        }
        double heightAverage = sum2 / users.length;

        System.out.println(user1);
        user1.userInfo();
        System.out.println(user2);
        user2.userInfo();
        System.out.println(ageAverage);
        System.out.println(heightAverage);

    }
}
