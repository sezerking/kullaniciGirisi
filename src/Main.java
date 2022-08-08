import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName,password,ans;

        Scanner scn= new Scanner(System.in);

        System.out.println("Kullanici adini giriniz: ");
        userName=scn.nextLine();

        System.out.println("Sifreniz: ");
        password=scn.nextLine();

        if (userName.equals("patika")&&password.equals("java123")){
            System.out.println("Giris yaptiniz.");
        }
        else {
            System.out.println("Bilgileriniz yanlis! Sifrenizi degistirmek ister misiniz?(E ya da H)");

        }
        ans=scn.nextLine();

        switch (ans){
            case "E":
                System.out.println("Lutfen yenisifrenizigiriniz: ");
                password=scn.nextLine();
                if (password.equals("java123"))
                    System.out.println("Sifre olusturulamadi lutfen baska sifre girinz.");
                else
                    System.out.println("Sifre olusturuldu.");
                break;
            case "H":
                System.out.println("Lutfen tekrar deneyiniz.");
        }
    }
}
