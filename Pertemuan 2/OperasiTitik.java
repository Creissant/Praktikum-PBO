/**
 * File      : OperasiTitik.java		01/03/23
 * Penulis   : Varrel
 * Deskripsi : Kelas yang berisi body dari OperasiTitik
**/

public class OperasiTitik {
    private void refleksiSumbuTitikX(Titik titik){
        double ordinat = titik.getOrdinat();
        ordinat = ordinat * -1;
        titik.setOrdinat(ordinat);
    }

    private void refleksiSumbuTitikY(Titik titik){
        //cara normal
        //double absis = titik.getAbsis();
        //absis = absis * -1;
        //titik.setAbsis(absis);

        //cara cepat
        titik.setAbsis(-titik.getAbsis());
    }
    
    public Titik refleksiX(Titik titik){
        refleksiSumbuTitikX(titik);
        return titik;
    }

    public Titik refleksiY(Titik titik){
        refleksiSumbuTitikY(titik);
        return titik;
    }
}
