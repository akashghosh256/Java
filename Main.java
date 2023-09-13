public class Main {
    public static void main(String[] args) {
        int[] arr = new int[25];
        int ptr = 0;
        String printer = "AZGB";
        int cost = 0;
        for(Character c : printer.toCharArray()){
            int dest = c-'A';
			System.out.println(c+" "+dest+" ptr "+ptr);
            int cw = ptr > dest ? (dest+26-ptr) : dest-ptr;
            int acw = ptr < dest ? (ptr+26-dest) : ptr-dest;
			System.out.println("cw " +cw+" acw "+ acw);
            cost+= Math.min(cw, acw);
            ptr = dest;
        }
        System.out.println(cost);
    }
}