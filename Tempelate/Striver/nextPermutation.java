// import java.util.*;
// public class nextPermutation{

//    static void reverse(int ar[], int s , int e){
//         int p1=s, p2=e;

//         while(p1 < p2){
//             int temp = ar[p1];
//             ar[p1] = ar[p2];
//             ar[p2] = temp;
//             p1++;
//             p2--;
//         }

//     }


//     static void perm(int [] ar, int n){
//         int ind1=-1, ind2; //not required
//         for(int i = n-2; i>=0; i--){
//             if( ar[i+1]>ar[i]){
//                 ind1 = i;
//                 break;
//             }
//         }
//         if( ind1 == -1){
//             reverse(ar,0,n-1);
//             return ;
//         }
//         for(int i = n-1; i>=0; i--){
//             if( ar[ind1]<ar[i]){
//                 ind2 = i;
//                 int tp = ar[i];
//                 ar[i] = ar[ind1];
//                 ar[ind1] = tp;
//                 break;
//             }
//         }

//    reverse(ar,ind1+1,n-1);
// return;


//     }

//     public static void main (String args[]){

//         int ar[] = {1,2,3,4,5};
//         int n = ar.length;
//        perm(ar,n);

//         System.out.println(Arrays.toString(ar));
//     }
// }


// Print all permutation----------------------------------------------
import java.util.*;
public class nextPermutation{

   static void reverse(int ar[], int s , int e){
        int p1=s, p2=e;

        while(p1 < p2){
            int temp = ar[p1];
            ar[p1] = ar[p2];
            ar[p2] = temp;
            p1++;
            p2--;
        }

    }


    static boolean perm(int [] ar, int n){
        int ind1=-1, ind2; //not required
        for(int i = n-2; i>=0; i--){
            if( ar[i+1]>ar[i]){
                ind1 = i;
                break;
            }
        }
        if( ind1 == -1){
          //  reverse(ar,0,n-1);
            return false;
        }
        for(int i = n-1; i>=0; i--){
            if( ar[ind1]<ar[i]){
                ind2 = i;
                int tp = ar[i];
                ar[i] = ar[ind1];
                ar[ind1] = tp;
                break;
            }
        }

   reverse(ar,ind1+1,n-1);
return true;


    }

    public static void main (String args[]){

        int ar[] = {1,2,3};
        int n = ar.length;


        System.out.println(Arrays.toString(ar));  // this is also ans
        while (perm(ar, n)) {
            System.out.println(Arrays.toString(ar));
        }
    }
}

// with return 

// import java.util.*;
// public class bb{

//    static void reverse(int ar[], int s , int e){
//         int p1=s, p2=e;

//         while(p1 < p2){
//             int temp = ar[p1];
//             ar[p1] = ar[p2];
//             ar[p2] = temp;
//             p1++;
//             p2--;
//         }

//     }


//     static int[] perm(int [] ar, int n){
//         int ind1=-1, ind2;
//         for(int i = n-2; i>=0; i--){
//             if( ar[i+1]>ar[i]){
//                 ind1 = i;
//                 break;
//             }
//         }
//         if( ind1 == -1){
//             reverse(ar,0,n-1);
//             return ar;
//         }
//         for(int i = n-1; i>=0; i--){
//             if( ar[ind1]<ar[i]){
//                 ind2 = i;
//                 int tp = ar[i];
//                 ar[i] = ar[ind1];
//                 ar[ind1] = tp;
//                 break;
//             }
//         }

//    reverse(ar,ind1+1,n-1);
// return ar;


//     }

//     public static void main (String args[]){

//         int ar[] = {1,2,3};
//         int n = ar.length;
//       int [] ans =  perm(ar,n);

//         System.out.println(Arrays.toString(ans));
//     }
// }