import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;


//getting value to string list from array
public class FirstArray extends Parent{
    private final static Logger LOG = LogManager.getLogger("TEST");
    String name;
    int number;
    FirstArray(String name, int number){
        super(name);
        this.name = name;
        this.number = number;
    }
    FirstArray(){
        LOG.info("New example of First Array class");
    }
   public String [] Alphabet = new String [] {"c", "a","b", "d", "f", "e", "g"};
//
    public List <String> typeAlphabet(String [] Alphabet){
        int i = 0;
        List<String> stringAlphabet = new ArrayList();
        while (true){
            if(i == 4) {
                break;
            }
            stringAlphabet.add(Alphabet[i]);
            i++;
        }
        return stringAlphabet;
    }
    public List convertArrayToList(String [] Array){
        List stringList = new ArrayList();
        for (int i = 0; i < Array.length; i++ ){
            stringList.add(Array[i]);
        }
        return stringList;
    }

}
