/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetAdapterVersionResult
 */
public class GetAdapterVersionResultJsonUnmarshaller implements
        Unmarshaller<GetAdapterVersionResult, JsonUnmarshallerContext> {

    public GetAdapterVersionResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetAdapterVersionResult getAdapterVersionResult = new GetAdapterVersionResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdapterId")) {
                getAdapterVersionResult.setAdapterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdapterVersion")) {
                getAdapterVersionResult.setAdapterVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                getAdapterVersionResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FeatureTypes")) {
                getAdapterVersionResult.setFeatureTypes(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                getAdapterVersionResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StatusMessage")) {
                getAdapterVersionResult.setStatusMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DatasetConfig")) {
                getAdapterVersionResult
                        .setDatasetConfig(AdapterVersionDatasetConfigJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("KMSKeyId")) {
                getAdapterVersionResult.setKMSKeyId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("OutputConfig")) {
                getAdapterVersionResult.setOutputConfig(OutputConfigJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("EvaluationMetrics")) {
                getAdapterVersionResult
                        .setEvaluationMetrics(new ListUnmarshaller<AdapterVersionEvaluationMetric>(
                                AdapterVersionEvaluationMetricJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Tags")) {
                getAdapterVersionResult.setTags(new MapUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getAdapterVersionResult;
    }

    private static GetAdapterVersionResultJsonUnmarshaller instance;

    public static GetAdapterVersionResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetAdapterVersionResultJsonUnmarshaller();
        return instance;
    }
}
