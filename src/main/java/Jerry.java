/**
 * Created by Wojt on 2016-08-06.
 */
public class Jerry extends PiesBase implements Pies {



    public Jerry() {
        age = 12;
        name = "Jerry";
        race = "German Shepherd";
        nick = "Jerrito";
    }

    public void bark() {
        System.out.println("This is how I bark:");
        System.out.println("Woof! Woof!");
    }

    public void howl() {
        System.out.println("This is how I howl:");
        System.out.println("Auuuu!!! Auuuu!");
    }

    public void play() {
        System.out.println("Now watch me play!");
        System.out.println("Your " + name + " lies down and rolls.");
    }

    public void presentYourself() {
        System.out.println("Hello, my name is " + name + " (they sometimes call me " + nick + ") and I'm " + age + " years old.\n" + " I can bark, howl and play.");
    }

    @Override
    public void pacPac() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void cuddle() {

    }


    public void dogsPlay(Object Pies) {

    }
}
