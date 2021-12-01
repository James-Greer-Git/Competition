import java.util.Scanner;
public class slidingWindowDepth {
    public static void main(String args[]){
        System.out.print(Solution());
    }
    public static int Solution(){
        Scanner scanner = new Scanner(System.in);
        int count = 0;

            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int third = scanner.nextInt();
            int temp = first + second + third;
        
        while(scanner.hasNextInt()){
            first = second;
            second = third;
            third = scanner.nextInt();
            int next = first + second + third;

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
