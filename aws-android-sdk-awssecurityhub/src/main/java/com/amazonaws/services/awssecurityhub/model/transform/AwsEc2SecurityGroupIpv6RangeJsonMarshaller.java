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
 * JSON marshaller for POJO AwsEc2SecurityGroupIpv6Range
 */
class AwsEc2SecurityGroupIpv6RangeJsonMarshaller {

    public void marshall(AwsEc2SecurityGroupIpv6Range awsEc2SecurityGroupIpv6Range,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (awsEc2SecurityGroupIpv6Range.getCidrIpv6() != null) {
            String cidrIpv6 = awsEc2SecurityGroupIpv6Range.getCidrIpv6();
            jsonWriter.name("CidrIpv6");
            jsonWriter.value(cidrIpv6);
        }
        jsonWriter.endObject();
    }

    private static AwsEc2SecurityGroupIpv6RangeJsonMarshaller instance;

    public static AwsEc2SecurityGroupIpv6RangeJsonMarshaller getInstance() {
        if (instance == null)
            instance = new AwsEc2SecurityGroupIpv6RangeJsonMarshaller();
        return instance;
    }
}
