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

package com.amazonaws.services.amazonimportexportsnowball.model.transform;

import com.amazonaws.services.amazonimportexportsnowball.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LambdaResource
 */
class LambdaResourceJsonMarshaller {

    public void marshall(LambdaResource lambdaResource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (lambdaResource.getLambdaArn() != null) {
            String lambdaArn = lambdaResource.getLambdaArn();
            jsonWriter.name("LambdaArn");
            jsonWriter.value(lambdaArn);
        }
        if (lambdaResource.getEventTriggers() != null) {
            java.util.List<EventTriggerDefinition> eventTriggers = lambdaResource
                    .getEventTriggers();
            jsonWriter.name("EventTriggers");
            jsonWriter.beginArray();
            for (EventTriggerDefinition eventTriggersItem : eventTriggers) {
                if (eventTriggersItem != null) {
                    EventTriggerDefinitionJsonMarshaller.getInstance().marshall(eventTriggersItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LambdaResourceJsonMarshaller instance;

    public static LambdaResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LambdaResourceJsonMarshaller();
        return instance;
    }
}
