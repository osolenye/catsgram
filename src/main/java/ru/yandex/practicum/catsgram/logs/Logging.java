package ru.yandex.practicum.catsgram.logs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Logging {
    // a text file that stores every exception in chronological sequence.
    // SLF4J - logging framework, it's implementation is Logback
    // many logging frameworks consist of 3 things:
    // 1) Logger - class that transforms an action to an object and gives is to other framework's components
    // 2) Appender - appends the object to a log file depending on where it is stored (file appender, DB appender)
    // 3) Layout - before writing the log in the console it formats the logs
    // To add a log we need LoggerFactory factory-class and it's static method getLogger(String)

    // should specify the class name from where the logger will be called
    private static final Logger log = LoggerFactory.getLogger(Logging.class);

    // 5 levels of importance in SLF4J for getting the important info when reading the logs
    // TRACE - tracing messages. Stores almost everythig that happeend
    // DEBUG - for debugging messages
    // INFO - for program's current state. e.g. state of request to an endpoint etc
    // WARN - stores exceptions. The program can go on and continue working
    // ERROR - critical errors in program. The program can't keep working.

    // it is possible to write in the console only specific levels of logs

    public static void main(String[] args) {
        System.out.println(log.getName());
    }
}
