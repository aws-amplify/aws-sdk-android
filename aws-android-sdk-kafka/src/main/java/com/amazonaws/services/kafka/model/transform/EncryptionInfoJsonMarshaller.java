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

package com.amazonaws.services.kafka.model.transform;

import com.amazonaws.services.kafka.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EncryptionInfo
 */
class EncryptionInfoJsonMarshaller {

    public void marshall(EncryptionInfo encryptionInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (encryptionInfo.getEncryptionAtRest() != null) {
            EncryptionAtRest encryptionAtRest = encryptionInfo.getEncryptionAtRest();
            jsonWriter.name("EncryptionAtRest");
            EncryptionAtRestJsonMarshaller.getInstance().marshall(encryptionAtRest, jsonWriter);
        }
        if (encryptionInfo.getEncryptionInTransit() != null) {
            EncryptionInTransit encryptionInTransit = encryptionInfo.getEncryptionInTransit();
            jsonWriter.name("EncryptionInTransit");
            EncryptionInTransitJsonMarshaller.getInstance().marshall(encryptionInTransit,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EncryptionInfoJsonMarshaller instance;

    public static EncryptionInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EncryptionInfoJsonMarshaller();
        return instance;
    }
}
