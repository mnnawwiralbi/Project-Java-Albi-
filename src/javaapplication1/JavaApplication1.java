/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner a = new Scanner(System. in );
int nim, jenis, harga_sewa;
int total_harga=0;
String namaMHS;
System.out.println ("===========================================================");
System.out.println ("INPUT DATA PEMINJAM");
System.out.println ("===========================================================");
System.out.print   ("Masukkan Nama       = ");
namaMHS = a.nextLine();
System.out.print   ("Masukkan Nim        = ");
nim = a.nextInt();
System.out.print   ("Masukan Jumlah Buku = ");
jenis = a.nextInt();
System.out.println ("==========================================================");
//tentukan jumlah arfraynya sebanyak nilai jenis
int jenis_arr[] = new int[jenis];
String judul_arr[] = new String[jenis];
//lakukan pengulangan
for (int b = 0; b < jenis; b++) {
System.out.print("Masukan Judul Buku : ");
judul_arr[b] = a.next();
System.out.print("Jenis Buku : 1. Komputer | 2. Non Komputer \nMasukan pilihan buku : ");
jenis_arr[b] = a.nextInt();
if(jenis_arr[b]==1){//"komputer"){ —---> Letak kesalahan
harga_sewa = 5000;

total_harga = total_harga+harga_sewa;
}else if(jenis_arr[b]==2){//"non komputer"){ —-> Letak kesalahan
harga_sewa = 3000;

total_harga = total_harga+harga_sewa;
}
}
System.out.println("");
System.out.println ("==========================================================");
System.out.println ("DATA PEMINJAM");
System.out.println ("==========================================================");
System.out.println ("Nama Mahasiswa               = "+namaMHS);
System.out.println ("Nim Mahasiswa                = "+nim);
System.out.println ("Total Biaya Pinjam           = "+total_harga);
System.out.println ("==========================================================");
System.out.println ("DAFTAR BUKU YANG DIPINJAM");
System.out.println ("==========================================================");
for (int b = 0;b<jenis;b++){
System.out.println ("Judul Buku Ke : " + b +": " + judul_arr [b]);
}
    }   
}
    

