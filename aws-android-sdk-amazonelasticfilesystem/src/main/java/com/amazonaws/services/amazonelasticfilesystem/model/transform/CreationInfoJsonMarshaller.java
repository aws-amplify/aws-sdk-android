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

package com.amazonaws.services.amazonelasticfilesystem.model.transform;

import com.amazonaws.services.amazonelasticfilesystem.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CreationInfo
 */
class CreationInfoJsonMarshaller {

    public void marshall(CreationInfo creationInfo, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (creationInfo.getOwnerUid() != null) {
            Long ownerUid = creationInfo.getOwnerUid();
            jsonWriter.name("OwnerUid");
            jsonWriter.value(ownerUid);
        }
        if (creationInfo.getOwnerGid() != null) {
            Long ownerGid = creationInfo.getOwnerGid();
            jsonWriter.name("OwnerGid");
            jsonWriter.value(ownerGid);
        }
        if (creationInfo.getPermissions() != null) {
            String permissions = creationInfo.getPermissions();
            jsonWriter.name("Permissions");
            jsonWriter.value(permissions);
        }
        jsonWriter.endObject();
    }

    private static CreationInfoJsonMarshaller instance;

    public static CreationInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CreationInfoJsonMarshaller();
        return instance;
    }
}
