public class Urun {
    private String urunAdi;
    private int stok;

    public Urun(String urunAdi, int stok) {
        this.urunAdi = urunAdi;
        this.stok = stok;
    }

    public int getStok() {
        return stok;
    }

    public void satinAl(int miktar) throws StokYetersizException {
        if (miktar > stok) {
            throw new StokYetersizException("Yetersiz stok!! İstediğiniz miktarda ürün stokta bulunmamaktadır.");
        }
        stok -= miktar;
        System.out.println(miktar + " adet " + urunAdi + " satın alındı. Güncel stok: " + stok);
    }
}
