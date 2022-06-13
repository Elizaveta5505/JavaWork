package JavaWork.Example1;
/* Реализовать функцию возведения числа а в степень b. a, b ∈ Z. 
Сводя количество выполняемых действий к минимуму. 
Пример 1: а = 3, b = 2, ответ: 9 
Пример 2: а = 2, b = -2, ответ: 0.25
Пример 3: а = 3, b = 0, ответ: 1
Пример 4: а = 0, b = 0, ответ: не определено
входные данные находятся в файле input.txt в виде
b 3
a 10
Результат нужно сохранить в файле output.txt
1000
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;

public class Ex1 {
    static String numA = "";
    static String numB = "";

    public void reader() throws Exception {
        BufferedReader fr = new BufferedReader(new FileReader("Example1/input.txt"));
        String str; 
        
        while((str= fr.readLine()) != null) {
            if (str.contains("b")) {
                String [] num = str.split(" ");
                numB = num[2];
            }
        
            else if (str.contains("a")){
                String [] num1 = str.split(" ");
                numA = num1[2];
            }
            
            else {
                System.out.print("Некорректные данные");
            }
        }
        
        fr.close();
    }

    public double numA () {
        double a = Double.parseDouble(numA);
        return a;
    }

    public double numB () {
        double b = Double.parseDouble(numB);
        return b;
    }

    public void output (double a, double b) {
        try (FileWriter file = new FileWriter("Example1/out.txt", false)) {
            if (a == 0 & b == 0) {
                file.write("Результат неопределён");
                file.flush();
            } else {
                file.write(String.format("%.0f ^ %.0f = %.0f", a, b, Math.pow(a,b)));
                file.flush();
            }
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }

    public static void main(String[] args) throws Exception {
        Ex1 example = new Ex1();
        example.reader();
        example.output(example.numA(), example.numB());
    }
}