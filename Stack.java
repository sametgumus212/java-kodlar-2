
package stack;

public class Stack {
    public static void main(String[] args) {
        yigit yig=new yigit(5);
        for(int i=1;i<7;i++){
            yig.push(i);
        }
        for(int j=yig.dizi.length;j>0;j--){
            yig.pop();
        }
        yig.pop();
        yig.pop();      
    }
    
}
class yigit{
 int [] dizi;
 int N, ust;
    public yigit(int N){
        this.N=N;
        dizi=new int[N];
        ust=-1;        
    }
    int top(){
        return dizi[ust];
    }
    boolean bosmu(){
        if(ust==-1)return true;
        else return false;
        
    }
    boolean dolumu(){
       // if(dizi[ust +1]%N==0 )return true;
       // else return false;
       return ust==N-1;
       
    }
    void push(int e){
        if(!dolumu()){
            ust=ust+1;
            dizi[ust]=e;
        }
        else System.out.println("yigit dolu ekleme olmaz");
    }
    int pop(){
        if(!bosmu()){
            ust--;
            return dizi[ust+1];
        }
        System.out.println("yigit boş ");
        return -1;
    }
}
