/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.digitaloneinnovation;
/**
 *
 * @author erikr
 */

/*
Desafio
Você receberá dois valores inteiros. Faça a leitura e em seguida calcule o produto entre estes dois valores. 
Atribua esta operação à variável PROD, mostrando esta de acordo com a mensagem de saída esperada.   

Entrada
A entrada contém 2 valores inteiros.

Saída
Exiba a variável PROD conforme exemplo abaixo, tendo obrigatoriamente 
um espaço em branco antes e depois da igualdade.
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class MinhaPrimeiraClasse {

  public static void main(String[] args) throws IOException {
    
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    
    int a = Integer.parseInt(st.nextToken());
    st = new StringTokenizer(br.readLine());
    int b = Integer.parseInt(st.nextToken());
    int total = a * b;  

   System.out.println("PROD = " + total);
 }
}