
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hw2 {

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
        ArrayList<String> myVowels = new ArrayList<String>();
//        adding vowels to my list of vowels
        myVowels.add("a");
        myVowels.add("e");
        myVowels.add("i");
        myVowels.add("o");
        myVowels.add("u");
        System.out.println(" List of vowels:" + myVowels);

//        creating consonant list and adding elements
        ArrayList<String> myConsonants = new ArrayList<String>();
        myConsonants.add("b");
        myConsonants.add("c");
        myConsonants.add("d");
        myConsonants.add("f");
        myConsonants.add("g");
        System.out.println("List of consonants :" + myConsonants);

//        using Collections.copy to copy list of myVowels inside list of MyConsonants
        Collections.copy(myConsonants, myVowels);
        System.out.println("List of copied elements :" + myConsonants);


//        Write a Java program to extract a portion of an array list
//        Creating and adding elements to original list
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("veggies");
        groceriesList.add("dairy");
        groceriesList.add("desert");
        groceriesList.add("fruits");
        groceriesList.add("beauty");
        System.out.println("Original groceries list:" + groceriesList);

//        using subList() method to extract last 2 items of groceriesList
       List<String> shorterList = groceriesList.subList (3,4);
        System.out.println("shorter groceries list:" + shorterList );



    }
}
