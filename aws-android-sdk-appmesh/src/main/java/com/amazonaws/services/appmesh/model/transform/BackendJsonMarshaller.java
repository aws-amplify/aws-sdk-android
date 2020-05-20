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
 * JSON marshaller for POJO Backend
 */
class BackendJsonMarshaller {

    public void marshall(Backend backend, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (backend.getVirtualService() != null) {
            VirtualServiceBackend virtualService = backend.getVirtualService();
            jsonWriter.name("virtualService");
            VirtualServiceBackendJsonMarshaller.getInstance().marshall(virtualService, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static BackendJsonMarshaller instance;

    public static BackendJsonMarshaller getInstance() {
        if (instance == null)
            instance = new BackendJsonMarshaller();
        return instance;
    }
}
