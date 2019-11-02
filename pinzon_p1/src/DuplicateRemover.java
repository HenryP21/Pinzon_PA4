import java.io.*;
import java.util.*;

class DuplicateRemover {
    private Set<String> uniqueWords = new HashSet<>();

    void remove(String dataFile) throws IOException {
        dataFile = "problem1.txt";

        String line;

        try {
            FileReader fr = new FileReader(dataFile);
            BufferedReader br = new BufferedReader(fr);


            while ((line = br.readLine()) != null) {
                String[] sentence = line.split(" ");
                for(String x : sentence){
                    uniqueWords.add(x);
                }
            }
            System.out.println("remove method completed");
            br.close();
        }

        catch(IOException ex){
            ex.printStackTrace();
        }
    }

     void write(String outputFile) throws IOException {

        outputFile = "unique_words.txt";


        try {
            FileWriter fw = new FileWriter(outputFile);
            PrintWriter pw = new PrintWriter(fw);
            for (String x : uniqueWords) {
                pw.println(x);
            }
            System.out.println("write method completed");
            pw.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }
        }
    }


