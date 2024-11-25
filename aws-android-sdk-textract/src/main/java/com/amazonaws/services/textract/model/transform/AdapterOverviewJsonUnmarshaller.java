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

package com.amazonaws.services.textract.model.transform;

import com.amazonaws.services.textract.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO AdapterOverview
 */
class AdapterOverviewJsonUnmarshaller implements
        Unmarshaller<AdapterOverview, JsonUnmarshallerContext> {

    public AdapterOverview unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        AdapterOverview adapterOverview = new AdapterOverview();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AdapterId")) {
                adapterOverview.setAdapterId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AdapterName")) {
                adapterOverview.setAdapterName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("CreationTime")) {
                adapterOverview.setCreationTime(DateJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("FeatureTypes")) {
                adapterOverview.setFeatureTypes(new ListUnmarshaller<String>(StringJsonUnmarshaller
                        .getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return adapterOverview;
    }

    private static AdapterOverviewJsonUnmarshaller instance;

    public static AdapterOverviewJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new AdapterOverviewJsonUnmarshaller();
        return instance;
    }
}
