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

package com.amazonaws.services.fsx.model.transform;

import com.amazonaws.services.fsx.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SelfManagedActiveDirectoryAttributes
 */
class SelfManagedActiveDirectoryAttributesJsonUnmarshaller implements
        Unmarshaller<SelfManagedActiveDirectoryAttributes, JsonUnmarshallerContext> {

    public SelfManagedActiveDirectoryAttributes unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryAttributes = new SelfManagedActiveDirectoryAttributes();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("DomainName")) {
                selfManagedActiveDirectoryAttributes.setDomainName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("OrganizationalUnitDistinguishedName")) {
                selfManagedActiveDirectoryAttributes
                        .setOrganizationalUnitDistinguishedName(StringJsonUnmarshaller
                                .getInstance()
                                .unmarshall(context));
            } else if (name.equals("FileSystemAdministratorsGroup")) {
                selfManagedActiveDirectoryAttributes
                        .setFileSystemAdministratorsGroup(StringJsonUnmarshaller.getInstance()
                                .unmarshall(context));
            } else if (name.equals("UserName")) {
                selfManagedActiveDirectoryAttributes.setUserName(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("DnsIps")) {
                selfManagedActiveDirectoryAttributes.setDnsIps(new ListUnmarshaller<String>(
                        StringJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return selfManagedActiveDirectoryAttributes;
    }

    private static SelfManagedActiveDirectoryAttributesJsonUnmarshaller instance;

    public static SelfManagedActiveDirectoryAttributesJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SelfManagedActiveDirectoryAttributesJsonUnmarshaller();
        return instance;
    }
}
