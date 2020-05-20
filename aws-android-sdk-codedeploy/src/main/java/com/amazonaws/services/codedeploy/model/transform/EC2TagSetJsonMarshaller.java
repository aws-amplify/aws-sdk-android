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

package com.amazonaws.services.codedeploy.model.transform;

import com.amazonaws.services.codedeploy.model.*;
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO EC2TagSet
 */
class EC2TagSetJsonMarshaller {

    public void marshall(EC2TagSet eC2TagSet, AwsJsonWriter jsonWriter) throws Exception {
        jsonWriter.beginObject();
        if (eC2TagSet.getEc2TagSetList() != null) {
            java.util.List<java.util.List<EC2TagFilter>> ec2TagSetList = eC2TagSet
                    .getEc2TagSetList();
            jsonWriter.name("ec2TagSetList");
            jsonWriter.beginArray();
            for (java.util.List<EC2TagFilter> ec2TagSetListItem : ec2TagSetList) {
                if (ec2TagSetListItem != null) {
                    jsonWriter.beginArray();
                    for (EC2TagFilter ec2TagSetListItemItem : ec2TagSetListItem) {
                        if (ec2TagSetListItemItem != null) {
                            EC2TagFilterJsonMarshaller.getInstance().marshall(
                                    ec2TagSetListItemItem, jsonWriter);
                        }
                    }
                    jsonWriter.endArray();
                }
            }
            jsonWriter.endArray();
        }
        jsonWriter.endObject();
    }

    private static EC2TagSetJsonMarshaller instance;

    public static EC2TagSetJsonMarshaller getInstance() {
        if (instance == null)
            instance = new EC2TagSetJsonMarshaller();
        return instance;
    }
}
