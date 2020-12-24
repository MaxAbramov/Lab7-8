package HoMeWoRk;
import java.util.ArrayList;
import java.io.*;
public class hh {
    public static void main(String[] args) {
        ArrayList<String> FIO = new ArrayList<String>();
        String[] fio = new String[7];
        FIO.add("Абрамов Максим Константинович");
        FIO.add("Десятников Алексей Андреевич");
        FIO.add("Фролов Дмитрий Антатольевич");
        FIO.add("Першин Влад Станиславович");
        FIO.add(1,"Петров Павел Максимович");
        FIO.add("Греков Андрей Алексеевич");
        System.out.println(FIO.get(1));
        FIO.remove("Греков Андрей Алексеевич");
        for(int i = 0;i<FIO.size();i++)System.out.println(FIO.get(i));
        System.out.println("////////////////////////");
        Object[] fiol = FIO.toArray();
        for(Object count : fiol){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
        try{
            FileWriter writer = new FileWriter("C:\\Users\\MaximAbramov2007\\IdeaProjects\\lab 7-8\\src\\HoMeWoRk\\rrr.txt", true);

            // запись всей строки
            writer.append("\n");
            writer.append("Купить:");
            String text = "<Батон,утюг,макароны>";
            writer.write(text);
            // запись по символам
            writer.append('.');
            writer.append('\n');
            writer.append("Список закончен.");
            writer.append("\n");
            writer.write("И воды");




            writer.flush();
            FileReader reader = new FileReader("C:\\Users\\MaximAbramov2007\\IdeaProjects\\lab 7-8\\src\\HoMeWoRk\\rrr.txt");
            System.out.println("////////////////////////");
            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                //System.out.print(" c= "+c);// Если добавить данну строчку мы увидим Unicode символов
                System.out.print((char)c);

            }

        }
        catch(IOException ex){

            System.out.println(ex.getMessage());


        }

    }
}