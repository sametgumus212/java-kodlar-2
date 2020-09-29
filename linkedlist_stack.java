/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist_stac;

public class Linkedlist_stac {

    public static void main(String[] args) {
       Node n=new Node(6);
       ListStack ls=new ListStack();
      // ls.push(n);
      for(int i =6;i>0;i--){
          Node nn=new Node(i);
          ls.push(nn);
      }
      ls.pop();
      ls.siralimi();
    ls.pop();
      ls.push(n);
        ls.siralimi();
      ls.pop();
       ls.pop();
       ls.siralimi();
        ls.pop();
       
    }
    
}
class Node{
    int icerik;
    Node ileri;
    public Node(int icerik){
        this.icerik=icerik;
        ileri=null;
       }
}
class ListStack{
    Node ust;
    public ListStack(){
    ust=null;
}
    boolean isempty(){
        return ust==null;
    }
    void push(Node yeni){
        if(isempty())
            ust=yeni;
        else{
            yeni.ileri=ust;
            ust=yeni;
        }
    }
    Node pop(){
        Node tmp=ust;
        if(!isempty()){
            System.out.println("pop edilen :"+ust.icerik);
            ust=ust.ileri;
        }
        return tmp;
    }
    boolean siralimi(){
        boolean sirali=true;
        Node tmp=ust;
        Node once=null;
        while(tmp.ileri!=null){
            once=tmp;
            tmp=tmp.ileri;
        if(once.icerik>tmp.icerik){
            sirali=false;
            System.out.println("sirali değil");
            break;
                            
        }
        System.out.println("siralı");
        }
        
        return sirali;
    }
    
}
