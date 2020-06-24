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
 * JSON marshaller for POJO SelfManagedActiveDirectoryConfiguration
 */
class SelfManagedActiveDirectoryConfigurationJsonMarshaller {

    public void marshall(
            SelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (selfManagedActiveDirectoryConfiguration.getDomainName() != null) {
            String domainName = selfManagedActiveDirectoryConfiguration.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (selfManagedActiveDirectoryConfiguration.getOrganizationalUnitDistinguishedName() != null) {
            String organizationalUnitDistinguishedName = selfManagedActiveDirectoryConfiguration
                    .getOrganizationalUnitDistinguishedName();
            jsonWriter.name("OrganizationalUnitDistinguishedName");
            jsonWriter.value(organizationalUnitDistinguishedName);
        }
        if (selfManagedActiveDirectoryConfiguration.getFileSystemAdministratorsGroup() != null) {
            String fileSystemAdministratorsGroup = selfManagedActiveDirectoryConfiguration
                    .getFileSystemAdministratorsGroup();
            jsonWriter.name("FileSystemAdministratorsGroup");
            jsonWriter.value(fileSystemAdministratorsGroup);
        }
        if (selfManagedActiveDirectoryConfiguration.getUserName() != null) {
            String userName = selfManagedActiveDirectoryConfiguration.getUserName();
            jsonWriter.name("UserName");
            jsonWriter.value(userName);
        }
        if (selfManagedActiveDirectoryConfiguration.getPassword() != null) {
            String password = selfManagedActiveDirectoryConfiguration.getPassword();
            jsonWriter.name("Password");
            jsonWriter.value(password);
        }
        if (selfManagedActiveDirectoryConfiguration.getDnsIps() != null) {
            java.util.List<String> dnsIps = selfManagedActiveDirectoryConfiguration.getDnsIps();
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

    private static SelfManagedActiveDirectoryConfigurationJsonMarshaller instance;

    public static SelfManagedActiveDirectoryConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SelfManagedActiveDirectoryConfigurationJsonMarshaller();
        return instance;
    }
}
