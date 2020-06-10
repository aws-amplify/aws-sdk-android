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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IpOwner
 */
class IpOwnerJsonMarshaller {

    public void marshall(IpOwner ipOwner, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ipOwner.getAsn() != null) {
            String asn = ipOwner.getAsn();
            jsonWriter.name("asn");
            jsonWriter.value(asn);
        }
        if (ipOwner.getAsnOrg() != null) {
            String asnOrg = ipOwner.getAsnOrg();
            jsonWriter.name("asnOrg");
            jsonWriter.value(asnOrg);
        }
        if (ipOwner.getIsp() != null) {
            String isp = ipOwner.getIsp();
            jsonWriter.name("isp");
            jsonWriter.value(isp);
        }
        if (ipOwner.getOrg() != null) {
            String org = ipOwner.getOrg();
            jsonWriter.name("org");
            jsonWriter.value(org);
        }
        jsonWriter.endObject();
    }

    private static IpOwnerJsonMarshaller instance;

    public static IpOwnerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IpOwnerJsonMarshaller();
        return instance;
    }
}
