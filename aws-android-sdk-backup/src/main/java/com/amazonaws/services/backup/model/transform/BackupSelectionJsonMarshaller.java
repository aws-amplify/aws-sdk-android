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
 * JSON marshaller for POJO BackupSelection
 */
class BackupSelectionJsonMarshaller {

    public void marshall(BackupSelection backupSelection, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (backupSelection.getSelectionName() != null) {
            String selectionName = backupSelection.getSelectionName();
            jsonWriter.name("SelectionName");
            jsonWriter.value(selectionName);
        }
        if (backupSelection.getIamRoleArn() != null) {
            String iamRoleArn = backupSelection.getIamRoleArn();
            jsonWriter.name("IamRoleArn");
            jsonWriter.value(iamRoleArn);
        }
        if (backupSelection.getResources() != null) {
            java.util.List<String> resources = backupSelection.getResources();
            jsonWriter.name("Resources");
            jsonWriter.beginArray();
            for (String resourcesItem : resources) {
                if (resourcesItem != null) {
                    jsonWriter.value(resourcesItem);
                }
            }
            jsonWriter.endArray();
        }
        if (backupSelection.getListOfTags() != null) {
            java.util.List<Condition> listOfTags = backupSelection.getListOfTags();
            jsonWriter.name("ListOfTags");
            jsonWriter.beginArray();
            for (Condition listOfTagsItem : listOfTags) {
                if (listOfTagsItem != null) {
                    ConditionJsonMarshaller.getInstance().marshall(listOfTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BackupSelectionJsonMarshaller instance;

    public static BackupSelectionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackupSelectionJsonMarshaller();
        return instance;
    }
}
