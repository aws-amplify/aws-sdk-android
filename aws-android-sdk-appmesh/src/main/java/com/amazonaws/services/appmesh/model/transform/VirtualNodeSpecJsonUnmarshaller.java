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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO VirtualNodeSpec
 */
class VirtualNodeSpecJsonUnmarshaller implements
        Unmarshaller<VirtualNodeSpec, JsonUnmarshallerContext> {

    public VirtualNodeSpec unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        VirtualNodeSpec virtualNodeSpec = new VirtualNodeSpec();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("backendDefaults")) {
                virtualNodeSpec.setBackendDefaults(BackendDefaultsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("backends")) {
                virtualNodeSpec.setBackends(new ListUnmarshaller<Backend>(BackendJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("listeners")) {
                virtualNodeSpec.setListeners(new ListUnmarshaller<Listener>(
                        ListenerJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("logging")) {
                virtualNodeSpec.setLogging(LoggingJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("serviceDiscovery")) {
                virtualNodeSpec.setServiceDiscovery(ServiceDiscoveryJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return virtualNodeSpec;
    }

    private static VirtualNodeSpecJsonUnmarshaller instance;

    public static VirtualNodeSpecJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new VirtualNodeSpecJsonUnmarshaller();
        return instance;
    }
}
