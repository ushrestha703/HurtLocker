import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TODO
// Output a string formatted list that resembles (outputFormat.txt)
// Use Pattern and Matcher
// Be able to handle Exceptions
// Using Maven.Regex-Hamlet-Parser lab as reference


public class JerksonDataParser {

        private String rawData;

        public JerksonDataParser(){
            this.rawData = loadFile();
        }

        private String loadFile(){
            ClassLoader classLoader = getClass().getClassLoader();
            File file = new File(classLoader.getResource("RawData.txt").getFile());
            StringBuilder result = new StringBuilder("");

            try(Scanner scanner = new Scanner(file)){
                while(scanner.hasNextLine()){
                    String line = scanner.nextLine();
                    result.append(line).append("\n");
                }
                scanner.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            return result.toString();
        }

        public String getRawData(){
            return rawData;
        }

    public String changeApples( String str) throws Exception {
        Pattern p = Pattern.compile("[Aa][Pp][Pp][Ll][Ee][Ss]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Apples");
    }

    public String changeMilk( String str) throws Exception {
        Pattern p = Pattern.compile("[Mm][Ii][Ll][Kk]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Milk");
    }

    public String changeBread( String str) throws Exception {
        Pattern p = Pattern.compile("[Bb][Rr][Ee][Aa][Dd]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Bread");
    }

    public String changeCookies( String str) throws Exception {
        Pattern p = Pattern.compile("[Cc][Oo0][Oo0][Kk][Ii][Ee][Ss]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Cookies");
    }

    public String changeName( String str) throws Exception {
        Pattern p = Pattern.compile("[Nn] [Aa] [Mm] [Ee]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Name");
    }

    public String changePrice( String str) throws Exception {
        Pattern p = Pattern.compile("[Pp] [Ri] [Cc] [Ee]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Price");
    }

    public String changeType( String str) throws Exception {
        Pattern p = Pattern.compile("[Tt] [Yy] [Pp] [Ee]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Type");
    }

    public String changeExpiration( String str) throws Exception {
        Pattern p = Pattern.compile("[Ee] [Xx] [Pp] [Ii] [Rr] [Aa] [Tt] [Ii] [0Oo] [Nn]");
        Matcher m = p.matcher(str);
        return m.replaceAll("Expiration");
    }

    }
