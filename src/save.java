import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class save {
        public static void main(String[] args) throws IOException {
            Random random = new Random();
            String pointsFromFile = readFromFile();
            int points =0;
            if (pointsFromFile != null)
                points=  Integer.valueOf(pointsFromFile);
            Scanner scan = new Scanner(System.in);
            while (true){
                int number1 = random.nextInt (20);
                int number2 = random.nextInt(20);
                System.out.println ("sum yor points is "+ points);
                System.out.println (number1 +" + "+ number2+" =  ?");
                int enswer = scan.nextInt();
                if (number1+number2 == enswer)
                    points++;
                else
                    points = points -2;

                writeToFile(String.valueOf(points));
            }
        }
        public static void writeToFile (String text)  {
            try {
                File data = new File("C:\\DriverForGame\\points.txt");
                FileWriter Write = new FileWriter(data);
                Write.write(text);
                Write.close();
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
         public static String readFromFile(){
        String text = null;
        try {
            File data = new File("C:\\DriverForGame\\points.txt");
            Scanner scan = new Scanner(data);
            text = scan.nextLine();

        }catch (IOException e) {
            throw new RuntimeException(e);
        }
        return text;
    }
    }




