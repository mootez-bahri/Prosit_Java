//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Instruction 5

        Animal lion= new Animal();
        lion.name = "simba";
        lion.family = "lion";
        lion.age = 30;
        lion.isMammal = true;

        Zoo zoo = new Zoo();
        zoo.name = "belvedere";
        zoo.city = "Tunis";
        zoo.nbrCages = 3;
        zoo.animaux = new Animal[zoo.nbrCages];

        //Instruction  6 / 7

        Animal lion1= new Animal("simba","lion",45,true);
        Animal lion2= new Animal("Ishkel","lion",45,true);
        Zoo zoo1= new Zoo("Ishkel","ben arous", 3);
        zoo1.displayZoo();


        System.out.println(lion1.toString());
        System.out.println(zoo1.toString());
        zoo1.addAnimal(lion1);
        zoo1.addAnimal(lion);
        zoo1.addAnimal(lion2);
        zoo1.afficherAnimaux();

        System.out.println(".........................");
        zoo1.removeAnimal(lion);
        zoo1.afficherAnimaux();


        System.out.println(".........................");
        zoo.addAnimal(lion);
        System.out.println("comparer les zoos");
        Zoo plusGrand = Zoo.comparerZoo(zoo1, zoo);
        if (plusGrand == null) {
            System.out.println("zoo egale");
        } else  {
            System.out.println("zoo plus grand est : " + plusGrand.toString());
        }
    }
    }
