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
package com.amazonaws.services.aws-android-sdk-ssm.model.transform;

import com.amazonaws.services.aws-android-sdk-ssm.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EffectivePatch
 */
class EffectivePatchJsonMarshaller {

    public void marshall(EffectivePatch effectivePatch, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (effectivePatch.getPatch() != null) {
            Patch patch = effectivePatch.getPatch();
            jsonWriter.name("Patch");
            PatchJsonMarshaller.getInstance().marshall(patch, jsonWriter);
        }
        if (effectivePatch.getPatchStatus() != null) {
            PatchStatus patchStatus = effectivePatch.getPatchStatus();
            jsonWriter.name("PatchStatus");
            PatchStatusJsonMarshaller.getInstance().marshall(patchStatus, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static EffectivePatchJsonMarshaller instance;
    public static EffectivePatchJsonMarshaller getInstance() {
        if (instance == null) instance = new EffectivePatchJsonMarshaller();
        return instance;
    }
}
