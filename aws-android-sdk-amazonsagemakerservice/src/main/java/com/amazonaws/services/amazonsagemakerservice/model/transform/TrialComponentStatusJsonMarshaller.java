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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TrialComponentStatus
 */
class TrialComponentStatusJsonMarshaller {

    public void marshall(TrialComponentStatus trialComponentStatus, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trialComponentStatus.getPrimaryStatus() != null) {
            String primaryStatus = trialComponentStatus.getPrimaryStatus();
            jsonWriter.name("PrimaryStatus");
            jsonWriter.value(primaryStatus);
        }
        if (trialComponentStatus.getMessage() != null) {
            String message = trialComponentStatus.getMessage();
            jsonWriter.name("Message");
            jsonWriter.value(message);
        }
        jsonWriter.endObject();
    }

    private static TrialComponentStatusJsonMarshaller instance;

    public static TrialComponentStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentStatusJsonMarshaller();
        return instance;
    }
}
