import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class PhoneBook {

    private static String[][] mPhoneBook = new String[2][2];
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Boolean error = false;
    private static String phoneNumber;
    private static int countPhoneNumber = 0;
    private static int sizeArray = 2;

    public static void main(String[] args) throws IOException {

        System.out.println("Введить ФИО в виде \"Фамилия Имя Отчество через пробел\"");
        String line =null;
        while((line = reader.readLine()) != ""){

            formatName(line);

            if(error){
                System.out.println("Неверно введено имя. Следует вводить в виде \"Фамилия Имя Отчество через пробел\" введенное значение: " +line);
                continue;
            }

            if(checkName(line)){
                System.out.println(line + ":" +phoneNumber);
            }else{
                System.out.println("Такого имени нет, введите номер телефона: ");
                phoneNumber = reader.readLine();
                add(line);
            }
        }
    }

    public static boolean checkPhoneNumber(String phoneNumber) {
        return true;
    }

    public static boolean checkName(String name) {

        for (int i = 0; i < mPhoneBook.length; i++){

            if(mPhoneBook[i][0] == null){
                return false;
            }

            if(mPhoneBook[i][0].equals(name)){
                phoneNumber =mPhoneBook[i][1];
                return true;
            }
        }

        return false;
    }

    public static String formatName(String name) {

        String[] fio =name.split(" ");
        String newName ="";

        if(fio.length != 3){
            error = true;
        } else {

            for (int i = 0; i < fio.length; i++) {
                char elem = fio[i].charAt(0);
                newName += fio[i].substring(0, 1).toUpperCase() + fio[i].substring(1, fio[i].length()) + " ";
            }
        }

        return newName;
    }

    public static String formatPhoneNumber(String number) {
        return "";
    }

    public static void add(String name) {

        if(mPhoneBook.length == countPhoneNumber){
            countPhoneNumber += 2;
            String[][] newArray =new String[countPhoneNumber][2];
            System.arraycopy(mPhoneBook, 0, newArray, 0, countPhoneNumber -= 2);
            mPhoneBook =newArray;

            mPhoneBook[countPhoneNumber][0] =name;
            mPhoneBook[countPhoneNumber][1] =phoneNumber;
            countPhoneNumber++;
        }else{
            mPhoneBook[countPhoneNumber][0] =name;
            mPhoneBook[countPhoneNumber][1] =phoneNumber;
            countPhoneNumber++;
        }
    }

    public static void list(String[][] book) {
        //print phone book
    }
}
