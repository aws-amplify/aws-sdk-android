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

package com.amazonaws.services.dlm.model.transform;

import com.amazonaws.services.dlm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Schedule
 */
class ScheduleJsonMarshaller {

    public void marshall(Schedule schedule, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (schedule.getName() != null) {
            String name = schedule.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (schedule.getCopyTags() != null) {
            Boolean copyTags = schedule.getCopyTags();
            jsonWriter.name("CopyTags");
            jsonWriter.value(copyTags);
        }
        if (schedule.getTagsToAdd() != null) {
            java.util.List<Tag> tagsToAdd = schedule.getTagsToAdd();
            jsonWriter.name("TagsToAdd");
            jsonWriter.beginArray();
            for (Tag tagsToAddItem : tagsToAdd) {
                if (tagsToAddItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsToAddItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (schedule.getVariableTags() != null) {
            java.util.List<Tag> variableTags = schedule.getVariableTags();
            jsonWriter.name("VariableTags");
            jsonWriter.beginArray();
            for (Tag variableTagsItem : variableTags) {
                if (variableTagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(variableTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (schedule.getCreateRule() != null) {
            CreateRule createRule = schedule.getCreateRule();
            jsonWriter.name("CreateRule");
            CreateRuleJsonMarshaller.getInstance().marshall(createRule, jsonWriter);
        }
        if (schedule.getRetainRule() != null) {
            RetainRule retainRule = schedule.getRetainRule();
            jsonWriter.name("RetainRule");
            RetainRuleJsonMarshaller.getInstance().marshall(retainRule, jsonWriter);
        }
        if (schedule.getFastRestoreRule() != null) {
            FastRestoreRule fastRestoreRule = schedule.getFastRestoreRule();
            jsonWriter.name("FastRestoreRule");
            FastRestoreRuleJsonMarshaller.getInstance().marshall(fastRestoreRule, jsonWriter);
        }
        if (schedule.getCrossRegionCopyRules() != null) {
            java.util.List<CrossRegionCopyRule> crossRegionCopyRules = schedule
                    .getCrossRegionCopyRules();
            jsonWriter.name("CrossRegionCopyRules");
            jsonWriter.beginArray();
            for (CrossRegionCopyRule crossRegionCopyRulesItem : crossRegionCopyRules) {
                if (crossRegionCopyRulesItem != null) {
                    CrossRegionCopyRuleJsonMarshaller.getInstance().marshall(
                            crossRegionCopyRulesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ScheduleJsonMarshaller instance;

    public static ScheduleJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ScheduleJsonMarshaller();
        return instance;
    }
}
