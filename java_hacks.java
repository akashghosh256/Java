
// Java Hacks and Tricks for Prograramming
// Home>Java Programs>Java Hacks and Tricks for Prograramming



import java.math.BigInteger;
import java.util.*;
 
public class Document {
 
    public  static void main(String args[]) {
 
        Scanner in = new Scanner(System.in);
 
        String str = "Adarsh";
 
        //replace substring in a String
        String result = str.replaceFirst("ar", "A");
        System.out.println(result);
 
        //String upper case
        System.out.println("String upperCase: " + str.toUpperCase());
 
        //String lower case
        System.out.println("String lowerCase: " + str.toLowerCase());
 
        //length of string
        System.out.println("Length: " + str.length());
 
        //first index in string
        System.out.println("First index of 'r': " + str.indexOf('r'));
 
        //last index in string
        System.out.println("Last index of 'a': " + str.lastIndexOf('a'));
 
        //String difference
        System.out.println("compare with 'Kumar': " + str.compareTo("Kumar"));
 
        //String contains char sequence
        System.out.println(str+" contain 'arsh': "+str.contains("arsh"));
 
 
        //String to char Array
        char charArray[] = str.toCharArray();
        System.out.print("Char Array: ");
        System.out.println(charArray);
 
 
        //List to Array
        List<String> list = Arrays.asList("C", "C++", "Java");
        String[] array = list.toArray(new String[list.size()]);
        System.out.println(Arrays.toString(array));
 
        //ASCII
        System.out.println("ASCII of numbers");
        for(int i=48; i<57; i++){
            System.out.print((char)i);
        }
 
        System.out.println();
        System.out.println("ASCII of A-Z");
        for(int i=65; i<91; i++){
            System.out.print((char)i);
        }
 
        System.out.println();
        System.out.println("ASCII of a-z");
        for(int i=97; i<123; i++){
            System.out.print((char)i);
        }
 
        System.out.println();
 
        //character Input
        System.out.println("Enter a Character");
        char ch = in.next().charAt(0);
 
        //Subtring
        System.out.println("Substring of "+str+" 0 to 4 is: "+str.substring(1,4));
 
        //String to Integer
        String num = "100";
        System.out.println("Integer form of '100': "+Integer.parseInt(num));
 
        //Swapping of 2 numbers using XOR:
        int a = 4, b=5;
        System.out.println("Before Swapping a="+a+", b="+b);
        a ^= b;
        b ^= a;
        a ^= b;
        System.out.println("After Swapping a="+a+", b="+b);
 
        //Multiply by 2
        System.out.println("Multiply 3 with 2: "+ (3 << 1));
 
        //Divide by 2
        System.out.println("Divide 6 with 2: "+ (6 >> 1));
 
        //Number of Digit
        System.out.println((int)Math.floor(Math.log10(556)) +1);
 
        //GCD using BigInteger
        BigInteger b1 = BigInteger.valueOf(10);
        BigInteger b2 = BigInteger.valueOf(5);
        System.out.println("GCD of 10 & 5: "+b1.gcd(b2));
 
        //Check Prime Number
        System.out.println("Is 9 prime?: "+BigInteger.valueOf(9).isProbablePrime(1));
 
        //Check if number is power of 2 or not
        int x = 7;
        System.out.println("Is "+x+" power of 2? "+(x!=0 && ((x&(x-1)) == 0)));
 
        //sort array
        int numArray[] = {1, 5, 3, 2, 4};
        Arrays.sort(numArray);
 
        for(Integer n: numArray){
            System.out.print(n + " ");
        }
 
        System.out.println();
 
        char ch2 = 'a';
        //upper case character
        ch2 = Character.toUpperCase(ch2);
        System.out.println("Character upper case: "+ch2);
 
        //lower case character
        ch2 = Character.toLowerCase(ch2);
        System.out.println("Lower upper case: "+ch2);
 
        //List Sorting
        List<Integer> numList= new ArrayList<>();
        numList.add(5);
        numList.add(1);
        numList.add(3);
 
        System.out.println("List Before Sorting");
        for(Integer n: numList){
            System.out.print(n+" ");
        }
        System.out.println();
 
        Collections.sort(numList);
 
        System.out.println("List After Sorting");
        for(Integer n: numList){
            System.out.print(n+" ");
        }
 
        System.out.println();
 
        //Hash Map
        HashMap<String, Integer> numHash = new HashMap<>();
        numHash.put("A",65);
        numHash.put("B",66);
        numHash.put("C",67);
 
        if(numHash.containsKey("A"))
            System.out.println(numHash.get("A"));
 
        if(numHash.containsValue(66))
            System.out.println(numHash.get("B"));
 
        System.out.println("Size Of HashMap: "+numHash.size());
 
        numHash.remove("A");
 
        System.out.println("Size Of HashMap after removing First Object: "+numHash.size());
 
        numHash.replace("C",0);
 
        System.out.println(numHash.get("C"));
 
        numHash.clear();
 
        if(numHash.isEmpty())
            System.out.println("HashMap is Empty");
 
        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(2);
        stack.push(3);
        stack.push(4);
 
        System.out.println("Top Element in Stack: "+stack.peek());
 
        System.out.println("Popping Top Element in Stack: "+stack.pop());
 
        System.out.println("Top Element in Stack: "+stack.peek());
 
        stack.clear();
 
        if (stack.isEmpty())
            System.out.println("Stack is Empty");
        
    }
}


--------------------------------------------------------------Output:-------------------------------------------------------------------------------------------------------

AdAsh
String upperCase: ADARSH
String lowerCase: adarsh
Length: 6
First index of 'r': 3
Last index of 'a': 2
compare with 'Kumar': -10
Adarsh contain 'arsh': true
Char Array: Adarsh
[C, C++, Java]
ASCII of numbers
012345678
ASCII of A-Z
ABCDEFGHIJKLMNOPQRSTUVWXYZ
ASCII of a-z
abcdefghijklmnopqrstuvwxyz
Enter a Character
p
Substring of Adarsh 0 to 4 is: dar
Integer form of '100': 100
Before Swapping a=4, b=5
After Swapping a=5, b=4
Multiply 3 with 2: 6
Divide 6 with 2: 3
3
GCD of 10 & 5: 5
Is 9 prime?: false
Is 7 power of 2? false
1 2 3 4 5 
Character upper case: A
Lower upper case: a
List Before Sorting
5 1 3 
List After Sorting
1 3 5 
65
66
Size Of HashMap: 3
Size Of HashMap after removing First Object: 2
0
HashMap is Empty
Top Element in Stack: 4
Popping Top Element in Stack: 4
Top Element in Stack: 3
Stack is Empty