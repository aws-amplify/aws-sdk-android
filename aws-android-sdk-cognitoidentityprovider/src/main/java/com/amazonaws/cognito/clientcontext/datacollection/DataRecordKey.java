package com.amazonaws.cognito.clientcontext.datacollection;

/**
 * Constants in this class contains the fields that are extracted from the
 * device. It enlists the constants used as a key for user context data fields.
 */
public class DataRecordKey {

    /*
     * Keys for application related data.
     */

    /**
     * Operating system architecture.
     */
    public static final String OS_ARCH = "os.arch";
    
    /**
     * Operating system name
     */
    public static final String OS_NAME = "os.name";
    
    /**
     * Operating system version
     */
    public static final String OS_VERSION = "os.version";

    /**
     * JVM vendor
     */
    public static final String JDK_VENDOR = "java.vm.specification.vendor";    
}