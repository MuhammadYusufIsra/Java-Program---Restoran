/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restoran;

/**
 *
 * @author Yusuf Isra
 */
//Class Restoran dengan extends ke class Main
public class Restoran extends Main {
    //Deklarasi variabel
    //Private untuk variabel yang hanya akan digunakan di class ini
    private String Meja1;
    //Variabel Meja2-Meja4 akan digunakan di class meja
    public String Meja2;
    public String Meja3;
    public String Meja4;
    public String Pulang;

    //Method public void dengan nama "judul"
    //Method ini hanya untuk menampilkan bagian pembuka pada user interface
    public void judul() {
        System.out.println("------------------------------------------------");
        System.out.println("      Selamat Datang Di Rumah Makan BERKAYU     ");
        System.out.println("------------------------------------------------");
        System.out.println(" ");
        System.out.println("      ~ Masukkan data diri kamu ya... ;) ~      ");
        System.out.println("------------------------------------------------");
    }

    //Menggunakan setter untuk mengubah variabel Meja 1 sebelumnya menjadi Meja1 yang digunakan sebagai parameter
    public void setMeja(String Meja1) {
        this.Meja1 = Meja1;

    }
    //Menggunakan getter untuk mencetak apa yang user tulis di parameter dan mengembalikan nilai Meja1
    public String getMeja() {
        System.out.println(Meja1);
        return Meja1;
    }

}
