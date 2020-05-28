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

package com.amazonaws.services.workmail.model.transform;

import com.amazonaws.services.workmail.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AccessControlRule
 */
class AccessControlRuleJsonMarshaller {

    public void marshall(AccessControlRule accessControlRule, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (accessControlRule.getName() != null) {
            String name = accessControlRule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (accessControlRule.getEffect() != null) {
            String effect = accessControlRule.getEffect();
            jsonWriter.name("Effect");
            jsonWriter.value(effect);
        }
        if (accessControlRule.getDescription() != null) {
            String description = accessControlRule.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (accessControlRule.getIpRanges() != null) {
            java.util.List<String> ipRanges = accessControlRule.getIpRanges();
            jsonWriter.name("IpRanges");
            jsonWriter.beginArray();
            for (String ipRangesItem : ipRanges) {
                if (ipRangesItem != null) {
                    jsonWriter.value(ipRangesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getNotIpRanges() != null) {
            java.util.List<String> notIpRanges = accessControlRule.getNotIpRanges();
            jsonWriter.name("NotIpRanges");
            jsonWriter.beginArray();
            for (String notIpRangesItem : notIpRanges) {
                if (notIpRangesItem != null) {
                    jsonWriter.value(notIpRangesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getActions() != null) {
            java.util.List<String> actions = accessControlRule.getActions();
            jsonWriter.name("Actions");
            jsonWriter.beginArray();
            for (String actionsItem : actions) {
                if (actionsItem != null) {
                    jsonWriter.value(actionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getNotActions() != null) {
            java.util.List<String> notActions = accessControlRule.getNotActions();
            jsonWriter.name("NotActions");
            jsonWriter.beginArray();
            for (String notActionsItem : notActions) {
                if (notActionsItem != null) {
                    jsonWriter.value(notActionsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getUserIds() != null) {
            java.util.List<String> userIds = accessControlRule.getUserIds();
            jsonWriter.name("UserIds");
            jsonWriter.beginArray();
            for (String userIdsItem : userIds) {
                if (userIdsItem != null) {
                    jsonWriter.value(userIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getNotUserIds() != null) {
            java.util.List<String> notUserIds = accessControlRule.getNotUserIds();
            jsonWriter.name("NotUserIds");
            jsonWriter.beginArray();
            for (String notUserIdsItem : notUserIds) {
                if (notUserIdsItem != null) {
                    jsonWriter.value(notUserIdsItem);
                }
            }
            jsonWriter.endArray();
        }
        if (accessControlRule.getDateCreated() != null) {
            java.util.Date dateCreated = accessControlRule.getDateCreated();
            jsonWriter.name("DateCreated");
            jsonWriter.value(dateCreated);
        }
        if (accessControlRule.getDateModified() != null) {
            java.util.Date dateModified = accessControlRule.getDateModified();
            jsonWriter.name("DateModified");
            jsonWriter.value(dateModified);
        }
        jsonWriter.endObject();
    }

    private static AccessControlRuleJsonMarshaller instance;

    public static AccessControlRuleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AccessControlRuleJsonMarshaller();
        return instance;
    }
}
