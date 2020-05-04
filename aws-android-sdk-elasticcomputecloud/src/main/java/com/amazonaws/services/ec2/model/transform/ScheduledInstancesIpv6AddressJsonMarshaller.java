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
 * JSON marshaller for POJO ScheduledInstancesIpv6Address
 */
class ScheduledInstancesIpv6AddressJsonMarshaller {

    public void marshall(ScheduledInstancesIpv6Address scheduledInstancesIpv6Address,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (scheduledInstancesIpv6Address.getIpv6Address() != null) {
            String ipv6Address = scheduledInstancesIpv6Address.getIpv6Address();
            jsonWriter.name("Ipv6Address");
            jsonWriter.value(ipv6Address);
        }
        jsonWriter.endObject();
    }

    private static ScheduledInstancesIpv6AddressJsonMarshaller instance;

    public static ScheduledInstancesIpv6AddressJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduledInstancesIpv6AddressJsonMarshaller();
        return instance;
    }
}
