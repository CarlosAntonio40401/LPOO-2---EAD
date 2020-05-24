package questao3;

import java.util.EmptyStackException;


public class LinkedIntList {

    private ListNode first;
    private int size;

    public LinkedIntList() {
        first = null;
        size = 0;
    }

    LinkedIntList(LinkedIntList l) {
        first = l.getFirst();
        size = l.size();
    }

    public ListNode getFirst() {
        return first;
    }

    public boolean empty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void print() {
        ListNode cursor = first;

        while (cursor != null) {
            System.out.println(cursor.nome+" "+ cursor.link);
            cursor = cursor.next;
        }

    }

    public void addFirst(String nome, String link) {
        first = new ListNode(nome,link, first);
        size++;
    }

    public void add(String nome, String link, int index) {
        if (index == 0) {
            first = new ListNode(nome,link, first);
        } else {
            ListNode cursor = first;

            for (int i = 0; i < index - 1; i++) {
                cursor = cursor.next;
            }

            cursor.next = new ListNode(nome,link, first);
        }
        size++;
    }

    public void removeFirst() {
        first = first.next;
        size--;
    }

    public void remove(int index) throws EmptyStackException {
        if (empty()) {
            throw new EmptyStackException();
        }
        
        if(index == 0){
            first = first.next;
        }else{
            ListNode cursor = first;
            
            for(int i=0; i<index-1; i++){
                cursor = cursor.next;
            }
            cursor.next= cursor.next.next;
        }
        size--;
    }
    
    public String get(int index){
        ListNode cursor = first;
        for(int i = 0; i< index;i++){
            cursor = cursor.next;
        }
        return cursor.nome;
    }
    
    public void concList(LinkedIntList l){
        ListNode cursor = first;
        for(int i =0; i<size-1;i++){
            cursor =  cursor.next;
        }
        cursor.next = l.getFirst();
        size += l.size();
    }
    
    public void getNomeFist(String nome){
        ListNode cursor = first;          
                
        for(int i=0; i<size;i++){
            
            if(nome.equals(cursor.nome)){
                               
                addFirst(cursor.nome, cursor.link);
                cursor.next = cursor.next.next;
                
                
            }else
            cursor = cursor.next;
        }
    }
    
    
    
    

}