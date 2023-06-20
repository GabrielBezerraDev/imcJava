/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classificar;

/**
 *
 * @author gabrielbezerra
 */
public interface Classifica {
    default String classe(double imc){
        String categoria = null;
        if(imc < 18.5) categoria = String.format("Sua média é %.2f, você está abaixo do peso.", imc);
        else if(imc >= 18.6 && imc <= 24.9) categoria = String.format("Sua média é %.2f, você está com o peso ideal.",imc);
        else if(imc >= 25 && imc <= 29.9) categoria = String.format("Sua média é %.2f, você está levemente acima do peso.",imc);
        else if(imc >= 30 && imc <= 34.9) categoria = String.format("Sua média é %.2f, você está com obesidade grau I.",imc);
        else if(imc >= 35 && imc <= 39.9) categoria = String.format("Sua média é %.2f, você está com obesidade grau II.",imc);
        else if(imc >= 40) categoria = String.format("Sua média é %.2f, você está com obesidade III.", imc);
        return categoria;
    }
}
