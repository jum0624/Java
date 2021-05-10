package Chapter5;

interface PhoneInterface{
    final int TIMEOUT = 10000;
    void sendCall();
    void recevieCall();
    default void printLoGo(){
        System.out.println("**Phone**");
    }
}
/*
public class SamsungPhone implements Chapter5.Phone.PhoneInterface {
    @Override
    public void sendCall() {
        System.out.println("띠리리리링");
    }

    @Override
    public void recevieCall() {
        System.out.println("전화가 왔습니다.");
    }

    public void flash(){
        System.out.println("전화기에 불이 켜졌습니다.");
    }

    public static void main(String[] args) {
        SamsungPhone phone = new SamsungPhone();
        phone.printLoGo();
        phone.sendCall();
        phone.recevieCall();
        phone.flash();
    }
}
 */
