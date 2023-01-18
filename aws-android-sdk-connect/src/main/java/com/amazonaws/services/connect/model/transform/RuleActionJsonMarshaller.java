/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RuleAction
 */
class RuleActionJsonMarshaller {

    public void marshall(RuleAction ruleAction, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ruleAction.getActionType() != null) {
            String actionType = ruleAction.getActionType();
            jsonWriter.name("ActionType");
            jsonWriter.value(actionType);
        }
        if (ruleAction.getTaskAction() != null) {
            TaskActionDefinition taskAction = ruleAction.getTaskAction();
            jsonWriter.name("TaskAction");
            TaskActionDefinitionJsonMarshaller.getInstance().marshall(taskAction, jsonWriter);
        }
        if (ruleAction.getEventBridgeAction() != null) {
            EventBridgeActionDefinition eventBridgeAction = ruleAction.getEventBridgeAction();
            jsonWriter.name("EventBridgeAction");
            EventBridgeActionDefinitionJsonMarshaller.getInstance().marshall(eventBridgeAction,
                    jsonWriter);
        }
        if (ruleAction.getAssignContactCategoryAction() != null) {
            AssignContactCategoryActionDefinition assignContactCategoryAction = ruleAction
                    .getAssignContactCategoryAction();
            jsonWriter.name("AssignContactCategoryAction");
            AssignContactCategoryActionDefinitionJsonMarshaller.getInstance().marshall(
                    assignContactCategoryAction, jsonWriter);
        }
        if (ruleAction.getSendNotificationAction() != null) {
            SendNotificationActionDefinition sendNotificationAction = ruleAction
                    .getSendNotificationAction();
            jsonWriter.name("SendNotificationAction");
            SendNotificationActionDefinitionJsonMarshaller.getInstance().marshall(
                    sendNotificationAction, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RuleActionJsonMarshaller instance;

    public static RuleActionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RuleActionJsonMarshaller();
        return instance;
    }
}
