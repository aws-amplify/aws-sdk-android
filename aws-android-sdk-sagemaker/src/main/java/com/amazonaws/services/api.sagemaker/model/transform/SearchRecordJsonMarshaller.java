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
 * JSON marshaller for POJO SearchRecord
 */
class SearchRecordJsonMarshaller {

    public void marshall(SearchRecord searchRecord, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (searchRecord.getTrainingJob() != null) {
            TrainingJob trainingJob = searchRecord.getTrainingJob();
            jsonWriter.name("TrainingJob");
            TrainingJobJsonMarshaller.getInstance().marshall(trainingJob, jsonWriter);
        }
        if (searchRecord.getExperiment() != null) {
            Experiment experiment = searchRecord.getExperiment();
            jsonWriter.name("Experiment");
            ExperimentJsonMarshaller.getInstance().marshall(experiment, jsonWriter);
        }
        if (searchRecord.getTrial() != null) {
            Trial trial = searchRecord.getTrial();
            jsonWriter.name("Trial");
            TrialJsonMarshaller.getInstance().marshall(trial, jsonWriter);
        }
        if (searchRecord.getTrialComponent() != null) {
            TrialComponent trialComponent = searchRecord.getTrialComponent();
            jsonWriter.name("TrialComponent");
            TrialComponentJsonMarshaller.getInstance().marshall(trialComponent, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static SearchRecordJsonMarshaller instance;

    public static SearchRecordJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SearchRecordJsonMarshaller();
        return instance;
    }
}
