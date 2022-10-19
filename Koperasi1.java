import java.text.DecimalFormat;
public class Data
{
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main (String[] args){
    //intansiasi objek Koperasi
    Koperasi Koperasi01 = new Koperasi();
    //mengisi data pada objeck Koperasi.
    Koperasi01.ID="K001";
    Koperasi01.nama="Adam Kusuma Djati";
    Koperasi01.alamat="Jl.Raya Bogor";
    Koperasi01.pinjam= 1000000;
    Koperasi01.angsuran = 200000;
 
    ///menganngi methodvoid()
    Koperasi01.cetakdata();
    Koperasi01.pinjam();
    Koperasi01.angsuran();
    
    //Memanggil Methodnonvoid
    System.out.println("Sumbangan zakat : "+Koperasi01.hitungsumbangan());
    System.out.println("Cicilan Pertahun : "+Koperasi01.cicilanbulanan());
    System.out.println("Bunga : "+ df.format(Koperasi01.hitungbunga()));
 
}
}