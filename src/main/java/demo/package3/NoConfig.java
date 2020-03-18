package demo.package3;

import lombok.extern.java.Log;

@Log
public class NoConfig {

    public static void main(String[] args) {
        /*
        Uses the default `lombok.log.fieldName` setting.
        Looks good in the editor, and compiles.
         */
        log.info("Greetings from NoConfig");
    }

}
