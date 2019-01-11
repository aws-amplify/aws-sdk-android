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
 * JSON marshaller for POJO Fragment
 */
class FragmentJsonMarshaller {

    public void marshall(Fragment fragment, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (fragment.getFragmentNumber() != null) {
            String fragmentNumber = fragment.getFragmentNumber();
            jsonWriter.name("FragmentNumber");
            jsonWriter.value(fragmentNumber);
        }
        if (fragment.getFragmentSizeInBytes() != null) {
            Long fragmentSizeInBytes = fragment.getFragmentSizeInBytes();
            jsonWriter.name("FragmentSizeInBytes");
            jsonWriter.value(fragmentSizeInBytes);
        }
        if (fragment.getProducerTimestamp() != null) {
            java.util.Date producerTimestamp = fragment.getProducerTimestamp();
            jsonWriter.name("ProducerTimestamp");
            jsonWriter.value(producerTimestamp);
        }
        if (fragment.getServerTimestamp() != null) {
            java.util.Date serverTimestamp = fragment.getServerTimestamp();
            jsonWriter.name("ServerTimestamp");
            jsonWriter.value(serverTimestamp);
        }
        if (fragment.getFragmentLengthInMilliseconds() != null) {
            Long fragmentLengthInMilliseconds = fragment.getFragmentLengthInMilliseconds();
            jsonWriter.name("FragmentLengthInMilliseconds");
            jsonWriter.value(fragmentLengthInMilliseconds);
        }
        jsonWriter.endObject();
    }

    private static FragmentJsonMarshaller instance;

    public static FragmentJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FragmentJsonMarshaller();
        return instance;
    }
}
