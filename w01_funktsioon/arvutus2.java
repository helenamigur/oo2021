public class arvutus2{
  public static void main(String[] arg){
    System.out.println("argumente: "+arg.length);
    if(arg.length==1){
      System.out.println("Ainuke: "+arg[0]);
    }
    if(arg.length==2){
      System.out.println("Kaks arvu");
      int arv1=Integer.parseInt(arg[0]);
      int arv2=Integer.parseInt(arg[1]);
      System.out.println(arv1*arv2);
    }
    //kui on kolm arvu, kuvage nende summa
    if(arg.length==3){
      System.out.println("summa:");
      int arv1=Integer.parseInt(arg[0]);
      int arv2=Integer.parseInt(arg[1]);
      int arv3=Integer.parseInt(arg[2]);
      System.out.println(arv1+arv2+arv3);
    }
    for(String a: arg){
      System.out.println(a);
    }
    for(int i=0; i<arg.length; i++){
      System.out.println("kohal "+i+" on "+arg[i]);
    }
    //4 ja rohkema arvu puhul kuvage arvude summa tsükli abil, 10:15
    int summa=0;
    if(arg.length>=4){
      for(int i=0; i<arg.length; i++){
        summa=summa+Integer.parseInt(arg[i]);
      }
        System.out.println(summa);
    }
  }
}
