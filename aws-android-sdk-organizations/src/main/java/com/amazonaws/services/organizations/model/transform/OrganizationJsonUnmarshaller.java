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

package com.amazonaws.services.organizations.model.transform;

import com.amazonaws.services.organizations.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Organization
 */
class OrganizationJsonUnmarshaller implements Unmarshaller<Organization, JsonUnmarshallerContext> {

    public Organization unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Organization organization = new Organization();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Id")) {
                organization.setId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Arn")) {
                organization.setArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FeatureSet")) {
                organization.setFeatureSet(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterAccountArn")) {
                organization.setMasterAccountArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterAccountId")) {
                organization.setMasterAccountId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MasterAccountEmail")) {
                organization.setMasterAccountEmail(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailablePolicyTypes")) {
                organization.setAvailablePolicyTypes(new ListUnmarshaller<PolicyTypeSummary>(
                        PolicyTypeSummaryJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return organization;
    }

    private static OrganizationJsonUnmarshaller instance;

    public static OrganizationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new OrganizationJsonUnmarshaller();
        return instance;
    }
}
