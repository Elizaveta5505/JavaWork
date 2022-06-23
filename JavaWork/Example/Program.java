package JavaWork.Example;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) throws Exception {
        // Contact contact = importContact.getScannerNumber();

        // importContact.writeResult(contact.getContactRows(), 
        //"C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book.txt");
        // importContact.writeResult(contact.getContactRow(), 
        //"C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book2.txt");
        
        ArrayList<String> List = new ArrayList<>();
        List = exportContact.expContactRows("C:/Users/ПК/OneDrive/Рабочий стол/Work/JavaWork/JavaWork/Example/book.txt");
        Contact contact = findContacts.findContact(List, 6);
        System.out.println(contact.getContactRow());
        System.out.println(contact.getContactRows());
    }

}