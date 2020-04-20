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

package com.amazonaws.services.synthetics.model.transform;

import com.amazonaws.services.synthetics.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CanaryRun
 */
class CanaryRunJsonMarshaller {

    public void marshall(CanaryRun canaryRun, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (canaryRun.getName() != null) {
            String name = canaryRun.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (canaryRun.getStatus() != null) {
            CanaryRunStatus status = canaryRun.getStatus();
            jsonWriter.name("Status");
            CanaryRunStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (canaryRun.getTimeline() != null) {
            CanaryRunTimeline timeline = canaryRun.getTimeline();
            jsonWriter.name("Timeline");
            CanaryRunTimelineJsonMarshaller.getInstance().marshall(timeline, jsonWriter);
        }
        if (canaryRun.getArtifactS3Location() != null) {
            String artifactS3Location = canaryRun.getArtifactS3Location();
            jsonWriter.name("ArtifactS3Location");
            jsonWriter.value(artifactS3Location);
        }
        jsonWriter.endObject();
    }

    private static CanaryRunJsonMarshaller instance;

    public static CanaryRunJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CanaryRunJsonMarshaller();
        return instance;
    }
}
