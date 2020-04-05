public class Arraytest {

    public static void arrayget() {
        int[] arrow = new int[10];
        int comt =0;
        for (int i = 0; i < arrow.length; i++) {
            arrow[i] += comt +1;
            comt=arrow[i];

    if (arrow[i]%2==0){
            System.out.println(arrow[i]);}
        }
    }

    public static void main(String[] args) {
        arrayget();
    }
}
