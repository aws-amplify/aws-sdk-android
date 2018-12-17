/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cognitosync.model.transform;

import com.amazonaws.services.cognitosync.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Dataset
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 * @deprecated The Amazon Cognito Sync SDK for Android is deprecated as of release 2.9.0. Please use the AWS AppSync SDK for Android along with AWS AppSync service instead.
 */
@Deprecated
class DatasetJsonMarshaller {

    public void marshall(Dataset dataset, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dataset.getIdentityId() != null) {
            String identityId = dataset.getIdentityId();
            jsonWriter.name("IdentityId");
            jsonWriter.value(identityId);
        }
        if (dataset.getDatasetName() != null) {
            String datasetName = dataset.getDatasetName();
            jsonWriter.name("DatasetName");
            jsonWriter.value(datasetName);
        }
        if (dataset.getCreationDate() != null) {
            java.util.Date creationDate = dataset.getCreationDate();
            jsonWriter.name("CreationDate");
            jsonWriter.value(creationDate);
        }
        if (dataset.getLastModifiedDate() != null) {
            java.util.Date lastModifiedDate = dataset.getLastModifiedDate();
            jsonWriter.name("LastModifiedDate");
            jsonWriter.value(lastModifiedDate);
        }
        if (dataset.getLastModifiedBy() != null) {
            String lastModifiedBy = dataset.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            jsonWriter.value(lastModifiedBy);
        }
        if (dataset.getDataStorage() != null) {
            Long dataStorage = dataset.getDataStorage();
            jsonWriter.name("DataStorage");
            jsonWriter.value(dataStorage);
        }
        if (dataset.getNumRecords() != null) {
            Long numRecords = dataset.getNumRecords();
            jsonWriter.name("NumRecords");
            jsonWriter.value(numRecords);
        }
        jsonWriter.endObject();
    }

    private static DatasetJsonMarshaller instance;

    public static DatasetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetJsonMarshaller();
        return instance;
    }
}
