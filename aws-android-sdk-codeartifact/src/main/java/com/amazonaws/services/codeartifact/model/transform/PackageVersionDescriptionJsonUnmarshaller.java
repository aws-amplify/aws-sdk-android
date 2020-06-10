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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO PackageVersionDescription
 */
class PackageVersionDescriptionJsonUnmarshaller implements
        Unmarshaller<PackageVersionDescription, JsonUnmarshallerContext> {

    public PackageVersionDescription unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        PackageVersionDescription packageVersionDescription = new PackageVersionDescription();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("format")) {
                packageVersionDescription.setFormat(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("namespace")) {
                packageVersionDescription.setNamespace(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("packageName")) {
                packageVersionDescription.setPackageName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("displayName")) {
                packageVersionDescription.setDisplayName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("version")) {
                packageVersionDescription.setVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("summary")) {
                packageVersionDescription.setSummary(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("homePage")) {
                packageVersionDescription.setHomePage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("sourceCodeRepository")) {
                packageVersionDescription.setSourceCodeRepository(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("publishedTime")) {
                packageVersionDescription.setPublishedTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("licenses")) {
                packageVersionDescription.setLicenses(new ListUnmarshaller<LicenseInfo>(
                        LicenseInfoJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("revision")) {
                packageVersionDescription.setRevision(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("status")) {
                packageVersionDescription.setStatus(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return packageVersionDescription;
    }

    private static PackageVersionDescriptionJsonUnmarshaller instance;

    public static PackageVersionDescriptionJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new PackageVersionDescriptionJsonUnmarshaller();
        return instance;
    }
}
