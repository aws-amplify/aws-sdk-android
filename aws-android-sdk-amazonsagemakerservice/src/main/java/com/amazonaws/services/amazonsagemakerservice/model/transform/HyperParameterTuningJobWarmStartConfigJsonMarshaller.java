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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HyperParameterTuningJobWarmStartConfig
 */
class HyperParameterTuningJobWarmStartConfigJsonMarshaller {

    public void marshall(
            HyperParameterTuningJobWarmStartConfig hyperParameterTuningJobWarmStartConfig,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (hyperParameterTuningJobWarmStartConfig.getParentHyperParameterTuningJobs() != null) {
            java.util.List<ParentHyperParameterTuningJob> parentHyperParameterTuningJobs = hyperParameterTuningJobWarmStartConfig
                    .getParentHyperParameterTuningJobs();
            jsonWriter.name("ParentHyperParameterTuningJobs");
            jsonWriter.beginArray();
            for (ParentHyperParameterTuningJob parentHyperParameterTuningJobsItem : parentHyperParameterTuningJobs) {
                if (parentHyperParameterTuningJobsItem != null) {
                    ParentHyperParameterTuningJobJsonMarshaller.getInstance().marshall(
                            parentHyperParameterTuningJobsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (hyperParameterTuningJobWarmStartConfig.getWarmStartType() != null) {
            String warmStartType = hyperParameterTuningJobWarmStartConfig.getWarmStartType();
            jsonWriter.name("WarmStartType");
            jsonWriter.value(warmStartType);
        }
        jsonWriter.endObject();
    }

    private static HyperParameterTuningJobWarmStartConfigJsonMarshaller instance;

    public static HyperParameterTuningJobWarmStartConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HyperParameterTuningJobWarmStartConfigJsonMarshaller();
        return instance;
    }
}
