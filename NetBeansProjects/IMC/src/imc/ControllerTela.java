/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package imc;

import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import calculo.CalculoImc;
import classificar.Classifica;
import javafx.scene.control.Label;
/**
 *
 * @author gabrielbezerra
 */
public class ControllerTela implements Classifica{
        public Pane telaPrincipal = (Pane) IMC.root;
        
        public void manipularTela(){
            System.out.println(IMC.root);
            System.out.println("FAZ O L");
            Pane calculo = (Pane) telaPrincipal.getChildren().get(1);
            TextField fieldAltura = (TextField) calculo.getChildren().get(3);
            TextField fieldPeso = (TextField) calculo.getChildren().get(1);
            double altura = Integer.parseInt(fieldAltura.getText());
            double peso = Integer.parseInt(fieldPeso.getText());
            CalculoImc calcular = new CalculoImc(altura, peso);
            double resultado = calcular.calculo();
            String categoria = classe(resultado);
            Label mostrar = (Label) calculo.getChildren().get(6);
            mostrar.setText(categoria);
        }
}
