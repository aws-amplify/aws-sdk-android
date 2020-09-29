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
import com.amazonaws.util.DateUtils;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO ResourceDataSyncAwsOrganizationsSource
 */
class ResourceDataSyncAwsOrganizationsSourceJsonMarshaller {

    public void marshall(ResourceDataSyncAwsOrganizationsSource resourceDataSyncAwsOrganizationsSource, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (resourceDataSyncAwsOrganizationsSource.getOrganizationSourceType() != null) {
            String organizationSourceType = resourceDataSyncAwsOrganizationsSource.getOrganizationSourceType();
            jsonWriter.name("OrganizationSourceType");
            jsonWriter.value(organizationSourceType);
        }
        if (resourceDataSyncAwsOrganizationsSource.getOrganizationalUnits() != null) {
            java.util.List<ResourceDataSyncOrganizationalUnit> organizationalUnits = resourceDataSyncAwsOrganizationsSource.getOrganizationalUnits();
            jsonWriter.name("OrganizationalUnits");
            jsonWriter.beginArray();
            for (ResourceDataSyncOrganizationalUnit organizationalUnitsItem : organizationalUnits) {
                if (organizationalUnitsItem != null) {
            ResourceDataSyncOrganizationalUnitJsonMarshaller.getInstance().marshall(organizationalUnitsItem, jsonWriter);
                    }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static ResourceDataSyncAwsOrganizationsSourceJsonMarshaller instance;
    public static ResourceDataSyncAwsOrganizationsSourceJsonMarshaller getInstance() {
        if (instance == null) instance = new ResourceDataSyncAwsOrganizationsSourceJsonMarshaller();
        return instance;
    }
}
