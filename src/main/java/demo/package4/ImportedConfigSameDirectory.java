package demo.package4;

import lombok.extern.java.Log;

@Log
public class ImportedConfigSameDirectory {

    public static void main(String[] args) {
        /*
        Imports the `lombok.log.fieldName` setting from `../package1/lombok.config` through `lombok.config` next to this class.
        The editor says "Cannot resolve symbol 'package1log'", but it compiles and runs.
         */
        package4log.info("Greetings from ImportedConfigSameDirectory");

        /*
        Looks good in the editor, but it doesn't compile.
         */
        log.info("Greetings from ImportedConfigSameDirectory");
    }

}
