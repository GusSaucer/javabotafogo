package ex1;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro("Rex"));
        animais.add(new Gato("Mimi"));
        animais.add(new Vaca("Mimosa"));
        animais.add(new Animal("Bicho"));


    for(Animal a : animais){
        System.out.println(a.apresentar());
    }}
}









