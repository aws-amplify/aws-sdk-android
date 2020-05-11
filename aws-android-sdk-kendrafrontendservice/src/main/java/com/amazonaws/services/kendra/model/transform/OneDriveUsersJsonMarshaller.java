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

package com.amazonaws.services.kendra.model.transform;

import com.amazonaws.services.kendra.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OneDriveUsers
 */
class OneDriveUsersJsonMarshaller {

    public void marshall(OneDriveUsers oneDriveUsers, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (oneDriveUsers.getOneDriveUserList() != null) {
            java.util.List<String> oneDriveUserList = oneDriveUsers.getOneDriveUserList();
            jsonWriter.name("OneDriveUserList");
            jsonWriter.beginArray();
            for (String oneDriveUserListItem : oneDriveUserList) {
                if (oneDriveUserListItem != null) {
                    jsonWriter.value(oneDriveUserListItem);
                }
            }
            jsonWriter.endArray();
        }
        if (oneDriveUsers.getOneDriveUserS3Path() != null) {
            S3Path oneDriveUserS3Path = oneDriveUsers.getOneDriveUserS3Path();
            jsonWriter.name("OneDriveUserS3Path");
            S3PathJsonMarshaller.getInstance().marshall(oneDriveUserS3Path, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static OneDriveUsersJsonMarshaller instance;

    public static OneDriveUsersJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OneDriveUsersJsonMarshaller();
        return instance;
    }
}
