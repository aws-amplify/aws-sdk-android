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
 * JSON unmarshaller for POJO Experiment
 */
class ExperimentJsonUnmarshaller implements Unmarshaller<Experiment, JsonUnmarshallerContext> {

    public Experiment unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Experiment experiment = new Experiment();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ExperimentName")) {
                experiment.setExperimentName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ExperimentArn")) {
                experiment.setExperimentArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DisplayName")) {
                experiment.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Source")) {
                experiment.setSource(ExperimentSourceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                experiment.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                experiment.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedBy")) {
                experiment.setCreatedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                experiment.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedBy")) {
                experiment.setLastModifiedBy(UserContextJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                experiment.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return experiment;
    }

    private static ExperimentJsonUnmarshaller instance;

    public static ExperimentJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ExperimentJsonUnmarshaller();
        return instance;
    }
}
