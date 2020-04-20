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

package com.amazonaws.services.awsglue.model.transform;

import com.amazonaws.services.awsglue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO Crawl
 */
class CrawlJsonUnmarshaller implements Unmarshaller<Crawl, JsonUnmarshallerContext> {

    public Crawl unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        Crawl crawl = new Crawl();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("State")) {
                crawl.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("StartedOn")) {
                crawl.setStartedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CompletedOn")) {
                crawl.setCompletedOn(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ErrorMessage")) {
                crawl.setErrorMessage(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogGroup")) {
                crawl.setLogGroup(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LogStream")) {
                crawl.setLogStream(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return crawl;
    }

    private static CrawlJsonUnmarshaller instance;

    public static CrawlJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new CrawlJsonUnmarshaller();
        return instance;
    }
}
