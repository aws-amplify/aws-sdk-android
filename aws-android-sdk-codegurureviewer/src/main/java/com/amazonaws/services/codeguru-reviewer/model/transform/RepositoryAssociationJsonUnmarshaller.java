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
package com.amazonaws.services.codeguru-reviewer.model.transform;

import com.amazonaws.services.codeguru-reviewer.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;


/**
 * JSON unmarshaller for POJO RepositoryAssociation
 */
class RepositoryAssociationJsonUnmarshaller implements Unmarshaller<RepositoryAssociation, JsonUnmarshallerContext> {

    public RepositoryAssociation unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        RepositoryAssociation repositoryAssociation = new RepositoryAssociation();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("AssociationId")) {
                repositoryAssociation.setAssociationId(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("AssociationArn")) {
                repositoryAssociation.setAssociationArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ConnectionArn")) {
                repositoryAssociation.setConnectionArn(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Name")) {
                repositoryAssociation.setName(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("Owner")) {
                repositoryAssociation.setOwner(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("ProviderType")) {
                repositoryAssociation.setProviderType(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("State")) {
                repositoryAssociation.setState(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("StateReason")) {
                repositoryAssociation.setStateReason(StringJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("LastUpdatedTimeStamp")) {
                repositoryAssociation.setLastUpdatedTimeStamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else if (name.equals("CreatedTimeStamp")) {
                repositoryAssociation.setCreatedTimeStamp(DateJsonUnmarshaller.getInstance()
.unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return repositoryAssociation;
    }

    private static RepositoryAssociationJsonUnmarshaller instance;
    public static RepositoryAssociationJsonUnmarshaller getInstance() {
        if (instance == null) instance = new RepositoryAssociationJsonUnmarshaller();
        return instance;
    }
}
