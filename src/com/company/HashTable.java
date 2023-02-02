package com.company;

public class HashTable {
    int size;
    Node[] array ;
    public HashTable(int size) {
        this.size = size;
        array = new Node[size];
        for (int i=0 ; i<size ; i++){
            array[i] = new Node();
        }

    }

    public int getHashCode(String author) {
        int key = 0;
        for (char c : author.toCharArray()) {
            key += c;
        }
        return key % size;
    }

    public void insert(String bookId , String bookName , String author , int numOfPages , int ratingsCount) {
        int index = getHashCode(author);
        HashTable hashTable = new HashTable(size);
        Node temp = new Node(bookId,bookName,author,numOfPages,ratingsCount);
        for (int i = 0; i < size; i++) {
            if (index == i) {
                if (array[index].bookName == null) {
                    array[index] = temp;
                    temp.next=null;
                }else {
                    Node temp1 = array[index] ;
                    while (true){
                        if (temp1.next == null){
                            temp1.next=temp ;
                            temp.next=null;
                            break;
                        }
                        temp1 = temp1.next;
                    }
                }
            }

        }

    }

    public void display(){
        for (int i=0 ; i<size ; i++){
            Node temp = array[i];
            if(array[i].bookId == null){

            }else{
                while (temp.next != null){
                    System.out.print(temp.bookId+"    ");
                    temp= temp.next;
                }System.out.println(temp.bookId);
            }
        }
        System.out.println();
        System.out.println();
    }
    public void delete(String bookId){
        for (int i=0 ; i<size ; i++){
            Node temp = array[i];
            if(temp.bookId == null){ //1. array element empty

            }else if(array[i].bookId==bookId && array[i].next == null ) { //2. array has only one node and delete it
                array[i].bookId = null ;
                break;
            }else if(array[i].bookId == bookId && array[i].next != null){ //3. array element has two oe more node and delete its first node
                array[i] = array[i].next ;
            }
            else{
                while (temp.next != null){
                    if (temp.next.bookId == bookId){
                        if(temp.next == null){ //4. delete last node in array element
                            temp.bookId = null;
                        }
                        else {
                            temp.next = temp.next.next ; //5. delete intermediate node
                        }
                        break;
                    }temp=temp.next;
                }
            }
        }
    }

    public void retrive(String bookName){
        for (int i=0 ; i<size ; i++){
            Node temp = array[i];
            if(temp.bookName == null){
                temp= temp.next;
            }else if(array[i].bookName==bookName){
                System.out.println("Book ID         : "+array[i].bookId);
                System.out.println("Book Name       : "+array[i].bookName);
                System.out.println("Author          : "+array[i].author);
                System.out.println("Number Of Pages : "+array[i].numOfPages);
                System.out.println("Rating Counts   : "+array[i].ratingCount);
                System.out.println();
                System.out.println();
                temp=temp.next;

            }
            else{
                while (temp.next != null){
                    if (temp.next.bookName == bookName){
                        if(temp.next == null){
                            System.out.println("Book ID         : "+temp.next.bookId);
                            System.out.println("Book Name       : "+temp.next.bookName);
                            System.out.println("Author          : "+temp.next.author);
                            System.out.println("Number Of Pages : "+temp.next.numOfPages);
                            System.out.println("Rating Counts   : "+temp.next.ratingCount);
                            System.out.println();
                            System.out.println();
                        }else {
                            System.out.println("Book ID         : "+temp.next.bookId);
                            System.out.println("Book Name       : "+temp.next.bookName);
                            System.out.println("Author          : "+temp.next.author);
                            System.out.println("Number Of Pages : "+temp.next.numOfPages);
                            System.out.println("Rating Counts   : "+temp.next.ratingCount);
                            System.out.println();
                            System.out.println();
                        }
                        break;
                    }temp=temp.next;

                }
            }
        }
    }
}



