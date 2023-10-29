/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugaspbo;
/**
 *
 * @author ASUS
 */
public class Padi {
    public static void main(String[] args) {
     Tanaman Padi = new Tanaman();
        Padi.setNama("Padi");
        Padi.setSpecies("Poaceae atau Gramineae (biasa dikenal rumput-rumputan)");
        Padi.setBatang("panjang dan runcing");
        Padi.setDaun("lebar dan pipih");
        Padi.setAkar("akar serabut");
        Padi.setSistemAkar("dangkal sehingga cocok untuk tumbuh di habitatnya");
        Padi.setBunga("bunga kecil yang dikenal sebagai malai/tangkai bunga");
        Padi.setPolinasi("serbuk sari yang dihasilkan oleh bunga jantan padi terbawa oleh angin atau serangga pembantu seperti lebah ke bagian putik bunga betina");
        Padi.setBiji("beras");
        Padi.setBuah("gabah");
        Padi.setFasePertumbuhan("fase perkecambahan, Fase vegetatif, Fase pembentukan anakan, Fase pembentukan malai, Fase berbunga, Fase pembentukan buah, Fase kematangan, Fase panen");
        Padi.setHabitat("sawah, lahan berair (tepi sungai, rawa-rawa, dll), lahan banjir, dan lahan bergengseng");
        Padi.setMasaPanen("ketika bulir-bulirnya telah matang sepenuhnya");
  
        System.out.println("Nama tumbuhan : "+Padi.getNama());
        System.out.println("Species tumbuhan : "+Padi.getSpecies());
        System.out.println("Padi Mempunyai Batang yang "+Padi.getBatang());
        System.out.println("Padi Mempunyai daun yang "+Padi.getDaun());
        System.out.println("Padi memiliki "+Padi.getAkar());
        System.out.println("Tanaman padi memiliki sistem akar yang "+Padi.getSistemAkar());
        System.out.println("Padi menghasilkan "+Padi.getBunga());
        System.out.println("Polinasi terjadi saat "+Padi.getPolinasi());
        System.out.println("Nama biji dari tanaman padi adalah "+Padi.getBiji());
        System.out.println("Nama buah dari tanaman padi adalah "+Padi.getBuah());
        System.out.println("Siklus hidup padi melibatkan beberapa fase pertumbuhan, yaitu "+Padi.getFasePertumbuhan());
        System.out.println("Tanaman padi memiliki habitat alami yang umumnya berhubungan dengan lahan basah, seperti "+Padi.getHabitat());
        System.out.println("Tanaman padi biasanya panen "+Padi.getMasaPanen());
       
        System.out.println(Padi.PerandalamMasyarakat());
        System.out.println(Padi.PerandalamEkonomi());
        // TODO code application logic here
    }
}




