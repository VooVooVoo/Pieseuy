/**
 * Created by Wojt on 2016-08-06.
 */
public class Oro extends PiesBase implements Pies{

    public Oro() {
        age = 6;
        name = "Oro";
        race = "Mongrel";
        nick = "Oreo";
    }

    public void bark() {
        System.out.println("This is how I bark:");
        System.out.println("Hau! Hau!");

    }


    public void howl() {
        System.out.println("This is how I howl:");
        System.out.println("Ouuuu, ou, ooooouuuu!");
    }

    public void play() {
        System.out.println("Now watch me play!");
        System.out.println("Your " + name + " grabs a plush squirrel and gives it to you.");
    }

    public void presentYourself() {
        System.out.println("Hello, my name is " + name + " (they sometimes call me " + nick + ") and I'm " + age + " years old.\n" + " I can bark, howl and play.");
    }

    public void pacPac(){
        System.out.println("Now I will pac you!");
        System.out.println("PAC.....PAC.....PACPAC......PAC...PAC!!!");
    }
    public void eat() {
        System.out.println("I'm hungryyyy!!!");
        System.out.println("OMNOMNOMNOMNOM!");
    }
    public void cuddle(){
        System.out.println("Tuli tuli tuli tuliiii!");
    }


    public void dogsPlay(Object Pies) {
        System.out.println(name  + " ciągnie " + Pies + " za ucho!");
        System.out.println(Pies + " gryzie " + name + " w ogon!");

    }
}