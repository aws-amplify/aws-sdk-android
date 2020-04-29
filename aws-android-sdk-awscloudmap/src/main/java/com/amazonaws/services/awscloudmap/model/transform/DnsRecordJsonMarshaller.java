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

package com.amazonaws.services.awscloudmap.model.transform;

import com.amazonaws.services.awscloudmap.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DnsRecord
 */
class DnsRecordJsonMarshaller {

    public void marshall(DnsRecord dnsRecord, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dnsRecord.getType() != null) {
            String type = dnsRecord.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (dnsRecord.getTTL() != null) {
            Long tTL = dnsRecord.getTTL();
            jsonWriter.name("TTL");
            jsonWriter.value(tTL);
        }
        jsonWriter.endObject();
    }

    private static DnsRecordJsonMarshaller instance;

    public static DnsRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsRecordJsonMarshaller();
        return instance;
    }
}
