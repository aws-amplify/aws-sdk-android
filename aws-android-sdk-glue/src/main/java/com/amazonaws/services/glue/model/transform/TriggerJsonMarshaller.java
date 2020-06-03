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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Trigger
 */
class TriggerJsonMarshaller {

    public void marshall(Trigger trigger, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trigger.getName() != null) {
            String name = trigger.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (trigger.getWorkflowName() != null) {
            String workflowName = trigger.getWorkflowName();
            jsonWriter.name("WorkflowName");
            jsonWriter.value(workflowName);
        }
        if (trigger.getId() != null) {
            String id = trigger.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (trigger.getType() != null) {
            String type = trigger.getType();
            jsonWriter.name("Type");
            jsonWriter.value(type);
        }
        if (trigger.getState() != null) {
            String state = trigger.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (trigger.getDescription() != null) {
            String description = trigger.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (trigger.getSchedule() != null) {
            String schedule = trigger.getSchedule();
            jsonWriter.name("Schedule");
            jsonWriter.value(schedule);
        }
        if (trigger.getActions() != null) {
            java.util.List<Action> actions = trigger.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (Action actionsItem : actions) {
                if (actionsItem != null) {
                    ActionJsonMarshaller.getInstance().marshall(actionsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trigger.getPredicate() != null) {
            Predicate predicate = trigger.getPredicate();
            jsonWriter.name("Predicate");
            PredicateJsonMarshaller.getInstance().marshall(predicate, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TriggerJsonMarshaller instance;

    public static TriggerJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TriggerJsonMarshaller();
        return instance;
    }
}
