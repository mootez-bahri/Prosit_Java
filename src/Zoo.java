public class Zoo {
    Animal[] animaux;
    String name;
    String city;
    int nbrCages;
    int nbrAnimaux;

    public Zoo(){}
    public Zoo(String name, String city, int nbrCages){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.nbrAnimaux = 0;
        this.animaux = new Animal[nbrCages];
    }
    public void displayZoo() {
        System.out.println("Zoo name: " + this.name +
                " / Zoo city: " + this.city +
                " / Number of cages: " + this.nbrCages +
                " / Number of animals: " + this.nbrAnimaux);
    }


    @Override
    public String toString() {
        return "Zoo name: " + name +
                ", city: " + city +
                ", number of cages: " + nbrCages +
                ", number of animals: " + nbrAnimaux;
    }

    public boolean addAnimal (Animal animal){
        if (this.nbrAnimaux >= this.nbrCages){
            System.out.println("Le zoo est plein ! Impossible d'ajouter l'animal.");
            return false;
        }
        if (this.searchAnimal(animal) != -1 ) {
            System.out.println("Animal existe deja");
            return false;
        }
        this.animaux[this.nbrAnimaux] = animal;
        nbrAnimaux++;
        System.out.println("Animal ajouté avec succès ");
        return true;
    }

    public void afficherAnimaux() {
        for (int i = 0; i < nbrAnimaux; i++) {
            System.out.println(this.animaux[i].toString());
        }
    }

    public int searchAnimal(Animal animal){
        if ( this.nbrAnimaux == 0) {
            return -1;
        }
        for (int i = 0; i < this.nbrAnimaux; i++) {
            if (this.animaux[i].name.equals(animal.name)) {
                return i;
            }
        }
        return -1;
    }
    boolean removeAnimal(Animal animal){
        int index = searchAnimal(animal);
        if (index == -1) {
            System.out.println("animal a supprimer n existe pas");
            return false;
        }
        for (int i = index; i < nbrAnimaux; i++) {
            this.animaux[i] = this.animaux[i + 1];
        }
        this.animaux[nbrAnimaux - 1] = null;
        nbrAnimaux--;
        return true;
    }
    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimaux > z2.nbrAnimaux) {
            return z1;
        } else if (z2.nbrAnimaux > z1.nbrAnimaux) {
            return z2;
        } else {
            System.out.println("les deux zoo contiennnet meme nobmre d'animaux");
            return null;
        }
    }


}