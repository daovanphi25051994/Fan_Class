package fan;

public class Main {
    public static void main(String[] args) {
        Fan fan1 = new Fan();
        Fan fan2 = new Fan();
        fan1.setSpeed(fan1.getFAST());
        fan1.setRadius(10);
        fan1.setColor("yellow");
        fan1.setStatus(true);
        fan2.setSpeed(fan2.getMEDIUM());
        fan2.setRadius(5);
        fan2.setColor("blue");
        fan2.setStatus(false);

        String strFan1 = fan1.toString();
        String strFan2 = fan2.toString();
        System.out.println(strFan1);
        System.out.println(strFan2);
    }
}
