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

package com.amazonaws.services.kinesisvideoarchivedmedia.model.transform;

import com.amazonaws.services.kinesisvideoarchivedmedia.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FragmentSelector
 */
class FragmentSelectorJsonMarshaller {

    public void marshall(FragmentSelector fragmentSelector, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fragmentSelector.getFragmentSelectorType() != null) {
            String fragmentSelectorType = fragmentSelector.getFragmentSelectorType();
            jsonWriter.name("FragmentSelectorType");
            jsonWriter.value(fragmentSelectorType);
        }
        if (fragmentSelector.getTimestampRange() != null) {
            TimestampRange timestampRange = fragmentSelector.getTimestampRange();
            jsonWriter.name("TimestampRange");
            TimestampRangeJsonMarshaller.getInstance().marshall(timestampRange, jsonWriter);
        }
        jsonWriter.endObject();
    }

    private static FragmentSelectorJsonMarshaller instance;

    public static FragmentSelectorJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FragmentSelectorJsonMarshaller();
        return instance;
    }
}
