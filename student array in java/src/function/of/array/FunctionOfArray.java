package function.of.array;

/**
 *
 * @author Bilal Ahmed
 */
public class FunctionOfArray {

    public static void main(String[] args) {
        StudentArray stdArrayObj = new StudentArray();
        stdArrayObj.insert("Bilal Ahmed");
        stdArrayObj.insert("Baloch Ahmed");
        System.out.println(stdArrayObj.find("Bilal Ahmed"));
    }
    
}
