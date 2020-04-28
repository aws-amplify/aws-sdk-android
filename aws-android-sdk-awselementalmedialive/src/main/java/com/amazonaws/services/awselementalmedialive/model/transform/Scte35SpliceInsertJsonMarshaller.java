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

package com.amazonaws.services.awselementalmedialive.model.transform;

import com.amazonaws.services.awselementalmedialive.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Scte35SpliceInsert
 */
class Scte35SpliceInsertJsonMarshaller {

    public void marshall(Scte35SpliceInsert scte35SpliceInsert, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (scte35SpliceInsert.getAdAvailOffset() != null) {
            Integer adAvailOffset = scte35SpliceInsert.getAdAvailOffset();
            jsonWriter.name("AdAvailOffset");
            jsonWriter.value(adAvailOffset);
        }
        if (scte35SpliceInsert.getNoRegionalBlackoutFlag() != null) {
            String noRegionalBlackoutFlag = scte35SpliceInsert.getNoRegionalBlackoutFlag();
            jsonWriter.name("NoRegionalBlackoutFlag");
            jsonWriter.value(noRegionalBlackoutFlag);
        }
        if (scte35SpliceInsert.getWebDeliveryAllowedFlag() != null) {
            String webDeliveryAllowedFlag = scte35SpliceInsert.getWebDeliveryAllowedFlag();
            jsonWriter.name("WebDeliveryAllowedFlag");
            jsonWriter.value(webDeliveryAllowedFlag);
        }
        jsonWriter.endObject();
    }

    private static Scte35SpliceInsertJsonMarshaller instance;

    public static Scte35SpliceInsertJsonMarshaller getInstance() {
        if (instance == null)
            instance = new Scte35SpliceInsertJsonMarshaller();
        return instance;
    }
}
