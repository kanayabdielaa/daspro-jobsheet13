import java.util.Scanner;

public class ModifUcapanTerimaKasih_14 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan NAMA orang yang ingin Anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        sc.close();
        return namaOrang;
    }   

    public static void UcapanTerimakasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you "+nama+" for being the best teacher in the world.\n"+
        "You inspired in me a love for learning and made me feel like I could ask ypu anything.");
    }

    public static void UcapanTambahan(String tambahan) {
        System.out.println("Additional Message: " + tambahan);  
    }
    public static void main(String[] args) {
        UcapanTerimakasih();
        UcapanTambahan("Your dedication is truly appreciated!");
    }
}