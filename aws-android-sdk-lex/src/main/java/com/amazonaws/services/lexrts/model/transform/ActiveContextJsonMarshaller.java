/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.lexrts.model.transform;

import com.amazonaws.services.lexrts.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActiveContext
 */
class ActiveContextJsonMarshaller {

    public void marshall(ActiveContext activeContext, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (activeContext.getName() != null) {
            String name = activeContext.getName();
            jsonWriter.name("name");
            jsonWriter.value(name);
        }
        if (activeContext.getTimeToLive() != null) {
            ActiveContextTimeToLive timeToLive = activeContext.getTimeToLive();
            jsonWriter.name("timeToLive");
            ActiveContextTimeToLiveJsonMarshaller.getInstance().marshall(timeToLive, jsonWriter);
        }
        if (activeContext.getParameters() != null) {
            java.util.Map<String, String> parameters = activeContext.getParameters();
            jsonWriter.name("parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, String> parametersEntry : parameters.entrySet()) {
                String parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
                    jsonWriter.value(parametersValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ActiveContextJsonMarshaller instance;

    public static ActiveContextJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActiveContextJsonMarshaller();
        return instance;
    }
}
