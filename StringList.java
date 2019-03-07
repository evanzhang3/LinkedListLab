
public interface StringList
{
   void add(int index, String newItem);  // adds newItem at spot index
                    	// only if index <= the length of the list
   String get(int index); // return null if the index does not exist
   void remove(int index);  // do nothing if the index does not exist
   int size( );  // the number of String items in the list
   String toString( );
 }
