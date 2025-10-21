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
    public int searchAnimal(Animal animal)
    {
        for(int i=0;i<nbrAnimaux;i++)
        {
            if(animal.name==animaux[i].name)
                return i;
        }
        return -1;
    }
    public void addAnimal(Animal animal)
    {
        if(searchAnimal(animal)!=-1) {
            if(nbrAnimaux==nbrCages) {
                animaux[nbrAnimaux] = animal;
                nbrAnimaux++;
            }
        }

    }
    public void removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index == -1) {
            for (int i = index; i < nbrAnimaux - 1; i++) {
                animaux[i] = animaux[i + 1];
            }

            animaux[nbrAnimaux - 1] = null;
            nbrAnimaux--;
        }
    }

    @Override
    public String toString() {
        return "Zoo name: " + name +
                ", city: " + city +
                ", number of cages: " + nbrCages +
                ", number of animals: " + nbrAnimaux;
    }

}