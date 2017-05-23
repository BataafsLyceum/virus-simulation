/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusSimulation;

/**
 *
 * @author 010918
 */
public class Person {
     public Person(int input){
    int age = (int) (100*Math.random());
    System.out.println(age);
    char[] ManofVrouw = {'m', 'v'};
    char Geslacht = ManofVrouw[(int) (2*Math.random())];
    char Status = 's';
    int Number = input;
     }
}
