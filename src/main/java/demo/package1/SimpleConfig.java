package demo.package1;

import lombok.extern.java.Log;

@Log
public class SimpleConfig {

    public static void main(String[] args) {
        /*
        Uses the `lombok.log.fieldName` setting from `lombok.config` next to this class.
        Looks good in the editor, compiles, and runs.
         */
        package1log.info("Greetings from SimpleConfig");
    }

}
