
import java.util.*;
public class Password{

    public static void main(String arg[]){
        String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z","0","1","2","3","4","5","6","7","8","9"};
        ArrayList<String> AL = new ArrayList<String>(Arrays.asList(al));

        boolean lowercase = false;
        boolean uppercase = false;
        boolean number = false;

        for(int i = 0;i < 26;i++){
            AL.add(al[i].toUpperCase());
        }

        ArrayList<String> password = new ArrayList<String>();
        for(int i = 0; i < 8; i++){
            password.add("0");
        }

        while(!lowercase || !uppercase || !number){
            for(int i = 0; i < 8; i++){
                int random = (int)(Math.random() * 62);
                password.set(i,AL.get(random));
                if(random >= 0 && random < 26)
                    lowercase = true;
                if(random >= 26 && random < 36)
                    number = true;
                if(random >= 36)
                    uppercase = true;
            }
        }

        String passwordString = "";
        for(int i = 0; i < 8; i++){
            passwordString += password.get(i);
        }

        ArrayList<String> pass = new ArrayList<String>();
        pass.add(passwordString);

    }

}