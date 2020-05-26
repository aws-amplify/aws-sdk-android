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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Ingestion
 */
class IngestionJsonMarshaller {

    public void marshall(Ingestion ingestion, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (ingestion.getArn() != null) {
            String arn = ingestion.getArn();
            jsonWriter.name("Arn");
            jsonWriter.value(arn);
        }
        if (ingestion.getIngestionId() != null) {
            String ingestionId = ingestion.getIngestionId();
            jsonWriter.name("IngestionId");
            jsonWriter.value(ingestionId);
        }
        if (ingestion.getIngestionStatus() != null) {
            String ingestionStatus = ingestion.getIngestionStatus();
            jsonWriter.name("IngestionStatus");
            jsonWriter.value(ingestionStatus);
        }
        if (ingestion.getErrorInfo() != null) {
            ErrorInfo errorInfo = ingestion.getErrorInfo();
            jsonWriter.name("ErrorInfo");
            ErrorInfoJsonMarshaller.getInstance().marshall(errorInfo, jsonWriter);
        }
        if (ingestion.getRowInfo() != null) {
            RowInfo rowInfo = ingestion.getRowInfo();
            jsonWriter.name("RowInfo");
            RowInfoJsonMarshaller.getInstance().marshall(rowInfo, jsonWriter);
        }
        if (ingestion.getQueueInfo() != null) {
            QueueInfo queueInfo = ingestion.getQueueInfo();
            jsonWriter.name("QueueInfo");
            QueueInfoJsonMarshaller.getInstance().marshall(queueInfo, jsonWriter);
        }
        if (ingestion.getCreatedTime() != null) {
            java.util.Date createdTime = ingestion.getCreatedTime();
            jsonWriter.name("CreatedTime");
            jsonWriter.value(createdTime);
        }
        if (ingestion.getIngestionTimeInSeconds() != null) {
            Long ingestionTimeInSeconds = ingestion.getIngestionTimeInSeconds();
            jsonWriter.name("IngestionTimeInSeconds");
            jsonWriter.value(ingestionTimeInSeconds);
        }
        if (ingestion.getIngestionSizeInBytes() != null) {
            Long ingestionSizeInBytes = ingestion.getIngestionSizeInBytes();
            jsonWriter.name("IngestionSizeInBytes");
            jsonWriter.value(ingestionSizeInBytes);
        }
        if (ingestion.getRequestSource() != null) {
            String requestSource = ingestion.getRequestSource();
            jsonWriter.name("RequestSource");
            jsonWriter.value(requestSource);
        }
        if (ingestion.getRequestType() != null) {
            String requestType = ingestion.getRequestType();
            jsonWriter.name("RequestType");
            jsonWriter.value(requestType);
        }
        jsonWriter.endObject();
    }

    private static IngestionJsonMarshaller instance;

    public static IngestionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IngestionJsonMarshaller();
        return instance;
    }
}
