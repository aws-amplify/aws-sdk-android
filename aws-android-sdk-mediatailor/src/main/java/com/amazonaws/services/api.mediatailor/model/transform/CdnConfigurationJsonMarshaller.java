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

package com.amazonaws.services.api.mediatailor.model.transform;

import com.amazonaws.services.api.mediatailor.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO CdnConfiguration
 */
class CdnConfigurationJsonMarshaller {

    public void marshall(CdnConfiguration cdnConfiguration, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (cdnConfiguration.getAdSegmentUrlPrefix() != null) {
            String adSegmentUrlPrefix = cdnConfiguration.getAdSegmentUrlPrefix();
            jsonWriter.name("AdSegmentUrlPrefix");
            jsonWriter.value(adSegmentUrlPrefix);
        }
        if (cdnConfiguration.getContentSegmentUrlPrefix() != null) {
            String contentSegmentUrlPrefix = cdnConfiguration.getContentSegmentUrlPrefix();
            jsonWriter.name("ContentSegmentUrlPrefix");
            jsonWriter.value(contentSegmentUrlPrefix);
        }
        jsonWriter.endObject();
    }

    private static CdnConfigurationJsonMarshaller instance;

    public static CdnConfigurationJsonMarshaller getInstance() {
        if (instance == null)
            instance = new CdnConfigurationJsonMarshaller();
        return instance;
    }
}
