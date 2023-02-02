package com.company;

public class Main {

    public static void main(String[] args) {
	    HashTable hashTable = new HashTable(5);
        hashTable.insert("B01","Harry Potter","Rowling",652,2095690);
        hashTable.insert("B02","The Lost Continent","Bryson",299,45712);
        hashTable.insert("B03","Notes from a Small Island","Bryson",324,80609);
        hashTable.insert("B04","The Lord of the Rings","Tolkien",1184,1710);
        hashTable.insert("B05","The Changeling Sea","Patricia",137,4454);
        hashTable.insert("B06","Heirs of General Practice","McPhee",128,268);
        hashTable.insert("B07","Salmon of Doubt","Douglas",336,5);
        hashTable.insert("B08","For the New Intellectual","Rand",224,2750);
        hashTable.insert("B09","City of Glass","Auster",203,12410);
        hashTable.insert("B10","A War Like No Other","Davis",397,1693);
        hashTable.display();
        hashTable.retrive("The Lord of the Rings");
        hashTable.delete("B08");
        hashTable.display();
    }
}
