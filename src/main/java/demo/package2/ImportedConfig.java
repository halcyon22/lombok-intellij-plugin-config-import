package demo.package2;

import lombok.extern.java.Log;

@Log
public class ImportedConfig {

    public static void main(String[] args) {
        /*
        Imports the `lombok.log.fieldName` setting from `../package1/lombok.config` through `lombok.config` next to this class.
        The editor says "Cannot resolve symbol 'package1log'", but it compiles and runs.
         */
        package1log.info("Greetings from ImportedConfig");
    }

}
