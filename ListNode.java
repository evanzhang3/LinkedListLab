
public class ListNode <E>
{
  private E value;
  private ListNode<E> next;
 
  
  //ListNode constructor
  public ListNode (E initValue, ListNode<E> initNext)
  {
    value = initValue;
    next = initNext;
  } 
  
  
  public E getValue ()
  {
    return value;
  } 
  
  
  public ListNode<E> getNext ()
  {
    return next;
  } 
  
  
  public void setValue (E theNewValue)
  {
    value = theNewValue;
  } 
  
  
  public void setNext (ListNode<E> theNewNext)
  {
    next = theNewNext;
  } 
} // ListNode class
