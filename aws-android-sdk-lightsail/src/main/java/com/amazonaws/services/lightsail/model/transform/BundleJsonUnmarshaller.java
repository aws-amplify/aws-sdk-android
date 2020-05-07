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

package com.amazonaws.services.lightsail.model.transform;

import com.amazonaws.services.lightsail.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Bundle
 */
class BundleJsonUnmarshaller implements Unmarshaller<Bundle, JsonUnmarshallerContext> {

    public Bundle unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Bundle bundle = new Bundle();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("price")) {
                bundle.setPrice(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("cpuCount")) {
                bundle.setCpuCount(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("diskSizeInGb")) {
                bundle.setDiskSizeInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("bundleId")) {
                bundle.setBundleId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("instanceType")) {
                bundle.setInstanceType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("isActive")) {
                bundle.setIsActive(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("name")) {
                bundle.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("power")) {
                bundle.setPower(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ramSizeInGb")) {
                bundle.setRamSizeInGb(FloatJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("transferPerMonthInGb")) {
                bundle.setTransferPerMonthInGb(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("supportedPlatforms")) {
                bundle.setSupportedPlatforms(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return bundle;
    }

    private static BundleJsonUnmarshaller instance;

    public static BundleJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new BundleJsonUnmarshaller();
        return instance;
    }
}
