package task07.task0724;

public class Solution {
    public static void main(String[] args) {
        // �������� ��� ��� ���
    	
    	Human grandFather1 = new Human("Mikle", true , 70);
    	Human grandFather2 = new Human("Nuke", true,  80);
    	Human grandMother1 = new Human("Helen", false , 70);
    	Human grandMother2 = new Human("Hilga", false , 75);
    	Human father = new Human("Tulle", true, 40, grandFather1, grandMother1);
    	Human mother = new Human("Nadya", false, 38, grandFather2, grandMother2);
    	Human kid1 = new Human("Sasha", true, 13, father, mother);
    	Human kid2 = new Human("Peter", true, 8,father, mother);    	
    	Human kid3 = new Human("Susan", false, 4, father, mother);
    	System.out.println(grandFather1);
    	System.out.println(grandFather2);
    	System.out.println(grandMother1);
    	System.out.println(grandMother2);
    	System.out.println(father);
    	System.out.println(mother);
    	System.out.println(kid1);
    	System.out.println(kid2);
    	System.out.println(kid3);

    }

    public static class Human {
        // �������� ��� ��� ���
    	String name;
    	int age;
    	boolean sex;
    	Human father;
    	Human mother;
    	
    	// ����������� ��� ���. � ���.

    	public Human (String name, boolean sex, int age ) {
    		this.name = name;
    		this.age = age;
    		this.sex = sex;
    		this.father = null;
    		this.mother = null;
    	}
    	
    	// ����������� ��� ���� � ���� 
    	public Human (String name, boolean sex, int age,  Human father, Human mother ) {
    		this.name = name;
    		this.age = age;
    		this.sex = sex;
    		this.father = father;
    		this.mother = mother;
    	}   	
    

    	// ����������� ��� �����

    	
        public String toString() {
            String text = "";
            text += "���: " + this.name;
            text += ", ���: " + (this.sex ? "�������" : "�������");
            text += ", �������: " + this.age;

            if (this.father != null) {
                text += ", ����: " + this.father.name;
            }

            if (this.mother != null) {
                text += ", ����: " + this.mother.name;
            }

            return text;
        }
    }

}

