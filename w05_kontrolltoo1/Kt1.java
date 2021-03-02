//Kui sisestatud arvudest on lugeja suurem kui nimetaja, esita arv segaarvuna.
//(nt, 7/4 -> 1 3/4). 
//Liida kokku kaks murdu, esita tulemus segaarvuna. 
//Lisaks eelmisele taanda vastus. 
import java.util.Scanner;

public class Kt1 {
    public static void main(String[] arg){
        int lugeja;
        int nimetaja;
        System.out.println("Sisesta lugeja:");
        Scanner userInput;
        userInput = new Scanner(System.in);
        lugeja = userInput.nextInt();
        //System.out.println("Lugejaks on " + lugeja);
        System.out.println("Sisesta nimetaja:");
        userInput = new Scanner(System.in);
        nimetaja = userInput.nextInt();
        //System.out.println("Nimetajaks on " + nimetaja);
        System.out.println("Murruks on " + lugeja +"/"+ nimetaja);
        int j22k;
        int t2isarv;
        if (lugeja > nimetaja){
            j22k = lugeja % nimetaja;
            t2isarv = (lugeja - j22k) / nimetaja;
            if(j22k == 0){
                System.out.println("Jääk 0, täisarv " + t2isarv);
            } else {
                System.out.println("Esimene murd segaarvuks: " + t2isarv + " " + j22k +"/"+ nimetaja);
            }
        }
        //küsimine korras
        //teise murru küsimine
        int teineLugeja;
        int teineNimetaja;
        System.out.println("Sisesta teine lugeja: ");
        userInput = new Scanner(System.in);
        teineLugeja = userInput.nextInt();
        System.out.println("Sisesta teine nimetaja: ");
        userInput = new Scanner(System.in);
        teineNimetaja = userInput.nextInt();
        System.out.println("Teiseks murruks on " + teineLugeja +"/"+ teineNimetaja);
        int j22k3;
        int t2isarv3;
        if (teineLugeja > teineNimetaja){
            j22k3 = teineLugeja % teineNimetaja;
            t2isarv3 = (teineLugeja - j22k3) / teineNimetaja;
            if(j22k3 == 0){
                System.out.println("Jääk 0, täisarv " + t2isarv3);
            } else {
                System.out.println("Teine murd segaarvuks: " + t2isarv3 + " " + j22k3 +"/"+ teineNimetaja);
            }
        }
        //kahe küsitud murru liitmine
        int uusLugeja;
        int uusNimetaja;
        if(nimetaja == teineNimetaja){
            uusLugeja = lugeja + teineLugeja;
            uusNimetaja = nimetaja;
        } else if(nimetaja % teineNimetaja == 0 || teineNimetaja % nimetaja == 0){
            if(nimetaja > teineNimetaja){
                uusNimetaja = nimetaja;
            } else {
                uusNimetaja = teineNimetaja;
            }
            uusLugeja = (lugeja * (uusNimetaja / nimetaja)) + (teineLugeja *(uusNimetaja / teineNimetaja));
        } else {
            uusNimetaja = nimetaja * teineNimetaja;
            uusLugeja = (lugeja * (uusNimetaja / nimetaja)) + (teineLugeja *(uusNimetaja / teineNimetaja));
        }
        if(uusLugeja == uusNimetaja){
            System.out.println("Liidetud murd on " + uusLugeja +"/"+ uusNimetaja + ", taanduvad 1");
        } else {
            System.out.println("Liidetud murd on " + uusLugeja +"/"+ uusNimetaja);
        }
        //murrud liidetud
        //teen tulemuse segaarvuks
        int j22k2;
        int t2isarv2;
        if (uusLugeja > uusNimetaja){
            j22k2 = uusLugeja % uusNimetaja;
            t2isarv2 = (uusLugeja - j22k2) / uusNimetaja;
            if(j22k2 == 0){
                System.out.println("Jääk 0, täisarv " + t2isarv2);
            } else {
                System.out.println("Tulemus segaarvuks: " + t2isarv2 + " " + j22k2 +"/"+ uusNimetaja);
                //taandan
                for(int i=2; i<uusNimetaja; i++){
                    if(j22k2 % i == 0 && uusNimetaja % i == 0){
                        int taandL = j22k2 / i;
                        int taandN = uusNimetaja / i;
                        System.out.println("Taandatud segaarv: " + t2isarv2 + " " + taandL +"/"+ taandN);
                        //kordab kuni saab taandada
                    }
                }
            }
        }
        //segaarv korras, taandamine korras
    }
}