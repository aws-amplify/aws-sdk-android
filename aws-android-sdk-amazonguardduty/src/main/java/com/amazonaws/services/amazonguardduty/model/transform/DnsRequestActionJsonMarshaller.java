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

package com.amazonaws.services.amazonguardduty.model.transform;

import com.amazonaws.services.amazonguardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DnsRequestAction
 */
class DnsRequestActionJsonMarshaller {

    public void marshall(DnsRequestAction dnsRequestAction, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (dnsRequestAction.getDomain() != null) {
            String domain = dnsRequestAction.getDomain();
            jsonWriter.name("Domain");
            jsonWriter.value(domain);
        }
        jsonWriter.endObject();
    }

    private static DnsRequestActionJsonMarshaller instance;

    public static DnsRequestActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DnsRequestActionJsonMarshaller();
        return instance;
    }
}
