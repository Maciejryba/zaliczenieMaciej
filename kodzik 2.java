import java.util.Scanner;
class Przedmiot {
private String nazwa;
private String typ;
private String producent;
private int rok_produkcji;
public void wczytaj() {
Scanner input = new Scanner(System.in);
System.out.println("Podaj nazwe: ");
this.nazwa = input.nextLine();
System.out.println("Podaj typ: ");
this.typ = input.nextLine();
System.out.println("Podaj producenta: ");
this.producent = input.nextLine();
System.out.println("Podaj nazwe: ");
this.rok_produkcji = Integer.parseInt(input.nextLine());
input.close();
}
public void wypisz() {
wczytaj();
}
public Przedmiot() {
}
public Przedmiot(String nazwa, String typ, String producent, int rok_produkcji) {
super();
this.nazwa = nazwa;
this.typ = typ;
this.producent = producent;
this.rok_produkcji = rok_produkcji;
}
}