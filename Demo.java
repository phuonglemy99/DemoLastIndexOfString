public class Demo {
    public static void main(String[] args){
        String string = "Hello LAMP, Hi LAMP, Bonjour LAMP";
        System.out.println("String :- " + string);
    
        String str = "LAMP"; // String you want to search
        int fromIndex_1 = 17;  // Index 17 is M in second LAMP
        int fromIndex_2 = 12;  // Index 12 is i in Hi
        System.out.println("Last Index of 'LAMP' from beginning to index 17: " +
                                    string.lastIndexOf(str, fromIndex_1));
        //Output: Last Index of 'LAMP' from beginning to index 17: 15
        System.out.println("Last Index of 'LAMP' from beginning to index 12: " +
                                    string.lastIndexOf(str, fromIndex_2));
        //Output: Last Index of 'LAMP' from beginning to index 12: 6
    }
}
