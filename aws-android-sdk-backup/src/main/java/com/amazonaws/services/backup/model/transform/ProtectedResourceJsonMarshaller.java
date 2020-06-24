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

package com.amazonaws.services.backup.model.transform;

import com.amazonaws.services.backup.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ProtectedResource
 */
class ProtectedResourceJsonMarshaller {

    public void marshall(ProtectedResource protectedResource, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (protectedResource.getResourceArn() != null) {
            String resourceArn = protectedResource.getResourceArn();
            jsonWriter.name("ResourceArn");
            jsonWriter.value(resourceArn);
        }
        if (protectedResource.getResourceType() != null) {
            String resourceType = protectedResource.getResourceType();
            jsonWriter.name("ResourceType");
            jsonWriter.value(resourceType);
        }
        if (protectedResource.getLastBackupTime() != null) {
            java.util.Date lastBackupTime = protectedResource.getLastBackupTime();
            jsonWriter.name("LastBackupTime");
            jsonWriter.value(lastBackupTime);
        }
        jsonWriter.endObject();
    }

    private static ProtectedResourceJsonMarshaller instance;

    public static ProtectedResourceJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ProtectedResourceJsonMarshaller();
        return instance;
    }
}
