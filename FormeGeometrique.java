public class FormeGeometrique {

    String nom;

    public FormeGeometrique(String nom) {
        this.nom = nom;
    }

    public double perimetre() {
        return 0;
    }

    public String toString() {
        return nom + " a pour perimetre " + perimetre();
    }
}

class Triangle extends FormeGeometrique {
    
    double c1;
    double c2;
    double c3;

    public Triangle(String nom, double c1, double c2, double c3) {
        super(nom);
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
    }

    @Override
    public double perimetre() {
        return c1 + c2 + c3;
    }
}

class Carree extends FormeGeometrique {

    double cote;

    public Carree(String nom, double cote) {
        super(nom);
        this.cote = cote;
    }

    @Override
    public double perimetre() {
        return cote * 4;
    }
}
class Cercle extends FormeGeometrique {

    double rayon;

    public Cercle(String nom, double rayon) {
        super(nom);
        this.rayon = rayon;
    }

    @Override
    public double perimetre() {
        return 2 * Math.PI * rayon;
    }
}
class FormeConteneur {

    FormeGeometrique[] tableauFormes = new FormeGeometrique[10];

    public void addForme(int index, FormeGeometrique forme) {
        tableauFormes[index] = forme;
    }

    public String toString() {
        String chaine = "";
        for (FormeGeometrique forme : tableauFormes) {
            chaine += forme + "\n";
        }
        return chaine;
    }

    public static void main(String[] args) {
        Triangle triangle = new Triangle("Triangle 1", 3, 4, 5);
        Carree carree = new Carree("Carree 1", 2);
        Cercle cercle = new Cercle("Cercle 1", 2);
        FormeConteneur conteneur = new FormeConteneur();

        conteneur.addForme(0, triangle);
        conteneur.addForme(1, carree);
        conteneur.addForme(2, cercle);

        System.out.println(triangle);
        System.out.println(carree);
        System.out.println(cercle);
        System.out.println(conteneur);
    }
}
