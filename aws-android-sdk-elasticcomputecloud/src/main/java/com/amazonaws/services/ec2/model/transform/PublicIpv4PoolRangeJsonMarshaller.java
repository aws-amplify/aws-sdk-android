/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PublicIpv4PoolRange
 */
class PublicIpv4PoolRangeJsonMarshaller {

    public void marshall(PublicIpv4PoolRange publicIpv4PoolRange, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (publicIpv4PoolRange.getFirstAddress() != null) {
            String firstAddress = publicIpv4PoolRange.getFirstAddress();
            jsonWriter.name("FirstAddress");
            jsonWriter.value(firstAddress);
        }
        if (publicIpv4PoolRange.getLastAddress() != null) {
            String lastAddress = publicIpv4PoolRange.getLastAddress();
            jsonWriter.name("LastAddress");
            jsonWriter.value(lastAddress);
        }
        if (publicIpv4PoolRange.getAddressCount() != null) {
            Integer addressCount = publicIpv4PoolRange.getAddressCount();
            jsonWriter.name("AddressCount");
            jsonWriter.value(addressCount);
        }
        if (publicIpv4PoolRange.getAvailableAddressCount() != null) {
            Integer availableAddressCount = publicIpv4PoolRange.getAvailableAddressCount();
            jsonWriter.name("AvailableAddressCount");
            jsonWriter.value(availableAddressCount);
        }
        jsonWriter.endObject();
    }

    private static PublicIpv4PoolRangeJsonMarshaller instance;

    public static PublicIpv4PoolRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PublicIpv4PoolRangeJsonMarshaller();
        return instance;
    }
}
