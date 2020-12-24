package Lab78;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
public class hh1 {
    public static void main(String[] args) {
        ArrayList<String> states = new ArrayList<String>();
        String[] st = new String[5];
        states.add("Франция");
        states.add("England");
        states.add(1,"USA");
        states.add("Shri-Lanka");
        System.out.println(states.get(1));
        for(int i = 0;i<states.size();i++)System.out.println(states.get(i));

        /////////////////////////////////////
        System.out.println("////////////////////////");
        Object[] countries = states.toArray();
        for(Object count : countries){

            System.out.println(count);
        }
        System.out.println("////////////////////////");
////////////////////////////////////////////////////////
        for (String it: states) System.out.println(it);
        LinkedList<String> vaze = new LinkedList<String>();
        vaze.add("Apple");
        vaze.addFirst("plun");
        vaze.addLast("banana");
        vaze.add(1,"orange");
        for(String it:vaze){
            System.out.println(it);
        }
        String tmp = vaze.getFirst();
        System.out.println("first elem of list "+tmp);
        vaze.remove("plun");
        for(String it:vaze){
            System.out.println(it);
        }
        ///////////////////////////////////////////////
        System.out.println("////////////////////////");
        /*
        try{
            FileWriter writer = new FileWriter("C:\\Users\\Admin\\IdeaProjects\\lab78\\src\\note.txt", false);
                // запись всей строки
                writer.append("апываываываы");
                String text = "Мама мыла раму, раму мыла мама";
                writer.write(text);
                // запись по символам
                writer.append('\n');
                writer.append('E');
                writer.flush();
            }
        catch(IOException ex){
                System.out.println(ex.getMessage());
            }
            */
        try{
            FileReader reader = new FileReader("C:\\Users\\MaximAbramov2007\\IdeaProjects\\lab 7-8\\src\\HoMeWoRk\\rrr.txt");

            // читаемпосимвольно
            int c;
            while((c=reader.read())!=-1){

                System.out.print(" c= "+c);
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }





    }

}
