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
 * JSON marshaller for POJO SSEDescription
 */
class SSEDescriptionJsonMarshaller {

    public void marshall(SSEDescription sSEDescription, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (sSEDescription.getStatus() != null) {
            String status = sSEDescription.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (sSEDescription.getSSEType() != null) {
            String sSEType = sSEDescription.getSSEType();
            jsonWriter.name("SSEType");
            jsonWriter.value(sSEType);
        }
        if (sSEDescription.getKMSMasterKeyArn() != null) {
            String kMSMasterKeyArn = sSEDescription.getKMSMasterKeyArn();
            jsonWriter.name("KMSMasterKeyArn");
            jsonWriter.value(kMSMasterKeyArn);
        }
        jsonWriter.endObject();
    }

    private static SSEDescriptionJsonMarshaller instance;

    public static SSEDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SSEDescriptionJsonMarshaller();
        return instance;
    }
}
