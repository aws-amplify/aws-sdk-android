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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO OptionStatus
 */
class OptionStatusJsonMarshaller {

    public void marshall(OptionStatus optionStatus, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (optionStatus.getCreationDate() != null) {
            java.util.Date creationDate = optionStatus.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (optionStatus.getUpdateDate() != null) {
            java.util.Date updateDate = optionStatus.getUpdateDate();
            jsonWriter.name("UpdateDate");
            jsonWriter.value(updateDate);
        }
        if (optionStatus.getUpdateVersion() != null) {
            Integer updateVersion = optionStatus.getUpdateVersion();
            jsonWriter.name("UpdateVersion");
            jsonWriter.value(updateVersion);
        }
        if (optionStatus.getState() != null) {
            String state = optionStatus.getState();
            jsonWriter.name("State");
            jsonWriter.value(state);
        }
        if (optionStatus.getPendingDeletion() != null) {
            Boolean pendingDeletion = optionStatus.getPendingDeletion();
            jsonWriter.name("PendingDeletion");
            jsonWriter.value(pendingDeletion);
        }
        jsonWriter.endObject();
    }

    private static OptionStatusJsonMarshaller instance;

    public static OptionStatusJsonMarshaller getInstance() {
        if (instance == null)
            instance = new OptionStatusJsonMarshaller();
        return instance;
    }
}
