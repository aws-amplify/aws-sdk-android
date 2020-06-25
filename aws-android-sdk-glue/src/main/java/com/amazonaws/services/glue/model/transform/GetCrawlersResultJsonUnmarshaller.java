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

package com.amazonaws.services.glue.model.transform;

import com.amazonaws.services.glue.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for response GetCrawlersResult
 */
public class GetCrawlersResultJsonUnmarshaller implements
        Unmarshaller<GetCrawlersResult, JsonUnmarshallerContext> {

    public GetCrawlersResult unmarshall(JsonUnmarshallerContext context) throws Exception {
        GetCrawlersResult getCrawlersResult = new GetCrawlersResult();

        AwsJsonReader reader = context.getReader();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("Crawlers")) {
                getCrawlersResult.setCrawlers(new ListUnmarshaller<Crawler>(CrawlerJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else if (name.equals("NextToken")) {
                getCrawlersResult.setNextToken(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();

        return getCrawlersResult;
    }

    private static GetCrawlersResultJsonUnmarshaller instance;

    public static GetCrawlersResultJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new GetCrawlersResultJsonUnmarshaller();
        return instance;
    }
}
