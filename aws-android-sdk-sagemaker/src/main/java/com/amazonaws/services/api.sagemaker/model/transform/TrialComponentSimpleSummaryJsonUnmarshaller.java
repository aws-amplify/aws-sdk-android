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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrialComponentSimpleSummary
 */
class TrialComponentSimpleSummaryJsonUnmarshaller implements
        Unmarshaller<TrialComponentSimpleSummary, JsonUnmarshallerContext> {

    public TrialComponentSimpleSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrialComponentSimpleSummary trialComponentSimpleSummary = new TrialComponentSimpleSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrialComponentName")) {
                trialComponentSimpleSummary.setTrialComponentName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrialComponentArn")) {
                trialComponentSimpleSummary.setTrialComponentArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrialComponentSource")) {
                trialComponentSimpleSummary
                        .setTrialComponentSource(TrialComponentSourceJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                trialComponentSimpleSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                trialComponentSimpleSummary.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trialComponentSimpleSummary;
    }

    private static TrialComponentSimpleSummaryJsonUnmarshaller instance;

    public static TrialComponentSimpleSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentSimpleSummaryJsonUnmarshaller();
        return instance;
    }
}
