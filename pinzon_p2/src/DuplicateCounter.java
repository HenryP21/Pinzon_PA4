import java.util.*;
import java.io.*;

public class DuplicateCounter {
    private Map<String, Integer> wordCounter = new HashMap<>();

     void count(String dataFile) throws IOException {
        dataFile = "problem2.txt";
        String line;

        try {
            FileReader fr = new FileReader(dataFile);
            BufferedReader br = new BufferedReader(fr);

            while ((line = br.readLine()) != null) {
                String[] sentence = line.split(" ");
                for (String x : sentence) {
                       if(!wordCounter.containsKey(x)) {
                           wordCounter.put(x, 1);
                       }

                        else{
                        wordCounter.put(x,wordCounter.get(x) + 1);
                    }

                }
            }
            System.out.println("count method completed");

            br.close();

        }
        catch(IOException e){
            e.printStackTrace();
        }

    }



     void write(String outputFile) throws IOException{
        outputFile = "unique_word_counts.txt";

        try{
            FileWriter fw = new FileWriter(outputFile);
            PrintWriter pw = new PrintWriter(fw);
            Set<Map.Entry<String,Integer>> x = wordCounter.entrySet();

            for(Map.Entry<String,Integer>count: x){
                pw.println("word- " + count.getKey() + " appears : " + count.getValue() + " time(s)");
            }
            System.out.println("write method completed");
            pw.close();
        }

        catch (IOException e){
            e.printStackTrace();
        }


    }
}
