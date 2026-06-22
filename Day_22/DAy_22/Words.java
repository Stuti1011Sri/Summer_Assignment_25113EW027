import java.util.*;
public class Words {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String sen;
        System.out.println("Enter a sentence:");
        sen = sc.nextLine();
        int c=0;
        boolean inword = false;
        for(int i= 0; i<sen.length(); i++){
            char ch = sen.charAt(i);
            if(ch == ' ' || ch == '\t' || ch == '\n'){
                inword = false;
            }
            else{
                if(!inword){
                    c++;
                    inword = true;
                }
            }
        }
        System.out.println(c);
    }
    
}
