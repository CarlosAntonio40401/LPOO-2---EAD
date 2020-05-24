
package Lista_Lista;

public class Lista<E> {
    
   int size;
   Node first;
   Node last;
   

    public Lista(int size, Node first) {
        this.size = size;
        this.first = first;
    }

    public Lista() {
    }
    
    
   
    
    public int size(){
        return size;
    }
   
    public boolean empty(){
        
        return size==0;
    }
    
    public Object getFirst(){
        return first.valor;
    }
    
    public void pertence(Object e){
        Node cursor=first;
        for(int i=0; i< size; i++){
            if(cursor.getValor().equals(e)){
                System.out.println("O valor:"+ cursor.getValor()+"pertence a lista");
                break;
            }
            cursor=cursor.getNext();
        }
    }
    
    public void addFirst(Object object){
      if(empty()){
          first= new Node(object, first);
          
          
      }else{
          Node novo= new Node(object,null);
          novo.setNext(first);
          first=novo;
      }
      size++;
    }
    
    public void addLast(Object object){
        Node cursor= first;
        for(int i=0; i<size-1; i++){
            cursor =cursor.getNext();
            
        }
        Node novo = new Node(object,null);
        cursor.setNext(novo);
        size++;
    }
    
    public void removerFirst(){
        first=first.getNext();
    }
    
    void print(){
        Node cursor=first;
        
        while(cursor!=null){
            System.out.println(cursor.valor);
            cursor=cursor.next;
            
        }
    }
    
    public void concatenarListas(Lista l1, Lista l2){
       l1.last.next = l2.first;
       l2.first.prev = l1.last;
       l2.last.next = l1.first;
       l1.first.prev = l2.last;
       l1.last = l2.last;
   }
}
