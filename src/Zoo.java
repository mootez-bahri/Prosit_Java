public class Zoo {
    Animal[] animaux;
    String name;
    String city;
    int nbrCages;
    int nbrAnimaux;

    public Zoo(){}
    public Zoo(String name, String city, int nbrCages, int nbrAnimaux){
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
        this.nbrAnimaux = nbrAnimaux;
        this.animaux = new Animal[nbrAnimaux];
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

}