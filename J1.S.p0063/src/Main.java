    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */
public class Main{
    public static void main(String[] args) {
        //Execute ex = new Execute();
        int n = Execute.checkInputNumberStudent();
        Person[] persons = new Person[n];
        for(int i = 0; i < persons.length; i++){
            persons[i] = Execute.inputPersonInfo();
        }
        Person[] list = Execute.sort(persons);        
        for(int i = 0; i < list.length; i++){
            list[i].displayPersonInfo();
        }
    }
}
