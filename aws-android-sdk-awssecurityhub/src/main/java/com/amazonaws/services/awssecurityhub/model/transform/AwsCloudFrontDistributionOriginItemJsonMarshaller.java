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
 * JSON marshaller for POJO AwsCloudFrontDistributionOriginItem
 */
class AwsCloudFrontDistributionOriginItemJsonMarshaller {

    public void marshall(AwsCloudFrontDistributionOriginItem awsCloudFrontDistributionOriginItem,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCloudFrontDistributionOriginItem.getDomainName() != null) {
            String domainName = awsCloudFrontDistributionOriginItem.getDomainName();
            jsonWriter.name("DomainName");
            jsonWriter.value(domainName);
        }
        if (awsCloudFrontDistributionOriginItem.getId() != null) {
            String id = awsCloudFrontDistributionOriginItem.getId();
            jsonWriter.name("Id");
            jsonWriter.value(id);
        }
        if (awsCloudFrontDistributionOriginItem.getOriginPath() != null) {
            String originPath = awsCloudFrontDistributionOriginItem.getOriginPath();
            jsonWriter.name("OriginPath");
            jsonWriter.value(originPath);
        }
        jsonWriter.endObject();
    }

    private static AwsCloudFrontDistributionOriginItemJsonMarshaller instance;

    public static AwsCloudFrontDistributionOriginItemJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionOriginItemJsonMarshaller();
        return instance;
    }
}
