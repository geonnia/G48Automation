import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;
import java.util.List;

public class Parent {
    private final static Logger LOG = LogManager.getLogger("TEST");
    protected String name;
    Parent(String name){
        this.name = name;
    }
    Parent(){

    }

    public void typeName(){
        System.out.println("<name>:" + name);
    }
    public List<String> doingSmth(List <String> stringList){




           try {
               for (int i = 0; i < stringList.size(); i++) {
                   LOG.debug(
                           Arrays.toString(
                                   stringList.get(i).split(" ")
                           )
                   );

               }
           } catch (NullPointerException e) {
               LOG.error(String.format("The array doesn't initialized. Please, refine your input data ", e.getMessage()));

           }
           catch (Exception e) {
               LOG.error(String.format("Some error. Get info: %s", e.getMessage()));
           }


       // }
//        else{
//            System.out.println("There are no symbols in array");
//        }
        return stringList;
    }

}
