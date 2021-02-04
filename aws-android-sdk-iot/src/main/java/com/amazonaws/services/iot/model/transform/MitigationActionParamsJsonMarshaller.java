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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO MitigationActionParams
 */
class MitigationActionParamsJsonMarshaller {

    public void marshall(MitigationActionParams mitigationActionParams, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (mitigationActionParams.getUpdateDeviceCertificateParams() != null) {
            UpdateDeviceCertificateParams updateDeviceCertificateParams = mitigationActionParams
                    .getUpdateDeviceCertificateParams();
            jsonWriter.name("updateDeviceCertificateParams");
            UpdateDeviceCertificateParamsJsonMarshaller.getInstance().marshall(
                    updateDeviceCertificateParams, jsonWriter);
        }
        if (mitigationActionParams.getUpdateCACertificateParams() != null) {
            UpdateCACertificateParams updateCACertificateParams = mitigationActionParams
                    .getUpdateCACertificateParams();
            jsonWriter.name("updateCACertificateParams");
            UpdateCACertificateParamsJsonMarshaller.getInstance().marshall(
                    updateCACertificateParams, jsonWriter);
        }
        if (mitigationActionParams.getAddThingsToThingGroupParams() != null) {
            AddThingsToThingGroupParams addThingsToThingGroupParams = mitigationActionParams
                    .getAddThingsToThingGroupParams();
            jsonWriter.name("addThingsToThingGroupParams");
            AddThingsToThingGroupParamsJsonMarshaller.getInstance().marshall(
                    addThingsToThingGroupParams, jsonWriter);
        }
        if (mitigationActionParams.getReplaceDefaultPolicyVersionParams() != null) {
            ReplaceDefaultPolicyVersionParams replaceDefaultPolicyVersionParams = mitigationActionParams
                    .getReplaceDefaultPolicyVersionParams();
            jsonWriter.name("replaceDefaultPolicyVersionParams");
            ReplaceDefaultPolicyVersionParamsJsonMarshaller.getInstance().marshall(
                    replaceDefaultPolicyVersionParams, jsonWriter);
        }
        if (mitigationActionParams.getEnableIoTLoggingParams() != null) {
            EnableIoTLoggingParams enableIoTLoggingParams = mitigationActionParams
                    .getEnableIoTLoggingParams();
            jsonWriter.name("enableIoTLoggingParams");
            EnableIoTLoggingParamsJsonMarshaller.getInstance().marshall(enableIoTLoggingParams,
                    jsonWriter);
        }
        if (mitigationActionParams.getPublishFindingToSnsParams() != null) {
            PublishFindingToSnsParams publishFindingToSnsParams = mitigationActionParams
                    .getPublishFindingToSnsParams();
            jsonWriter.name("publishFindingToSnsParams");
            PublishFindingToSnsParamsJsonMarshaller.getInstance().marshall(
                    publishFindingToSnsParams, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static MitigationActionParamsJsonMarshaller instance;

    public static MitigationActionParamsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new MitigationActionParamsJsonMarshaller();
        return instance;
    }
}
