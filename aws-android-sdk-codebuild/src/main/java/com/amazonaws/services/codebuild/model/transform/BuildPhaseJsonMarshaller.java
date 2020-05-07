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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO BuildPhase
 */
class BuildPhaseJsonMarshaller {

    public void marshall(BuildPhase buildPhase, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (buildPhase.getPhaseType() != null) {
            String phaseType = buildPhase.getPhaseType();
            jsonWriter.name("phaseType");
            jsonWriter.value(phaseType);
        }
        if (buildPhase.getPhaseStatus() != null) {
            String phaseStatus = buildPhase.getPhaseStatus();
            jsonWriter.name("phaseStatus");
            jsonWriter.value(phaseStatus);
        }
        if (buildPhase.getStartTime() != null) {
            java.util.Date startTime = buildPhase.getStartTime();
            jsonWriter.name("startTime");
            jsonWriter.value(startTime);
        }
        if (buildPhase.getEndTime() != null) {
            java.util.Date endTime = buildPhase.getEndTime();
            jsonWriter.name("endTime");
            jsonWriter.value(endTime);
        }
        if (buildPhase.getDurationInSeconds() != null) {
            Long durationInSeconds = buildPhase.getDurationInSeconds();
            jsonWriter.name("durationInSeconds");
            jsonWriter.value(durationInSeconds);
        }
        if (buildPhase.getContexts() != null) {
            java.util.List<PhaseContext> contexts = buildPhase.getContexts();
            jsonWriter.name("contexts");
            jsonWriter.beginArray();
            for (PhaseContext contextsItem : contexts) {
                if (contextsItem != null) {
                    PhaseContextJsonMarshaller.getInstance().marshall(contextsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static BuildPhaseJsonMarshaller instance;

    public static BuildPhaseJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BuildPhaseJsonMarshaller();
        return instance;
    }
}
