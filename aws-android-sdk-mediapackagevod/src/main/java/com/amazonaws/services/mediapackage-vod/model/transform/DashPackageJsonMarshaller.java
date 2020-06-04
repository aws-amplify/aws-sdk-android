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
package com.amazonaws.services.mediapackage-vod.model.transform;

import com.amazonaws.services.mediapackage-vod.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DashPackage
 */
class DashPackageJsonMarshaller {

    public void marshall(DashPackage dashPackage, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (dashPackage.getDashManifests() != null) {
            java.util.List<DashManifest> dashManifests = dashPackage.getDashManifests();
            jsonWriter.name("DashManifests");
            jsonWriter.beginArray();
            for (DashManifest dashManifestsItem : dashManifests) {
                if (dashManifestsItem != null) {
            DashManifestJsonMarshaller.getInstance().marshall(dashManifestsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        if (dashPackage.getEncryption() != null) {
            DashEncryption encryption = dashPackage.getEncryption();
            jsonWriter.name("Encryption");
            DashEncryptionJsonMarshaller.getInstance().marshall(encryption, jsonWriter);
        }
        if (dashPackage.getPeriodTriggers() != null) {
            java.util.List<String> periodTriggers = dashPackage.getPeriodTriggers();
            jsonWriter.name("PeriodTriggers");
            jsonWriter.beginArray();
            for (String periodTriggersItem : periodTriggers) {
                if (periodTriggersItem != null) {
            jsonWriter.value(periodTriggersItem);
                    }
            }
            jsonWriter.endArray();
        }
        if (dashPackage.getSegmentDurationSeconds() != null) {
            Integer segmentDurationSeconds = dashPackage.getSegmentDurationSeconds();
            jsonWriter.name("SegmentDurationSeconds");
            jsonWriter.value(segmentDurationSeconds);
        }
        if (dashPackage.getSegmentTemplateFormat() != null) {
            String segmentTemplateFormat = dashPackage.getSegmentTemplateFormat();
            jsonWriter.name("SegmentTemplateFormat");
            jsonWriter.value(segmentTemplateFormat);
        }
        jsonWriter.endObject();
    }

    private static DashPackageJsonMarshaller instance;
    public static DashPackageJsonMarshaller getInstance() {
        if (instance == null) instance = new DashPackageJsonMarshaller();
        return instance;
    }
}
