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
 * JSON marshaller for POJO UpstreamRepository
 */
class UpstreamRepositoryJsonMarshaller {

    public void marshall(UpstreamRepository upstreamRepository, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (upstreamRepository.getRepositoryName() != null) {
            String repositoryName = upstreamRepository.getRepositoryName();
            jsonWriter.name("repositoryName");
            jsonWriter.value(repositoryName);
        }
        jsonWriter.endObject();
    }

    private static UpstreamRepositoryJsonMarshaller instance;

    public static UpstreamRepositoryJsonMarshaller getInstance() {
        if (instance == null)
            instance = new UpstreamRepositoryJsonMarshaller();
        return instance;
    }
}
