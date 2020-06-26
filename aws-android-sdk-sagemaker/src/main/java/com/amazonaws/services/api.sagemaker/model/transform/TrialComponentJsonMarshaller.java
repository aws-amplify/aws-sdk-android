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
 * JSON marshaller for POJO TrialComponent
 */
class TrialComponentJsonMarshaller {

    public void marshall(TrialComponent trialComponent, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialComponent.getTrialComponentName() != null) {
            String trialComponentName = trialComponent.getTrialComponentName();
            jsonWriter.name("TrialComponentName");
            jsonWriter.value(trialComponentName);
        }
        if (trialComponent.getDisplayName() != null) {
            String displayName = trialComponent.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (trialComponent.getTrialComponentArn() != null) {
            String trialComponentArn = trialComponent.getTrialComponentArn();
            jsonWriter.name("TrialComponentArn");
            jsonWriter.value(trialComponentArn);
        }
        if (trialComponent.getSource() != null) {
            TrialComponentSource source = trialComponent.getSource();
            jsonWriter.name("Source");
            TrialComponentSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (trialComponent.getStatus() != null) {
            TrialComponentStatus status = trialComponent.getStatus();
            jsonWriter.name("Status");
            TrialComponentStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (trialComponent.getStartTime() != null) {
            java.util.Date startTime = trialComponent.getStartTime();
            jsonWriter.name("StartTime");
            jsonWriter.value(startTime);
        }
        if (trialComponent.getEndTime() != null) {
            java.util.Date endTime = trialComponent.getEndTime();
            jsonWriter.name("EndTime");
            jsonWriter.value(endTime);
        }
        if (trialComponent.getCreationTime() != null) {
            java.util.Date creationTime = trialComponent.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trialComponent.getCreatedBy() != null) {
            UserContext createdBy = trialComponent.getCreatedBy();
            jsonWriter.name("CreatedBy");
            UserContextJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (trialComponent.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = trialComponent.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (trialComponent.getLastModifiedBy() != null) {
            UserContext lastModifiedBy = trialComponent.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            UserContextJsonMarshaller.getInstance().marshall(lastModifiedBy, jsonWriter);
        }
        if (trialComponent.getParameters() != null) {
            java.util.Map<String, TrialComponentParameterValue> parameters = trialComponent
                    .getParameters();
            jsonWriter.name("Parameters");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, TrialComponentParameterValue> parametersEntry : parameters
                    .entrySet()) {
                TrialComponentParameterValue parametersValue = parametersEntry.getValue();
                if (parametersValue != null) {
                    jsonWriter.name(parametersEntry.getKey());
                    TrialComponentParameterValueJsonMarshaller.getInstance().marshall(
                            parametersValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (trialComponent.getInputArtifacts() != null) {
            java.util.Map<String, TrialComponentArtifact> inputArtifacts = trialComponent
                    .getInputArtifacts();
            jsonWriter.name("InputArtifacts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, TrialComponentArtifact> inputArtifactsEntry : inputArtifacts
                    .entrySet()) {
                TrialComponentArtifact inputArtifactsValue = inputArtifactsEntry.getValue();
                if (inputArtifactsValue != null) {
                    jsonWriter.name(inputArtifactsEntry.getKey());
                    TrialComponentArtifactJsonMarshaller.getInstance().marshall(
                            inputArtifactsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (trialComponent.getOutputArtifacts() != null) {
            java.util.Map<String, TrialComponentArtifact> outputArtifacts = trialComponent
                    .getOutputArtifacts();
            jsonWriter.name("OutputArtifacts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, TrialComponentArtifact> outputArtifactsEntry : outputArtifacts
                    .entrySet()) {
                TrialComponentArtifact outputArtifactsValue = outputArtifactsEntry.getValue();
                if (outputArtifactsValue != null) {
                    jsonWriter.name(outputArtifactsEntry.getKey());
                    TrialComponentArtifactJsonMarshaller.getInstance().marshall(
                            outputArtifactsValue, jsonWriter);
                }
            }
            jsonWriter.endObject();
        }
        if (trialComponent.getMetrics() != null) {
            java.util.List<TrialComponentMetricSummary> metrics = trialComponent.getMetrics();
            jsonWriter.name("Metrics");
            jsonWriter.beginArray();
            for (TrialComponentMetricSummary metricsItem : metrics) {
                if (metricsItem != null) {
                    TrialComponentMetricSummaryJsonMarshaller.getInstance().marshall(metricsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trialComponent.getSourceDetail() != null) {
            TrialComponentSourceDetail sourceDetail = trialComponent.getSourceDetail();
            jsonWriter.name("SourceDetail");
            TrialComponentSourceDetailJsonMarshaller.getInstance().marshall(sourceDetail,
                    jsonWriter);
        }
        if (trialComponent.getTags() != null) {
            java.util.List<Tag> tags = trialComponent.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (trialComponent.getParents() != null) {
            java.util.List<Parent> parents = trialComponent.getParents();
            jsonWriter.name("Parents");
            jsonWriter.beginArray();
            for (Parent parentsItem : parents) {
                if (parentsItem != null) {
                    ParentJsonMarshaller.getInstance().marshall(parentsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static TrialComponentJsonMarshaller instance;

    public static TrialComponentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentJsonMarshaller();
        return instance;
    }
}
