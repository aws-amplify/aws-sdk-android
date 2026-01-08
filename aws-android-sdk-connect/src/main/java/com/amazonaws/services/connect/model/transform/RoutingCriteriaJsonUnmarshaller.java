/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model.transform;

import com.amazonaws.services.connect.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RoutingCriteria
 */
class RoutingCriteriaJsonUnmarshaller implements
        Unmarshaller<RoutingCriteria, JsonUnmarshallerContext> {

    public RoutingCriteria unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RoutingCriteria routingCriteria = new RoutingCriteria();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Steps")) {
                routingCriteria.setSteps(new ListUnmarshaller<Step>(StepJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("ActivationTimestamp")) {
                routingCriteria.setActivationTimestamp(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Index")) {
                routingCriteria.setIndex(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return routingCriteria;
    }

    private static RoutingCriteriaJsonUnmarshaller instance;

    public static RoutingCriteriaJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RoutingCriteriaJsonUnmarshaller();
        return instance;
    }
}
