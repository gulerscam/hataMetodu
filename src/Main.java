/*
 Bu örnekte bir e-ticaret uygulamasında stok kontrolü için; bir ürünü satın almaya
 çalıştığımızda yeterli stok yoksa özel bir StokYetersizException hatası fırlatılacaktır.
 */

// Main.java
public class Main {
    public static void main(String[] args) {
        Urun urun = new Urun("Laptop", 100);

        try {
            System.out.println("95 adet Laptop satın alınmaya çalışılıyor...");
            urun.satinAl(95); // Yeterli stok, başarılı olacak


            System.out.println("\n17 adet Laptop satın alınmaya çalışılıyor...");
            urun.satinAl(17); // Yetersiz stok, hata fırlatılacak
        } catch (StokYetersizException e) {
            System.out.println("Hata: " + e.getMessage());
        }
    }
}