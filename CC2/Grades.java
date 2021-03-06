import java.util.*;
public class Grade {

    public static int nS = 1;

    //initialization of the students information (inputs)
    public static String[] idNumber = new String[nS];
    public static String[] firstName = new String[nS];
    public static String[] lastName = new String[nS];
    public static String[] middleInitial = new String[nS];
    public static double[] midtermCS = new double[nS]; 
    public static double[] midtermLab = new double[nS];
    public static double[] midtermExam = new double[nS];
    public static double[] finalCS = new double[nS];
    public static double[] finalLab = new double[nS];
    public static double[] finalExam = new double[nS];

    
    public static int[] FmidtermGrade = new int[nS];
    public static int[] FfinalGrade = new int[nS];
   
    
    public static double[] midtermGrade = new double[nS];
    public static double[] finalGrade = new double[nS];
    public static int[] grade = new int[nS];
    
    public static String[] status = new String[nS];
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        for(int i = 0; i < nS; i++){
            System.out.println("STUDENT "+(i+1));
            System.out.print("ID Number: ");
            idNumber[i] = sc.nextLine();
            System.out.print("First Name: ");
            firstName[i] = sc.nextLine();
            System.out.print("Last Name: ");
            lastName[i] = sc.nextLine();
            System.out.print("Middle Initial: ");
            middleInitial[i] = sc.nextLine();
            boolean input = true;
            do{
                System.out.print("Midterm Class Standing Score: ");
                midtermCS[i] = sc.nextDouble();
                if(midtermCS[i] > 100 || midtermCS[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
            
            input = true;
            do{
                System.out.print("Midterm Laboratory Score: ");
                midtermLab[i] = sc.nextDouble();
                if(midtermLab[i] > 100 || midtermLab[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
            
            input = true;
            do{
                System.out.print("Midterm Exam Score: ");
                midtermExam[i] = sc.nextDouble();
                if(midtermExam[i] > 100 || midtermExam[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
      
            input = true;
            do{
                System.out.print("Final Class Standing Score: ");
                finalCS[i] = sc.nextDouble();
                if(finalCS[i] > 100 || finalCS[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
            
            input = true;
            do{
                System.out.print("Final Laboratory Score: ");
                finalLab[i] = sc.nextDouble();
                if(finalLab[i] > 100 || finalLab[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
            
            input = true;
            do{
                System.out.print("Final Exam Score: ");
                finalExam[i] = sc.nextDouble();
                if(finalExam[i] > 100 || finalExam[i] < 0){
                    System.err.println("Invalid input. Try again.");
                    input = false;
                }else{
                    break;
                }
            }while(input == false);
            sc.nextLine();
            System.out.println();
        }
        
        for(int i = 0; i < nS; i++){
           midtermGrade[i] = ((midtermCS[i]*0.33)+(midtermLab[i]*0.33)+(midtermExam[i]*0.34));
           finalGrade[i] = ((finalCS[i]*0.33)+(finalLab[i]*0.33)+(finalExam[i]*0.34));
           
           FmidtermGrade[i] = convert(midtermGrade[i]);
           FfinalGrade[i] = convert(finalGrade[i]);
           grade[i] = (int) Math.round((FmidtermGrade[i]/2.0)+(FfinalGrade[i]/2.0));
           if(grade[i] >= 75){
               status[i] = "PASSED";
           }else{
               status[i] = "FAILED";
           }
        }
        
        System.out.printf("%10s%13s%10s%3s%7s%7s%10s%n", "ID Number","Last Name", "Name", "MI", "Mid", "Fin", "Remarks");
        
        for(int i = 0; i < nS; i++){
            System.out.printf("%10s%13s%10s%3s%7s%7s%10s%n", idNumber[i], lastName[i], firstName[i], middleInitial[i], FmidtermGrade[i], FfinalGrade[i], status[i]);
        }
        System.out.println();
        String ans;
        boolean valid;
        do{
            valid = false;
            ans = "";
            System.out.print("Enter ID Number of Student: ");
            String id = sc.nextLine();
            for(int i = 0; i < nS; i++){
                if(idNumber[i].equals(id)){
                    printStud(i);
                    valid = true;
                    break;
                }
            }
            if(valid == false){
                System.err.println("ID Number not found!");
                ans = "y";
                continue;
            }
            System.out.print("Check again? [y/n]:");
            ans = sc.nextLine();
        }while(ans.toLowerCase().equals("y"));
    }
    static void printStud(int id){
        System.out.printf("%nName of Student: %s %s. %s%n",firstName[id], middleInitial[id], lastName[id]);
        System.out.println("Midterm Grade: "+FmidtermGrade[id]);
        System.out.println("Finals Grade: "+FfinalGrade[id]);
        System.out.println();
    }
    
    static int convert(double g){
        int grade = 1;
        if(g < 7 && g >= 0){
            grade = 70;
        }else if(g < 19){
            grade = 71;
        }else if(g < 31){
            grade = 72;
        }else if(g < 43){
            grade = 73;
        }else if(g < 50){
            grade = 74;
        }else if(g < 51.5){
            grade = 75;
        }else if(g < 53){
            grade = 76;
        }else if(g < 55){
            grade = 77;
        }else if(g < 57){
            grade = 78;
        }else if(g < 59){
            grade = 79;
        }else if(g < 61){
            grade = 80;
        }else if(g < 63){
            grade = 81;
        }else if(g < 65){
            grade = 82;
        }else if(g < 67){
            grade = 83;
        }else if(g < 69){
            grade = 84;
        }else if(g < 71){
            grade = 85;
        }else if(g < 73){
            grade = 86;
        }else if(g < 75){
            grade = 87;
        }else if(g < 77){
            grade = 88;
        }else if(g < 79){
            grade = 89;
        }else if(g < 81){
            grade = 90;
        }else if(g < 83){
            grade = 91;
        }else if(g < 85){
            grade = 92;
        }else if(g < 87){
            grade = 93;
        }else if(g < 89){
            grade = 94;
        }else if(g < 91){
            grade = 95;
        }else if(g < 93){
            grade = 96;
        }else if(g < 95){
            grade = 97;
        }else if(g < 97){
            grade = 98;
        }else{
            grade = 99;
        }
        return grade;
    }    
}