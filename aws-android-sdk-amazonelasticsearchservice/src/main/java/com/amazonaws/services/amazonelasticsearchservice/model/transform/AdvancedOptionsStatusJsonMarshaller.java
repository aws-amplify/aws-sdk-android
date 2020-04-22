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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AdvancedOptionsStatus
 */
class AdvancedOptionsStatusJsonMarshaller {

    public void marshall(AdvancedOptionsStatus advancedOptionsStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (advancedOptionsStatus.getOptions() != null) {
            java.util.Map<String, String> options = advancedOptionsStatus.getOptions();
            jsonWriter.name("Options");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> optionsEntry : options.entrySet()) {
                String optionsValue = optionsEntry.getValue();
                if (optionsValue != null) {
                    jsonWriter.name(optionsEntry.getKey());
                    jsonWriter.value(optionsValue);
                }
            }
            jsonWriter.endObject();
        }
        if (advancedOptionsStatus.getStatus() != null) {
            OptionStatus status = advancedOptionsStatus.getStatus();
            jsonWriter.name("Status");
            OptionStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static AdvancedOptionsStatusJsonMarshaller instance;

    public static AdvancedOptionsStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AdvancedOptionsStatusJsonMarshaller();
        return instance;
    }
}
