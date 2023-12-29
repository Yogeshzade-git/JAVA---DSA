
class mediaPlayer{
    public void play(){
        System.out.println("Music Playing!!");
    } 
    public String songname(int num){
        if(num>3){   
            return ("Hello Moto");
        }
        return ("Bye Moto");
    }
}

public class methods {
    public static void main(String[] args) {
        
        mediaPlayer mp = new mediaPlayer();   // here mp is reference variable and [ new mediaPlayer(); is responsible for object creatiom and memory assign for object ]
        mp.play();
        String str = mp.songname(12);
        System.out.println(str);

    }
}
