import java.util.Scanner;

public class BSayi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] sayilar=new int[3];
        for (int i=0;i<3;i++){
            System.out.println(i+1+". Sayıyı giriniz  ");
            sayilar[i]=sc.nextInt();
        }
        int max=0;
        for(int a:sayilar){
            for (int b:sayilar){
                if(a>b && a>max){
                    max=a;
                }
            }
        }
        System.out.println(max+ " en büyük sayıdır");
    }
}
