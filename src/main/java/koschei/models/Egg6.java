package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.xml.ws.Action;
@Component
public class Egg6 {

    @Autowired
    private Needle7 needle;

    @Override
    public String toString() {
        return ", в яйце иголка " + needle;
    }
}
