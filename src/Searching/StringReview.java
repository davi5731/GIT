package Searching;


public class StringReview {

   
    public static void main(String[] args) {
       String x = "The quick brown fox";
       //index of - finds location of something, returns an int
       int loc = x.indexOf("q");
       System.out.println("q is at " + loc);
       loc = x.indexOf("o",13);
        System.out.println("Starting at 13, o is at " + loc);
        loc = x.indexOf("q",13);
        System.out.println("Starting at 13, q is at " + loc); //-1 - not found
        
        //charAt - returns a char at a given location
        char c = x.charAt(13);
        System.out.println("The character at 13 is " + c);
        //length
        int len = x.length();
        System.out.println(x + " is " + len + " characters long.");
        
        //substring - returns a string that is part of the original string
        String y = x.substring(10,13); //13 not included
        System.out.println(y);
        y = x.substring(16); //16 to the end
        System.out.println(y);
        
        System.out.println(x.toUpperCase()); //call as you print the string
        x= x.toLowerCase();
        
        //compareTo -> 
        y = "jumped over the lazy dog";
        int z = y.compareTo(x);
        System.out.println("y compared to x is " + z);
        z = x.compareTo(y);
        System.out.println("x compared to y is " + z);
        //"t"ge vs "j"umped - 10 letters away - 10
        //positive means first thing is further down the alphabet 
        System.out.println("Bob vs Andy:"+"Bob".compareTo("Andy"));
        System.out.println("Bob vs Bob:"+"Bob".compareTo("Bob"));
        System.out.println("Tim vs Tom:"+"Tim".compareTo("Tom")); //T is ties, i vs. 0 = -6
        System.out.println("Bob vs bob:"+"Bob".compareTo("bob"));
        //Moral of story - compareTo = 0 means you have an exact match
               
    }
    
}
