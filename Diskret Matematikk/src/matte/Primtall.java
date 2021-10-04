package matte;

public class Primtall {
    public static boolean[] finnPrimtallene(int grense){
        boolean[]primtall = new boolean[grense + 1];
        for(int i = 2; i < primtall.length; i++)
            primtall[i] = true;

        // Eratonstenes sil:
        for (int i = 2; i <= Math.sqrt(primtall.length); i++){
            if(primtall[i]){
                for(int j = i*i;j < primtall.length;j += i)
                    primtall[j] = false;
            }
        }

        return primtall;
    }
}
