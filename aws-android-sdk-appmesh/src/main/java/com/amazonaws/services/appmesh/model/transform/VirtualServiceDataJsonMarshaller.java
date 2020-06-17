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

package com.amazonaws.services.appmesh.model.transform;

import com.amazonaws.services.appmesh.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO VirtualServiceData
 */
class VirtualServiceDataJsonMarshaller {

    public void marshall(VirtualServiceData virtualServiceData, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualServiceData.getMeshName() != null) {
            String meshName = virtualServiceData.getMeshName();
            jsonWriter.name("meshName");
            jsonWriter.value(meshName);
        }
        if (virtualServiceData.getMetadata() != null) {
            ResourceMetadata metadata = virtualServiceData.getMetadata();
            jsonWriter.name("metadata");
            ResourceMetadataJsonMarshaller.getInstance().marshall(metadata, jsonWriter);
        }
        if (virtualServiceData.getSpec() != null) {
            VirtualServiceSpec spec = virtualServiceData.getSpec();
            jsonWriter.name("spec");
            VirtualServiceSpecJsonMarshaller.getInstance().marshall(spec, jsonWriter);
        }
        if (virtualServiceData.getStatus() != null) {
            VirtualServiceStatus status = virtualServiceData.getStatus();
            jsonWriter.name("status");
            VirtualServiceStatusJsonMarshaller.getInstance().marshall(status, jsonWriter);
        }
        if (virtualServiceData.getVirtualServiceName() != null) {
            String virtualServiceName = virtualServiceData.getVirtualServiceName();
            jsonWriter.name("virtualServiceName");
            jsonWriter.value(virtualServiceName);
        }
        jsonWriter.endObject();
    }

    private static VirtualServiceDataJsonMarshaller instance;

    public static VirtualServiceDataJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualServiceDataJsonMarshaller();
        return instance;
    }
}
