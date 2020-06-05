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

package com.amazonaws.services.personalize.model.transform;

import com.amazonaws.services.personalize.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO HPOResourceConfig
 */
class HPOResourceConfigJsonMarshaller {

    public void marshall(HPOResourceConfig hPOResourceConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (hPOResourceConfig.getMaxNumberOfTrainingJobs() != null) {
            String maxNumberOfTrainingJobs = hPOResourceConfig.getMaxNumberOfTrainingJobs();
            jsonWriter.name("maxNumberOfTrainingJobs");
            jsonWriter.value(maxNumberOfTrainingJobs);
        }
        if (hPOResourceConfig.getMaxParallelTrainingJobs() != null) {
            String maxParallelTrainingJobs = hPOResourceConfig.getMaxParallelTrainingJobs();
            jsonWriter.name("maxParallelTrainingJobs");
            jsonWriter.value(maxParallelTrainingJobs);
        }
        jsonWriter.endObject();
    }

    private static HPOResourceConfigJsonMarshaller instance;

    public static HPOResourceConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new HPOResourceConfigJsonMarshaller();
        return instance;
    }
}
