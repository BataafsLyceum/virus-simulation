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

    public int Age;
    public char State;
    public boolean Infected;
    public int Number;
    public char Gender;

    public Person(int input) {
        Age = (int) (100 * Math.random());
        char[] ManofWife = {'m', 'f'};
        Gender = ManofWife[(int) (2 * Math.random())];
        State = 's';
        Number = input;
        Infected = false;
    }
}
