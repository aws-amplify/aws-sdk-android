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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OTAUpdateSummary
 */
class OTAUpdateSummaryJsonMarshaller {

    public void marshall(OTAUpdateSummary oTAUpdateSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (oTAUpdateSummary.getOtaUpdateId() != null) {
            String otaUpdateId = oTAUpdateSummary.getOtaUpdateId();
            jsonWriter.name("otaUpdateId");
            jsonWriter.value(otaUpdateId);
        }
        if (oTAUpdateSummary.getOtaUpdateArn() != null) {
            String otaUpdateArn = oTAUpdateSummary.getOtaUpdateArn();
            jsonWriter.name("otaUpdateArn");
            jsonWriter.value(otaUpdateArn);
        }
        if (oTAUpdateSummary.getCreationDate() != null) {
            java.util.Date creationDate = oTAUpdateSummary.getCreationDate();
            jsonWriter.name("creationDate");
            jsonWriter.value(creationDate);
        }
        jsonWriter.endObject();
    }

    private static OTAUpdateSummaryJsonMarshaller instance;

    public static OTAUpdateSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OTAUpdateSummaryJsonMarshaller();
        return instance;
    }
}
