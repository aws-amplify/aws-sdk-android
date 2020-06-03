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
 * JSON marshaller for POJO DomainEndpointOptions
 */
class DomainEndpointOptionsJsonMarshaller {

    public void marshall(DomainEndpointOptions domainEndpointOptions, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainEndpointOptions.getEnforceHTTPS() != null) {
            Boolean enforceHTTPS = domainEndpointOptions.getEnforceHTTPS();
            jsonWriter.name("EnforceHTTPS");
            jsonWriter.value(enforceHTTPS);
        }
        if (domainEndpointOptions.getTLSSecurityPolicy() != null) {
            String tLSSecurityPolicy = domainEndpointOptions.getTLSSecurityPolicy();
            jsonWriter.name("TLSSecurityPolicy");
            jsonWriter.value(tLSSecurityPolicy);
        }
        jsonWriter.endObject();
    }

    private static DomainEndpointOptionsJsonMarshaller instance;

    public static DomainEndpointOptionsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainEndpointOptionsJsonMarshaller();
        return instance;
    }
}
