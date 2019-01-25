/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO GroupNameAndArn
 */
class GroupNameAndArnJsonMarshaller {

    public void marshall(GroupNameAndArn groupNameAndArn, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (groupNameAndArn.getGroupName() != null) {
            String groupName = groupNameAndArn.getGroupName();
            jsonWriter.name("groupName");
            jsonWriter.value(groupName);
        }
        if (groupNameAndArn.getGroupArn() != null) {
            String groupArn = groupNameAndArn.getGroupArn();
            jsonWriter.name("groupArn");
            jsonWriter.value(groupArn);
        }
        jsonWriter.endObject();
    }

    private static GroupNameAndArnJsonMarshaller instance;

    public static GroupNameAndArnJsonMarshaller getInstance() {
        if (instance == null)
            instance = new GroupNameAndArnJsonMarshaller();
        return instance;
    }
}
