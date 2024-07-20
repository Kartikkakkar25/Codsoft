import java.util.Scanner;
public class task2 {
    public int eng;
    public int hindi;
    public int math;
    public int sst;
    public int science;
    int sum=0;
    float avg=0;
    public task2(int e,int h,int m,int s,int sc){
        eng=e;
        hindi=h;
        math=m;
        sst=s;
        science=sc;
    }
    public int cal_tot(){
        sum=eng+hindi+math+sst+science;
        return sum;
    }
    public float avg_per(){
        avg=sum/5;
        return avg;
    }

    public static void main(String[] args) {
        String grade = "";
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter English subject marks(out of 100): ");
        int eng=sc.nextInt();
        System.out.print("Enter Hindi subject marks(out of 100): ");
        int hin=sc.nextInt();
        System.out.print("Enter Maths subject marks(out of 100): ");
        int mat=sc.nextInt();
        System.out.print("Enter SST subject marks(out of 100): ");
        int sst=sc.nextInt();
        System.out.print("Enter Science subject marks(out of 100): ");
        int sci=sc.nextInt();
        task2 ts=new task2(eng,hin,mat,sst,sci);
        int total=ts.cal_tot();
        float avrg=ts.avg_per();
        if(avrg>=97&&avrg<=100){
            grade="A+";
        }
        else if(avrg>=93&&avrg<=96){
            grade="A";
        }
        else if(avrg>=90&&avrg<=92){
            grade="A-";
        }
        else if(avrg>=87&&avrg<=89){
            grade="B+";
        }
        else if(avrg>=83&&avrg<=86){
            grade="B";
        }
        else if(avrg>=80&&avrg<=82){
            grade="B-";
        }
        else if(avrg>=77&&avrg<=79){
            grade="C+";
        }
        else if(avrg>=73&&avrg<=76){
            grade="C";
        }
        else if(avrg>=70&&avrg<=72){
            grade="C-";
        }
        else if(avrg>=67&&avrg<=69){
            grade="D+";
        }
        else if(avrg>=63&&avrg<=66){
            grade="D";
        }
        else if(avrg>=60&&avrg<=62){
            grade="D-";
        }
        else if(avrg>=0&&avrg<=59){
            grade="F";
        }
        System.out.println("Your total Marks are: "+total);
        System.out.println("Your Average Percentage is: "+avrg);
        System.out.println("Grade assigned is: "+grade);
        sc.close();
    }
}
