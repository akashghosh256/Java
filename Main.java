class Main{
 static   void helper(String st, StringBuilder s){

      s.append(st).reverse();
      System.out.println(s);
   }
 public static void main(String[] args) {
   //  StringBuilder s = new StringBuilder();
   //  s.append('a');
   //  s.append('z');
   //  s.append("ass");
   //  s.reverse();
   //  System.out.println(s.toString());
   helper("ass", new StringBuilder());

 }    
}