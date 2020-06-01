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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelCountersForWorkteam
 */
class LabelCountersForWorkteamJsonMarshaller {

    public void marshall(LabelCountersForWorkteam labelCountersForWorkteam, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (labelCountersForWorkteam.getHumanLabeled() != null) {
            Integer humanLabeled = labelCountersForWorkteam.getHumanLabeled();
            jsonWriter.name("HumanLabeled");
            jsonWriter.value(humanLabeled);
        }
        if (labelCountersForWorkteam.getPendingHuman() != null) {
            Integer pendingHuman = labelCountersForWorkteam.getPendingHuman();
            jsonWriter.name("PendingHuman");
            jsonWriter.value(pendingHuman);
        }
        if (labelCountersForWorkteam.getTotal() != null) {
            Integer total = labelCountersForWorkteam.getTotal();
            jsonWriter.name("Total");
            jsonWriter.value(total);
        }
        jsonWriter.endObject();
    }

    private static LabelCountersForWorkteamJsonMarshaller instance;

    public static LabelCountersForWorkteamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelCountersForWorkteamJsonMarshaller();
        return instance;
    }
}
