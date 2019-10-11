/**
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.s3.transferutility;

import com.google.gson.Gson;

import org.junit.Test;

import static org.hamcrest.Matchers.containsString;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class GsonSerializationTest {

    private static Gson gson = new Gson();

    @Test
    public void testTransferNetworkConnectionTypeSerialization() {
        String typeAny = gson.toJson(TransferNetworkConnectionType.ANY);
        String typeWifi = gson.toJson(TransferNetworkConnectionType.WIFI);
        String typeMobile = gson.toJson(TransferNetworkConnectionType.MOBILE);

        assertEquals("\"ANY\"", typeAny);
        assertEquals("\"WIFI\"", typeWifi);
        assertEquals("\"MOBILE\"", typeMobile);
    }

    @Test
    public void testTransferNetworkConnectionTypeDeserialization() {
        TransferNetworkConnectionType anyType = gson.fromJson("\"ANY\"", TransferNetworkConnectionType.class);
        TransferNetworkConnectionType wifiType = gson.fromJson("\"WIFI\"", TransferNetworkConnectionType.class);
        TransferNetworkConnectionType mobileType = gson.fromJson("\"MOBILE\"", TransferNetworkConnectionType.class);

        assertEquals(TransferNetworkConnectionType.ANY, anyType);
        assertEquals(TransferNetworkConnectionType.WIFI, wifiType);
        assertEquals(TransferNetworkConnectionType.MOBILE, mobileType);
    }

    @Test
    public void testTransferUtilityOptionsSerialization() {
        String jsonOptions = gson.toJson(new TransferUtilityOptions());

        assertThat(jsonOptions, containsString("\"transferServiceCheckTimeInterval\":" +
                TransferUtilityOptions.getDefaultCheckTimeInterval()));
        assertThat(jsonOptions, containsString("\"transferThreadPoolSize\":" +
                TransferUtilityOptions.getDefaultThreadPoolSize()));
        assertThat(jsonOptions, containsString("\"transferNetworkConnectionType\":" +
                "\"" + TransferUtilityOptions.getDefaultTransferNetworkConnectionType() + "\""));
    }

    @Test
    public void testTransferUtilityOptionsDeserialization() {
        final String jsonOptions = "{" +
                "\"transferServiceCheckTimeInterval\":6000," +
                "\"transferThreadPoolSize\":10," +
                "\"transferNetworkConnectionType\":\"ANY\"" +
                "}";

        TransferUtilityOptions tuOptions = gson.fromJson(jsonOptions, TransferUtilityOptions.class);

        assertEquals(6000,
                tuOptions.getTransferServiceCheckTimeInterval());
        assertEquals(10,
                tuOptions.getTransferThreadPoolSize());
        assertEquals(TransferNetworkConnectionType.ANY,
                tuOptions.getTransferNetworkConnectionType());
    }
}
