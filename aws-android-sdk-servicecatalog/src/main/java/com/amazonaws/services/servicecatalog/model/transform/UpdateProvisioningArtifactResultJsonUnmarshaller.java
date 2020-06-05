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

package com.amazonaws.services.servicecatalog.model.transform;

import com.amazonaws.services.servicecatalog.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response UpdateProvisioningArtifactResult
 */
public class UpdateProvisioningArtifactResultJsonUnmarshaller implements
        Unmarshaller<UpdateProvisioningArtifactResult, JsonUnmarshallerContext> {

    public UpdateProvisioningArtifactResult unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        UpdateProvisioningArtifactResult updateProvisioningArtifactResult = new UpdateProvisioningArtifactResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ProvisioningArtifactDetail")) {
                updateProvisioningArtifactResult
                        .setProvisioningArtifactDetail(ProvisioningArtifactDetailJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Info")) {
                updateProvisioningArtifactResult.setInfo(new MapUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                updateProvisioningArtifactResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return updateProvisioningArtifactResult;
    }

    private static UpdateProvisioningArtifactResultJsonUnmarshaller instance;

    public static UpdateProvisioningArtifactResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new UpdateProvisioningArtifactResultJsonUnmarshaller();
        return instance;
    }
}
