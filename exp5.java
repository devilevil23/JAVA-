import java.util.Scanner;
import java.util.ArrayList;
public class exp5{
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();

        for(int i=0;i<3;i++){
            System.out.println("Enter value of index:"+i);
            int num=sc.nextInt();
            list.add(num);
        }
        int sum=0;
        for(Integer ele:list){
            sum+=ele;
        }
        System.out.println("Sum:"+sum);
    }
}
