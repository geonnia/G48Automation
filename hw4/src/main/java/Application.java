import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;



public class Application {
    private final static Logger LOG = LogManager.getLogger("TEST");
    public static void main(String[] args) {

        LOG.info("============Start================");
        List newList = new ArrayList();
        newList.add("String for list number 1");
        newList.add("String for list number 2");

        Parent parent = new FirstArray("name", 2);
        parent.typeName();


        //Class A
        FirstArray firstArray = new FirstArray();
        firstArray.doingSmth(null);

        //Class B
        SecondArray secondArray = new SecondArray();
        secondArray.doingSmth(firstArray.convertArrayToList(firstArray.Alphabet));

        secondArray.doingSmth(newList);
//        secondArray.sortingList(firstArray.doingSmth();
        LOG.info("============END================");

    }
}
