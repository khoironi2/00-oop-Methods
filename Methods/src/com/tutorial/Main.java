package com.tutorial;

// Class
class Manusia {
    
    //Data dari class
    String nama;
    String Jenis_kelamin;
    int umur;
    String no_hp;

    //Constructor
    Manusia(String nama, String Jenis_kelamin, int umur, String no_hp){
        //this akan memanggil nama dari data diluar scopenya kemudian = di isi dengan nama didalam scope
        this.nama = nama;
        this.Jenis_kelamin = Jenis_kelamin;
        this.umur = umur;
        this.no_hp = no_hp;
    }

    //method tanpa return dan parameter
    void show(){
        System.out.println("Nama " + this.nama);
    }

    //method tanpa return dengan parameter
    void setNama(String nama){
        this.nama = nama;
    }

    //method dengan return tapi tanpa parameter
    String getNama(){
        return this.nama;
    }

    //method dengan return tapi tanpa parameter
    String getJenis_kelamin(){
        return this.Jenis_kelamin;
    }

    //method dengan return menggunakan parameter
    String SayHi(String message){
        return message + " Apa kabar, Perkenalkan saya adalah :" + this.nama;
    }

}

public class Main {
    public static void main(String[] args) {
        //membuat objek dengan nama manusia1
        Manusia manusia1 = new Manusia("khoironi","Laki-Laki",27,"08832728");

        //memannggil method dengan menempelkannya ke objek
        manusia1.show();

        //memanggil method dengan parameter dan menempelkannya ke objek
        manusia1.setNama("Jack");
        manusia1.show();


        System.out.println(manusia1.getNama());
        System.out.println(manusia1.getJenis_kelamin());

        String data = manusia1.SayHi("Hai Tamvan");
        System.out.println(data);
    }
}
