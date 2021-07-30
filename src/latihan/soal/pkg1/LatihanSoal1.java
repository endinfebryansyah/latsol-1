/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.soal.pkg1;

/**
 *
 * @author WINDOWS 10
 */
public class LatihanSoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int sukuPertama = 3;
        int selisih = 5;
        int jumlahSuku = 10;
        int sukuSaatIni = sukuPertama;
        int totalDeretAritmatika = 0;
        
       for(int i = 1; i <= jumlahSuku; i++){
           
           totalDeretAritmatika += sukuSaatIni;  
           sukuSaatIni += selisih; 
           
           System.out.println("Suku ke - "+i+" : "+sukuSaatIni); 
       }
       
        System.out.println("Jumlah Deret Aritmatika : " + totalDeretAritmatika);//
    }
}

    
}

    
    
}
