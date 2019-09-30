import my_store.Iphone;
import my_store.Phone;

import java.util.ArrayList;

public class CollectionLec {

    public static void main(String[] args) {

        // Integer[] numbers = new Integer[1];
        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

//        numbers[0] = 1;
        numbers.add(1);
        System.out.println("numbers.size() = " + numbers.size());
        numbers.add(3);
        System.out.println("numbers.size() = " + numbers.size());

        numbers.add(8);
        numbers.add(5);
        numbers.add(8);

//        numbers[1]
        System.out.println("numbers.get(1) = " + numbers.get(1));

        System.out.println("numbers.indexOf(3) = " + numbers.indexOf(18));

        System.out.println(numbers.toString());

//        numbers.remove(numbers.lastIndexOf(8));
//        Object eight = 8;
//        numbers.remove(eight);

//        Removes all the 8's from the original one
//        ArrayList<Integer> numbersToRemove = new ArrayList<>();
//        numbersToRemove.add(8);
//
//        numbers.removeAll(numbersToRemove);

        System.out.println(numbers.toString());

        System.out.println("numbers.isEmpty() = " + numbers.isEmpty());

        if(numbers.contains(8)){
            System.out.println("Lucky number");
        }

        ArrayList<Phone> phones = new ArrayList<>();

        phones.add(new Phone(5.6, "Android"));
        phones.add(new Phone(6.0, "iOS"));
        phones.add(new Iphone(6.0));

        for (Phone phone: phones) {
            phone.makeCall("210");
        }

        System.out.println(phones.get(1).getOS());
        System.out.println(phones.get(2).getOS());

    }
}
