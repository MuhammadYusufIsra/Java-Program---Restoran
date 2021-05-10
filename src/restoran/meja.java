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
//Class meja dengan extends ke class Restoran agar bisa menggunakan variabel yang ada di class Restoran
public class meja extends Restoran {

    //Setter, untuk mengubah variabel Meja2 menjadi variabel Meja2 sebagai parameter di class Main nanti
    public void setMeja2(String Meja2) {
        //super digunakan jika variabel yang digunakan terletak di class induknya
        super.Meja2 = Meja2;
    }

    //Getter, untuk mencetak hasil parameter ke user interface, dan mengembalikan nilai menggunakan return
    public String getMeja2() {
        System.out.println(Meja2);
        return Meja2;
    }

    public void setMeja3(String Meja3) {
        super.Meja3 = Meja3;
    }

    public void setMeja4(String Meja4) {
        super.Meja4 = Meja4;
    }

    public String getMeja3() {
        System.out.println(Meja3);
        return Meja3;
    }

    public String getMeja4() {
        System.out.println(Meja4);
        return Meja4;
    }
    
    public void setPulang(String Pulang){
        super.Pulang = Pulang;
    }
    
    public String getPulang(){
        System.out.println(Pulang);
        return Pulang;
    }
}
