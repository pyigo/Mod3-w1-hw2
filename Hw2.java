
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hw2 {
//    Write a Java program to copy one array list into another
//
//    Write a Java program to extract a portion of an array list
//
//    Write a Java program of swap two elements in an array list
//
//    Write a Java program to test an array list is empty or not
//
//    Write a Java program to replace the second element of an ArrayList with the specified element.
//
//    Write a Java program to trim the capacity of an array list the current list size



    public static void main(String[] args) {
        List<String> myVowels = new ArrayList<>();
//        adding vowels to my list of vowels
        myVowels.add("a");
        myVowels.add("e");
        myVowels.add("i");
        myVowels.add("o");
        myVowels.add("u");
        System.out.println("myVowels");

//        creating consonant list and adding elements
        List<String> MyConsonants = new ArrayList<>();
        MyConsonants.add("b");
        MyConsonants.add("c");
        MyConsonants.add("d");
        MyConsonants.add("f");
        MyConsonants.add("g");

//        using Collections.copy to copy list of myVowels inside list of MyConsonants
        Collections.copy(MyConsonants, myVowels);
        System.out.println("MyConsonants");

    }
}
