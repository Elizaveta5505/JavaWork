package JavaWork.Example;

import java.io.IOException;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws IOException {
        // Contact contact = importContact.getScannerNumber();

        // importContact.writeResult(contact.getContactRows(), "C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book.txt");
        // importContact.writeResult(contact.getContactRow(), "C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book2.txt");
        ArrayList<String> a = new ArrayList<>();
        a = exportContact.expContactRows("C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book.txt");
        // System.out.println(a);
        // System.out.println("-------------------------------------");
        // exportContact.expContactRow("C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book2.txt");
        
        Contact contact = exportContact.findContact(a, 6);
        System.out.println(contact.getContactRow());
        System.out.println(contact.getContactRows());
    }

}