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
 * JSON marshaller for POJO HostProperties
 */
class HostPropertiesJsonMarshaller {

    public void marshall(HostProperties hostProperties, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hostProperties.getCores() != null) {
            Integer cores = hostProperties.getCores();
            jsonWriter.name("Cores");
            jsonWriter.value(cores);
        }
        if (hostProperties.getInstanceType() != null) {
            String instanceType = hostProperties.getInstanceType();
            jsonWriter.name("InstanceType");
            jsonWriter.value(instanceType);
        }
        if (hostProperties.getInstanceFamily() != null) {
            String instanceFamily = hostProperties.getInstanceFamily();
            jsonWriter.name("InstanceFamily");
            jsonWriter.value(instanceFamily);
        }
        if (hostProperties.getSockets() != null) {
            Integer sockets = hostProperties.getSockets();
            jsonWriter.name("Sockets");
            jsonWriter.value(sockets);
        }
        if (hostProperties.getTotalVCpus() != null) {
            Integer totalVCpus = hostProperties.getTotalVCpus();
            jsonWriter.name("TotalVCpus");
            jsonWriter.value(totalVCpus);
        }
        jsonWriter.endObject();
    }

    private static HostPropertiesJsonMarshaller instance;

    public static HostPropertiesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostPropertiesJsonMarshaller();
        return instance;
    }
}
