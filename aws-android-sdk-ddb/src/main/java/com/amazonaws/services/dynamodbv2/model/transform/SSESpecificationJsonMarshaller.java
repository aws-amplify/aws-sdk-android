/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.dynamodbv2.model.transform;

import com.amazonaws.services.dynamodbv2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SSESpecification
 */
class SSESpecificationJsonMarshaller {

    public void marshall(SSESpecification sSESpecification, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sSESpecification.getEnabled() != null) {
            Boolean enabled = sSESpecification.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (sSESpecification.getSSEType() != null) {
            String sSEType = sSESpecification.getSSEType();
            jsonWriter.name("SSEType");
            jsonWriter.value(sSEType);
        }
        if (sSESpecification.getKMSMasterKeyId() != null) {
            String kMSMasterKeyId = sSESpecification.getKMSMasterKeyId();
            jsonWriter.name("KMSMasterKeyId");
            jsonWriter.value(kMSMasterKeyId);
        }
        jsonWriter.endObject();
    }

    private static SSESpecificationJsonMarshaller instance;

    public static SSESpecificationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SSESpecificationJsonMarshaller();
        return instance;
    }
}
