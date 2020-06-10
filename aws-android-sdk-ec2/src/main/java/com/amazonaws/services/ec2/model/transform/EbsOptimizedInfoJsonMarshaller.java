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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EbsOptimizedInfo
 */
class EbsOptimizedInfoJsonMarshaller {

    public void marshall(EbsOptimizedInfo ebsOptimizedInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (ebsOptimizedInfo.getBaselineBandwidthInMbps() != null) {
            Integer baselineBandwidthInMbps = ebsOptimizedInfo.getBaselineBandwidthInMbps();
            jsonWriter.name("BaselineBandwidthInMbps");
            jsonWriter.value(baselineBandwidthInMbps);
        }
        if (ebsOptimizedInfo.getBaselineThroughputInMBps() != null) {
            Double baselineThroughputInMBps = ebsOptimizedInfo.getBaselineThroughputInMBps();
            jsonWriter.name("BaselineThroughputInMBps");
            jsonWriter.value(baselineThroughputInMBps);
        }
        if (ebsOptimizedInfo.getBaselineIops() != null) {
            Integer baselineIops = ebsOptimizedInfo.getBaselineIops();
            jsonWriter.name("BaselineIops");
            jsonWriter.value(baselineIops);
        }
        if (ebsOptimizedInfo.getMaximumBandwidthInMbps() != null) {
            Integer maximumBandwidthInMbps = ebsOptimizedInfo.getMaximumBandwidthInMbps();
            jsonWriter.name("MaximumBandwidthInMbps");
            jsonWriter.value(maximumBandwidthInMbps);
        }
        if (ebsOptimizedInfo.getMaximumThroughputInMBps() != null) {
            Double maximumThroughputInMBps = ebsOptimizedInfo.getMaximumThroughputInMBps();
            jsonWriter.name("MaximumThroughputInMBps");
            jsonWriter.value(maximumThroughputInMBps);
        }
        if (ebsOptimizedInfo.getMaximumIops() != null) {
            Integer maximumIops = ebsOptimizedInfo.getMaximumIops();
            jsonWriter.name("MaximumIops");
            jsonWriter.value(maximumIops);
        }
        jsonWriter.endObject();
    }

    private static EbsOptimizedInfoJsonMarshaller instance;

    public static EbsOptimizedInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EbsOptimizedInfoJsonMarshaller();
        return instance;
    }
}
