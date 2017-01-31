import java.util.*;
public class WonGame{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        char c[] = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i < c.length; i++){
            if(map.containsKey(c[i])){
                map.put(c[i],map.get(c[i])+1);
            }else{
                map.put(c[i],1);
            }
        }
        int AntonWon = 0;
        int DanikWon = 0;
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            if(entry.getKey() == 'A'){
                AntonWon = entry.getValue();
            }else{
                DanikWon = entry.getValue();
            }
        }
        if(AntonWon == DanikWon){
            System.out.println("Friendship");
        }else if(AntonWon > DanikWon){
            System.out.println("Anton");
        }else{
            System.out.println("Danik");
        }
    }
} 
