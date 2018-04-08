package praktek03;
public class SepatuAksi {
    public static void main(String[] args) {
        Sepatu a = new Sepatu();
        
        a.setMerk("Nike");
        a.setWarna("Putih");
        a.setHarga(20000);
        
        a.cetakinfo();
    
        System.out.println("merknya \t: ");
        System.out.println(a.getMerk());
        System.out.println("warnanya \t: ");
        System.out.println(a.getWarna());
        System.out.println("harganya \t: "); 
        System.out.println(a.getHarga());
                
    
    
    }
}
