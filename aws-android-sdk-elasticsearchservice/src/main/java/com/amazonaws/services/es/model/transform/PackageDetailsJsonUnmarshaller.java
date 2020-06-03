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

package com.amazonaws.services.es.model.transform;

import com.amazonaws.services.es.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PackageDetails
 */
class PackageDetailsJsonUnmarshaller implements
        Unmarshaller<PackageDetails, JsonUnmarshallerContext> {

    public PackageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PackageDetails packageDetails = new PackageDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PackageID")) {
                packageDetails.setPackageID(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageName")) {
                packageDetails.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageType")) {
                packageDetails.setPackageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageDescription")) {
                packageDetails.setPackageDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageStatus")) {
                packageDetails.setPackageStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreatedAt")) {
                packageDetails.setCreatedAt(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorDetails")) {
                packageDetails.setErrorDetails(ErrorDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return packageDetails;
    }

    private static PackageDetailsJsonUnmarshaller instance;

    public static PackageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PackageDetailsJsonUnmarshaller();
        return instance;
    }
}
