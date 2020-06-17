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
 * JSON marshaller for POJO VirtualNodeSpec
 */
class VirtualNodeSpecJsonMarshaller {

    public void marshall(VirtualNodeSpec virtualNodeSpec, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (virtualNodeSpec.getBackendDefaults() != null) {
            BackendDefaults backendDefaults = virtualNodeSpec.getBackendDefaults();
            jsonWriter.name("backendDefaults");
            BackendDefaultsJsonMarshaller.getInstance().marshall(backendDefaults, jsonWriter);
        }
        if (virtualNodeSpec.getBackends() != null) {
            java.util.List<Backend> backends = virtualNodeSpec.getBackends();
            jsonWriter.name("backends");
            jsonWriter.beginArray();
            for (Backend backendsItem : backends) {
                if (backendsItem != null) {
                    BackendJsonMarshaller.getInstance().marshall(backendsItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (virtualNodeSpec.getListeners() != null) {
            java.util.List<Listener> listeners = virtualNodeSpec.getListeners();
            jsonWriter.name("listeners");
            jsonWriter.beginArray();
            for (Listener listenersItem : listeners) {
                if (listenersItem != null) {
                    ListenerJsonMarshaller.getInstance().marshall(listenersItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (virtualNodeSpec.getLogging() != null) {
            Logging logging = virtualNodeSpec.getLogging();
            jsonWriter.name("logging");
            LoggingJsonMarshaller.getInstance().marshall(logging, jsonWriter);
        }
        if (virtualNodeSpec.getServiceDiscovery() != null) {
            ServiceDiscovery serviceDiscovery = virtualNodeSpec.getServiceDiscovery();
            jsonWriter.name("serviceDiscovery");
            ServiceDiscoveryJsonMarshaller.getInstance().marshall(serviceDiscovery, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static VirtualNodeSpecJsonMarshaller instance;

    public static VirtualNodeSpecJsonMarshaller getInstance() {
        if (instance == null)
            instance = new VirtualNodeSpecJsonMarshaller();
        return instance;
    }
}
