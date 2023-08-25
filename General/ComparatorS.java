import java.util.*;

class Student implements Comparable<Student>{
    int age;
    String name;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }
// this is comparable, it is uesd inside class
    public int compareTo(Student that){
      // think me and you i am this and you are that
        if(this.age>that.age)
            return 1;
        else
            return -1;
    }
};


public class ComparatorS {
    
    public  static void main(String args[]){

// Comparator is used when we want to sort according to our own logic

// Comparator<Student> comp = new Comparator<Student>() {
//     @Override
//     public int compare(Student s1, Student s2) {
//         if(s1.age>s2.age)
//             return 1;
//         else
//             return -1;
//     }
// };


// same as above but using lambda expression
Comparator<Student> comp = (s1, s2) -> s1.age > s2.age? 1 : -1;

List<Student> students = new ArrayList<Student>();
students.add(new Student(20,"Rahul"));
students.add(new Student(19,"Rohit"));
students.add(new Student(21,"Raj"));
students.add(new Student(18,"Ramesh"));
students.add(new Student(22,"Rakesh"));
students.add(new Student(17,"Rajesh"));

// See the difference in calling sort method

// this is using Comparator interface / comp method
Collections.sort(students,comp);

// This is using Comparable interface / CompareTo method
// it means logic is written already in student class so calling sort 
//method directly implements sort according to that logic
//Collections.sort(students);




for(Student s:students)
    System.out.println(s.age+" "+s.name);



//         Comparator<Integer> comp = new Comparator<Integer>() {
//             @Override
//         public int compare(Integer i, Integer j) {
//                 if(i%10>j%10)
//                     return 1;
//                 else
//                     return -1;
//             }
//         };
// List<Integer> nums = new ArrayList<Integer>();
// nums.add(122);
// nums.add(234);
// nums.add(345);
// nums.add(452);
// nums.add(569);
// nums.add(670);
// // Arranging nums as per the last digit
// Collections.sort(nums,comp);

// System.out.println("list :"+nums);


// // For Array we have to use Integer[] instead of int[]
// // because Arrays.sort() takes only Object type
// Integer num[] = {122,234,345,452,569,670};
// Arrays.sort(num,comp);
// System.out.println("Array :"+Arrays.toString(num));

// // list :[670, 452, 122, 234, 345, 569]
// // Array :[670, 452, 122, 234, 345, 569]
    }
}
