package GangOfFour.Mediator.ChatsApp;

public class MediatorPatternDemo {
    public static void main(String[] args) {
        AbstractUser mAliUser = new User("M Ali");
        AbstractUser comsatsUniversity = new University("COMSATS University");
        AbstractUser nustUniversity = new University("NUST University");
        AbstractUser aliTeacher = new Teacher("Sir Ali");
        AbstractUser ahmadUser = new User("Ahmad");
        AbstractUser zainUser = new User("Zain");

        //Task#1:
        mAliUser.sendMessage("Ali Says Hi to COMSATS University", comsatsUniversity);

        //Task#2:
        mAliUser.sendMessage("Ali Says Hi to many at the same time", comsatsUniversity,nustUniversity,aliTeacher,ahmadUser,zainUser);


    }
}
