package pdc.sc.comp603;
public class Node <E extends Comparable> {
    public E data;
    public Node<E> next; 
    public Node<E> prev;
    public Node()
    {
        this.data = null;
        next = null;
        prev = null;
    }public Node(E data)
    {
        this.data = data;
        next = null;
        prev = null;
    }
        
    public boolean equals(Node node)
    {
        if(node.data == this.data){
            return true;
        }else{
            return false;
        }
    }
    
    public int compareTo(Node node)
    {
        if(equals(node)){
            return 0;
        }
        else{
            return 1;
        }
        
    }
}
