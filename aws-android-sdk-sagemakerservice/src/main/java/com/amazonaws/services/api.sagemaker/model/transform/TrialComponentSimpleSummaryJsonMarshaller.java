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
 * JSON marshaller for POJO TrialComponentSimpleSummary
 */
class TrialComponentSimpleSummaryJsonMarshaller {

    public void marshall(TrialComponentSimpleSummary trialComponentSimpleSummary,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (trialComponentSimpleSummary.getTrialComponentName() != null) {
            String trialComponentName = trialComponentSimpleSummary.getTrialComponentName();
            jsonWriter.name("TrialComponentName");
            jsonWriter.value(trialComponentName);
        }
        if (trialComponentSimpleSummary.getTrialComponentArn() != null) {
            String trialComponentArn = trialComponentSimpleSummary.getTrialComponentArn();
            jsonWriter.name("TrialComponentArn");
            jsonWriter.value(trialComponentArn);
        }
        if (trialComponentSimpleSummary.getTrialComponentSource() != null) {
            TrialComponentSource trialComponentSource = trialComponentSimpleSummary
                    .getTrialComponentSource();
            jsonWriter.name("TrialComponentSource");
            TrialComponentSourceJsonMarshaller.getInstance().marshall(trialComponentSource,
                    jsonWriter);
        }
        if (trialComponentSimpleSummary.getCreationTime() != null) {
            java.util.Date creationTime = trialComponentSimpleSummary.getCreationTime();
            jsonWriter.name("CreationTime");
            jsonWriter.value(creationTime);
        }
        if (trialComponentSimpleSummary.getCreatedBy() != null) {
            UserContext createdBy = trialComponentSimpleSummary.getCreatedBy();
            jsonWriter.name("CreatedBy");
            UserContextJsonMarshaller.getInstance().marshall(createdBy, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static TrialComponentSimpleSummaryJsonMarshaller instance;

    public static TrialComponentSimpleSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentSimpleSummaryJsonMarshaller();
        return instance;
    }
}
