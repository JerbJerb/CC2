
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Minuend: ");
        int Minuend = sc.nextInt();
       
        System.out.println("Enter Subtrahend: ");
        int Subtrahend = sc.nextInt();
       
        String stMin = Minuend + "";
        String stSub = Subtrahend + "";

        int sMin = stMin.length();
        int sSub = stSub.length();
       
        int zeros = 0;
       
        for(int i = sSub; i < sMin; i++){zeros += 1;
                   
        }
       
        int TransSubtrahend = getComplement(stSub);
        int TempAns = TransSubtrahend + Minuend;
        String StringTempAns = TempAns + "";
        String FFinal = "";
       
        for(int i = 1; i < StringTempAns.length(); i++){
            FFinal += StringTempAns.charAt(i);
        }
       
        int FinalAnswer = Integer.parseInt(FFinal);
        System.out.println("The final answer: "+FinalAnswer+".");
        }
        public static int
                getComplement(String N){
                    char C = 'k';
                    String ComplementString = "";
                    int Complement = 0;
                   
                    for(int i = 0; i<N.length(); i++){
                        char c = N.charAt(i);
                        switch(c){
                            case '0':
                                C = '9';
                                break;
                            case '1':
                                C = '8';
                                break;
                            case '2':
                                C = '7';
                                break;
                            case '3':
                                C = '6';
                                break;
                            case '4':
                                C = '5';
                                break;
                            case '5':
                                C = '4';
                                break;
                            case '6':
                                C = '3';
                                break;
                            case '7':
                                C = '2';
                                break;
                            case '8':
                                C = '1';
                                break;
                            case '9':
                                C = '0';
                                break;
                            default:
                                System.exit(0);
                                break;
                        }
                        ComplementString = ComplementString + C;
                    }
                    Complement = Integer.parseInt(ComplementString) + 1;
                    return Complement;
   
    }
}
