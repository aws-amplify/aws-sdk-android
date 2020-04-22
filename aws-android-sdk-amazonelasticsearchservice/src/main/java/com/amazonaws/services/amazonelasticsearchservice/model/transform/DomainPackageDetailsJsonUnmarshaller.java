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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DomainPackageDetails
 */
class DomainPackageDetailsJsonUnmarshaller implements
        Unmarshaller<DomainPackageDetails, JsonUnmarshallerContext> {

    public DomainPackageDetails unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DomainPackageDetails domainPackageDetails = new DomainPackageDetails();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("PackageID")) {
                domainPackageDetails.setPackageID(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageName")) {
                domainPackageDetails.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("PackageType")) {
                domainPackageDetails.setPackageType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdated")) {
                domainPackageDetails.setLastUpdated(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                domainPackageDetails.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainPackageStatus")) {
                domainPackageDetails.setDomainPackageStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ReferencePath")) {
                domainPackageDetails.setReferencePath(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorDetails")) {
                domainPackageDetails.setErrorDetails(ErrorDetailsJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return domainPackageDetails;
    }

    private static DomainPackageDetailsJsonUnmarshaller instance;

    public static DomainPackageDetailsJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DomainPackageDetailsJsonUnmarshaller();
        return instance;
    }
}
