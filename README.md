Verilen bir yöntemin, giriş parametrelerine ve dış faktörlere bağlı olarak belirli hata türlerini döndürebilen bir
yöntem olduğu bir senaryo oluşturun. Yöntemi çağırmak, hataları düzgün şekilde işlemek ve hataların hangi
koşullarda geri döndüğünü anlamak için bir test yazın. Ödevi Github reposu ile gönderiniz.
Örnek:
Bölme işlemi gerçekleştirirken 0’a bölünme durumunda oluşacak hatayı yakalayarak, ilgili hata yaşandığında
“Sıfıra bölme işlemi hatası” mesajını gönderecek Custom bir Exception tanımlayarak. Bu hatanın alınıp
alınmadığını kontrol eden bir test yazın.
Ödev adımları:
1. Custom exception oluşturun. (4 puan)
2. Seçtiğiniz hata metodu için hatanın oluştuğunu kontrol edin. (3 puan)
3. Hata mesajını kendinizin oluşturduğu hata ile fırlatın. (3 puan)

Bu ödevde yetersiz stok için bir exception tanımlanmıştır. 
Bir e-ticaret projesinde; Belirli bir ürünü satın almaya çalışan kullanıcı için, stok yeterli değilse StokYetersizException isimli özel bir hata sınıfı başlatacağız.
