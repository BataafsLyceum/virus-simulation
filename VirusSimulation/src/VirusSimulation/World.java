/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package VirusSimulation;

/**
 *
 * @author 010918
 */
public class World {

    /**
     * @param args the command line arguments
     */
    static VirusSimulation.Person People[] = new VirusSimulation.Person[10000];
    static char State[] = new char[10000];

    public static void main(String[] args) {
         for (int number4 = 0; number4 < 1; number4++){
        // TODO code application logic here
        Virus Virus1 = new Virus();
        startVirusSimulation();
        countInfected2(0);
        for (int number = 1; number <= 10; number++) {
            haveANewDay(Virus1);
            countInfected2(number);
        }
    }
    }

    public static void startVirusSimulation() {

        for (int number = 0; number < 10000; number++) {
            People[number] = new VirusSimulation.Person(number);
        }

        int Number2 = (int) (10000 * Math.random());
        VirusSimulation.World.People[Number2].State = 'i';
        for (int number = 0; number < 0; number++) {
        int Number3 = (int) (10000 * Math.random());
        if(VirusSimulation.World.People[Number3].State != 'i' && VirusSimulation.World.People[Number3].State !='r' ){
            VirusSimulation.World.People[Number3].State = 'r';}
        
        
        
    }
    }
    

    public static void haveANewDay(Virus Virus1) {

        for (int number = 0; number < 10000; number++) {
            People[number].Infected = false;
        }
        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 'i') {
                Virus1.infectSomeone(50);
            }
        }
        
        for (int number = 0; number < 10000; number++) {
            if (People[number].Infected == true){
            People[number].State = 'i';
            }
        }
        
        for (int number = 0; number < 10000; number++) {
            People[number].Infected = false;
        }

        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 'i') {
                Virus1.becomeResistent(number);
            }
        }
    }

    public static void countInfected(int day) {
        int[] Count = new int[3];
        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 's') {
                Count[0]++;
            }
            if (People[number].State == 'i') {
                Count[1]++;
            }
            if (People[number].State == 'r') {
                Count[2]++;
            }
        }
        System.out.println(day);
        System.out.println("s  " + Count[0]);
        System.out.println("i  " + Count[1]);
        System.out.println("r  " + Count[2]);
    }

    public static void countInfected2(int day) {
        int[] Count = new int[3];
        for (int number = 0; number < 10000; number++) {
            if (People[number].State == 's') {
                Count[0]++;
            }
            if (People[number].State == 'i') {
                Count[1]++;
            }
            if (People[number].State == 'r') {
                Count[2]++;
            }
        }
        System.out.print(day + ",");
        System.out.print(Count[0] + ","); //s
        System.out.print(Count[1] + ","); //i
        System.out.print(Count[2] + ",");   // r
        System.out.println();
    }
}