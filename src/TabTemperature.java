import java.util.ArrayList;
import java.util.List;

public class TabTemperature {





    public static void main(String[] args) {
        int min= Integer.MAX_VALUE;//la valeur minimum étant intializer à un maximum
        List<Integer> number = new ArrayList<Integer>();//list entier
        number.add(10);
        number.add(5);
        number.add(-4);
        number.add(7);


        for (int i = 0; i <number.size() ; i++) {//boucle pour aller au maximum de la taille de la liste
            if(min>number.get(i)){//si la valeur min est superieur à la ref du tableau
                min=number.get(i);//la ref devient la valeur min
            }
// a voir avec les valeur négative/
        }

        System.out.println(min);
    }
}
