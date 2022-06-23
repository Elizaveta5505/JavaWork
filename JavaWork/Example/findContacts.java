package JavaWork.Example;

import java.util.ArrayList;

public class findContacts {
    static Contact findContact(ArrayList<String> arr, int id) throws Exception{
        Integer idf = 0;
        String name = "";
        String number = "";
        for (int i = 0; i < arr.size(); i++){
            if (arr.get(i).length() <= 2 && Integer.parseInt(arr.get(i)) == id){
                idf = id;
                name = arr.get(i+1);
                number = arr.get(i+2);
                }
            }

        return new Contact(idf, name, number);
    }
    
}
