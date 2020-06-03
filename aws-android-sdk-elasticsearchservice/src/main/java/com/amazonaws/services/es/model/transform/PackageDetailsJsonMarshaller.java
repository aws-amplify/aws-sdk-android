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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackageDetails
 */
class PackageDetailsJsonMarshaller {

    public void marshall(PackageDetails packageDetails, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageDetails.getPackageID() != null) {
            String packageID = packageDetails.getPackageID();
            jsonWriter.name("PackageID");
            jsonWriter.value(packageID);
        }
        if (packageDetails.getPackageName() != null) {
            String packageName = packageDetails.getPackageName();
            jsonWriter.name("PackageName");
            jsonWriter.value(packageName);
        }
        if (packageDetails.getPackageType() != null) {
            String packageType = packageDetails.getPackageType();
            jsonWriter.name("PackageType");
            jsonWriter.value(packageType);
        }
        if (packageDetails.getPackageDescription() != null) {
            String packageDescription = packageDetails.getPackageDescription();
            jsonWriter.name("PackageDescription");
            jsonWriter.value(packageDescription);
        }
        if (packageDetails.getPackageStatus() != null) {
            String packageStatus = packageDetails.getPackageStatus();
            jsonWriter.name("PackageStatus");
            jsonWriter.value(packageStatus);
        }
        if (packageDetails.getCreatedAt() != null) {
            java.util.Date createdAt = packageDetails.getCreatedAt();
            jsonWriter.name("CreatedAt");
            jsonWriter.value(createdAt);
        }
        if (packageDetails.getErrorDetails() != null) {
            ErrorDetails errorDetails = packageDetails.getErrorDetails();
            jsonWriter.name("ErrorDetails");
            ErrorDetailsJsonMarshaller.getInstance().marshall(errorDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static PackageDetailsJsonMarshaller instance;

    public static PackageDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageDetailsJsonMarshaller();
        return instance;
    }
}
