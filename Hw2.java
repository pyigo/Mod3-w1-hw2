import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hw2 {

    public static void main(String[] args) {
        //*************Write a Java program to copy one array list into another*************
        ArrayList<String> myVowels = new ArrayList<>();
        //adding vowels to my list of vowels
        myVowels.add("a");
        myVowels.add("e");
        myVowels.add("i");
        myVowels.add("o");
        myVowels.add("u");
        System.out.println(" List of vowels:" + myVowels);

        //creating consonant list and adding elements
        ArrayList<String> myConsonants = new ArrayList<>();
        myConsonants.add("b");
        myConsonants.add("c");
        myConsonants.add("d");
        myConsonants.add("f");
        myConsonants.add("g");
        System.out.println("List of consonants :" + myConsonants);

        //using Collections.copy to copy list of myVowels inside list of MyConsonants
        Collections.copy(myConsonants, myVowels);
        System.out.println("List of copied elements :" + myConsonants);


        //*************Write a Java program to extract a portion of an array list*************
        //Creating and adding elements to original list
        ArrayList<String> groceriesList = new ArrayList<>();
        groceriesList.add("veggies");
        groceriesList.add("dairy");
        groceriesList.add("desert");
        groceriesList.add("fruits");
        groceriesList.add("beauty");
        System.out.println("Original groceries list:" + groceriesList);

        //using subList() method to extract last 2 items of groceriesList
       List<String> shorterList = groceriesList.subList (3,4);
        System.out.println("shorter groceries list:" + shorterList );

        //*************Write a Java program of swap two elements in an array list*************
        //// Create and populating the Array List
        ArrayList<String> count = new ArrayList<>(10);
        count.add("one");
        count.add("two");
        count.add("three");
        count.add("four");
        count.add("five");
        //display original count list
        System.out.println("Count list before swap:" + count);

        // Swapping the elements at 0 and 1 indices using Collections.swap() and display new list after swap
        Collections.swap(count, 0, 1);
        System.out.println("Count list after swap:" + count);

        //*************Write a Java program to test an array list is empty or not*************
        //using isEmpty()  to check if count list is empty
        boolean response= count.isEmpty();
        if (response==true){
            System.out.println("Count list is empty");
        }else{
            System.out.println("Count list is not empty");
        }

        //*************Write a Java program to replace the second element of an ArrayList with the specified element.*************
        //using set() method to replace beauty element by baby food in groceries list
        groceriesList.set(4,"baby food");
        System.out.println("New groceries list updated :" + groceriesList);

        //*************Write a Java program to trim the capacity of an array list the current list size*************
        //using trimToSize() to trim myConsonants list size to specified number of elements
        count.trimToSize();
        System.out.println("Trimed to size count list:"+ count);
}
}
