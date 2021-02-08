public class kodune1{
    //funktsioon arvutab hinna koos käibemaksuga, sisestatakse käibemaksuta hind
    public static double käibemaks(double h){
            double d = h*1.2;
            double roundDbl = Math.round(d*100.0)/100.0;
            return roundDbl;
        }

public static void main(String[] arg){
    System.out.println(käibemaks((Double.parseDouble(arg[0]))));
}
}