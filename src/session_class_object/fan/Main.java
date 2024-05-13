package session_class_object.fan;

public class Main {
    public static void main(String[] args) {
        final int SLOW = 1;
        final int MEDIUM = 2;
        final int FAST = 3;
        Fan f1 = new Fan(FAST,true,10,"yellow");
        Fan f2 = new Fan(MEDIUM,false,5,"blue");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
    }
}
