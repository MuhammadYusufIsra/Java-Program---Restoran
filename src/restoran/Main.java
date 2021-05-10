//package
package restoran;
//mengimport scanner

import java.util.Scanner;

/**
 *
 * @author Yusuf Isra
 */
//Class
public class Main {

    //Deklarasi variabel untuk method di class lain
    public String nama;
    public String notelp;
    public int cash;

    //Method main
    public static void main(String[] args) {

        //Deklarasi variabel
        String nama;
        String notelp;
        String alamat;
        int cash;
        int meja;
        int jumlah;
        int total;
        //Membuat kondisi variabel menjadi true dari awal
        boolean running = true;
        boolean runningmenu1 = true;
        String yeen;
        //Membuat object untuk menghubungkan method class lain dengan class ini
        Restoran class1 = new Restoran();
        meja class2 = new meja();
        //Membuat scanner
        Scanner input = new Scanner(System.in);
        Scanner inputadd = new Scanner(System.in);

        //Memanggil method judul di class Restoran
        class1.judul();
        System.out.print("Silahkan masukkan nama Anda                       : ");
        //Memakai scanner dengan nama variabel "nama"
        nama = input.nextLine();
        System.out.print("Silahkan masukkan nomor telefon anda (Yang aktif) : ");
        notelp = input.next();
        //Menampilkan data yang sudah dimasukkan oleh user sebelumnya
        System.out.println("\n------------------------------------------------");
        System.out.println("Atas Nama     : " + nama);
        System.out.println("Nomor telefon : " + notelp);
        System.out.println("------------------------------------------------");
        System.out.println("Berikut Meja yang Kosong : ");

        //Memakai setter untuk mencetak pilihan data meja yang kosong/makanan dibawa pulang
        //Dan mengisi parameter dengan apa yang akan kita tampilkan (Meja kosong/dibawa pulang)
        class1.setMeja("1. Meja 4 (Lantai 2)");
        class2.setMeja2("2. Meja 1 (Lantai 1");
        class2.setMeja3("3. Meja 2 (Lantai 1)");
        class2.setMeja4("4. Meja 5 (Lantai 2)");
        class2.setPulang("5. Dibawa pulang");

        //Memakai getter untuk me-return nilai pada setter
        class1.getMeja();
        class2.getMeja2();
        class2.getMeja3();
        class2.getMeja4();
        class2.getPulang();

        //Menggunakan while dengan kondisi true oleh variabel "running"
        while (running) {
            System.out.println("------------------------------------------------");
            System.out.print("Nomor Meja yang Anda pilih [1|2|3|4|5] : ");
            //User memasukkan pilihan
            meja = input.nextInt();
            System.out.println("------------------------------------------------");

            //Percabangan switchcase yang mengarahkan variabel scanner meja kepada opsinya masing masing
            switch (meja) {
                case 1:
                    //Mencetak pilihan user
                    System.out.println("Meja yang akan digunakan = Meja 4 - L2");
                    //Break untuk menghentikan keberlanjutan case 1 dengan case setelahnya
                    break;
                case 2:
                    //Mencetak pilihan user
                    System.out.println("Meja yang akan digunakan = Meja 1 - L1");
                    break;
                case 3:
                    //Mencetak pilihan user
                    System.out.println("Meja yang akan digunakan = Meja 2 - L1");
                    break;
                case 4:
                    //Mencetak pilihan user
                    System.out.println("Meja yang akan digunakan = Meja 5 - L5");
                    break;
                case 5:
                    //Meminta alamat user karena user telah memilih opsi dimana makanan akan dibawa pulang
                    System.out.print("Masukkan Alamat Anda : ");
                    //Menggunakan scanner dengan variabel alamat
                    alamat = inputadd.nextLine();
                    //Menampilkan data yang sudah dimasukkan oleh user sebelumnya
                    System.out.println("------------------------------------------------");
                    System.out.println("Atas Nama     : " + nama);
                    System.out.println("Nomor Telepon : " + notelp);
                    System.out.println("Alamat        : " + alamat);
                    System.out.println("------------------------------------------------");
                    break;
                //Default untuk code yang dijalankan jika user tidak memilih angka pada opsi (1-5)
                default:
                    System.out.println("Mohon Maaf nomor yang anda pilih tidak ada");
                    /*System.exit digunakan untuk menghentikan program secara keseluruhan,
                    dan (2) untuk menentukan waktu yang diperlukan hingga program akan mati,
                    singkatnya "2 detik program ini mati"*/
                    System.exit(2);
            }
            System.out.print("Apakah Anda sudah yakin dengan pilihan Anda [Y|N] ? ");
            yeen = input.next();
            //Menggunakan percabangan untuk memastikan pilihan user benar atau tidak menggunakan if else
            //EqualsIgnoreCase memperbolehkan user mengetik huruf y dengan huruf kapital ataupun bukan
            if (yeen.equalsIgnoreCase("y")) {
                //Jika user mengetik y maka perulangan while yang kondisinya tadi true menjadi false
                running = false;
                //while kedua untuk bagian menu makanan
                while (runningmenu1) {
                    //Menampilkan menu makanan
                    System.out.println("\n----------- M E N U    M A K A N A N -----------");
                    System.out.println("1. Paket A [Nasi + Ayam Goreng + Coke]       : Rp. 30.000,00 ");
                    System.out.println("2. Paket B [Nasi + Ayam Goreng+ Air Mineral] : Rp. 25.000,00 ");
                    System.out.println("3. Paket C [2 Nasi + 3 Ayam + Coke]          : Rp. 70.000,00 ");
                    System.out.println("4. Paket Keluarga [3 Nasi + 5 Ayam + 3 Coke] : Rp. 101.000,00   ");
                    System.out.println("5. Coke                                      : Rp. 7.000,00  ");
                    System.out.println("6. Air Mineral                               : Rp. 5000,00   ");
                    System.out.println("------------------------------------------------");
                    System.out.print("Pilihan Menu Anda [1|2|3|4|5|6] : ");
                    //user memasukkan pilihannya
                    int pilihan1 = input.nextInt();

                    System.out.println("------------------------------------------------");
                    //Percabangan switch case untuk user input dalam variabel "pilihan1"
                    switch (pilihan1) {
                        //Jika user memasukkan angka 1
                        case 1:
                            System.out.print("Jumlah item                     : ");
                            //User diminta jumlah item yang akan dibeli
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Paket A - Rp. 30.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            //Operator aritmatika untuk mencari total harga dimana harga barang sesuai menu*jumlah
                            total = 30000 * jumlah;
                            //Menampilkan total
                            System.out.println("Total harga yang harus anda bayar    : " + total);

                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen1 = input.next();
                            //Menggunakan if else untuk memastikan pilihan user akan pilihan mereka
                            //If untuk kondisi jika user memasukkan "N", karena ada equalsIgnoreCase jadi user bisa memasukkan "N" atau "n"
                            if (yeen1.equalsIgnoreCase("N")) {
                                //Jika user memasukkan "n" maka while sebelumnya akan mengulang program (menampilkan menu makanan lagi)
                                runningmenu1 = true;
                                //Else, jika user tidak memasukkan "N", atau dalam maksud lain "Y" maka perulangan sebelumnya akan dimatikan dan lanjut ke code berikutnya
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                //User diminta untuk memasukkan nominal yang user bawa
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");
                                //Percabangan if else
                                //If, jika uang user (cash) lebih kecil dari total
                                if (cash < total) {
                                    //Mencetak pemberitahuan
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen2 = input.next();
                                    //Menggunakan if else untuk memastikan pilihan user akan pilihan mereka
                                    //If untuk kondisi jika user memasukkan "y", karena ada equalsIgnoreCase jadi user bisa memasukkan "Y" atau "y"
                                    if (yeen2.equalsIgnoreCase("Y")) {
                                        //Jika user memasukkan "y" maka while sebelumnya akan mengulang program (menampilkan menu makanan lagi)
                                        runningmenu1 = true;
                                        //Jika tidak, maka program akan mati dengan System.exit(0); dengan 0 sebagai jeda waktu sampai program mati
                                    } else {
                                        System.exit(0);
                                    }
                                    //Else if, dalam kondisi lain jika uang user sama dengan totalnya maka akan menampilkan pemberitahuan berikut    
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    //Dan tidak lupa System.exit(0); untuk mematikan program
                                    System.exit(0);
                                    //Else, jika uang user tidak memenuhi kedua kondisi di atas (uang user lebih)
                                } else {
                                    //Program mencetak jumlah uang user
                                    System.out.println("Uang Anda                        : " + cash);
                                    //Program mencetak total harga yang harus dibayar, dengan operator aritmatika (uang user - total harga)
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    //Program berhenti
                                    System.exit(0);
                                }
                            }
                            //Break untuk menghentikan keberlanjutan case 1 dengan case setelahnya
                            break;

                        case 2:
                            System.out.print("Jumlah item                     : ");
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Paket B - Rp. 25.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            total = 25000 * jumlah;
                            System.out.println("Total harga yang harus anda bayar    : " + total);

                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen3 = input.next();
                            if (yeen3.equalsIgnoreCase("N")) {
                                runningmenu1 = true;
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");

                                if (cash < total) {
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen4 = input.next();
                                    if (yeen4.equalsIgnoreCase("Y")) {
                                        runningmenu1 = true;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    System.exit(0);
                                } else {
                                    System.out.println("Uang Anda                        : " + cash);
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    System.exit(0);
                                }
                            }
                            break;

                        case 3:
                            System.out.print("Jumlah item                     : ");
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Paket B - Rp. 70.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            total = 70000 * jumlah;
                            System.out.println("Total harga yang harus anda bayar    : " + total);
                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen5 = input.next();
                            if (yeen5.equalsIgnoreCase("N")) {
                                runningmenu1 = true;
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");

                                if (cash < total) {
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen6 = input.next();
                                    if (yeen6.equalsIgnoreCase("Y")) {
                                        runningmenu1 = true;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    System.exit(0);
                                } else {
                                    System.out.println("Uang Anda                        : " + cash);
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    System.exit(0);
                                }
                            }
                            break;

                        case 4:
                            System.out.print("Jumlah item                     : ");
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Paket Keluarga - Rp. 101.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            total = 101000 * jumlah;
                            System.out.println("Total harga yang harus anda bayar    : " + total);
                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen7 = input.next();
                            if (yeen7.equalsIgnoreCase("N")) {
                                runningmenu1 = true;
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");

                                if (cash < total) {
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen8 = input.next();
                                    if (yeen8.equalsIgnoreCase("Y")) {
                                        runningmenu1 = true;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    System.exit(0);
                                } else {
                                    System.out.println("Uang Anda                        : " + cash);
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    System.exit(0);
                                }
                            }
                            break;

                        case 5:
                            System.out.print("Jumlah item                     : ");
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Coke - Rp. 7.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            total = 7000 * jumlah;
                            System.out.println("Total harga yang harus anda bayar    : " + total);
                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen9 = input.next();
                            if (yeen9.equalsIgnoreCase("N")) {
                                runningmenu1 = true;
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");

                                if (cash < total) {
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen10 = input.next();
                                    if (yeen10.equalsIgnoreCase("Y")) {
                                        runningmenu1 = true;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    System.exit(0);
                                } else {
                                    System.out.println("Uang Anda                        : " + cash);
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    System.exit(0);
                                }
                            }
                            break;

                        case 6:
                            System.out.print("Jumlah item                     : ");
                            jumlah = input.nextInt();
                            System.out.println("------------------------------------------------");
                            System.out.println("Item Yang Anda Pilih                 : Air Mineral - Rp. 5.000");
                            System.out.println("Jumlah item                          : " + jumlah);

                            total = 5000 * jumlah;
                            System.out.println("Total harga yang harus anda bayar    : " + total);
                            System.out.print("Apakah Anda sudah yakin dengan pesanan Anda [Y|N] ? ");
                            String yeen11 = input.next();
                            if (yeen11.equalsIgnoreCase("N")) {
                                runningmenu1 = true;
                            } else {
                                runningmenu1 = false;
                                System.out.println("------------------------------------------------");
                                System.out.print("Nominal uang yang Anda bawa            : ");
                                cash = input.nextInt();
                                System.out.println("------------------------------------------------");

                                if (cash < total) {
                                    System.out.print("Mohon maaf uang anda kurang, apakah ingin memilih menu makanan lain [Y|N] ? ");
                                    String yeen12 = input.next();
                                    if (yeen12.equalsIgnoreCase("Y")) {
                                        runningmenu1 = true;
                                    } else {
                                        System.exit(0);
                                    }
                                } else if (cash == total) {
                                    System.out.println("Uang Anda Pas, Terimakasih sudah memesan");
                                    System.exit(0);
                                } else {
                                    System.out.println("Uang Anda                        : " + cash);
                                    System.out.println("Kembalian Anda                   : " + (cash - total));
                                    System.out.println("------------------------------------------------");
                                    System.out.println("Terimakasih sudah memesan, pesanan anda akan segera kami kirim ketempat anda");
                                    System.out.println("------------------------------------------------");
                                    System.exit(0);
                                }
                            }
                            break;
                        //Default, jika user tidak memilih angka menu (1-6) Maka user akan diarahkan kedalam code default
                        default:
                            System.out.println("Pilihan Anda tidak ada, Kembali ke pemilihan menu ? [Y|N]");
                            String yeen13 = input.next();
                            //If else untuk memilah input user, jika user mengetik "y" atau "Y" maka user akan kembali kedalam pemilihan menu
                            if (yeen13.equalsIgnoreCase("Y")) {
                                runningmenu1 = true;
                                //Else if, jika user mengetik n atau N maka program akan berhenti
                            } else if (yeen13.equalsIgnoreCase("N")) {
                                System.exit(0);
                            }
                    }
                }
                //Else ini milik if yang menanyakan user apakah sudah yakin dengan meja yang dipilih/dibawa pulang
            } else {
                //Jika user memasukkan n atau N maka perulangan while dengan variabel bernama running akan berjalan/aktif
                running = true;
            }

        }
    }
}
