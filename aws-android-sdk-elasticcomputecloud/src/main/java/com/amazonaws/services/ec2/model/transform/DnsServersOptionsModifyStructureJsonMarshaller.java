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
 * JSON marshaller for POJO DnsServersOptionsModifyStructure
 */
class DnsServersOptionsModifyStructureJsonMarshaller {

    public void marshall(DnsServersOptionsModifyStructure dnsServersOptionsModifyStructure,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dnsServersOptionsModifyStructure.getCustomDnsServers() != null) {
            java.util.List<String> customDnsServers = dnsServersOptionsModifyStructure
                    .getCustomDnsServers();
            jsonWriter.name("CustomDnsServers");
            jsonWriter.beginArray();
            for (String customDnsServersItem : customDnsServers) {
                if (customDnsServersItem != null) {
                    jsonWriter.value(customDnsServersItem);
                }
            }
            jsonWriter.endArray();
        }
        if (dnsServersOptionsModifyStructure.getEnabled() != null) {
            Boolean enabled = dnsServersOptionsModifyStructure.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        jsonWriter.endObject();
    }

    private static DnsServersOptionsModifyStructureJsonMarshaller instance;

    public static DnsServersOptionsModifyStructureJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsServersOptionsModifyStructureJsonMarshaller();
        return instance;
    }
}
