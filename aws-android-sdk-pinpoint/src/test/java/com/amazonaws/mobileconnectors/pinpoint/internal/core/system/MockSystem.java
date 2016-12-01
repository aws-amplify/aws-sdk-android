/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.internal.core.system;

import java.io.File;
import java.util.Locale;

public class MockSystem extends AndroidSystem {

    private boolean isConnected = true;
    private boolean hasWifi = true;
    private boolean hasWAN = true;
    private final FileManager fileManager;
    private final AndroidPreferences preferences = new MockPreferences();
    private final File rootTestDirectory;
    private final AndroidAppDetails appDetails;
    private final MockDeviceDetails deviceDetails;

    public MockSystem(String applicationKey) {
        rootTestDirectory = new File("/tmp/AmazonMobileAnalyticsSDK/tests/" + applicationKey);
        rootTestDirectory.mkdirs();
        fileManager = new FileManager(rootTestDirectory);
        appDetails = new MockAppDetails();
        deviceDetails = new MockDeviceDetails();
    }

    @Override
    public AndroidPreferences getPreferences() {
        return preferences;
    }

    @Override
    public AndroidConnectivity getConnectivity() {
        return new AndroidConnectivity() {
            public boolean isConnected() {
                return isConnected;
            }
            public boolean hasWifi() {
                return hasWifi;
            }
            public boolean hasWAN() {
                return hasWAN;
            }
        };
    }

    @Override
    public AndroidAppDetails getAppDetails() {
        return this.appDetails;
    }

    @Override
    public AndroidDeviceDetails getDeviceDetails() {
        return this.deviceDetails;
    }

    public void setConnectivity(final boolean isConnected) {
        this.isConnected = isConnected;
    }

    public void setWifi(final boolean hasWifi) {
        this.hasWifi = hasWifi;
    }

    public void setWAN(final boolean hasWAN) {
        this.hasWAN = hasWAN;
    }

    public void setLocale(Locale locale) {
        this.deviceDetails.setLocale(locale);
    }

    public void reset() {
        setConnectivity(true);
        setWifi(true);
        setWifi(true);

        // try to delete after waiting some time for the event store to
        // finishing deleting any files
        int attempts = 3;
        while (attempts > 0) {
            try {
                Thread.sleep(1000);
                deleteRecursively(rootTestDirectory);
                attempts = 0;
            } catch (Exception e) {
                attempts--;
            }
        }
    }

    public static boolean deleteRecursively(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File[] children = file.listFiles();
                for (File curr : children) {
                    if (curr.isDirectory()) {
                        deleteRecursively(curr);
                    }
                    boolean success = deleteRecursively(curr);
                    if (!success) {
                        return false;
                    }
                }
            }
            return file.delete();
        }
        return false;
    }
}
