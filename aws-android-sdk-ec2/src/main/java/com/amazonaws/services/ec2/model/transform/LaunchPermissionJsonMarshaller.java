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
 * JSON marshaller for POJO LaunchPermission
 */
class LaunchPermissionJsonMarshaller {

    public void marshall(LaunchPermission launchPermission, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (launchPermission.getGroup() != null) {
            String group = launchPermission.getGroup();
            jsonWriter.name("Group");
            jsonWriter.value(group);
        }
        if (launchPermission.getUserId() != null) {
            String userId = launchPermission.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        jsonWriter.endObject();
    }

    private static LaunchPermissionJsonMarshaller instance;

    public static LaunchPermissionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LaunchPermissionJsonMarshaller();
        return instance;
    }
}
