
public class DoubleListNode<E>
{
  private E value;
  private DoubleListNode<E> next, previous;
  
  public DoubleListNode (E initValue, DoubleListNode<E> initPrev,
                         DoubleListNode<E> initNext)
  {
    value = initValue;
    previous = initPrev;
    next = initNext;
  } // DoubleListNode constructor
  
  
  public E getValue ()
  {
    return value;
  } // getValue method
  
  
  public DoubleListNode<E> getNext ()
  {
    return next;
  } // getNext method
  
  
  public DoubleListNode<E> getPrevious ()
  {
    return previous;
  } // getPrevious method
  
  
  public void setValue (E theNewValue)
  {
    value = theNewValue;
  } // setValue method
  
  
  public void setNext (DoubleListNode<E> theNewNext)
  {
    next = theNewNext;
  } // setNext method
  
  
  public void setPrevious (DoubleListNode<E> theNewPrevious)
  {
    previous = theNewPrevious;
  } // setNext method
} // DoubleListNode class
