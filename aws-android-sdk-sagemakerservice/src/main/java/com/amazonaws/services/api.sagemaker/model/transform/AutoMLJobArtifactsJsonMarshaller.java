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
 * JSON marshaller for POJO AutoMLJobArtifacts
 */
class AutoMLJobArtifactsJsonMarshaller {

    public void marshall(AutoMLJobArtifacts autoMLJobArtifacts, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (autoMLJobArtifacts.getCandidateDefinitionNotebookLocation() != null) {
            String candidateDefinitionNotebookLocation = autoMLJobArtifacts
                    .getCandidateDefinitionNotebookLocation();
            jsonWriter.name("CandidateDefinitionNotebookLocation");
            jsonWriter.value(candidateDefinitionNotebookLocation);
        }
        if (autoMLJobArtifacts.getDataExplorationNotebookLocation() != null) {
            String dataExplorationNotebookLocation = autoMLJobArtifacts
                    .getDataExplorationNotebookLocation();
            jsonWriter.name("DataExplorationNotebookLocation");
            jsonWriter.value(dataExplorationNotebookLocation);
        }
        jsonWriter.endObject();
    }

    private static AutoMLJobArtifactsJsonMarshaller instance;

    public static AutoMLJobArtifactsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AutoMLJobArtifactsJsonMarshaller();
        return instance;
    }
}
