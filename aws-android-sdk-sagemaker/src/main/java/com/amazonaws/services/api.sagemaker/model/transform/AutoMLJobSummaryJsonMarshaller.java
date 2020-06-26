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

package com.amazonaws.services.api.sagemaker.model.transform;

import com.amazonaws.services.api.sagemaker.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AutoMLJobSummary
 */
class AutoMLJobSummaryJsonMarshaller {

    public void marshall(AutoMLJobSummary autoMLJobSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoMLJobSummary.getAutoMLJobName() != null) {
            String autoMLJobName = autoMLJobSummary.getAutoMLJobName();
            jsonWriter.name("AutoMLJobName");
            jsonWriter.value(autoMLJobName);
        }
        if (autoMLJobSummary.getAutoMLJobArn() != null) {
            String autoMLJobArn = autoMLJobSummary.getAutoMLJobArn();
            jsonWriter.name("AutoMLJobArn");
            jsonWriter.value(autoMLJobArn);
        }
        if (autoMLJobSummary.getAutoMLJobStatus() != null) {
            String autoMLJobStatus = autoMLJobSummary.getAutoMLJobStatus();
            jsonWriter.name("AutoMLJobStatus");
            jsonWriter.value(autoMLJobStatus);
        }
        if (autoMLJobSummary.getAutoMLJobSecondaryStatus() != null) {
            String autoMLJobSecondaryStatus = autoMLJobSummary.getAutoMLJobSecondaryStatus();
            jsonWriter.name("AutoMLJobSecondaryStatus");
            jsonWriter.value(autoMLJobSecondaryStatus);
        }
        if (autoMLJobSummary.getCreationTime() != null) {
            java.util.Date creationTime = autoMLJobSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (autoMLJobSummary.getEndTime() != null) {
            java.util.Date endTime = autoMLJobSummary.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (autoMLJobSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = autoMLJobSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (autoMLJobSummary.getFailureReason() != null) {
            String failureReason = autoMLJobSummary.getFailureReason();
            jsonWriter.name("FailureReason");
            jsonWriter.value(failureReason);
        }
        jsonWriter.endObject();
    }

    private static AutoMLJobSummaryJsonMarshaller instance;

    public static AutoMLJobSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLJobSummaryJsonMarshaller();
        return instance;
    }
}
