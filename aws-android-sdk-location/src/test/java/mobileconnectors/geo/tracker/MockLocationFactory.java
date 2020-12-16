/*
 * Copyright 2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package mobileconnectors.geo.tracker;

import android.location.Location;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class MockLocationFactory {
    static final double DEFAULT_LONGITUDE = 67.89;
    static final double DEFAULT_LATITUDE = 23.45;
    static final double DEFAULT_ALTITUDE = 125.00;

    public static Location createAndroidLocation() {
        return createAndroidLocation(DEFAULT_LONGITUDE, DEFAULT_LATITUDE, DEFAULT_ALTITUDE);
    }

    public static Location createAndroidLocation(double longitude,
                                                 double latittude,
                                                 double altitude) {
        Location mockAndroidLocation = mock(Location.class);
        when(mockAndroidLocation.getLongitude()).thenReturn(longitude);
        when(mockAndroidLocation.getLatitude()).thenReturn(latittude);
        when(mockAndroidLocation.getAltitude()).thenReturn(altitude);
        return mockAndroidLocation;
    }
}
