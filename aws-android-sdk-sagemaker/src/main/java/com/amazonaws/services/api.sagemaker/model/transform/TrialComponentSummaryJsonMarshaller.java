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
 * JSON marshaller for POJO TrialComponentSummary
 */
class TrialComponentSummaryJsonMarshaller {

    public void marshall(TrialComponentSummary trialComponentSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (trialComponentSummary.getTrialComponentName() != null) {
            String trialComponentName = trialComponentSummary.getTrialComponentName();
            jsonWriter.name("TrialComponentName");
            jsonWriter.value(trialComponentName);
        }
        if (trialComponentSummary.getTrialComponentArn() != null) {
            String trialComponentArn = trialComponentSummary.getTrialComponentArn();
            jsonWriter.name("TrialComponentArn");
            jsonWriter.value(trialComponentArn);
        }
        if (trialComponentSummary.getDisplayName() != null) {
            String displayName = trialComponentSummary.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (trialComponentSummary.getTrialComponentSource() != null) {
            TrialComponentSource trialComponentSource = trialComponentSummary
                    .getTrialComponentSource();
            jsonWriter.name("TrialComponentSource");
            TrialComponentSourceJsonMarshaller.getInstance().marshall(trialComponentSource,
                    jsonWriter);
        }
        if (trialComponentSummary.getStatus() != null) {
            TrialComponentStatus status = trialComponentSummary.getStatus();
            jsonWriter.name("Status");
            TrialComponentStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (trialComponentSummary.getStartTime() != null) {
            java.util.Date startTime = trialComponentSummary.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (trialComponentSummary.getEndTime() != null) {
            java.util.Date endTime = trialComponentSummary.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (trialComponentSummary.getCreationTime() != null) {
            java.util.Date creationTime = trialComponentSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trialComponentSummary.getCreatedBy() != null) {
            UserContext createdBy = trialComponentSummary.getCreatedBy();
            jsonWriter.name("CreatedBy");
            UserContextJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (trialComponentSummary.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trialComponentSummary.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (trialComponentSummary.getLastModifiedBy() != null) {
            UserContext lastModifiedBy = trialComponentSummary.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            UserContextJsonMarshaller.getInstance().marshall(lastModifiedBy, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrialComponentSummaryJsonMarshaller instance;

    public static TrialComponentSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentSummaryJsonMarshaller();
        return instance;
    }
}
