import java.util.Scanner;
class OrderFlowers {
  public static void main(String[] args) {
    String order = orderFlowers();
    System.out.println(order);
    /*
     * FORMÅL:
     * bruge String-format metoden til at tildele en variabel en kompleks
     * værdi af sammensatte dele som returneres til main. 
     *
     * OPGAVE:
     * Lav en metode orderFlowers som indeholder en række spørgsmål til en 
     * bruger om hvilken buket han/hun vil bestille:
     * hvilke blomster skal indgå, hvad må den koste, skal den leveres, skal der grønt med
     * Hvis der svares Ja til levering skal der spørges til navn og adresse
     * Ja/Nej svaret til om der skal grønt med skal sættes sammen som  det ses i testresultatet
     * Alle variabler samles i én streng-variabel der returneres til main hvor hvert svar
     * er adskilt af en såkaldt delimiter - i dette tilfælde et semikolon
     
     * TESTKØRSEL: en mulig returstreng: 
     * roser,tulipaner;Ja til grønt;345;Otto Verner;Gyden 12;4500 Odense
     *

*/
  }
  public static String orderFlowers() {
    Scanner myScan = new Scanner(System.in);
    String flowerOrder = "";
    String flowerOrderAdress = "";

    System.out.println("Hvilke blomster skal indgå? Adskil med komma - feks roser,tulipaner");
    String flowers = myScan.nextLine();
    System.out.println("Skal der grønt med?(Ja/Nej)");
    String green = myScan.nextLine();
    green += " til grønt";
    System.out.println("Hvad må den koste?");
    int price = myScan.nextInt();
    System.out.println("Skal den leveres?(Ja/Nej)");
    myScan.nextLine();
    String deliver = myScan.nextLine();
    if (deliver.equals("Ja")) {
      System.out.println("Navn");
      String name = myScan.nextLine();
      System.out.println("Indtast vej navn og nr:");
      String street  = myScan.nextLine();
      System.out.println("Indtast postnr og by:");
      String postal  = myScan.nextLine();
      flowerOrderAdress = String.format("%s;%s;%s", name,street,postal);
    }
    flowerOrder = String.format("%s;%s;%d;",flowers,green,price);
    flowerOrder += flowerOrderAdress;
    return flowerOrder;
  }
}

