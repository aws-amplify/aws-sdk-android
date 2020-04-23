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

package com.amazonaws.services.awsstoragegateway.model.transform;

import com.amazonaws.services.awsstoragegateway.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Tape
 */
class TapeJsonUnmarshaller implements Unmarshaller<Tape, JsonUnmarshallerContext> {

    public Tape unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Tape tape = new Tape();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("TapeARN")) {
                tape.setTapeARN(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeBarcode")) {
                tape.setTapeBarcode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeCreatedDate")) {
                tape.setTapeCreatedDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeSizeInBytes")) {
                tape.setTapeSizeInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeStatus")) {
                tape.setTapeStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VTLDevice")) {
                tape.setVTLDevice(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Progress")) {
                tape.setProgress(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("TapeUsedInBytes")) {
                tape.setTapeUsedInBytes(LongJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("KMSKey")) {
                tape.setKMSKey(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PoolId")) {
                tape.setPoolId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return tape;
    }

    private static TapeJsonUnmarshaller instance;

    public static TapeJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new TapeJsonUnmarshaller();
        return instance;
    }
}
