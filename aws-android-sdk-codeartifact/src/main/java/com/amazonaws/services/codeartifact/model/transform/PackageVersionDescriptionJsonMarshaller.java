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

package com.amazonaws.services.codeartifact.model.transform;

import com.amazonaws.services.codeartifact.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO PackageVersionDescription
 */
class PackageVersionDescriptionJsonMarshaller {

    public void marshall(PackageVersionDescription packageVersionDescription,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageVersionDescription.getFormat() != null) {
            String format = packageVersionDescription.getFormat();
            jsonWriter.name("format");
            jsonWriter.value(format);
        }
        if (packageVersionDescription.getNamespace() != null) {
            String namespace = packageVersionDescription.getNamespace();
            jsonWriter.name("namespace");
            jsonWriter.value(namespace);
        }
        if (packageVersionDescription.getPackageName() != null) {
            String packageName = packageVersionDescription.getPackageName();
            jsonWriter.name("packageName");
            jsonWriter.value(packageName);
        }
        if (packageVersionDescription.getDisplayName() != null) {
            String displayName = packageVersionDescription.getDisplayName();
            jsonWriter.name("displayName");
            jsonWriter.value(displayName);
        }
        if (packageVersionDescription.getVersion() != null) {
            String version = packageVersionDescription.getVersion();
            jsonWriter.name("version");
            jsonWriter.value(version);
        }
        if (packageVersionDescription.getSummary() != null) {
            String summary = packageVersionDescription.getSummary();
            jsonWriter.name("summary");
            jsonWriter.value(summary);
        }
        if (packageVersionDescription.getHomePage() != null) {
            String homePage = packageVersionDescription.getHomePage();
            jsonWriter.name("homePage");
            jsonWriter.value(homePage);
        }
        if (packageVersionDescription.getSourceCodeRepository() != null) {
            String sourceCodeRepository = packageVersionDescription.getSourceCodeRepository();
            jsonWriter.name("sourceCodeRepository");
            jsonWriter.value(sourceCodeRepository);
        }
        if (packageVersionDescription.getPublishedTime() != null) {
            java.util.Date publishedTime = packageVersionDescription.getPublishedTime();
            jsonWriter.name("publishedTime");
            jsonWriter.value(publishedTime);
        }
        if (packageVersionDescription.getLicenses() != null) {
            java.util.List<LicenseInfo> licenses = packageVersionDescription.getLicenses();
            jsonWriter.name("licenses");
            jsonWriter.beginArray();
            for (LicenseInfo licensesItem : licenses) {
                if (licensesItem != null) {
                    LicenseInfoJsonMarshaller.getInstance().marshall(licensesItem, jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        if (packageVersionDescription.getRevision() != null) {
            String revision = packageVersionDescription.getRevision();
            jsonWriter.name("revision");
            jsonWriter.value(revision);
        }
        if (packageVersionDescription.getStatus() != null) {
            String status = packageVersionDescription.getStatus();
            jsonWriter.name("status");
            jsonWriter.value(status);
        }
        jsonWriter.endObject();
    }

    private static PackageVersionDescriptionJsonMarshaller instance;

    public static PackageVersionDescriptionJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageVersionDescriptionJsonMarshaller();
        return instance;
    }
}
