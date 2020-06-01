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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SelfManagedActiveDirectoryAttributes
 */
class SelfManagedActiveDirectoryAttributesJsonMarshaller {

    public void marshall(SelfManagedActiveDirectoryAttributes selfManagedActiveDirectoryAttributes,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (selfManagedActiveDirectoryAttributes.getDomainName() != null) {
            String domainName = selfManagedActiveDirectoryAttributes.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (selfManagedActiveDirectoryAttributes.getOrganizationalUnitDistinguishedName() != null) {
            String organizationalUnitDistinguishedName = selfManagedActiveDirectoryAttributes
                    .getOrganizationalUnitDistinguishedName();
            jsonWriter.name("OrganizationalUnitDistinguishedName");
            jsonWriter.value(organizationalUnitDistinguishedName);
        }
        if (selfManagedActiveDirectoryAttributes.getFileSystemAdministratorsGroup() != null) {
            String fileSystemAdministratorsGroup = selfManagedActiveDirectoryAttributes
                    .getFileSystemAdministratorsGroup();
            jsonWriter.name("FileSystemAdministratorsGroup");
            jsonWriter.value(fileSystemAdministratorsGroup);
        }
        if (selfManagedActiveDirectoryAttributes.getUserName() != null) {
            String userName = selfManagedActiveDirectoryAttributes.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        if (selfManagedActiveDirectoryAttributes.getDnsIps() != null) {
            java.util.List<String> dnsIps = selfManagedActiveDirectoryAttributes.getDnsIps();
            jsonWriter.name("DnsIps");
            jsonWriter.beginArray();
            for (String dnsIpsItem : dnsIps) {
                if (dnsIpsItem != null) {
                    jsonWriter.value(dnsIpsItem);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static SelfManagedActiveDirectoryAttributesJsonMarshaller instance;

    public static SelfManagedActiveDirectoryAttributesJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SelfManagedActiveDirectoryAttributesJsonMarshaller();
        return instance;
    }
}
