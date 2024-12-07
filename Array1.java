// Source code is decompiled from a .class file using FernFlower decompiler.
import java.util.Arrays;

public class Array1 {
   public Array1() {
   }

   public static void main(String[] var0) {
      int[] var1 = new int[]{23, 56, 765, 7547, 200};
      System.out.println(Arrays.toString(var1));
      System.out.println(var1[2]);
      System.out.println(var1[3]);
      var1[2] = 56;
      var1[3] = 765;
      System.out.println(Arrays.toString(var1));
   }
}
