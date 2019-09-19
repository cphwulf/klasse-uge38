class DrawBox {
  public static void main(String[] args) {
    drawBox(6,10);
    /*
     * FORMÅL: 
     * for-loops samt parametrisere printf
     * dvs at System.out.printf("%14s%n","#") bliver til
     * format = "%" + variabel + "s%n";
     * myChar = "*"
     * System.out.printf(format,myChar);
     * 
     *
     * OPGAVEN:
     * tegn en firkant vha  metoden drawBox hvor højde og bredde 
     * angives som parametre 
     *
     * TESTKØRSEL:
     * drawBox(6,10) giver flg. figur

        **********
        *        *
        *        *
        *        *
        *        *
        **********

*/

  }
  public static void drawBox(int height, int width) {
    String format = "";
    String myEmpty = " ";
    writeChars('*',width);
    // TODO: skriv for-loop hvor hver iteration tegner en linje
    // og hvor antallet af loops begrænses af height samt at
    // width indgår i formateringen af printf.
    // a la format = "*%"+width+"s" og så printf(format,args)
    format = "*%"+(width-2)+"s*%n";
    for (int i = 0;i<height-2;i++) {
    //System.out.printf("*        *%n");
    System.out.printf(format,myEmpty);
    }
    writeChars('*',width);

  }
  public static void writeChars(char myChar, int frequency) {
    //TODO: skriv for-loopet der printer myChar det antal gange
    // der er med som anden parameter i metodekaldet
    for (int i = 0;i<frequency;i++) {
      System.out.print("*");
    }
    System.out.println();
  }
}
