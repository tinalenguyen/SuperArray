public class SuperArray {

  private String [] data;
  private int size; //The current size

  public SuperArray() {
    data = new String[10];
    size = 0;
  }

  public int size() {
//returns the number of elements in this list

    return size;

  }

  public boolean add(String element){
//appends the specified element to the end of this list
//modified (when capacity is full, resize before adding)
    if (size == data.length) resize();
    data[size] = element;
    size++;
    return true;

  }

  public String get(int index){
//returns the elemt at the specified position in this list

    return data[index];

  }

  public String set(int index, String element){
//replaces the element at the specified position in this list with the specified element, return the value you replaced
    String before = "";
    before = data[index];
    data[index] = element;
    return before;

  }

  private void resize(){
//increase the capacity: create a larger array, copy values from the original array to new one, assign new one to instance variable
    String[] newArray = new String[size + 10]
      for (int i = 0; i < data.length; i++){
          newArray[i] = data[i];
          }
          newArray = data;

  }



}
