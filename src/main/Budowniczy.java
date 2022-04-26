package main;

public class Budowniczy {
    public static void main(String[] args) {
        Pojazd p = new Pojazd.Builder()
                .id(1)
                .marka("AUDI")
                .predkoscMax(230)
                .rejestracja("ZAM12345")
                .kola(4)
                .poduszkiPowietrzne(2)
                .build();
        System.out.println(p.getId());
        System.out.println(p.getMarka());
        System.out.println(p.getPredkoscMax());
        System.out.println(p.getRejestracja());
        System.out.println(p.getKola());
        System.out.println(p.getPoduszkiPowietrzne());

        System.out.println("________");
        Pojazd p2 = new Pojazd.Builder()
                .id(2)
                .marka("ROVER")
                .predkoscMax(220)
                .rejestracja("LZK654445")
                .kola(4)
                .poduszkiPowietrzne(2)
                .build();
        System.out.println(p2.getId());
        System.out.println(p2.getMarka());
        System.out.println(p2.getPredkoscMax());
        System.out.println(p2.getRejestracja());
        System.out.println(p2.getKola());
        System.out.println(p2.getPoduszkiPowietrzne());

    }
}
