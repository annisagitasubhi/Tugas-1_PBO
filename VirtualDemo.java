package Latihan;

public class VirtualDemo {
    public static void main(String[] args) {
        /*Dua objek dibawah adalah polymorphism karena s dan e adalah objek baru di class Gaji dan class Gaji 
        adalah turunan dari class Pegawai*/
        Gaji s = new Gaji("Wahyu", "KUBAR", 3, 5000.00); 
        Pegawai e = new Gaji("Ini nama", "Samarinda", 2, 2500.00);/*upcasting*/
         /*karena objek e merupakan objek baru dengan tipe data pegawai pada class Gaji. Pegawai merupakan 
         superclass dan Gaji merupakan subclass. Jadi terjadi proses pengubahan referensi subclass 
         ke superclass -> upcasting*/
        System.out.println("Memanggil mailCheck Berdasarkan Referensi Gaji --");
        s.mailCheck();
        System.out.println("\nMemanggil mailCheck Berdasarkan Referensi Pegawai --");
        e.mailCheck();

        /*Alasan kenapa output "Menyusun Pegawai" ada 2, yaitu karena penggunaan super() pada constructor di 
        subclass (class Gaji) memanggil constructor superclass (class Pegawai).*/
    }
}