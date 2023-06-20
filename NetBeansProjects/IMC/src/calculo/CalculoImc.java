/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculo;

/**
 *
 * @author gabrielbezerra
 */
public class CalculoImc {
        private final double altura;
        private final double peso;
        
        public CalculoImc(double altura, double peso){
            this.altura = altura;
            this.peso = peso;
        }
        
        public double calculo(){
            double resultado = this.peso/(this.altura*this.altura);
            System.out.println(resultado);
            return resultado;
        }
}
