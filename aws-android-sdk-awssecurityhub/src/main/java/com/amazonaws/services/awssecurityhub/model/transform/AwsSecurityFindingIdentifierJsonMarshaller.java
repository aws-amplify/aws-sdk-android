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

package com.amazonaws.services.awssecurityhub.model.transform;

import com.amazonaws.services.awssecurityhub.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO AwsSecurityFindingIdentifier
 */
class AwsSecurityFindingIdentifierJsonMarshaller {

    public void marshall(AwsSecurityFindingIdentifier awsSecurityFindingIdentifier,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsSecurityFindingIdentifier.getId() != null) {
            String id = awsSecurityFindingIdentifier.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (awsSecurityFindingIdentifier.getProductArn() != null) {
            String productArn = awsSecurityFindingIdentifier.getProductArn();
            jsonWriter.name("ProductArn");
            jsonWriter.value(productArn);
        }
        jsonWriter.endObject();
    }

    private static AwsSecurityFindingIdentifierJsonMarshaller instance;

    public static AwsSecurityFindingIdentifierJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsSecurityFindingIdentifierJsonMarshaller();
        return instance;
    }
}
