/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao4des6;

/**
 *
 * @author AliraMaria
 */
public class Questao4des6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
     // Escrever um algoritmo que leia uma quantidade desconhecida
     //de números e conte quantos deles estão nos seguintes 
     // intervalos: [0,25], [26,50], [51,75] e [76,100]. A entrada
     // de dados deve terminar quando for lido um número negativo.
     //
    public static void main(String[] args) {
        int num, cont025, cont2650, cont5175, cont76100;
        cont025=0;cont2650=0;cont5175=0;cont76100=0;//inicializado
        do{
            num = Integer.parseInt(JOptionPane.showInputDialog("Digite"
            + "\nUm número positivo ou a qualquer momento um "
            + "\nnúmero negativo para sair"));
            if(num>=0 && num<=25){
                cont025++;
            }else if(num>=26 && num<=50){
                cont2650++;
            }else if(num>=51 && num<=75){
                cont5175++;
            }else if(num>=76 && num<=100){
                cont76100++;
            }else if(num>100){
                JOptionPane.showMessageDialog(null, "Este valor não"
                        + " foi contabilizado!");
            }else{
                JOptionPane.showMessageDialog(null,"Bye bye");
            }
            
        }while(num>=0);
        JOptionPane.showMessageDialog(null,"   RESULTADOS \n"
                + "Intervalor  [ 0,25  ]:"+cont025
                + "\nIntervalor [26,50  ]:"+cont2650
                + "\nIntervalor [51,75  ]:"+cont5175
                + "\nIntervalor [76,100]:"+cont76100);
    }
    
}
