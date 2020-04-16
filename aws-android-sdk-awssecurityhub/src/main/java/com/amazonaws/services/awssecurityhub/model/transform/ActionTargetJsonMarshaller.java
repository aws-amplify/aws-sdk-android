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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ActionTarget
 */
class ActionTargetJsonMarshaller {

    public void marshall(ActionTarget actionTarget, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (actionTarget.getActionTargetArn() != null) {
            String actionTargetArn = actionTarget.getActionTargetArn();
            jsonWriter.name("ActionTargetArn");
            jsonWriter.value(actionTargetArn);
        }
        if (actionTarget.getName() != null) {
            String name = actionTarget.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (actionTarget.getDescription() != null) {
            String description = actionTarget.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        jsonWriter.endObject();
    }

    private static ActionTargetJsonMarshaller instance;

    public static ActionTargetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ActionTargetJsonMarshaller();
        return instance;
    }
}
