/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Guille
 */
public class CalculadoraController implements Initializable {

    @FXML
    //variable asignada al bloque de texto usado como pantalla
    private Text mostrar_pantalla;
    //operand1 y operand2 las dos variables usadas para hacer las operaciones
    private double operand1;
    private double operand2;
    //variable usada para almacenar de forma temporal los datos introducidos
    private double num;
    //variable que contiene el tipo de operación a realizar
    private String oper;
    //variable que habilita la escritura de decimales
    private boolean decimal;
    //variable que es usada para añadir decimales a un número
    private double contador_decimal = 0.1;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    /**
     * Al pulsar C:
     * 
     * ->Borra el contenido de num, oper y  mostrar_pantalla
     * ->Reinicia los valores de decimal(false) y contador_decimal(0.1)
     */
    @FXML
    private void pulsa_C(ActionEvent event) {
        num = 0;
        oper = "";
        mostrar_pantalla.setText("");
        decimal = false;
        contador_decimal=0.1;
    }
    /**
     * Al pulsar simb:
     * 
     * ->Se cambia num a -num
     * ->Se mustra por pantalla el nuevo valor de num
     * 
     */
    @FXML
    private void pulsa_simb(ActionEvent event) {
        num = num * -1;
        mostrar_pantalla.setText(""+ num);
    }
    /**
     * Al pulsar mod:
     * 
     * ->Se asigna a la variable oper "mod"
     * ->Muestra por pantalla el símbolo de la operación y el numero
     * ->Guarda en operand1 el valor de num
     * ->Borra el contenido de num
     * ->Reinicia los valores de decimal y contador_decimal
     * 
     */
    @FXML
    private void pulsa_mod(ActionEvent event) {
        oper = "mod";
        mostrar_pantalla.setText("% " + num);
        operand1 = num;
        num = 0;
        contador_decimal=0.1;
        decimal=false;
    }
    /**
     * Al pulsar div:
     * 
     * ->Se asigna a la variable oper "div"
     * ->Muestra por pantalla el símbolo de la operación y el numero
     * ->Guarda en operand1 el valor de num
     * ->Borra el contenido de num
     * ->Reinicia los valores de decimal y contador_decimal
     * 
     */
    @FXML
    private void pulsa_div(ActionEvent event) {
        oper = "div";
        mostrar_pantalla.setText("/ " + num);
        operand1 = num;
        num = 0;
        contador_decimal=0.1;
        decimal=false;
    }
    /**
     * Al pulsar suma:
     * 
     * ->Se asigna a la variable oper "suma"
     * ->Muestra por pantalla el símbolo de la operación y el numero
     * ->Guarda en operand1 el valor de num
     * ->Borra el contenido de num
     * ->Reinicia los valores de decimal y contador_decimal
     * 
     */
    @FXML
    private void pulsa_suma(ActionEvent event) {
        oper = "suma";
        mostrar_pantalla.setText("+ " + num);
        operand1 = num;
        num = 0;
        contador_decimal=0.1;
        decimal=false;
    }
    /**
     * Al pulsar div se habilita la escritura decimal.
     */
    @FXML
    private void pulsa_decimal(ActionEvent event) {
        decimal = true;
    }
    /**
     * Al pulsar mult:
     * 
     * ->Se asigna a la variable oper "mult"
     * ->Muestra por pantalla el símbolo de la operación y el numero
     * ->Guarda en operand1 el valor de num
     * ->Borra el contenido de num
     * ->Reinicia los valores de decimal y contador_decimal
     * 
     */
    @FXML
    private void pulsa_mult(ActionEvent event) {
        oper = "mult";
        mostrar_pantalla.setText("* " + num);
        operand1 = num;
        num = 0;
        contador_decimal=0.1;
        decimal=false;
    }
    /**
     * Al pulsar resta:
     * 
     * ->Se asigna a la variable oper "resta"
     * ->Muestra por pantalla el símbolo de la operación y el numero
     * ->Guarda en operand1 el valor de num
     * ->Borra el contenido de num
     * ->Reinicia los valores de decimal y contador_decimal
     * 
     */
    @FXML
    private void pulsa_resta(ActionEvent event) {
        oper = "resta";
        mostrar_pantalla.setText("- " + num);
        operand1 = num;
        num = 0;
        contador_decimal=0.1;
        decimal=false;
    }
    
