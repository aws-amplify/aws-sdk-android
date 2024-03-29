/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO UpdateDataSecurityConfig
 */
class UpdateDataSecurityConfigJsonMarshaller {

    public void marshall(UpdateDataSecurityConfig updateDataSecurityConfig, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (updateDataSecurityConfig.getModelKmsKeyId() != null) {
            String modelKmsKeyId = updateDataSecurityConfig.getModelKmsKeyId();
            jsonWriter.name("ModelKmsKeyId");
            jsonWriter.value(modelKmsKeyId);
        }
        if (updateDataSecurityConfig.getVolumeKmsKeyId() != null) {
            String volumeKmsKeyId = updateDataSecurityConfig.getVolumeKmsKeyId();
            jsonWriter.name("VolumeKmsKeyId");
            jsonWriter.value(volumeKmsKeyId);
        }
        if (updateDataSecurityConfig.getVpcConfig() != null) {
            VpcConfig vpcConfig = updateDataSecurityConfig.getVpcConfig();
            jsonWriter.name("VpcConfig");
            VpcConfigJsonMarshaller.getInstance().marshall(vpcConfig, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static UpdateDataSecurityConfigJsonMarshaller instance;

    public static UpdateDataSecurityConfigJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpdateDataSecurityConfigJsonMarshaller();
        return instance;
    }
}
