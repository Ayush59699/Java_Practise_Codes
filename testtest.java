import java.util.*;
class FClass {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    evenDisplay(s1);
    sc.close();

  }
  public static void evenDisplay(String st){
      for(int i=0; i<10;i++){
          if(i%2==0){
              System.out.println(st.charAt(i));
          }
      }
  }
}