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

package com.amazonaws.services.guardduty.model.transform;

import com.amazonaws.services.guardduty.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Organization
 */
class OrganizationJsonMarshaller {

    public void marshall(Organization organization, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (organization.getAsn() != null) {
            String asn = organization.getAsn();
            jsonWriter.name("Asn");
            jsonWriter.value(asn);
        }
        if (organization.getAsnOrg() != null) {
            String asnOrg = organization.getAsnOrg();
            jsonWriter.name("AsnOrg");
            jsonWriter.value(asnOrg);
        }
        if (organization.getIsp() != null) {
            String isp = organization.getIsp();
            jsonWriter.name("Isp");
            jsonWriter.value(isp);
        }
        if (organization.getOrg() != null) {
            String org = organization.getOrg();
            jsonWriter.name("Org");
            jsonWriter.value(org);
        }
        jsonWriter.endObject();
    }

    private static OrganizationJsonMarshaller instance;

    public static OrganizationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationJsonMarshaller();
        return instance;
    }
}
