import java.util.Scanner;
public class depth{
    public static void main(String args[]){
        System.out.print(Solution());
    }
    public static int Solution(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int temp = scanner.nextInt();

            while(scanner.hasNextInt()){
                int next = scanner.nextInt();
                if(temp < next){
                    temp = next;
                    count++;
                }
                else{
                    temp = next;
                }
            }
        scanner.close();
        return count;
    }
}
