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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO LabelingJobInputConfig
 */
class LabelingJobInputConfigJsonMarshaller {

    public void marshall(LabelingJobInputConfig labelingJobInputConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (labelingJobInputConfig.getDataSource() != null) {
            LabelingJobDataSource dataSource = labelingJobInputConfig.getDataSource();
            jsonWriter.name("DataSource");
            LabelingJobDataSourceJsonMarshaller.getInstance().marshall(dataSource, jsonWriter);
        }
        if (labelingJobInputConfig.getDataAttributes() != null) {
            LabelingJobDataAttributes dataAttributes = labelingJobInputConfig.getDataAttributes();
            jsonWriter.name("DataAttributes");
            LabelingJobDataAttributesJsonMarshaller.getInstance().marshall(dataAttributes,
                    jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static LabelingJobInputConfigJsonMarshaller instance;

    public static LabelingJobInputConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new LabelingJobInputConfigJsonMarshaller();
        return instance;
    }
}
