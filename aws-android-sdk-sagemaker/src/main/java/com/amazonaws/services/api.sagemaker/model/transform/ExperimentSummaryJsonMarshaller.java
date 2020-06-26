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
 * JSON marshaller for POJO ExperimentSummary
 */
class ExperimentSummaryJsonMarshaller {

    public void marshall(ExperimentSummary experimentSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (experimentSummary.getExperimentArn() != null) {
            String experimentArn = experimentSummary.getExperimentArn();
            jsonWriter.name("ExperimentArn");
            jsonWriter.value(experimentArn);
        }
        if (experimentSummary.getExperimentName() != null) {
            String experimentName = experimentSummary.getExperimentName();
            jsonWriter.name("ExperimentName");
            jsonWriter.value(experimentName);
        }
        if (experimentSummary.getDisplayName() != null) {
            String displayName = experimentSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (experimentSummary.getExperimentSource() != null) {
            ExperimentSource experimentSource = experimentSummary.getExperimentSource();
            jsonWriter.name("ExperimentSource");
            ExperimentSourceJsonMarshaller.getInstance().marshall(experimentSource, jsonWriter);
        }
        if (experimentSummary.getCreationTime() != null) {
            java.util.Date creationTime = experimentSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (experimentSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = experimentSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static ExperimentSummaryJsonMarshaller instance;

    public static ExperimentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentSummaryJsonMarshaller();
        return instance;
    }
}
