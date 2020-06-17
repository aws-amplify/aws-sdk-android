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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DnsServiceDiscovery
 */
class DnsServiceDiscoveryJsonMarshaller {

    public void marshall(DnsServiceDiscovery dnsServiceDiscovery, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dnsServiceDiscovery.getHostname() != null) {
            String hostname = dnsServiceDiscovery.getHostname();
            jsonWriter.name("hostname");
            jsonWriter.value(hostname);
        }
        jsonWriter.endObject();
    }

    private static DnsServiceDiscoveryJsonMarshaller instance;

    public static DnsServiceDiscoveryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsServiceDiscoveryJsonMarshaller();
        return instance;
    }
}
