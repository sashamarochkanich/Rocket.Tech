package task_1;

import java.io.*;
import java.util.*;

public class DistinctWords {

    private final String fileName;

    public DistinctWords(String fileName) {
        this.fileName = fileName;
    }

    private Set<String> getDistinctWordList(){

        BufferedReader br = null;
        Set<String> wordList = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);

        try {
            br = new BufferedReader(new FileReader(fileName));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken();
                    wordList.add(tmp);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally{
            try{
                if(br != null) br.close();
            } catch(Exception ex){
                ex.printStackTrace();
            }
        }
        return wordList;
    }

    public static void main(String[] args){

        DistinctWords distinctWords = new DistinctWords("Lorem Ipsum.txt");
        Set<String> wordList = distinctWords.getDistinctWordList();
        for(String str:wordList){
            System.out.println(str);
        }
    }
}

