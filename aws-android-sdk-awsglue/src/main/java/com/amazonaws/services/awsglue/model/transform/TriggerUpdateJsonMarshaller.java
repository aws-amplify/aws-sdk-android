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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO TriggerUpdate
 */
class TriggerUpdateJsonMarshaller {

    public void marshall(TriggerUpdate triggerUpdate, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (triggerUpdate.getName() != null) {
            String name = triggerUpdate.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (triggerUpdate.getDescription() != null) {
            String description = triggerUpdate.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (triggerUpdate.getSchedule() != null) {
            String schedule = triggerUpdate.getSchedule();
            jsonWriter.name("Schedule");
            jsonWriter.value(schedule);
        }
        if (triggerUpdate.getActions() != null) {
            java.util.List<Action> actions = triggerUpdate.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (Action actionsItem : actions) {
                if (actionsItem != null) {
                    ActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (triggerUpdate.getPredicate() != null) {
            Predicate predicate = triggerUpdate.getPredicate();
            jsonWriter.name("Predicate");
            PredicateJsonMarshaller.getInstance().marshall(predicate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TriggerUpdateJsonMarshaller instance;

    public static TriggerUpdateJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TriggerUpdateJsonMarshaller();
        return instance;
    }
}
