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
 * JSON marshaller for POJO TrialSummary
 */
class TrialSummaryJsonMarshaller {

    public void marshall(TrialSummary trialSummary, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialSummary.getTrialArn() != null) {
            String trialArn = trialSummary.getTrialArn();
            jsonWriter.name("TrialArn");
            jsonWriter.value(trialArn);
        }
        if (trialSummary.getTrialName() != null) {
            String trialName = trialSummary.getTrialName();
            jsonWriter.name("TrialName");
            jsonWriter.value(trialName);
        }
        if (trialSummary.getDisplayName() != null) {
            String displayName = trialSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (trialSummary.getTrialSource() != null) {
            TrialSource trialSource = trialSummary.getTrialSource();
            jsonWriter.name("TrialSource");
            TrialSourceJsonMarshaller.getInstance().marshall(trialSource, jsonWriter);
        }
        if (trialSummary.getCreationTime() != null) {
            java.util.Date creationTime = trialSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trialSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trialSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        jsonWriter.endObject();
    }

    private static TrialSummaryJsonMarshaller instance;

    public static TrialSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialSummaryJsonMarshaller();
        return instance;
    }
}
