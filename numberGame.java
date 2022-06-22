import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class numberGame {
    public static void main(String[] args) {

        Random rand = new Random();
        int number = rand.nextInt(100);
        Scanner inp = new Scanner(System.in);

        int right = 0;
        int selected;
        int[] wrong = new int[5];
        boolean isWin= false;
        boolean isWrong = false;

        System.out.println(number);

        while(right<5){

            System.out.print(" Tahmin Gir : ");
            selected = inp.nextInt();
            if(selected<0||selected>100){
                System.out.println("100 ile 0 arasinda deger gir..");
                if(isWrong){
                    System.out.println("Cok Fazla Hatali Giris Yaptiniz ... Kalan Hak : "+ (5-(++right)));

                }else{
                    System.out.println("hatali Giris Tekrarlanirsa Hakknizdan Dusulecektir");
                    isWrong=true;

                }
                continue;
            }
            if(selected==number){
                System.out.println("Tebrikler dogru....");
                isWin=true;
                break;
            }else{
                wrong[right]= selected;
                right++;
                System.out.println("Tutturamadin...");
                if(selected>number){
                    System.out.println("daha asagiya dogru tahmin yurut..");
                } else{
                    System.out.println("daha yukariya dogru tahmin yurut..");
                    
                }
                System.out.println("kalan hakkiniz : "+(5-right));
            }






        }
        if(isWin==false){
            System.out.println(" Kaybettiniz..");
            System.out.println("Tahminleriniz: " + Arrays.toString(wrong));

        }


    }
}
