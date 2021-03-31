package function.of.array;

public class StudentArray {
    private int nestIndex;
    private String[] studentNamesArray = new String[10];
    
    void insert(String name){
        if (nestIndex < studentNamesArray.length){
            studentNamesArray[nestIndex++] = name;
            System.out.println("inserted successfully! ... ");
        }
        else{
            System.out.println("insertion unsuccessful! ... ");
        }
    }
    
    int find(String name){
        int index = -1;
        for (int i = 0; i < studentNamesArray.length; i++){
            if (studentNamesArray[i] == name){
                index = i;
                break;
            }
        }
        return index;
    }
    
}
