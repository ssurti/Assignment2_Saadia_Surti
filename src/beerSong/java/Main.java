package beerSong.java;

public class Main {

    public static void main(String[] args) {
	// write your code her
        Ninety_Nine_Bottles_of_Beer();
    }
    public static void Ninety_Nine_Bottles_of_Beer(){
        int i = 99;

        while (i > 0){
            System.out.print(i + " bottles on the wall ");
            System.out.println(i + " bottles of beer");
            System.out.print("take one down, pass it around,");
            i = i - 1;
            if (i > 0) {
                System.out.println(i + " bottles of beer on the wall");
            }
        }
        if (i == 0)
            System.out.print("no more bottles on the wall ");

    }
}
