import java.util.*;


public class Static
{
    public static void main(String[] args) {
        //initialization of array
        int arr[]={23,56,765,7547,200};
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        arr[2]=56;
        arr[3]=765;
        System.out.println(Arrays.toString(arr));
    }

}
