package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExecutableMavenJar {
    //No static, else log.name.IS_UNDEFINED.log
    private final Logger logger = LoggerFactory.getLogger(ExecutableMavenJar.class);

    public static void main(String[] args) {

        //Set this before the logger start.
        System.setProperty("log.name", "abcdefg");

        ExecutableMavenJar obj = new ExecutableMavenJar();
        obj.start();

    }

    private void start() {

        logger.error("------ Starting Ant------");
        //...
    }


}
