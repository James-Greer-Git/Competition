import java.util.Scanner;
public class position{
    public static void main(String args[]){
        System.out.print(Solution());
    }
    public static int Solution(){
        int depth = 0;
        int hor_pos = 0;
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextLine()){
            String line = scanner.next();
            if(line.equals("forward")){
                hor_pos += scanner.nextInt();
            }
            else if(line.equals("down")){
                depth += scanner.nextInt();
            }
            else if(line.equals("up")){
                depth -= scanner.nextInt();
            }
            else if(line.equals("EXIT")){
                break;
            }
        }
        scanner.close();
        return depth * hor_pos;
    }
}
