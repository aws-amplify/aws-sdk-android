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

package com.amazonaws.services.codebuild.model.transform;

import com.amazonaws.services.codebuild.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SourceCredentialsInfo
 */
class SourceCredentialsInfoJsonMarshaller {

    public void marshall(SourceCredentialsInfo sourceCredentialsInfo, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (sourceCredentialsInfo.getArn() != null) {
            String arn = sourceCredentialsInfo.getArn();
            jsonWriter.name("arn");
            jsonWriter.value(arn);
        }
        if (sourceCredentialsInfo.getServerType() != null) {
            String serverType = sourceCredentialsInfo.getServerType();
            jsonWriter.name("serverType");
            jsonWriter.value(serverType);
        }
        if (sourceCredentialsInfo.getAuthType() != null) {
            String authType = sourceCredentialsInfo.getAuthType();
            jsonWriter.name("authType");
            jsonWriter.value(authType);
        }
        jsonWriter.endObject();
    }

    private static SourceCredentialsInfoJsonMarshaller instance;

    public static SourceCredentialsInfoJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SourceCredentialsInfoJsonMarshaller();
        return instance;
    }
}
