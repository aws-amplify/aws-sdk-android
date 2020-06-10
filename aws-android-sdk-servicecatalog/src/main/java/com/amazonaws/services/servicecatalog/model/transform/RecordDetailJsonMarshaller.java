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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RecordDetail
 */
class RecordDetailJsonMarshaller {

    public void marshall(RecordDetail recordDetail, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (recordDetail.getRecordId() != null) {
            String recordId = recordDetail.getRecordId();
            jsonWriter.name("RecordId");
            jsonWriter.value(recordId);
        }
        if (recordDetail.getProvisionedProductName() != null) {
            String provisionedProductName = recordDetail.getProvisionedProductName();
            jsonWriter.name("ProvisionedProductName");
            jsonWriter.value(provisionedProductName);
        }
        if (recordDetail.getStatus() != null) {
            String status = recordDetail.getStatus();
            jsonWriter.name("Status");
            jsonWriter.value(status);
        }
        if (recordDetail.getCreatedTime() != null) {
            java.util.Date createdTime = recordDetail.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (recordDetail.getUpdatedTime() != null) {
            java.util.Date updatedTime = recordDetail.getUpdatedTime();
            jsonWriter.name("UpdatedTime");
            jsonWriter.value(updatedTime);
        }
        if (recordDetail.getProvisionedProductType() != null) {
            String provisionedProductType = recordDetail.getProvisionedProductType();
            jsonWriter.name("ProvisionedProductType");
            jsonWriter.value(provisionedProductType);
        }
        if (recordDetail.getRecordType() != null) {
            String recordType = recordDetail.getRecordType();
            jsonWriter.name("RecordType");
            jsonWriter.value(recordType);
        }
        if (recordDetail.getProvisionedProductId() != null) {
            String provisionedProductId = recordDetail.getProvisionedProductId();
            jsonWriter.name("ProvisionedProductId");
            jsonWriter.value(provisionedProductId);
        }
        if (recordDetail.getProductId() != null) {
            String productId = recordDetail.getProductId();
            jsonWriter.name("ProductId");
            jsonWriter.value(productId);
        }
        if (recordDetail.getProvisioningArtifactId() != null) {
            String provisioningArtifactId = recordDetail.getProvisioningArtifactId();
            jsonWriter.name("ProvisioningArtifactId");
            jsonWriter.value(provisioningArtifactId);
        }
        if (recordDetail.getPathId() != null) {
            String pathId = recordDetail.getPathId();
            jsonWriter.name("PathId");
            jsonWriter.value(pathId);
        }
        if (recordDetail.getRecordErrors() != null) {
            java.util.List<RecordError> recordErrors = recordDetail.getRecordErrors();
            jsonWriter.name("RecordErrors");
            jsonWriter.beginArray();
            for (RecordError recordErrorsItem : recordErrors) {
                if (recordErrorsItem != null) {
                    RecordErrorJsonMarshaller.getInstance().marshall(recordErrorsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (recordDetail.getRecordTags() != null) {
            java.util.List<RecordTag> recordTags = recordDetail.getRecordTags();
            jsonWriter.name("RecordTags");
            jsonWriter.beginArray();
            for (RecordTag recordTagsItem : recordTags) {
                if (recordTagsItem != null) {
                    RecordTagJsonMarshaller.getInstance().marshall(recordTagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static RecordDetailJsonMarshaller instance;

    public static RecordDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RecordDetailJsonMarshaller();
        return instance;
    }
}
