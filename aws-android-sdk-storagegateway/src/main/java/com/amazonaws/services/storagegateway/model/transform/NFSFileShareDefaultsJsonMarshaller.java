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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO NFSFileShareDefaults
 */
class NFSFileShareDefaultsJsonMarshaller {

    public void marshall(NFSFileShareDefaults nFSFileShareDefaults, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (nFSFileShareDefaults.getFileMode() != null) {
            String fileMode = nFSFileShareDefaults.getFileMode();
            jsonWriter.name("FileMode");
            jsonWriter.value(fileMode);
        }
        if (nFSFileShareDefaults.getDirectoryMode() != null) {
            String directoryMode = nFSFileShareDefaults.getDirectoryMode();
            jsonWriter.name("DirectoryMode");
            jsonWriter.value(directoryMode);
        }
        if (nFSFileShareDefaults.getGroupId() != null) {
            Long groupId = nFSFileShareDefaults.getGroupId();
            jsonWriter.name("GroupId");
            jsonWriter.value(groupId);
        }
        if (nFSFileShareDefaults.getOwnerId() != null) {
            Long ownerId = nFSFileShareDefaults.getOwnerId();
            jsonWriter.name("OwnerId");
            jsonWriter.value(ownerId);
        }
        jsonWriter.endObject();
    }

    private static NFSFileShareDefaultsJsonMarshaller instance;

    public static NFSFileShareDefaultsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new NFSFileShareDefaultsJsonMarshaller();
        return instance;
    }
}
