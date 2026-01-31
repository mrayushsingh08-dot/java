public class oops {
   //constor
   // void opps(){
      
   //  System.out.println("hello");
   // }

   public class B extends oops{
      public  void sound(int x){
      System.out.println(x);
   }
   }
   public static void main(String[] args) {
      oops obj = new oops();
      oops sid = new B();

      obj.sound(100);
      
   }

   public  void sound(int x){
      System.out.println(x);
   }
}

