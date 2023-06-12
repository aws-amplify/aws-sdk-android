/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.rekognition.model.transform;

import com.amazonaws.services.rekognition.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response SearchUsersResult
 */
public class SearchUsersResultJsonUnmarshaller implements
        Unmarshaller<SearchUsersResult, JsonUnmarshallerContext> {

    public SearchUsersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        SearchUsersResult searchUsersResult = new SearchUsersResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("UserMatches")) {
                searchUsersResult.setUserMatches(new ListUnmarshaller<UserMatch>(
                        UserMatchJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("FaceModelVersion")) {
                searchUsersResult.setFaceModelVersion(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SearchedFace")) {
                searchUsersResult.setSearchedFace(SearchedFaceJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SearchedUser")) {
                searchUsersResult.setSearchedUser(SearchedUserJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return searchUsersResult;
    }

    private static SearchUsersResultJsonUnmarshaller instance;

    public static SearchUsersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SearchUsersResultJsonUnmarshaller();
        return instance;
    }
}
