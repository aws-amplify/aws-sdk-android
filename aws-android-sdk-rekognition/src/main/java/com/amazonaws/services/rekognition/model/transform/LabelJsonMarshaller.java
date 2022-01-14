/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Label
 */
class LabelJsonMarshaller {

    public void marshall(Label label, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (label.getName() != null) {
            String name = label.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (label.getConfidence() != null) {
            Float confidence = label.getConfidence();
            jsonWriter.name("Confidence");
            jsonWriter.value(confidence);
        }
        if (label.getInstances() != null) {
            java.util.List<Instance> instances = label.getInstances();
            jsonWriter.name("Instances");
            jsonWriter.beginArray();
            for (Instance instancesItem : instances) {
                if (instancesItem != null) {
                    InstanceJsonMarshaller.getInstance().marshall(instancesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (label.getParents() != null) {
            java.util.List<Parent> parents = label.getParents();
            jsonWriter.name("Parents");
            jsonWriter.beginArray();
            for (Parent parentsItem : parents) {
                if (parentsItem != null) {
                    ParentJsonMarshaller.getInstance().marshall(parentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static LabelJsonMarshaller instance;

    public static LabelJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelJsonMarshaller();
        return instance;
    }
}
