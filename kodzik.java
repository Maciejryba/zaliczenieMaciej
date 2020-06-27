private String tytul;
private String autor;
private String wydawnictwo;
private int rokWydania;
private int cena;
public Ksiazka(String tytul, String autor, String wydawnictwo, int rokWydania, int cena) {
super();
this.tytul = tytul;
this.autor = autor;
this.wydawnictwo = wydawnictwo;
this.rokWydania = rokWydania;
this.cena = cena;
}
public Ksiazka() {
}
public void wczytajTytul(String tytul) {
this.tytul = tytul;
}
public void wczytajAutora(String autor) {
this.autor = autor;
}
public void wczytajRokWydania(int rok) {
this.rokWydania = rok;
}
public String wypiszTytul() {
return tytul;
}
public String wypiszAutora() {
return autor;
}
public int wypiszRokWydania() {
return rokWydania;
}
@Override
public String toString() {
return "Ksiazka [tytul=" + tytul + ", autor=" + autor + ", wydawnictwo=" + wydawnictwo +
", rokWydania="
+ rokWydania + ", cena=" + cena + "]";
}
}
public class Main {
public static void main(String[] args) {
Ksiazka k1 = new Ksiazka("W pustyni i w paszczy", "Henryk Sienkiewicz", "PWN", 1992, 9);
Scanner input = new Scanner(System.in);
System.out.println("Podaj tytul: ");
String tytul = input.nextLine();
System.out.println("Podaj autor: ");
String autor = input.nextLine();
System.out.println("Podaj wydawnictwo: ");
String wydawnictwo = input.nextLine();
System.out.println("Podaj rok wydania: ");
int rok_wydania = Integer.parseInt(input.nextLine());
System.out.println("Podaj cena: ");
int cena = Integer.parseInt(input.nextLine());
input.close();
Ksiazka k2 = new Ksiazka();
k2.wczytajAutora(autor);
k2.wczytajRokWydania(rok_wydania);
k2.wczytajTytul(tytul);
System.out.println(k1);
System.out.println(k2);
}
}