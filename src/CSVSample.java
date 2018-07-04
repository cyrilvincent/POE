import java.io.*;
import java.util.StringTokenizer;

public class CSVSample {

    public static void main(String[] args) {
        try {
            System.out.println(System.getProperty("user.dir"));
            BufferedReader reader = new BufferedReader(new FileReader("mesure.csv"));
            String line = reader.readLine();
            while(line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
            String s = "5;3;3.14";
            StringTokenizer st = new StringTokenizer(s,";");
            System.out.println(st.nextToken()); // 5
            System.out.println(st.nextToken()); // 3
            System.out.println(st.nextToken()); // 3.14
            s = "3.14";
            double d = Double.parseDouble(s);

        }
        catch(FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
