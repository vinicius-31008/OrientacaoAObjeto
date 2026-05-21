package exemplos;

public class ExemploSobrecarga {
    public static void main(String[] args){
        System.out.println(area(2));
        System.out.println(area(2,4));
        System.out.println(area(2,4,6));
    }

    public static  double area(double l1){
        return (l1 * l1);
    }

    public static  double area(double l1, double l2){
        return (l1 * l2);
    }

    public static  double area(double l1, double l2, double l3){
        return (l1 * l2 * l3);
    }
}
