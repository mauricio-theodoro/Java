import java.sql.SQLOutput;

public class enumTwo {
    enum Flavor{
        CHOCOLATE, VANILLA, STRAWBERRY; // PODE SE FAZER UM METODO DENTRO DO ENUM
        public static void getVanilla(){
            System.out.println(Flavor.VANILLA);
        }
    }

    public static void main(String[] args) {
        Flavor flavor = Flavor.VANILLA;
        flavor.getVanilla();

        if (flavor == Flavor.VANILLA){
            System.out.println("It's Vanilla!");
        }else if(flavor == Flavor.CHOCOLATE){
            System.out.println("It's CHOCOLATE");
        }else
            System.out.println("It's STRAWBERRY");
    }
}
