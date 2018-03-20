package com.pellegrinoprincipe;

/*
 Primo programma in Java
 */
public class PrimoProgramma
{
    private static int counter = 0;

    public static void main(String[] args)
    {
        String testo = "Primo programma in Java:",
                testo2 = " Buon divertimento!";

        int a = 10, b = 20;

        // stampa qualcosa...
        System.out.println(testo + testo2);

        String s = "Stampero' un test condizionale: " + "tra a=" + a + " e b=" + b;

        System.out.println(s);

        if (a < b)
        {
            System.out.println("a<b");
        }
        else
        {
            System.out.println("a>b");
        }

        s = "Stampero' un ciclo iterativo, " + "dove leggero' per 10 volte il valore di a";

        System.out.println(s);

        for (int i = 0; i < 10; i++)
        {
            System.out.print("Passo " + i);
            System.out.println("--> " + "a=" + a);
        }
    }
}
