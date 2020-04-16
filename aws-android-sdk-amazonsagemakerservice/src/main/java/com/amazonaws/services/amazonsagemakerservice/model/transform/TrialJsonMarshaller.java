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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO Trial
 */
class TrialJsonMarshaller {

    public void marshall(Trial trial, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trial.getTrialName() != null) {
            String trialName = trial.getTrialName();
            jsonWriter.name("TrialName");
            jsonWriter.value(trialName);
        }
        if (trial.getTrialArn() != null) {
            String trialArn = trial.getTrialArn();
            jsonWriter.name("TrialArn");
            jsonWriter.value(trialArn);
        }
        if (trial.getDisplayName() != null) {
            String displayName = trial.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (trial.getExperimentName() != null) {
            String experimentName = trial.getExperimentName();
            jsonWriter.name("ExperimentName");
            jsonWriter.value(experimentName);
        }
        if (trial.getSource() != null) {
            TrialSource source = trial.getSource();
            jsonWriter.name("Source");
            TrialSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (trial.getCreationTime() != null) {
            java.util.Date creationTime = trial.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trial.getCreatedBy() != null) {
            UserContext createdBy = trial.getCreatedBy();
            jsonWriter.name("CreatedBy");
            UserContextJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (trial.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trial.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (trial.getLastModifiedBy() != null) {
            UserContext lastModifiedBy = trial.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            UserContextJsonMarshaller.getInstance().marshall(lastModifiedBy, jsonWriter);
        }
        if (trial.getTags() != null) {
            java.util.List<Tag> tags = trial.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trial.getTrialComponentSummaries() != null) {
            java.util.List<TrialComponentSimpleSummary> trialComponentSummaries = trial
                    .getTrialComponentSummaries();
            jsonWriter.name("TrialComponentSummaries");
            jsonWriter.beginArray();
            for (TrialComponentSimpleSummary trialComponentSummariesItem : trialComponentSummaries) {
                if (trialComponentSummariesItem != null) {
                    TrialComponentSimpleSummaryJsonMarshaller.getInstance().marshall(
                            trialComponentSummariesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrialJsonMarshaller instance;

    public static TrialJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialJsonMarshaller();
        return instance;
    }
}
