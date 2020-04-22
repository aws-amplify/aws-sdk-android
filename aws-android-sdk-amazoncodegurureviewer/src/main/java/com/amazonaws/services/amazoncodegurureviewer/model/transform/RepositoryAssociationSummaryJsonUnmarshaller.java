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

package com.amazonaws.services.amazoncodegurureviewer.model.transform;

import com.amazonaws.services.amazoncodegurureviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO RepositoryAssociationSummary
 */
class RepositoryAssociationSummaryJsonUnmarshaller implements
        Unmarshaller<RepositoryAssociationSummary, JsonUnmarshallerContext> {

    public RepositoryAssociationSummary unmarshall(JsonUnmarshallerContext context)
            throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RepositoryAssociationSummary repositoryAssociationSummary = new RepositoryAssociationSummary();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociationArn")) {
                repositoryAssociationSummary.setAssociationArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("LastUpdatedTimeStamp")) {
                repositoryAssociationSummary.setLastUpdatedTimeStamp(DateJsonUnmarshaller
                        .getInstance()
                        .unmarshall(context));
            } else if (name.equals("AssociationId")) {
                repositoryAssociationSummary.setAssociationId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Name")) {
                repositoryAssociationSummary.setName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("Owner")) {
                repositoryAssociationSummary.setOwner(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ProviderType")) {
                repositoryAssociationSummary.setProviderType(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("State")) {
                repositoryAssociationSummary.setState(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return repositoryAssociationSummary;
    }

    private static RepositoryAssociationSummaryJsonUnmarshaller instance;

    public static RepositoryAssociationSummaryJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new RepositoryAssociationSummaryJsonUnmarshaller();
        return instance;
    }
}
