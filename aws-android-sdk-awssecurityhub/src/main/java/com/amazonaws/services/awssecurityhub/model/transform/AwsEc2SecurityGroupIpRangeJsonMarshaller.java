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
 * JSON marshaller for POJO AwsEc2SecurityGroupIpRange
 */
class AwsEc2SecurityGroupIpRangeJsonMarshaller {

    public void marshall(AwsEc2SecurityGroupIpRange awsEc2SecurityGroupIpRange,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2SecurityGroupIpRange.getCidrIp() != null) {
            String cidrIp = awsEc2SecurityGroupIpRange.getCidrIp();
            jsonWriter.name("CidrIp");
            jsonWriter.value(cidrIp);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2SecurityGroupIpRangeJsonMarshaller instance;

    public static AwsEc2SecurityGroupIpRangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupIpRangeJsonMarshaller();
        return instance;
    }
}
