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

package com.amazonaws.services.ecs.model.transform;

import com.amazonaws.services.ecs.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EFSAuthorizationConfig
 */
class EFSAuthorizationConfigJsonMarshaller {

    public void marshall(EFSAuthorizationConfig eFSAuthorizationConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (eFSAuthorizationConfig.getAccessPointId() != null) {
            String accessPointId = eFSAuthorizationConfig.getAccessPointId();
            jsonWriter.name("accessPointId");
            jsonWriter.value(accessPointId);
        }
        if (eFSAuthorizationConfig.getIam() != null) {
            String iam = eFSAuthorizationConfig.getIam();
            jsonWriter.name("iam");
            jsonWriter.value(iam);
        }
        jsonWriter.endObject();
    }

    private static EFSAuthorizationConfigJsonMarshaller instance;

    public static EFSAuthorizationConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EFSAuthorizationConfigJsonMarshaller();
        return instance;
    }
}
