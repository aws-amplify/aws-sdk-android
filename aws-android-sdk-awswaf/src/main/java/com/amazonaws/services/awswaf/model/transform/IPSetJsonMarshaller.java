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

package com.amazonaws.services.awswaf.model.transform;

import com.amazonaws.services.awswaf.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO IPSet
 */
class IPSetJsonMarshaller {

    public void marshall(IPSet iPSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (iPSet.getIPSetId() != null) {
            String iPSetId = iPSet.getIPSetId();
            jsonWriter.name("IPSetId");
            jsonWriter.value(iPSetId);
        }
        if (iPSet.getName() != null) {
            String name = iPSet.getName();
            jsonWriter.name("Name");
            jsonWriter.value(name);
        }
        if (iPSet.getIPSetDescriptors() != null) {
            java.util.List<IPSetDescriptor> iPSetDescriptors = iPSet.getIPSetDescriptors();
            jsonWriter.name("IPSetDescriptors");
            jsonWriter.beginArray();
            for (IPSetDescriptor iPSetDescriptorsItem : iPSetDescriptors) {
                if (iPSetDescriptorsItem != null) {
                    IPSetDescriptorJsonMarshaller.getInstance().marshall(iPSetDescriptorsItem,
                            jsonWriter);
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static IPSetJsonMarshaller instance;

    public static IPSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new IPSetJsonMarshaller();
        return instance;
    }
}
