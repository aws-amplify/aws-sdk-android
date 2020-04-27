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
 * JSON marshaller for POJO Experiment
 */
class ExperimentJsonMarshaller {

    public void marshall(Experiment experiment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (experiment.getExperimentName() != null) {
            String experimentName = experiment.getExperimentName();
            jsonWriter.name("ExperimentName");
            jsonWriter.value(experimentName);
        }
        if (experiment.getExperimentArn() != null) {
            String experimentArn = experiment.getExperimentArn();
            jsonWriter.name("ExperimentArn");
            jsonWriter.value(experimentArn);
        }
        if (experiment.getDisplayName() != null) {
            String displayName = experiment.getDisplayName();
            jsonWriter.name("DisplayName");
            jsonWriter.value(displayName);
        }
        if (experiment.getSource() != null) {
            ExperimentSource source = experiment.getSource();
            jsonWriter.name("Source");
            ExperimentSourceJsonMarshaller.getInstance().marshall(source, jsonWriter);
        }
        if (experiment.getDescription() != null) {
            String description = experiment.getDescription();
            jsonWriter.name("Description");
            jsonWriter.value(description);
        }
        if (experiment.getCreationTime() != null) {
            java.util.Date creationTime = experiment.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (experiment.getCreatedBy() != null) {
            UserContext createdBy = experiment.getCreatedBy();
            jsonWriter.name("CreatedBy");
            UserContextJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        if (experiment.getLastModifiedTime() != null) {
            java.util.Date lastModifiedTime = experiment.getLastModifiedTime();
            jsonWriter.name("LastModifiedTime");
            jsonWriter.value(lastModifiedTime);
        }
        if (experiment.getLastModifiedBy() != null) {
            UserContext lastModifiedBy = experiment.getLastModifiedBy();
            jsonWriter.name("LastModifiedBy");
            UserContextJsonMarshaller.getInstance().marshall(lastModifiedBy, jsonWriter);
        }
        if (experiment.getTags() != null) {
            java.util.List<Tag> tags = experiment.getTags();
            jsonWriter.name("Tags");
            jsonWriter.beginArray();
            for (Tag tagsItem : tags) {
                if (tagsItem != null) {
                    TagJsonMarshaller.getInstance().marshall(tagsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ExperimentJsonMarshaller instance;

    public static ExperimentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentJsonMarshaller();
        return instance;
    }
}
