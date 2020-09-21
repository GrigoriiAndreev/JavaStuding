package task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String grandFatherName = reader.readLine();
        Cat grandFather = new Cat (grandFatherName, null, null);
        String grandMotherName = reader.readLine();
        Cat grandMother = new Cat (grandMotherName, null, null);
        
        String fatherName = reader.readLine();
        Cat father = new Cat (fatherName, grandFather);
        String motherName = reader.readLine();
        Cat mother = new Cat (grandMother, motherName);

        String sonName = reader.readLine();
        Cat son = new Cat (mother,  father , sonName );
        String doughterName = reader.readLine();
        Cat doughter = new Cat ( mother,  father , doughterName);
        
        System.out.println("The cat's name is " + grandFather.name + ", no mother, no father");
        System.out.println("The cat's name is " + grandMother.name + ", no mother, no father");
        System.out.println("The cat's name is " + father.name + ", no mother, father is " + grandFather.name);
        System.out.println("The cat's name is " + mother.name + ", mother is " + grandMother.name + ", no father");
        System.out.println("The cat's name is " + son.name + ", mother is " + mother.name + ", father is " + father.name);
        System.out.println("The cat's name is " + doughter.name + ", mother is " + mother.name + ", father is " + father.name);
        
        //System.out.println(catMother);
        //System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat father;
        private Cat mother;

        Cat(String name) {
            this.name = name;
        }
        
        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.father = null;
            this.mother = null;
         }
        
        Cat(String name, Cat father) {
            this.name = name;
            this.father = father;
            this.mother = null;
        }
        
        Cat(Cat mother, String name) {
            this.name = name;
            this.father = null;
            this.mother = mother;
        }
        
        Cat (Cat mother, Cat father, String name){
        	this.name = name;
        	this.mother = mother;
        	this.father = father;
        }

  //      @Override
  //      public String toString() {
  //          if (father == null && mother == null)
   //         	System.out.println("The cat's name is дедушка " + grandFather.name + ", no mother, no father");
   //         else
   //             return "The cat's name is " + name + ", mother is " + parent.name;
    //    }
    }

}
