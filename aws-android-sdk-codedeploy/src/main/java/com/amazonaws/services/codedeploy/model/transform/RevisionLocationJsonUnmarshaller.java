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
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RevisionLocation
 */
class RevisionLocationJsonUnmarshaller implements
        Unmarshaller<RevisionLocation, JsonUnmarshallerContext> {

    public RevisionLocation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RevisionLocation revisionLocation = new RevisionLocation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("revisionType")) {
                revisionLocation.setRevisionType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("s3Location")) {
                revisionLocation.setS3Location(S3LocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("gitHubLocation")) {
                revisionLocation.setGitHubLocation(GitHubLocationJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("string")) {
                revisionLocation.setString(RawStringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("appSpecContent")) {
                revisionLocation.setAppSpecContent(AppSpecContentJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return revisionLocation;
    }

    private static RevisionLocationJsonUnmarshaller instance;

    public static RevisionLocationJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RevisionLocationJsonUnmarshaller();
        return instance;
    }
}
