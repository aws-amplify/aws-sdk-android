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

package com.amazonaws.services.session.qldb.model.transform;

import com.amazonaws.services.session.qldb.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO FetchPageRequest
 */
class FetchPageRequestJsonMarshaller {

    public void marshall(FetchPageRequest fetchPageRequest, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (fetchPageRequest.getTransactionId() != null) {
            String transactionId = fetchPageRequest.getTransactionId();
            jsonWriter.name("TransactionId");
            jsonWriter.value(transactionId);
        }
        if (fetchPageRequest.getNextPageToken() != null) {
            String nextPageToken = fetchPageRequest.getNextPageToken();
            jsonWriter.name("NextPageToken");
            jsonWriter.value(nextPageToken);
        }
        jsonWriter.endObject();
    }

    private static FetchPageRequestJsonMarshaller instance;

    public static FetchPageRequestJsonMarshaller getInstance() {
        if (instance == null)
            instance = new FetchPageRequestJsonMarshaller();
        return instance;
    }
}
