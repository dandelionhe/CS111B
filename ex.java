
import java.util.*;

public class ex{
public static void switchThem(int[] first, int[] second){
  if(first.length != second.length){ System.out.println("Arrays in different size can not be switched!");}
  else{
    int[] temp = new int[first.length];
    for(int i=0;i< first.length;i++){
      temp[i]=first[i];
      first[i]=second[i];
      second[i]=first[i];
    }
  }
}
  public static void main(String[] args) {
    int[] a = {61,51,91,3,24};
    int[] b = {24,14,61,52,92};
    switchThem(a,b);
    System.out.println(a[1]);


  }
}
