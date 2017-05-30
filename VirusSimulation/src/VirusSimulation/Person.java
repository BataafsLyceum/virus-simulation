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
    public int[] Position = new int[2];

    public Person(int input) {
        Age = (int) (100 * Math.random());
        char[] ManofWife = {'m', 'f'};
        Gender = ManofWife[(int) (2 * Math.random())];
        State = 's';
        Number = input;
        Infected = false;
        Position[0] = (int) (1000 * Math.random());
        Position[1] = (int) (1000 * Math.random());
    }
}
