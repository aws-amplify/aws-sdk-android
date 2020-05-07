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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO InstanceEntry
 */
class InstanceEntryJsonMarshaller {

    public void marshall(InstanceEntry instanceEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (instanceEntry.getSourceName() != null) {
            String sourceName = instanceEntry.getSourceName();
            jsonWriter.name("sourceName");
            jsonWriter.value(sourceName);
        }
        if (instanceEntry.getInstanceType() != null) {
            String instanceType = instanceEntry.getInstanceType();
            jsonWriter.name("instanceType");
            jsonWriter.value(instanceType);
        }
        if (instanceEntry.getPortInfoSource() != null) {
            String portInfoSource = instanceEntry.getPortInfoSource();
            jsonWriter.name("portInfoSource");
            jsonWriter.value(portInfoSource);
        }
        if (instanceEntry.getUserData() != null) {
            String userData = instanceEntry.getUserData();
            jsonWriter.name("userData");
            jsonWriter.value(userData);
        }
        if (instanceEntry.getAvailabilityZone() != null) {
            String availabilityZone = instanceEntry.getAvailabilityZone();
            jsonWriter.name("availabilityZone");
            jsonWriter.value(availabilityZone);
        }
        jsonWriter.endObject();
    }

    private static InstanceEntryJsonMarshaller instance;

    public static InstanceEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new InstanceEntryJsonMarshaller();
        return instance;
    }
}
