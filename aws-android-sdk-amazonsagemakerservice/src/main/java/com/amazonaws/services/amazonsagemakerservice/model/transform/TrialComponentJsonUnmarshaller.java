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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TrialComponent
 */
class TrialComponentJsonUnmarshaller implements
        Unmarshaller<TrialComponent, JsonUnmarshallerContext> {

    public TrialComponent unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TrialComponent trialComponent = new TrialComponent();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TrialComponentName")) {
                trialComponent.setTrialComponentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                trialComponent.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TrialComponentArn")) {
                trialComponent.setTrialComponentArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Source")) {
                trialComponent.setSource(TrialComponentSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Status")) {
                trialComponent.setStatus(TrialComponentStatusJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartTime")) {
                trialComponent.setStartTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EndTime")) {
                trialComponent.setEndTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                trialComponent.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                trialComponent.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                trialComponent.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                trialComponent.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Parameters")) {
                trialComponent.setParameters(new MapUnmarshaller<TrialComponentParameterValue>(
                        TrialComponentParameterValueJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("InputArtifacts")) {
                trialComponent.setInputArtifacts(new MapUnmarshaller<TrialComponentArtifact>(
                        TrialComponentArtifactJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("OutputArtifacts")) {
                trialComponent.setOutputArtifacts(new MapUnmarshaller<TrialComponentArtifact>(
                        TrialComponentArtifactJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Metrics")) {
                trialComponent.setMetrics(new ListUnmarshaller<TrialComponentMetricSummary>(
                        TrialComponentMetricSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SourceDetail")) {
                trialComponent.setSourceDetail(TrialComponentSourceDetailJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                trialComponent.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Parents")) {
                trialComponent.setParents(new ListUnmarshaller<Parent>(ParentJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return trialComponent;
    }

    private static TrialComponentJsonUnmarshaller instance;

    public static TrialComponentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TrialComponentJsonUnmarshaller();
        return instance;
    }
}
