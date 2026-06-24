import java.util.*;
public class String_rotataion{
    public static boolean isRotation(String s1 , String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        String res = s1 +s1;
        return res.contains(s2);
    }
    
    public static void main(String[] args) {
        System.out.println(isRotation( "abcd", "cdab"));
        System.out.println(isRotation( "abcd", "bcad"));

        
    }
}