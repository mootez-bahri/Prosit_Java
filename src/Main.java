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
        zoo.nbrAnimaux = 3;
        zoo.nbrCages = 1;
        zoo.animaux = new Animal[zoo.nbrAnimaux];

        //Instruction  6 / 7

        Animal lion1= new Animal("simba","lion",45,true);
        Zoo zoo1= new Zoo("Ishkel","ben arous", 3,1);
        zoo1.displayZoo();


    }
    }
