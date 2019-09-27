package my_store;

public class PhoneTest {

    public static void main(String[] args) {

        Phone[] phones = new Phone[2];

        Android pixel3 = new Android(5.1);
        Iphone iphone8 = new Iphone(6.1);

        Phone pixel4 = new Android(6.7);
        Phone iphoneX = new Iphone(5.6);

        phones[0] = pixel4;
        phones[1] = iphoneX;

        pixel3.makeCall("123");
        System.out.println("iphone8.facialUnlock(\"myface\") = " + iphone8.facialUnlock("myface"));
        System.out.println(iphoneX.getOS());


        for (Phone phone: phones) {
            phone.makeCall("210");
        }

    }

}
