public class Koperasi
{
    String ID, nama, alamat;
    double pinjam,angsuran;
 
 
 //Methodvoid
    void cetakdata(){
        System.out.println("==Data Nasabah==");
        System.out.println("ID : "+ID);
        System.out.println("Nama : "+nama);
        System.out.println("Alamat : "+alamat);
        System.out.println("==Keuangan==");
    }
    
    void pinjam(){
        System.out.println("Pinjaman : "+pinjam);
    }
    
    void angsuran(){
        System.out.println("Angsuran : "+angsuran);
    }
    
    
 //Methodnonvoid
    double hitungsumbangan(){
    double sumbangan = pinjam * 0.025;
    return sumbangan;
}
    double cicilanbulanan(){
    double cicilan = angsuran * 12;
    return cicilan;
}
    double hitungbunga(){
    double bunga = (cicilanbulanan()-pinjam)/pinjam*1;
    return bunga;
}
}