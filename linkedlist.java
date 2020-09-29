/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author chs
 */
public class Linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        liste list = new liste();
        for (int i = 0; i < 5; i++) {
            Node nod = new Node(i);
            list.basaekle(nod);
        }

        list.gez();
        list.listebasisil();
        System.out.println("-------------------");
        list.gez();
        list.listesonusil();
        System.out.println("-------------------");
        list.gez();
        System.out.println("-------------------");
        Node nb = new Node(4);
        Node ns = new Node(0);
        Node na = new Node(1);
        Node nn = new Node(3);
        list.basaekle(nb);
        list.gez();

        System.out.println("-------------------");
        list.sonaekle(ns);
        list.gez();

        System.out.println("-------------------");

       // list.arayaekle(na, nn);
        System.out.println("-------------------");
        list.gez();
        list.listearasil(na);
        list.gez();
        
    }

}

class Node {

    int icerik;

    Node ileri;

    public Node(int icerik) {
        this.icerik = icerik;

        ileri = null;
    }

}

class liste {

    Node bas;
    Node son;

    public liste() {
        bas = null;
        son = null;

    }

    void basaekle(Node yeni) {
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            yeni.ileri = bas;
            bas = yeni;
        }
    }

    void sonaekle(Node yeni) {
        if (son == null) {
            bas = yeni;
            son = yeni;

        } else {
            son.ileri = yeni;
            son = yeni;
        }
    }

    void arayaekle(Node yeni, Node aranan) {
        Node tmp = null;
        if (bas == null) {
            bas = yeni;
            son = yeni;
        } else {
            tmp = bas;
            while ((tmp.icerik != aranan.icerik) ) {
                
                System.out.println("a :"+yeni.icerik+" "+aranan.icerik +" "+tmp.icerik);
                tmp = tmp.ileri;
            }
            if(tmp.ileri==null){
                    System.out.println("mevcut değil"); 
                }
            else{
                yeni.ileri = tmp.ileri;
            tmp.ileri = yeni;
            }
            
        }

    }

    Node ara(int deger) {
        Node tmp = bas;
        while (tmp.ileri != null) {
            if (tmp.icerik == deger) {
                return tmp;
            }
            tmp = tmp.ileri;
        }
        return null;

    }

    /////*****silme*****//////
    void listebasisil() {
        if (bas == null) {
            son = null;
        }
        Node tmp = bas.ileri;
        bas = tmp;

    }

    void listesonusil() {
        Node tmp, once;
        tmp = bas;
        once = null;
        while (tmp != son) {
            once = tmp;
            tmp = tmp.ileri;
        }
        if (once == null) {
            bas = null;
        } else {
            once.ileri = null;
            son = once;
        }

    }
    void listearasil(Node ara){
        Node tmp=bas;
        Node once=null;
        while(tmp.icerik!=ara.icerik){
            once=tmp;
            tmp=tmp.ileri;
        }
        if(tmp.ileri==null)
            System.out.println("bulunamadı");
        else{
            once.ileri=tmp.ileri;
            System.out.println("silindi "+ tmp.icerik);
            tmp=null;
            
            
        }
    }

    void gez() {
        Node tmp = bas;
        while (tmp != null) {
            System.out.print(tmp.icerik + "  ");
            tmp = tmp.ileri;

        }
    }
}
