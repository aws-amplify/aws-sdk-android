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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO EbsOptimizedInfo
 */
class EbsOptimizedInfoJsonUnmarshaller implements
        Unmarshaller<EbsOptimizedInfo, JsonUnmarshallerContext> {

    public EbsOptimizedInfo unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        EbsOptimizedInfo ebsOptimizedInfo = new EbsOptimizedInfo();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("BaselineBandwidthInMbps")) {
                ebsOptimizedInfo.setBaselineBandwidthInMbps(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaselineThroughputInMBps")) {
                ebsOptimizedInfo.setBaselineThroughputInMBps(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("BaselineIops")) {
                ebsOptimizedInfo.setBaselineIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumBandwidthInMbps")) {
                ebsOptimizedInfo.setMaximumBandwidthInMbps(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumThroughputInMBps")) {
                ebsOptimizedInfo.setMaximumThroughputInMBps(DoubleJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MaximumIops")) {
                ebsOptimizedInfo.setMaximumIops(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return ebsOptimizedInfo;
    }

    private static EbsOptimizedInfoJsonUnmarshaller instance;

    public static EbsOptimizedInfoJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new EbsOptimizedInfoJsonUnmarshaller();
        return instance;
    }
}
