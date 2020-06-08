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

package com.amazonaws.services.servicediscovery.model.transform;

import com.amazonaws.services.servicediscovery.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DnsConfig
 */
class DnsConfigJsonMarshaller {

    public void marshall(DnsConfig dnsConfig, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dnsConfig.getNamespaceId() != null) {
            String namespaceId = dnsConfig.getNamespaceId();
            jsonWriter.name("NamespaceId");
            jsonWriter.value(namespaceId);
        }
        if (dnsConfig.getRoutingPolicy() != null) {
            String routingPolicy = dnsConfig.getRoutingPolicy();
            jsonWriter.name("RoutingPolicy");
            jsonWriter.value(routingPolicy);
        }
        if (dnsConfig.getDnsRecords() != null) {
            java.util.List<DnsRecord> dnsRecords = dnsConfig.getDnsRecords();
            jsonWriter.name("DnsRecords");
            jsonWriter.beginArray();
            for (DnsRecord dnsRecordsItem : dnsRecords) {
                if (dnsRecordsItem != null) {
                    DnsRecordJsonMarshaller.getInstance().marshall(dnsRecordsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static DnsConfigJsonMarshaller instance;

    public static DnsConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsConfigJsonMarshaller();
        return instance;
    }
}
