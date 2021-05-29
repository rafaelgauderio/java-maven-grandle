package encapsulamento;

public class ApplicationPerson {

    public static void main (String [] args ) {

        Person me = new Person("Rafael De luca", 17,12,1985);

        System.out.println(me.getName());
        System.out.println(me.getBirthDate());
        System.out.println("I am " + me.calculateAge() + " years old.");

        System.out.println(me);





    }

}
