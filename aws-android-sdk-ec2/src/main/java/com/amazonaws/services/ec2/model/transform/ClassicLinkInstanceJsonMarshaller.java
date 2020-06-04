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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClassicLinkInstance
 */
class ClassicLinkInstanceJsonMarshaller {

    public void marshall(ClassicLinkInstance classicLinkInstance, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classicLinkInstance.getGroups() != null) {
            java.util.List<GroupIdentifier> groups = classicLinkInstance.getGroups();
            jsonWriter.name("Groups");
            jsonWriter.beginArray();
            for (GroupIdentifier groupsItem : groups) {
                if (groupsItem != null) {
                    GroupIdentifierJsonMarshaller.getInstance().marshall(groupsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (classicLinkInstance.getInstanceId() != null) {
            String instanceId = classicLinkInstance.getInstanceId();
            jsonWriter.name("InstanceId");
            jsonWriter.value(instanceId);
        }
        if (classicLinkInstance.getTags() != null) {
            java.util.List<Tag> tags = classicLinkInstance.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (classicLinkInstance.getVpcId() != null) {
            String vpcId = classicLinkInstance.getVpcId();
            jsonWriter.name("VpcId");
            jsonWriter.value(vpcId);
        }
        jsonWriter.endObject();
    }

    private static ClassicLinkInstanceJsonMarshaller instance;

    public static ClassicLinkInstanceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassicLinkInstanceJsonMarshaller();
        return instance;
    }
}
