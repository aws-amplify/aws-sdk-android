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

package com.amazonaws.services.amazonec2containerregistry.model.transform;

import com.amazonaws.services.amazonec2containerregistry.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ImageScanFindingsSummary
 */
class ImageScanFindingsSummaryJsonMarshaller {

    public void marshall(ImageScanFindingsSummary imageScanFindingsSummary, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (imageScanFindingsSummary.getImageScanCompletedAt() != null) {
            java.util.Date imageScanCompletedAt = imageScanFindingsSummary
                    .getImageScanCompletedAt();
            jsonWriter.name("imageScanCompletedAt");
            jsonWriter.value(imageScanCompletedAt);
        }
        if (imageScanFindingsSummary.getVulnerabilitySourceUpdatedAt() != null) {
            java.util.Date vulnerabilitySourceUpdatedAt = imageScanFindingsSummary
                    .getVulnerabilitySourceUpdatedAt();
            jsonWriter.name("vulnerabilitySourceUpdatedAt");
            jsonWriter.value(vulnerabilitySourceUpdatedAt);
        }
        if (imageScanFindingsSummary.getFindingSeverityCounts() != null) {
            java.util.Map<String, Integer> findingSeverityCounts = imageScanFindingsSummary
                    .getFindingSeverityCounts();
            jsonWriter.name("findingSeverityCounts");
            jsonWriter.beginObject();
            for (java.util.Map.Entry<String, Integer> findingSeverityCountsEntry : findingSeverityCounts
                    .entrySet()) {
                Integer findingSeverityCountsValue = findingSeverityCountsEntry.getValue();
                if (findingSeverityCountsValue != null) {
                    jsonWriter.name(findingSeverityCountsEntry.getKey());
                    jsonWriter.value(findingSeverityCountsValue);
                }
            }
            jsonWriter.endObject();
        }
        jsonWriter.endObject();
    }

    private static ImageScanFindingsSummaryJsonMarshaller instance;

    public static ImageScanFindingsSummaryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingsSummaryJsonMarshaller();
        return instance;
    }
}
