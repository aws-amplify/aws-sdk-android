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

package com.amazonaws.services.macie2.model.transform;

import com.amazonaws.services.macie2.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ClassificationDetails
 */
class ClassificationDetailsJsonMarshaller {

    public void marshall(ClassificationDetails classificationDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (classificationDetails.getDetailedResultsLocation() != null) {
            String detailedResultsLocation = classificationDetails.getDetailedResultsLocation();
            jsonWriter.name("detailedResultsLocation");
            jsonWriter.value(detailedResultsLocation);
        }
        if (classificationDetails.getJobArn() != null) {
            String jobArn = classificationDetails.getJobArn();
            jsonWriter.name("jobArn");
            jsonWriter.value(jobArn);
        }
        if (classificationDetails.getJobId() != null) {
            String jobId = classificationDetails.getJobId();
            jsonWriter.name("jobId");
            jsonWriter.value(jobId);
        }
        if (classificationDetails.getResult() != null) {
            ClassificationResult result = classificationDetails.getResult();
            jsonWriter.name("result");
            ClassificationResultJsonMarshaller.getInstance().marshall(result, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static ClassificationDetailsJsonMarshaller instance;

    public static ClassificationDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ClassificationDetailsJsonMarshaller();
        return instance;
    }
}
