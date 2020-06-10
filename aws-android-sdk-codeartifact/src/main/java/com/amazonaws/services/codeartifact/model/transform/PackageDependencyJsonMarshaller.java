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
 * JSON marshaller for POJO PackageDependency
 */
class PackageDependencyJsonMarshaller {

    public void marshall(PackageDependency packageDependency, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (packageDependency.getNamespace() != null) {
            String namespace = packageDependency.getNamespace();
            jsonWriter.name("namespace");
            jsonWriter.value(namespace);
        }
        if (packageDependency.getPackage() != null) {
            String package = packageDependency.getPackage();
            jsonWriter.name("package");
            jsonWriter.value(package);
        }
        if (packageDependency.getDependencyType() != null) {
            String dependencyType = packageDependency.getDependencyType();
            jsonWriter.name("dependencyType");
            jsonWriter.value(dependencyType);
        }
        if (packageDependency.getVersionRequirement() != null) {
            String versionRequirement = packageDependency.getVersionRequirement();
            jsonWriter.name("versionRequirement");
            jsonWriter.value(versionRequirement);
        }
        jsonWriter.endObject();
    }

    private static PackageDependencyJsonMarshaller instance;

    public static PackageDependencyJsonMarshaller getInstance() {
        if (instance == null)
            instance = new PackageDependencyJsonMarshaller();
        return instance;
    }
}
