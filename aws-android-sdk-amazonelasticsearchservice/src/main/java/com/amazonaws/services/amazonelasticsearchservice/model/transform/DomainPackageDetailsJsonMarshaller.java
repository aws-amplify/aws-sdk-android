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

package com.amazonaws.services.amazonelasticsearchservice.model.transform;

import com.amazonaws.services.amazonelasticsearchservice.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO DomainPackageDetails
 */
class DomainPackageDetailsJsonMarshaller {

    public void marshall(DomainPackageDetails domainPackageDetails, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (domainPackageDetails.getPackageID() != null) {
            String packageID = domainPackageDetails.getPackageID();
            jsonWriter.name("PackageID");
            jsonWriter.value(packageID);
        }
        if (domainPackageDetails.getPackageName() != null) {
            String packageName = domainPackageDetails.getPackageName();
            jsonWriter.name("PackageName");
            jsonWriter.value(packageName);
        }
        if (domainPackageDetails.getPackageType() != null) {
            String packageType = domainPackageDetails.getPackageType();
            jsonWriter.name("PackageType");
            jsonWriter.value(packageType);
        }
        if (domainPackageDetails.getLastUpdated() != null) {
            java.util.Date lastUpdated = domainPackageDetails.getLastUpdated();
            jsonWriter.name("LastUpdated");
            jsonWriter.value(lastUpdated);
        }
        if (domainPackageDetails.getDomainName() != null) {
            String domainName = domainPackageDetails.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (domainPackageDetails.getDomainPackageStatus() != null) {
            String domainPackageStatus = domainPackageDetails.getDomainPackageStatus();
            jsonWriter.name("DomainPackageStatus");
            jsonWriter.value(domainPackageStatus);
        }
        if (domainPackageDetails.getReferencePath() != null) {
            String referencePath = domainPackageDetails.getReferencePath();
            jsonWriter.name("ReferencePath");
            jsonWriter.value(referencePath);
        }
        if (domainPackageDetails.getErrorDetails() != null) {
            ErrorDetails errorDetails = domainPackageDetails.getErrorDetails();
            jsonWriter.name("ErrorDetails");
            ErrorDetailsJsonMarshaller.getInstance().marshall(errorDetails, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static DomainPackageDetailsJsonMarshaller instance;

    public static DomainPackageDetailsJsonMarshaller getInstance() {
        if (instance == null)
            instance = new DomainPackageDetailsJsonMarshaller();
        return instance;
    }
}
