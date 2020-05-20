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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LifecycleEvent
 */
class LifecycleEventJsonMarshaller {

    public void marshall(LifecycleEvent lifecycleEvent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lifecycleEvent.getLifecycleEventName() != null) {
            String lifecycleEventName = lifecycleEvent.getLifecycleEventName();
            jsonWriter.name("lifecycleEventName");
            jsonWriter.value(lifecycleEventName);
        }
        if (lifecycleEvent.getDiagnostics() != null) {
            Diagnostics diagnostics = lifecycleEvent.getDiagnostics();
            jsonWriter.name("diagnostics");
            DiagnosticsJsonMarshaller.getInstance().marshall(diagnostics, jsonWriter);
        }
        if (lifecycleEvent.getStartTime() != null) {
            java.util.Date startTime = lifecycleEvent.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (lifecycleEvent.getEndTime() != null) {
            java.util.Date endTime = lifecycleEvent.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (lifecycleEvent.getStatus() != null) {
            String status = lifecycleEvent.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static LifecycleEventJsonMarshaller instance;

    public static LifecycleEventJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LifecycleEventJsonMarshaller();
        return instance;
    }
}
