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
 * JSON marshaller for POJO ImageScanFindings
 */
class ImageScanFindingsJsonMarshaller {

    public void marshall(ImageScanFindings imageScanFindings, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (imageScanFindings.getImageScanCompletedAt() != null) {
            java.util.Date imageScanCompletedAt = imageScanFindings.getImageScanCompletedAt();
            jsonWriter.name("imageScanCompletedAt");
            jsonWriter.value(imageScanCompletedAt);
        }
        if (imageScanFindings.getVulnerabilitySourceUpdatedAt() != null) {
            java.util.Date vulnerabilitySourceUpdatedAt = imageScanFindings
                    .getVulnerabilitySourceUpdatedAt();
            jsonWriter.name("vulnerabilitySourceUpdatedAt");
            jsonWriter.value(vulnerabilitySourceUpdatedAt);
        }
        if (imageScanFindings.getFindings() != null) {
            java.util.List<ImageScanFinding> findings = imageScanFindings.getFindings();
            jsonWriter.name("findings");
            jsonWriter.beginArray();
            for (ImageScanFinding findingsItem : findings) {
                if (findingsItem != null) {
                    ImageScanFindingJsonMarshaller.getInstance().marshall(findingsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (imageScanFindings.getFindingSeverityCounts() != null) {
            java.util.Map<String, Integer> findingSeverityCounts = imageScanFindings
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

    private static ImageScanFindingsJsonMarshaller instance;

    public static ImageScanFindingsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new ImageScanFindingsJsonMarshaller();
        return instance;
    }
}
