public class Demo {
  public static void removeDuplicates(SuperArray s){

        for (int i = 0; i < s.size();){
          if (s.indexOf(s.get(i)) != i){
            s.remove(i);
          }
          else i++;
        }

      }

      public static SuperArray findOverlap(SuperArray a, SuperArray b){
    //return a new SuperArray that is the intersection of elements of a and b
    //the order should be the same as the order of the elements of a

          SuperArray finalArray = new SuperArray();
          for (int i = 0 ; i < a.size(); i++){
            if (b.indexOf(a.get(i)) > -1) {
              finalArray.add(a.get(i));
            }

          }
          removeDuplicates(finalArray);
          return finalArray;
      }

      public static SuperArray zip(SuperArray a, SuperArray b){
    //return a new superarray that contains all elements of a and elements of b
    // in following sequence: [a0,b0,a1,b1,a2,b2]

        SuperArray finalArray = new SuperArray(a.size() + b.size());

        int i = 0;
        for ( ; i < b.size() && i < a.size() ; i++){
          finalArray.add(a.get(i));
          finalArray.add(b.get(i));

        }

        for (; i < b.size() || i < a.size(); i++){
          if (i < a.size()){
            finalArray.add(a.get(i));
          }
            else finalArray.add(b.get(i));
    }
          return finalArray;

      }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);


  }
}
