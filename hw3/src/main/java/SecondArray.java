import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//sorting string list and outputting it in console
public class SecondArray extends Parent{
    private final static Logger LOG = LogManager.getLogger("TEST");
    String name;
    int number;
    SecondArray(String name, int number){
        super(name);
        this.name = name;
        this.number = number;
    }
    SecondArray(){
        LOG.info("New example of Second Array class");
    }

    public Map sortingList(List <String> stringList){
        Map collection = new HashMap();
        Collections.sort(stringList);
        for(int i = 0; i < stringList.size(); i++){
            collection.put(i, stringList.get(i));
            LOG.debug(collection.get(i));
        }
        for(int i = 0; i < collection.size(); i++){

            LOG.debug(collection.get(i));
        }
        return collection;
    }
}
