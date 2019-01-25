/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model.transform;

import com.amazonaws.services.comprehend.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO DominantLanguageDetectionJobFilter
 */
class DominantLanguageDetectionJobFilterJsonUnmarshaller implements
        Unmarshaller<DominantLanguageDetectionJobFilter, JsonUnmarshallerContext> {

    public DominantLanguageDetectionJobFilter unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        DominantLanguageDetectionJobFilter dominantLanguageDetectionJobFilter = new DominantLanguageDetectionJobFilter();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobName")) {
                dominantLanguageDetectionJobFilter.setJobName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobStatus")) {
                dominantLanguageDetectionJobFilter.setJobStatus(StringJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTimeBefore")) {
                dominantLanguageDetectionJobFilter.setSubmitTimeBefore(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("SubmitTimeAfter")) {
                dominantLanguageDetectionJobFilter.setSubmitTimeAfter(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return dominantLanguageDetectionJobFilter;
    }

    private static DominantLanguageDetectionJobFilterJsonUnmarshaller instance;

    public static DominantLanguageDetectionJobFilterJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new DominantLanguageDetectionJobFilterJsonUnmarshaller();
        return instance;
    }
}
