package me.dio;

public class Calculadora{

    public int somar (String str){
        int soma = 0;
        for(String s : str.split("\\+"))
            soma += Integer.valueOf(s);
        return soma;
    }

}