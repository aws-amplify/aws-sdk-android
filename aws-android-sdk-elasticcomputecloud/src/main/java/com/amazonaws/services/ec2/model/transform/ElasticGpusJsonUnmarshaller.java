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

package com.amazonaws.services.ec2.model.transform;

import com.amazonaws.services.ec2.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO ElasticGpus
 */
class ElasticGpusJsonUnmarshaller implements Unmarshaller<ElasticGpus, JsonUnmarshallerContext> {

    public ElasticGpus unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        ElasticGpus elasticGpus = new ElasticGpus();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("ElasticGpuId")) {
                elasticGpus.setElasticGpuId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("AvailabilityZone")) {
                elasticGpus.setAvailabilityZone(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticGpuType")) {
                elasticGpus.setElasticGpuType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticGpuHealth")) {
                elasticGpus.setElasticGpuHealth(ElasticGpuHealthJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ElasticGpuState")) {
                elasticGpus.setElasticGpuState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("InstanceId")) {
                elasticGpus.setInstanceId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Tags")) {
                elasticGpus.setTags(new ListUnmarshaller<Tag>(TagJsonUnmarshaller.getInstance()
                        )
                                .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return elasticGpus;
    }

    private static ElasticGpusJsonUnmarshaller instance;

    public static ElasticGpusJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new ElasticGpusJsonUnmarshaller();
        return instance;
    }
}