    /**
     * Al pulsar (0...9):
     * 
     * [escritura decimal habilitada]
     *      ->Se le suma a num el valor de del numero introducido multiplicado
     *        por el valor de contador_decimal.
     *      ->Se multiplica el valor de contador_decimal * 0.1 para que el 
     *        siguiente valor decimal sea 10 unidades menor.
     *      ->Se muestra por pantalla el nuevo valor del número.
     * 
     * [escritura decimal inhabilitada]
     *      ->Se incrementa en 10 unidades el valor de num y se le suma el 
     *        número pulsado.
     *      ->Se muestra por pantalla el nuevo número
     * 
     */
    @FXML
    private void pulsa_1(ActionEvent event) {
        if(decimal){
            num = num + (1 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 1;
        mostrar_pantalla.setText(""+ num);
        }
    }

    @FXML
    private void pulsa_2(ActionEvent event) {
        if(decimal){
            num = num + (2 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 2;
        mostrar_pantalla.setText(""+ num);
        
        }
    }

    @FXML
    private void pulsa_3(ActionEvent event) {
        if(decimal){
            num = num + (3 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 3;
        mostrar_pantalla.setText(""+ num);
        }
    }
    
    @FXML
    private void pulsa_4(ActionEvent event) {
        if(decimal){
            num = num + (4 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 4;
        mostrar_pantalla.setText(""+ num);
        }
    }

    @FXML
    private void pulsa_5(ActionEvent event) {
        if(decimal){
            num = num + (5 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 5;
        mostrar_pantalla.setText(""+ num);
        }
    }

    @FXML
    private void pulsa_6(ActionEvent event) {
        if(decimal){
            num = num + (6 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 6;
        mostrar_pantalla.setText(""+ num);
        }
    }
    
    @FXML
    private void pulsa_7(ActionEvent event) {
        if(decimal){
            num = num + (7 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 7;
        mostrar_pantalla.setText(""+ num);
        }
    }
    
    @FXML
    private void pulsa_8(ActionEvent event) {
        if(decimal){
            num = num + (8 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 8;
        mostrar_pantalla.setText(""+ num);
        }
    }
    
    @FXML
    private void pulsa_9(ActionEvent event) {
        if(decimal){
            num = num + (9 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10) + 9;
        mostrar_pantalla.setText(""+ num);
        }
    }
    
    @FXML
    private void pulsa_0(ActionEvent event) {
        if(decimal){
            num = num + (0 * contador_decimal);
            contador_decimal = contador_decimal * 0.1;
            mostrar_pantalla.setText(""+ num);
        }
        else{
        num = (num*10);
        mostrar_pantalla.setText(""+ num);
        }
    }
    /**
     * Al pulsar result:
     * 
     * ->Se guarda el valor de num en operand2 (operand1 contiene el valor del
     *   primer numero introducido).
     * ->Se reinician contador_decimal y decimal.
     * ->Se aplica la operación indicada en la variable oper de esta forma:
     *   operand1 "oper" operand2.
     * ->Se guarda el resultado en num y se muestra por pantalla.
     * ->Se borra el valor de oper.
     *  
     */
    @FXML
    private void pulsa_result(ActionEvent event) {
        operand2 = num;
        contador_decimal=0.1;
        decimal=false;
        
        if(oper.equals("suma")){
            num=operand1+operand2;
            mostrar_pantalla.setText(""+ num);
            oper = "";
        } 
        if(oper.equals("mult")){
            num=operand1*operand2;
            mostrar_pantalla.setText(""+ num);
            oper = "";
        } 
        if(oper.equals("resta")){
            num=operand1-operand2;
            mostrar_pantalla.setText(""+ num);
            oper = "";
        }
        if(oper.equals("div")){
            num=operand1/operand2;
            mostrar_pantalla.setText(""+ num);
            oper = "";
        }
        if(oper.equals("mod")){
            num=operand1%operand2;
            mostrar_pantalla.setText(""+ num);
            oper = "";
        }
    }
    
}
