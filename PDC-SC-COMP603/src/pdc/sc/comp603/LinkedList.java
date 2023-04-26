package pdc.sc.comp603;

public class LinkedList <E extends Comparable>{
    
    public Node head;
    public int size;
    
    public void addHead(E data)
    {
        Node<E> newNode = new Node<E>();
        newNode.next = head;
        head = newNode;
        head.data = data;
        size++;
        
    }
    
    public Node getHead()
    {
        return head;
    }
    
    public void add(E data)
    {
        if(head != null){
        Node<E> currentNode = head;
        for(int i = 0; i < size-1;i++){
            currentNode = currentNode.next;
        }
        Node<E> newNode = new Node<E>();
        currentNode.next = newNode;
        currentNode.next.data = data;
        newNode.prev = currentNode;
        size++;
        }else{
            addHead(data);
        }
        
    }
    
   
    public boolean contains(Node node)
    {
        Node currentNode = head;
        for(int i = 0; i < size; i++){
            if(currentNode.data == node.data){
                return true;
            }else{
                currentNode = currentNode.next;
            }
        }
        return false;
    }
    
    private boolean contains(Node head, Node node)
    {
        Node currentNode = head;
        for(int i = 0; i < size; i++){
            if(currentNode == node){
                return true;
            }else{
                currentNode = currentNode.next;
            }
        }
        return false;
    }
    
    
    public void remove(Node node)
    {
        if(head == null){
            
        }else{
            if (head.data.equals(node)){
                head = head.next;
                size--;
            }else{
                Node<E> currentNode = head;
                while(currentNode.next != null){
                    if(currentNode.next.data.equals(node.data)){
                        currentNode.next = currentNode.next.next;
                        size--;
                        break;
                    }else{
                        currentNode = currentNode.next;
                    }
                }
            }
        }
        
    }
    
    public void remove(int position)
    {
      Node<E> currentNode = head;
      if(size >= position){
          for(int i = 0; i < position; i++)
          {
              currentNode = currentNode.next;
          }
          currentNode.next = currentNode.next.next;
          
      }
      size--;
    }

    
    public Node removeFromHead()
    {
        head = head.next;
        size--;
        return head;
    }
    
    public Node removeFromTail()
    {
        Node<E> currentNode = head;
        for(int i = 0; i < size-2; i++)
        {
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        size--;
        return head;
    }
    
    private Node removeFromTail(Node node)
    {
        Node<E> currentNode = head;
        for(int i = 0; i < size-1; i++)
        {
            currentNode = currentNode.next;
        }
        if(currentNode.next == node)
        {
            currentNode.next = null;
        }
        return head;
    }

    
    public Node getNode(int index)
    {
        if(size >= index)
        {
            Node<E> currentNode = head;
            for(int i = 0; i < index; i++){
                currentNode = currentNode.next;
            }
            return currentNode;
        }else{
            return null;
        }
        
        
    }
    
    private Node getNode(int index, Node head)
    {
        if(size >= index)
            {
                Node<E> currentNode = head;
                for(int i = 0; i < index; i++){
                    currentNode = currentNode.next;
                }
                return currentNode;
            }else{
                return null;
            }

    }
    
    public E getData(int index)
    {
        if(size >= index)
            {
                Node<E> currentNode = head;
                for(int i = 0; i < index; i++){
                    currentNode = currentNode.next;
                }
                return currentNode.data;
            }else{
                return null;
            }
    }
    
    private E getData(int index, Node head)
    {
        if(size >= index)
            {
                Node<E> currentNode = head;
                for(int i = 0; i < index; i++){
                    currentNode = currentNode.next;
                }
                return currentNode.data;
            }else{
                return null;
            }
    }    
}
