public class Fatorial {

    public int fatorial( int numero) {
        int fat = 1;
        for( int i = 1; i <= numero; i++ ) {
            fat = fat * i;
        }

        return fat;

    }



}
