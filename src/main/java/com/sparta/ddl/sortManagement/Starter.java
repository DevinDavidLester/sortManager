package com.sparta.ddl.sortManagement;

import com.sparta.ddl.sorters.MergeSorter;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Hello world!
 */
public class Starter {

    static final String LOG_PROPERTIES_FILE = "resources/log4j.properties";
    static Logger log = Logger.getLogger(Starter.class.getName());

    public static void main(String[] args) {
        initialiseLogging();
        Logger loggingExample = Logger.getLogger(Starter.class.getName());
        loggingExample.trace("Welcome to logging");

        //new SortManager().runSortManagerSortArray("bubble");
    }

    public static void initialiseLogging(){
        PropertyConfigurator.configure(LOG_PROPERTIES_FILE);
        log.trace("Logging initialised");
    }

}
