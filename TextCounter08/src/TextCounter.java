
import java.util.Hashtable;
import java.util.Scanner;
import java.util.Set;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DELL
 */
public class TextCounter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CheckInput c = new CheckInput();
        String str = c.testString("Enter your conter: ");
        // str = str.replaceAll("\\s+", " "); // xóa những dấu cách thừa
        char[] chars = str.toCharArray();

        String[] t = str.split("\\s+"); //chia str thành một mảng theo dấu cách
        Hashtable<String, Integer> words = new Hashtable<>();  // tạo một hash table với key kiểu String, value là các giá trị integer
        Hashtable<Character, Integer> character = new Hashtable<>();

        for (String ob : t) {             //chạy vòng lặp for duyệt từng object trong mảng t
            if (!words.containsKey(ob)) { //boolean containsKey(Object key)
                //Trả về true nếu key cân bằng với key tồn tại bên trong hash table. Trả về false nếu key đó không được tìm thấy
                words.put(ob, 1);        // add elements to hashtable ở vị trí key = ob, và lưu giá trị là 1
            } else {
                words.put(ob, words.get(ob) + 1);// add elements to hashtable ở vị trí key = ob, và lưu giá trị là giá trị hiện tại ở vị trí key đó + 1
            }
        }
        for (char ob : chars) {
            if (ob == ' ') {
                continue;
            }
            if (!character.containsKey(ob)) {
                character.put(ob, 1);
            } else {
                character.put(ob, character.get(ob) + 1);
            }
        }

        displayWord(words);
        displayChar(character);

    }

    public static void displayWord(Hashtable<String, Integer> word) {
        Set set = word.keySet();
        System.out.print("{");
        int index2 = 0;
        for (Object object : set) {
            if (index2 == set.size() - 1) {
                System.out.print(object + "=" + word.get(object) + "}");
            } else {
                System.out.print(object + "=" + word.get(object) + ", ");
                index2++;
            }
        }
        System.out.println("");
    }

    public static void displayChar(Hashtable<Character, Integer> character) {
        Set set = character.keySet();
        System.out.print("{");
        int index2 = 0;
        for (Object object : set) {
            if (index2 == set.size() - 1) {
                System.out.print(object + "=" + character.get(object) + "}");
            } else {
                System.out.print(object + "=" + character.get(object) + ", ");
                index2++;
            }
        }
        System.out.println("");
    }

    public static class CheckInput {

        Scanner sc = new Scanner(System.in);

        public String testString(String msg) {
            String str;
            while (true) {
                System.out.println(msg);
                str = sc.nextLine();
                if (str.trim().equals(" ")) {
                    System.out.println("String must not be empty !");
                } else {
                    break;
                }

            }
            return str;
        }
    }
}
