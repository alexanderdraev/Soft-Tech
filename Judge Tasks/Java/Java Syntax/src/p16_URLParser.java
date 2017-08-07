import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * Created by Marto on 7.8.2017 г..
 */
public class p16_URLParser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String pattern = "^(?<protocol>([A-Za-z0-9.]+))*(:\\/\\/)*(?<server>([A-Za-z0-9.]+))(\\/)*((?<resource>.+))*$";
        Pattern r = Pattern.compile(pattern);


        Matcher m = r.matcher(input);
        if (m.find( )) {
            String protocol = m.group("protocol");
            String server = m.group("server");
            String resource = m.group("resource");

            if(protocol == null){
               protocol = "";
            }
            if(resource == null){
                resource = "";
            }
            if(server == null){
                server = "";
            }

            System.out.println("[protocol] = " + '"' + protocol + '"' );
            System.out.println("[server] = " + '"' + server + '"' );
            System.out.println("[resource] = " + '"' + resource + '"' );
        }
    }
}
