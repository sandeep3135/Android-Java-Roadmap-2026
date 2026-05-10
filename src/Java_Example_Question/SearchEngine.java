package Java_Example_Question;

//implement linear search for string arrays with index reporting

public class SearchEngine {

    public void findPosition(String[] name, String target){

        for (int i = 0; i < name.length; i++){
            if (name[i].equals(target)){    //if target is found in array list by searching through indexes
                System.out.println("Found target: "+ target);     //print target name from list
                System.out.println("At position: " + i);    // print their position where are located
                break;
            }
        }
    }

    public static void main(String[] args) {
        SearchEngine mySearch = new SearchEngine();

        String[] name = {"pk", "Rahul", "Amit", "Ishan", "Sandeep"};
        mySearch.findPosition(name, "Rahul");
        mySearch.findPosition(name, "Sandeep");

    }
}
