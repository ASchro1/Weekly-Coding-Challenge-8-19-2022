
import java.lang.Math;
import java.util.Locale;

public class MainDriver {
    public static int walkAxis(int N){
        return ((N * (N + 1)) / 2) - 1;

    }

    public static boolean nameIsMine(String nameA, String nameB){
        StringBuilder name1 = new StringBuilder(nameA.toLowerCase());
        StringBuilder name2 = new StringBuilder(nameB.toLowerCase());

        if(name1.toString().equals(name2.toString())){
            return true;
        }
        if(name1.length() > name2.length() ){
            int i = 0;
            while(i < name1.length()){
                if(i >= name2.length() || name1.charAt(i) != name2.charAt(i)){
                    name1.deleteCharAt(i);
                    i=0;
                }
                i++;
            }
            if (name1.toString().equals(name2.toString())){
                return true;
            }
        }else{
            int i = 0;
            while(i < name2.length()){
                if(i >= name1.length() || name2.charAt(i) != name1.charAt(i)){
                    name2.deleteCharAt(i);
                    i=0;
                }
                i++;
            }
            if ((name1.toString().equals(name2.toString()))){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        System.out.println(walkAxis(5));
        System.out.println(nameIsMine( "johanna", "john"));
    }
}
