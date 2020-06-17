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

package com.amazonaws.services.snowball.model.transform;

import com.amazonaws.services.snowball.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO JobListEntry
 */
class JobListEntryJsonUnmarshaller implements Unmarshaller<JobListEntry, JsonUnmarshallerContext> {

    public JobListEntry unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        JobListEntry jobListEntry = new JobListEntry();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("JobId")) {
                jobListEntry.setJobId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobState")) {
                jobListEntry.setJobState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("IsMaster")) {
                jobListEntry.setIsMaster(BooleanJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("JobType")) {
                jobListEntry.setJobType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SnowballType")) {
                jobListEntry.setSnowballType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationDate")) {
                jobListEntry.setCreationDate(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Description")) {
                jobListEntry.setDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return jobListEntry;
    }

    private static JobListEntryJsonUnmarshaller instance;

    public static JobListEntryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new JobListEntryJsonUnmarshaller();
        return instance;
    }
}
