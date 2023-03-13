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
 * JSON marshaller for POJO TaskTemplateConstraints
 */
class TaskTemplateConstraintsJsonMarshaller {

    public void marshall(TaskTemplateConstraints taskTemplateConstraints, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (taskTemplateConstraints.getRequiredFields() != null) {
            java.util.List<RequiredFieldInfo> requiredFields = taskTemplateConstraints
                    .getRequiredFields();
            jsonWriter.name("RequiredFields");
            jsonWriter.beginArray();
            for (RequiredFieldInfo requiredFieldsItem : requiredFields) {
                if (requiredFieldsItem != null) {
                    RequiredFieldInfoJsonMarshaller.getInstance().marshall(requiredFieldsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskTemplateConstraints.getReadOnlyFields() != null) {
            java.util.List<ReadOnlyFieldInfo> readOnlyFields = taskTemplateConstraints
                    .getReadOnlyFields();
            jsonWriter.name("ReadOnlyFields");
            jsonWriter.beginArray();
            for (ReadOnlyFieldInfo readOnlyFieldsItem : readOnlyFields) {
                if (readOnlyFieldsItem != null) {
                    ReadOnlyFieldInfoJsonMarshaller.getInstance().marshall(readOnlyFieldsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (taskTemplateConstraints.getInvisibleFields() != null) {
            java.util.List<InvisibleFieldInfo> invisibleFields = taskTemplateConstraints
                    .getInvisibleFields();
            jsonWriter.name("InvisibleFields");
            jsonWriter.beginArray();
            for (InvisibleFieldInfo invisibleFieldsItem : invisibleFields) {
                if (invisibleFieldsItem != null) {
                    InvisibleFieldInfoJsonMarshaller.getInstance().marshall(invisibleFieldsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TaskTemplateConstraintsJsonMarshaller instance;

    public static TaskTemplateConstraintsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TaskTemplateConstraintsJsonMarshaller();
        return instance;
    }
}
