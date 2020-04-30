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

package com.amazonaws.services.awselementalmediaconvert.model.transform;

import com.amazonaws.services.awselementalmediaconvert.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO S3DestinationAccessControl
 */
class S3DestinationAccessControlJsonMarshaller {

    public void marshall(S3DestinationAccessControl s3DestinationAccessControl,
            AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (s3DestinationAccessControl.getCannedAcl() != null) {
            String cannedAcl = s3DestinationAccessControl.getCannedAcl();
            jsonWriter.name("CannedAcl");
            jsonWriter.value(cannedAcl);
        }
        jsonWriter.endObject();
    }

    private static S3DestinationAccessControlJsonMarshaller instance;

    public static S3DestinationAccessControlJsonMarshaller getInstance() {
        if (instance == null)
            instance = new S3DestinationAccessControlJsonMarshaller();
        return instance;
    }
}
