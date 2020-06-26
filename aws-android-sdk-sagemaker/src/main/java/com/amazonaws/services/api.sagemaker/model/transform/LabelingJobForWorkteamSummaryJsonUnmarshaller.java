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
 * JSON unmarshaller for POJO LabelingJobForWorkteamSummary
 */
class LabelingJobForWorkteamSummaryJsonUnmarshaller implements
        Unmarshaller<LabelingJobForWorkteamSummary, JsonUnmarshallerContext> {

    public LabelingJobForWorkteamSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        LabelingJobForWorkteamSummary labelingJobForWorkteamSummary = new LabelingJobForWorkteamSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("LabelingJobName")) {
                labelingJobForWorkteamSummary.setLabelingJobName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobReferenceCode")) {
                labelingJobForWorkteamSummary.setJobReferenceCode(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("WorkRequesterAccountId")) {
                labelingJobForWorkteamSummary.setWorkRequesterAccountId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                labelingJobForWorkteamSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LabelCounters")) {
                labelingJobForWorkteamSummary
                        .setLabelCounters(LabelCountersForWorkteamJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("NumberOfHumanWorkersPerDataObject")) {
                labelingJobForWorkteamSummary
                        .setNumberOfHumanWorkersPerDataObject(IntegerJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return labelingJobForWorkteamSummary;
    }

    private static LabelingJobForWorkteamSummaryJsonUnmarshaller instance;

    public static LabelingJobForWorkteamSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobForWorkteamSummaryJsonUnmarshaller();
        return instance;
    }
}
