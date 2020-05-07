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
 * JSON marshaller for POJO LoadPermissionRequest
 */
class LoadPermissionRequestJsonMarshaller {

    public void marshall(LoadPermissionRequest loadPermissionRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (loadPermissionRequest.getGroup() != null) {
            String group = loadPermissionRequest.getGroup();
            jsonWriter.name("Group");
            jsonWriter.value(group);
        }
        if (loadPermissionRequest.getUserId() != null) {
            String userId = loadPermissionRequest.getUserId();
            jsonWriter.name("UserId");
            jsonWriter.value(userId);
        }
        jsonWriter.endObject();
    }

    private static LoadPermissionRequestJsonMarshaller instance;

    public static LoadPermissionRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LoadPermissionRequestJsonMarshaller();
        return instance;
    }
}
