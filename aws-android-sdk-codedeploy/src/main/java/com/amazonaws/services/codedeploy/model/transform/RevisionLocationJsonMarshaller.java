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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO RevisionLocation
 */
class RevisionLocationJsonMarshaller {

    public void marshall(RevisionLocation revisionLocation, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (revisionLocation.getRevisionType() != null) {
            String revisionType = revisionLocation.getRevisionType();
            jsonWriter.name("revisionType");
            jsonWriter.value(revisionType);
        }
        if (revisionLocation.getS3Location() != null) {
            S3Location s3Location = revisionLocation.getS3Location();
            jsonWriter.name("s3Location");
            S3LocationJsonMarshaller.getInstance().marshall(s3Location, jsonWriter);
        }
        if (revisionLocation.getGitHubLocation() != null) {
            GitHubLocation gitHubLocation = revisionLocation.getGitHubLocation();
            jsonWriter.name("gitHubLocation");
            GitHubLocationJsonMarshaller.getInstance().marshall(gitHubLocation, jsonWriter);
        }
        if (revisionLocation.getString() != null) {
            RawString stringValue = revisionLocation.getString();
            jsonWriter.name("string");
            RawStringJsonMarshaller.getInstance().marshall(stringValue, jsonWriter);
        }
        if (revisionLocation.getAppSpecContent() != null) {
            AppSpecContent appSpecContent = revisionLocation.getAppSpecContent();
            jsonWriter.name("appSpecContent");
            AppSpecContentJsonMarshaller.getInstance().marshall(appSpecContent, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static RevisionLocationJsonMarshaller instance;

    public static RevisionLocationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new RevisionLocationJsonMarshaller();
        return instance;
    }
}
