import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] array = {10, 8, 5, 7, 1, 9, 6};

        for (int i = 0; i < array.length; i = i + 2) {
            System.out.println(array[i]);
        }
        for (int i = 1; i < array.length; i = i + 2) {
            System.out.println(array[i]);
            // можно ли сделать это в одном цикле???

        }
//        int result = 0;
//        int middle = array.length / 2;
//        int a = 0;
//        for (int i = 0; i < array.length / 2; i++) {
//            result = array[i] + array[middle];
//            middle++;
//
//            System.out.println(result);
////           a+= array[i];
//        }
//    if (array.length%2==1){
//        System.out.println(array[array.length - 1]);
//    }
//        System.out.println(a);
    }
//        String[] strings = {"collGirl", "may", "January", "Hello", " Me"};
//        for (int i = strings.length - 1; i >=0; i --){
//            if (strings[i].length()>4){
//                System.out.println(strings[i]);
//            }
//        }

}
