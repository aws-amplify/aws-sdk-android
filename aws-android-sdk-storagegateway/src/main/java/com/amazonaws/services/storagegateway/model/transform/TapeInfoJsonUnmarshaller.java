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

package com.amazonaws.services.storagegateway.model.transform;

import com.amazonaws.services.storagegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO TapeInfo
 */
class TapeInfoJsonUnmarshaller implements Unmarshaller<TapeInfo, JsonUnmarshallerContext> {

    public TapeInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        TapeInfo tapeInfo = new TapeInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TapeARN")) {
                tapeInfo.setTapeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeBarcode")) {
                tapeInfo.setTapeBarcode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeSizeInBytes")) {
                tapeInfo.setTapeSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeStatus")) {
                tapeInfo.setTapeStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("GatewayARN")) {
                tapeInfo.setGatewayARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PoolId")) {
                tapeInfo.setPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tapeInfo;
    }

    private static TapeInfoJsonUnmarshaller instance;

    public static TapeInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TapeInfoJsonUnmarshaller();
        return instance;
    }
}
