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

package com.amazonaws.services.awselementalmediapackagevod.model.transform;

import com.amazonaws.services.awselementalmediapackagevod.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DashPackage
 */
class DashPackageJsonUnmarshaller implements Unmarshaller<DashPackage, JsonUnmarshallerContext> {

    public DashPackage unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DashPackage dashPackage = new DashPackage();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DashManifests")) {
                dashPackage.setDashManifests(new ListUnmarshaller<DashManifest>(
                        DashManifestJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Encryption")) {
                dashPackage.setEncryption(DashEncryptionJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PeriodTriggers")) {
                dashPackage.setPeriodTriggers(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("SegmentDurationSeconds")) {
                dashPackage.setSegmentDurationSeconds(IntegerJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SegmentTemplateFormat")) {
                dashPackage.setSegmentTemplateFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dashPackage;
    }

    private static DashPackageJsonUnmarshaller instance;

    public static DashPackageJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DashPackageJsonUnmarshaller();
        return instance;
    }
}
