package GangOfFour.Mediator.ChatsApp;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        AbstractUser user1 = new User("Robert");
        AbstractUser user2 = new User("John");
        AbstractUser user3 = new User("David");

        AbstractUser university1 = new University("COMSATS");
        AbstractUser university2 = new University("NUST");
        AbstractUser university3 = new University("FAST");

        AbstractUser teacher1 = new Teacher("Dr. Ali");
        AbstractUser teacher2 = new Teacher("Dr. Ahmad");
        AbstractUser teacher3 = new Teacher("Dr. Aslam");

        user1.sendMessage("Hi All Universities", university1, university2, university3);
        user2.sendMessage("Hi Sir Ali", teacher1);
        user3.sendMessage("Hi Sir Ahmad & Sir Aslam", teacher2, teacher3);

        university1.sendMessage("Hi Students", user1, user2, user3);
        university2.sendMessage("Hi COMSATS & Dr Ali", university1, teacher1);
        university3.sendMessage("Hi Fast & Dr Ahmad & Dr Aslam", university3, teacher2, teacher3);
    }
}
