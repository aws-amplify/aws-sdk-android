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

package com.amazonaws.services.quicksight.model.transform;

import com.amazonaws.services.quicksight.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Ingestion
 */
class IngestionJsonUnmarshaller implements Unmarshaller<Ingestion, JsonUnmarshallerContext> {

    public Ingestion unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Ingestion ingestion = new Ingestion();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Arn")) {
                ingestion.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionId")) {
                ingestion.setIngestionId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionStatus")) {
                ingestion.setIngestionStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorInfo")) {
                ingestion.setErrorInfo(ErrorInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RowInfo")) {
                ingestion.setRowInfo(RowInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("QueueInfo")) {
                ingestion.setQueueInfo(QueueInfoJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedTime")) {
                ingestion.setCreatedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionTimeInSeconds")) {
                ingestion.setIngestionTimeInSeconds(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IngestionSizeInBytes")) {
                ingestion.setIngestionSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestSource")) {
                ingestion.setRequestSource(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("RequestType")) {
                ingestion.setRequestType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ingestion;
    }

    private static IngestionJsonUnmarshaller instance;

    public static IngestionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new IngestionJsonUnmarshaller();
        return instance;
    }
}
