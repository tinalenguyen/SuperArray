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

    data[size] = element;
    size++;
    return true;

  }

  public String get(int index){
//returns the elemt at the specified position in this list

    return data[index];

  }

}
