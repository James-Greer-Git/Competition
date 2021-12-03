import java.util.Scanner;
public class powerConsumption{
    public static void main (String args[]){
        System.out.print(Solution());
    }
    public static int Solution(){
        Scanner scanner = new Scanner(System.in);
        int pwr = 0;
        int[] count = new int[12];

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            if(line.equals("EXIT")){
                break;
            }
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i) == '0'){
                    count[i]++;
                }
                else{
                    count[i]--;
                }
            }
        }
        scanner.close();

        String gamma = "";
        String epsilon = "";

        for(int i = 0; i < count.length; i++){
            if(count[i] > 0){
                gamma += '0';
                epsilon += '1';
            }
            else{
                gamma += 1;
                epsilon += 0;
            }
        }

        int gammaRate = Integer.parseInt(gamma, 2);
        int epsilonRate = Integer.parseInt(epsilon, 2);

        pwr = gammaRate*epsilonRate;
        return pwr;
    }
}
