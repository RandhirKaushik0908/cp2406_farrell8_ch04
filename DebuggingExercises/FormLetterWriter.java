public class FormLetterWriter {
    public static void displaySalutation(String lastName){
        System.out.println("Dear Mr. or Ms." + lastName);
        System.out.println("Thank you for your recent order.");
    }
    public static void displaySalutation(String firstName, String lastName){
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("Thank you for your recent order.");
    }
    public static void main(String[] args){
        String firstName = "Randhir";
        String lastName = "Kaushik";
        System.out.println("This method just displays the last name: ");
        displaySalutation(lastName);
        System.out.println("This method displays the full name: ");
        displaySalutation(firstName, lastName);
    }
}
