package be.intecbrussel.javaClassAttributes;

public class MyMain
{
    public static void main(String[] args)
    {
        MyClass monObjet = new MyClass();
        MyClass monObjet2 = new MyClass();
        monObjet.a = 40;
        System.out.println(monObjet.a);
        System.out.println(monObjet2.a);

        MyPerson maPersonne = new MyPerson();
        System.out.println("Nom: " + maPersonne.prenom + " " + maPersonne.nom);
        System.out.println("Age: " + maPersonne.age);
    }
}
