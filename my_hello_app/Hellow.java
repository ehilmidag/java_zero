public class Hellow{
    public static void main(String[] args) {
        Hello object = new Hello();
        String answer = object.sayHi("hillheim");
        System.out.println(answer);     
    }
}
 
class Hello{
    String world = "world";

    public String sayHi(String who) {
        String sentence;
        if(who != "")
            sentence = "hello " + who;
        else
            sentence = "hello " + world;

        return sentence;
    }
}