package internalClasses;

import static internalClasses.Executors.*;

/**
 * Created by d1mys1klapo4ka on 06.04.2017.
 */
public class TestInternalClass {

    public static void main(String[] args) {

        getInner().execute();
        getNested().execute();
        getLocal().execute();
        getAnonim().execute();
    }
}
