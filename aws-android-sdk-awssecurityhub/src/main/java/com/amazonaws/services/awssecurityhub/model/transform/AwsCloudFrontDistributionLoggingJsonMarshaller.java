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
 * JSON marshaller for POJO AwsCloudFrontDistributionLogging
 */
class AwsCloudFrontDistributionLoggingJsonMarshaller {

    public void marshall(AwsCloudFrontDistributionLogging awsCloudFrontDistributionLogging,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsCloudFrontDistributionLogging.getBucket() != null) {
            String bucket = awsCloudFrontDistributionLogging.getBucket();
            jsonWriter.name("Bucket");
            jsonWriter.value(bucket);
        }
        if (awsCloudFrontDistributionLogging.getEnabled() != null) {
            Boolean enabled = awsCloudFrontDistributionLogging.getEnabled();
            jsonWriter.name("Enabled");
            jsonWriter.value(enabled);
        }
        if (awsCloudFrontDistributionLogging.getIncludeCookies() != null) {
            Boolean includeCookies = awsCloudFrontDistributionLogging.getIncludeCookies();
            jsonWriter.name("IncludeCookies");
            jsonWriter.value(includeCookies);
        }
        if (awsCloudFrontDistributionLogging.getPrefix() != null) {
            String prefix = awsCloudFrontDistributionLogging.getPrefix();
            jsonWriter.name("Prefix");
            jsonWriter.value(prefix);
        }
        jsonWriter.endObject();
    }

    private static AwsCloudFrontDistributionLoggingJsonMarshaller instance;

    public static AwsCloudFrontDistributionLoggingJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsCloudFrontDistributionLoggingJsonMarshaller();
        return instance;
    }
}
