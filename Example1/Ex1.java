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
import java.util.Scanner;
import java.io.BufferedReader;

public class Ex1 {
    static String numA = "";
    static String numB = "";

    public static void main(String[] args) throws Exception {
        BufferedReader fr = new BufferedReader(new FileReader("JavaWork/Example1/input.txt"));
        String str = ""; 
        Scanner scanner = new Scanner(fr);

        if (str.contains("b")) {
            String line = scanner.nextLine();
            String [] num = line.split(" ");
            numB = num[2];
        }
        
        else if (str.contains("a")){
            String line = scanner.nextLine();
            String [] num = line.split(" ");
            numA = num[2];
        }

        scanner.close();
    }

    public int numA () {
        int a = Integer.parseInt(numA);
        return a;
    }

    public int numB () {
        int b = Integer.parseInt(numB);
        return b;
    }

    public void output (int a, int b) {
        try (FileWriter file = new FileWriter("JavaWork/Example1/out.txt", false)) {
            if (a == 0 & b == 0) {
                file.write("Результат неопределён");
                file.flush();
            } else {
                file.write(String.format("%d ^ %d = %0.f", a, b, Math.pow(a,b)));
                file.flush();
            }
        }

        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
 
}