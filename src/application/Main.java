package application;


import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        ApiGet cs = new ApiGet("https://www.random.org/integers/?num=1&min=1&max=10000&col=1&base=10&format=plain&rnd=new/");
        //usei essa api que gera numeros aleatorios para tornar mais dinamico
        cs.requestGet();
    }

}
