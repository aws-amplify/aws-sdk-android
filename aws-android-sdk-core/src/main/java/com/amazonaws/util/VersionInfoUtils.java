/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.util;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Utility class for accessing AWS SDK versioning information.
 */
public class VersionInfoUtils {

    private static final int DEFAULT_STRING_LENGTH = 128;

    /** SDK version info */
    private static volatile String version = "2.6.17";
                                                                // changed build
                                                                // logic

    /** SDK platform info */
    private static volatile String platform = "android"; // this will be changed
                                                         // build logic

    /** User Agent info */
    private static volatile String userAgent;

    /** Shared logger for any issues while loading version information */
    private static final Log log = LogFactory.getLog(VersionInfoUtils.class);

    /**
     * Returns the current version for the AWS SDK in which this class is
     * running. Version information is obtained from from the
     * versionInfo.properties file which the AWS Java SDK build process
     * generates.
     *
     * @return The current version for the AWS SDK, if known, otherwise returns
     *         a string indicating that the version information is not
     *         available.
     */
    public static String getVersion() {
        return version;
    }

    /**
     * Returns the current platform for the AWS SDK in which this class is
     * running. Version information is obtained from from the
     * versionInfo.properties file which the AWS Java SDK build process
     * generates.
     *
     * @return The current platform for the AWS SDK, if known, otherwise returns
     *         a string indicating that the platform information is not
     *         available.
     */
    public static String getPlatform() {
        return platform;
    }

    /**
     * @return Returns the User Agent string to be used when communicating with
     *         the AWS services. The User Agent encapsulates SDK, Java, OS and
     *         region information.
     */
    public static String getUserAgent() {
        if (userAgent == null) {
            synchronized (VersionInfoUtils.class) {
                if (userAgent == null)
                    initializeUserAgent();
            }
        }
        return userAgent;
    }

    /**
     * Loads the versionInfo.properties file from the AWS Java SDK and stores
     * the information so that the file doesn't have to be read the next time
     * the data is needed.
     */
    private static void initializeUserAgent() {
        userAgent = userAgent();
    }

    static String userAgent() {
        StringBuilder buffer = new StringBuilder(DEFAULT_STRING_LENGTH);

        buffer.append("aws-sdk-");
        buffer.append(StringUtils.lowerCase(VersionInfoUtils.getPlatform()));
        buffer.append("/");

        buffer.append(VersionInfoUtils.getVersion());
        buffer.append(" ");
        buffer.append(replaceSpaces(System.getProperty("os.name")));
        buffer.append("/");
        buffer.append(replaceSpaces(System.getProperty("os.version")));

        buffer.append(" ");
        buffer.append(replaceSpaces(System.getProperty("java.vm.name")));
        buffer.append("/");
        buffer.append(replaceSpaces(System.getProperty("java.vm.version")));
        buffer.append("/");
        buffer.append(replaceSpaces(System.getProperty("java.version")));

        String language = System.getProperty("user.language");
        String region = System.getProperty("user.region");

        if (language != null && region != null) {
            buffer.append(" ");
            buffer.append(replaceSpaces(language));
            buffer.append("_");
            buffer.append(replaceSpaces(region));
        }
        return buffer.toString();
    }

    /**
     * Replace any spaces in the input with underscores.
     *
     * @param input the input
     * @return the input with spaces replaced by underscores
     */
    private static String replaceSpaces(final String input) {
        return input.replace(' ', '_');
    }
}
