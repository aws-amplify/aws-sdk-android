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
 * JSON marshaller for POJO DiskImageDetail
 */
class DiskImageDetailJsonMarshaller {

    public void marshall(DiskImageDetail diskImageDetail, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (diskImageDetail.getBytes() != null) {
            Long bytes = diskImageDetail.getBytes();
            jsonWriter.name("Bytes");
            jsonWriter.value(bytes);
        }
        if (diskImageDetail.getFormat() != null) {
            String format = diskImageDetail.getFormat();
            jsonWriter.name("Format");
            jsonWriter.value(format);
        }
        if (diskImageDetail.getImportManifestUrl() != null) {
            String importManifestUrl = diskImageDetail.getImportManifestUrl();
            jsonWriter.name("ImportManifestUrl");
            jsonWriter.value(importManifestUrl);
        }
        jsonWriter.endObject();
    }

    private static DiskImageDetailJsonMarshaller instance;

    public static DiskImageDetailJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DiskImageDetailJsonMarshaller();
        return instance;
    }
}
