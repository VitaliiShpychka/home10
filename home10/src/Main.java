// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
                try {
                    BufferedReader reader = new BufferedReader(new FileReader("file.txt"));
                    String line = reader.readLine();
                    while (line != null) {
                        Pattern pattern = Pattern.compile("(\\(\\d{3}\\)\\s\\d{3}-\\d{4})|(\\d{3}-\\d{3}-\\d{4})");
                        Matcher matcher = pattern.matcher(line);
                        if (matcher.matches()) {
                            System.out.println(matcher.group());
                        }
                        line = reader.readLine();
                    }
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
