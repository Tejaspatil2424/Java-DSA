import java.util.Scanner;
class Triangle2{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter No.");
        int n=sc.nextInt();

        for(int i=n;i>=1;i--)
        {
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
        
    }
}