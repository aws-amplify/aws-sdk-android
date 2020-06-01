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
 * JSON marshaller for POJO TrialComponentSourceDetail
 */
class TrialComponentSourceDetailJsonMarshaller {

    public void marshall(TrialComponentSourceDetail trialComponentSourceDetail,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialComponentSourceDetail.getSourceArn() != null) {
            String sourceArn = trialComponentSourceDetail.getSourceArn();
            jsonWriter.name("SourceArn");
            jsonWriter.value(sourceArn);
        }
        if (trialComponentSourceDetail.getTrainingJob() != null) {
            TrainingJob trainingJob = trialComponentSourceDetail.getTrainingJob();
            jsonWriter.name("TrainingJob");
            TrainingJobJsonMarshaller.getInstance().marshall(trainingJob, jsonWriter);
        }
        if (trialComponentSourceDetail.getProcessingJob() != null) {
            ProcessingJob processingJob = trialComponentSourceDetail.getProcessingJob();
            jsonWriter.name("ProcessingJob");
            ProcessingJobJsonMarshaller.getInstance().marshall(processingJob, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrialComponentSourceDetailJsonMarshaller instance;

    public static TrialComponentSourceDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentSourceDetailJsonMarshaller();
        return instance;
    }
}
