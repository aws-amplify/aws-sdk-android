/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model.transform;

import com.amazonaws.services.iot.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO MitigationActionParams
 */
class MitigationActionParamsJsonUnmarshaller implements
        Unmarshaller<MitigationActionParams, JsonUnmarshallerContext> {

    public MitigationActionParams unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        MitigationActionParams mitigationActionParams = new MitigationActionParams();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("updateDeviceCertificateParams")) {
                mitigationActionParams
                        .setUpdateDeviceCertificateParams(UpdateDeviceCertificateParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("updateCACertificateParams")) {
                mitigationActionParams
                        .setUpdateCACertificateParams(UpdateCACertificateParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("addThingsToThingGroupParams")) {
                mitigationActionParams
                        .setAddThingsToThingGroupParams(AddThingsToThingGroupParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("replaceDefaultPolicyVersionParams")) {
                mitigationActionParams
                        .setReplaceDefaultPolicyVersionParams(ReplaceDefaultPolicyVersionParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("enableIoTLoggingParams")) {
                mitigationActionParams
                        .setEnableIoTLoggingParams(EnableIoTLoggingParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("publishFindingToSnsParams")) {
                mitigationActionParams
                        .setPublishFindingToSnsParams(PublishFindingToSnsParamsJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return mitigationActionParams;
    }

    private static MitigationActionParamsJsonUnmarshaller instance;

    public static MitigationActionParamsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new MitigationActionParamsJsonUnmarshaller();
        return instance;
    }
}
