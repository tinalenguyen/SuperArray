public class SuperArray {

  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public SuperArray(int initialCapacity){
//create the SuperArray with the provided startnig initialCapacity
    if (initialCapacity < 0){
      throw new IllegalArgumentException("Value " + initialCapacity + " cannot be negative for initial capacity");
    }
    data = new String[initialCapacity];
    size = 0;

  }

  public int size() {
//returns the number of elements in this list

    return size;

  }

  public boolean add(String element){
//appends the specified element to the end of this list
//modified (when capacity is full, resize before adding
    if (size == data.length) resize();
    data[size] = element;
    size++;
    return true;

  }

  public String get(int index){
//returns the elemt at the specified position in this list
    if (index >= size() || index < 0){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    return data[index];

  }

  public String set(int index, String element){
//replaces the element at the specified position in this list with the specified element, return the value you replaced
  if (index >= size() || index < 0){
  throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
  }

    String before = "";
    before = data[index];
    data[index] = element;
    return before;

  }

  private void resize(){
//increase the capacity: create a larger array, copy values from the original array to new one, assign new one to instance variable
    String[] newArray = new String[2 * size];
      for (int i = 0; i < data.length; i++){
          newArray[i] = data[i];
          }
          data = newArray;

  }


  public void clear(){
//reset SuperArray to be size 0
    data = new String[10];
    size = 0;

  }
  public boolean isEmpty(){
//returns true if this list contains no elements

    if (size == 0) return true;
    else return false;

  }

  public String toString() {
//displays elements that were added, not the empty spots

    if (size == 0){
      return "[]";
    }

    String finalString = "[";

    for (int i = 0; i < size -1; i++){
      finalString += data[i] + ", ";
    }

    finalString += data[size-1] + "]";
    return finalString;
  }

  public boolean contains(String s){
//returns true if this list contains the specified element

    for (int i = 0; i < size ; i++){
      if (data[i].equals(s)) {
        return true;
      }}
      return false;

  }

  public void add(int index, String element){
//inserts specified element at the specified position in this list
//shift element currently at position and subsequent elements to the right
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
    }
    if (size >= data.length) resize();
    for (int i = size; i >= index ; i--){
      if (i == index) {
        data[index] = element;
        size++;
      }
      else data[i] = data[i-1];
    }

  }

  public String remove(int index){
//removes element at specified position in list
//shifts element currently at position and subsequent elements to the left
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " +index + " is out of bounds");
    }

    String original = data[index];
    for (int i = index ; i < size -1; i++){
      data[i] = data[i+1];

    }
    size--;
    return original;
  }

  public int indexOf(String s){
//returns index of first occurence of specified elements
//returns -1 if list doesn't contain specified element

    for (int i = 0; i< size ; i++){
      if (data[i].equals(s)) return i;

    }
    return -1;
  }

  public String[] toArray(){
//returns an array containing all of elements in this list in proper sequence
//this method must allocate a new toArray

    String[] allElements = new String[size];

    for (int i = 0; i < size; i++){
        allElements[i] = data[i];

    }
    return allElements;
  }

  public static void removeDuplicates(SuperArray s){
//all elements with the same value but higher index will be removed
//keep first occurence of each value

    for (int i = 0; i < s.size();){
      if (s.indexOf(s.get(i)) != i){
        s.remove(i);
      }
      else i++;
    }
  }



  public int lastIndexOf(String value){
//returns last occurence of specified value
//returns -1 if value doesn't exist in the array

  for (int i = (size - 1); i >= 0  ; i--) {
  if (data[i].equals(value)) return i;

}
return -1;

  }

  public boolean equals(SuperArray other){
//superarrays are equal when all corresponding elements are equal

    if (size == other.size){
      for (int i = 0; i < size; i++){
        if (!(data[i].equals(other.data[i]))) {
          return false;
      }}
      return true;
    }
    return false;
  }





}
