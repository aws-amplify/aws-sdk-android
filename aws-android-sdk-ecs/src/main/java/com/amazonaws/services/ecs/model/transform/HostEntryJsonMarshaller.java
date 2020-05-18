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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HostEntry
 */
class HostEntryJsonMarshaller {

    public void marshall(HostEntry hostEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hostEntry.getHostname() != null) {
            String hostname = hostEntry.getHostname();
            jsonWriter.name("hostname");
            jsonWriter.value(hostname);
        }
        if (hostEntry.getIpAddress() != null) {
            String ipAddress = hostEntry.getIpAddress();
            jsonWriter.name("ipAddress");
            jsonWriter.value(ipAddress);
        }
        jsonWriter.endObject();
    }

    private static HostEntryJsonMarshaller instance;

    public static HostEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HostEntryJsonMarshaller();
        return instance;
    }
}
