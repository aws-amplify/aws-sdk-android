/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DatasetStats
 */
class DatasetStatsJsonMarshaller {

    public void marshall(DatasetStats datasetStats, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (datasetStats.getLabeledEntries() != null) {
            Integer labeledEntries = datasetStats.getLabeledEntries();
            jsonWriter.name("LabeledEntries");
            jsonWriter.value(labeledEntries);
        }
        if (datasetStats.getTotalEntries() != null) {
            Integer totalEntries = datasetStats.getTotalEntries();
            jsonWriter.name("TotalEntries");
            jsonWriter.value(totalEntries);
        }
        if (datasetStats.getTotalLabels() != null) {
            Integer totalLabels = datasetStats.getTotalLabels();
            jsonWriter.name("TotalLabels");
            jsonWriter.value(totalLabels);
        }
        if (datasetStats.getErrorEntries() != null) {
            Integer errorEntries = datasetStats.getErrorEntries();
            jsonWriter.name("ErrorEntries");
            jsonWriter.value(errorEntries);
        }
        jsonWriter.endObject();
    }

    private static DatasetStatsJsonMarshaller instance;

    public static DatasetStatsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DatasetStatsJsonMarshaller();
        return instance;
    }
}
