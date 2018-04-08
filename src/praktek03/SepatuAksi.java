package praktek03;
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu a = new Sepatu();
        
        a.setMerk("Nike");
        a.setWarna("Putih");
        a.setHarga(20000);
        a.setJenisSepatu();
  
               a.cetakinfo();
    
        System.out.println("merknya \t: ");
        System.out.println(a.getMerk());
        System.out.println("warnanya \t: ");
        System.out.println(a.getWarna());
        System.out.println("harganya \t: "); 
        System.out.println(a.getHarga());
        
        
        
        SepatuGunung sm = new SepatuGunung();
        sm.setMerk("puma");
        sm.setWarna("hijau");
        sm.setHarga(40000);
        sm.setJenisSepatu("sekolah");
        sm.cetakinfo();
        System.out.println("jenis :"+sm.getJenisSepatu());
        sm.thorttle();
                
    
    
    }
}
