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

import com.amazonaws.mobileconnectors.geo.tracker.TrackingModelFactory;
import com.amazonaws.services.geo.model.DevicePositionUpdate;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class TrackingModelFactoryTest {

    @Test
    public void createServiceModelFromAndroidModel() {
        Location mockAndroidLocation = MockLocationFactory.createAndroidLocation();
        DevicePositionUpdate serviceModel = TrackingModelFactory.createDevicePositionUpdate("dummy_device_id", mockAndroidLocation);
        assertNotNull(serviceModel);
        assertEquals(2, serviceModel.getPosition().size());
        assertEquals(MockLocationFactory.DEFAULT_LONGITUDE, serviceModel.getPosition().get(0), 0.0);
        assertEquals(MockLocationFactory.DEFAULT_LATITUDE, serviceModel.getPosition().get(1), 0.0);
    }

}
