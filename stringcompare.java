import java.util.*;
public class stringcompare{
    public static void main(String arg[]){
        Scanner sc =  new Scanner(System.in);
        String name1 = "FOOL";
        String name2 = "FOOLi";

        // Strirng comparing 
        // compareTo 
        // string1>> string2 gives +ve
        // string1 == string2 gives 0
        // string1<< string2 gives -ve

        if(name1.compareTo(name2)==0){
            System.out.println("strings are equal");
        } 
        else{
            System.out.println("not equal");
        }

    }
    
}