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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response DescribeDomainResult
 */
public class DescribeDomainResultJsonUnmarshaller implements
        Unmarshaller<DescribeDomainResult, JsonUnmarshallerContext> {

    public DescribeDomainResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        DescribeDomainResult describeDomainResult = new DescribeDomainResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainArn")) {
                describeDomainResult.setDomainArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainId")) {
                describeDomainResult.setDomainId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DomainName")) {
                describeDomainResult.setDomainName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("HomeEfsFileSystemId")) {
                describeDomainResult.setHomeEfsFileSystemId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SingleSignOnManagedApplicationInstanceId")) {
                describeDomainResult
                        .setSingleSignOnManagedApplicationInstanceId(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("Status")) {
                describeDomainResult.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                describeDomainResult.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastModifiedTime")) {
                describeDomainResult.setLastModifiedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FailureReason")) {
                describeDomainResult.setFailureReason(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AuthMode")) {
                describeDomainResult.setAuthMode(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("DefaultUserSettings")) {
                describeDomainResult.setDefaultUserSettings(UserSettingsJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("HomeEfsFileSystemKmsKeyId")) {
                describeDomainResult.setHomeEfsFileSystemKmsKeyId(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubnetIds")) {
                describeDomainResult.setSubnetIds(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("Url")) {
                describeDomainResult.setUrl(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("VpcId")) {
                describeDomainResult.setVpcId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return describeDomainResult;
    }

    private static DescribeDomainResultJsonUnmarshaller instance;

    public static DescribeDomainResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DescribeDomainResultJsonUnmarshaller();
        return instance;
    }
}
