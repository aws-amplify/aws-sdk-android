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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainInformation
 */
class DomainInformationJsonMarshaller {

    public void marshall(DomainInformation domainInformation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainInformation.getOwnerId() != null) {
            String ownerId = domainInformation.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        if (domainInformation.getDomainName() != null) {
            String domainName = domainInformation.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainInformation.getRegion() != null) {
            String region = domainInformation.getRegion();
            jsonWriter.name("Region");
            jsonWriter.value(region);
        }
        jsonWriter.endObject();
    }

    private static DomainInformationJsonMarshaller instance;

    public static DomainInformationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainInformationJsonMarshaller();
        return instance;
    }
}
