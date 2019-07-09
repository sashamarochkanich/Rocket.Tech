package task_1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class DistinctWords {

    private final String fileName;

    public DistinctWords(String fileName) {
        this.fileName = fileName;
    }

    public Set<String> getDistinctWordList(){
        BufferedReader br = null;
        Set<String> wordList = new TreeSet<String>(String.CASE_INSENSITIVE_ORDER);
        try {
            br = new BufferedReader(new FileReader(fileName));
            String line = null;
            while((line = br.readLine()) != null){
                StringTokenizer st = new StringTokenizer(line, " ,.;:\"");
                while(st.hasMoreTokens()){
                    String tmp = st.nextToken().toLowerCase();
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
            System.out.print(str);
            System.out.print(" ");
        }
    }
}

