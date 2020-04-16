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

package com.amazonaws.services.awsiotevents.model.transform;

import com.amazonaws.services.awsiotevents.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DetectorModelVersionSummary
 */
class DetectorModelVersionSummaryJsonUnmarshaller implements
        Unmarshaller<DetectorModelVersionSummary, JsonUnmarshallerContext> {

    public DetectorModelVersionSummary unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DetectorModelVersionSummary detectorModelVersionSummary = new DetectorModelVersionSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("detectorModelName")) {
                detectorModelVersionSummary.setDetectorModelName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectorModelVersion")) {
                detectorModelVersionSummary.setDetectorModelVersion(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("detectorModelArn")) {
                detectorModelVersionSummary.setDetectorModelArn(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("roleArn")) {
                detectorModelVersionSummary.setRoleArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("creationTime")) {
                detectorModelVersionSummary.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("lastUpdateTime")) {
                detectorModelVersionSummary.setLastUpdateTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                detectorModelVersionSummary.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("evaluationMethod")) {
                detectorModelVersionSummary.setEvaluationMethod(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return detectorModelVersionSummary;
    }

    private static DetectorModelVersionSummaryJsonUnmarshaller instance;

    public static DetectorModelVersionSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DetectorModelVersionSummaryJsonUnmarshaller();
        return instance;
    }
}
