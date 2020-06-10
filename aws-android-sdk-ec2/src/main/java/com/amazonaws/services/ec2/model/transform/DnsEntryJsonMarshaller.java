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
 * JSON marshaller for POJO DnsEntry
 */
class DnsEntryJsonMarshaller {

    public void marshall(DnsEntry dnsEntry, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dnsEntry.getDnsName() != null) {
            String dnsName = dnsEntry.getDnsName();
            jsonWriter.name("DnsName");
            jsonWriter.value(dnsName);
        }
        if (dnsEntry.getHostedZoneId() != null) {
            String hostedZoneId = dnsEntry.getHostedZoneId();
            jsonWriter.name("HostedZoneId");
            jsonWriter.value(hostedZoneId);
        }
        jsonWriter.endObject();
    }

    private static DnsEntryJsonMarshaller instance;

    public static DnsEntryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsEntryJsonMarshaller();
        return instance;
    }
}
