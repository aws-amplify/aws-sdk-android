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

package com.amazonaws.services.amazonsagemakerservice.model.transform;

import com.amazonaws.services.amazonsagemakerservice.model.*;
import com.amazonaws.transform.SimpleTypeJsonUnmarshallers.*;
import com.amazonaws.transform.*;
import com.amazonaws.util.json.AwsJsonReader;

/**
 * JSON unmarshaller for POJO SubscribedWorkteam
 */
class SubscribedWorkteamJsonUnmarshaller implements
        Unmarshaller<SubscribedWorkteam, JsonUnmarshallerContext> {

    public SubscribedWorkteam unmarshall(JsonUnmarshallerContext context) throws Exception {
        AwsJsonReader reader = context.getReader();
        if (!reader.isContainer()) {
            reader.skipValue();
            return null;
        }
        SubscribedWorkteam subscribedWorkteam = new SubscribedWorkteam();
        reader.beginObject();
        while (reader.hasNext()) {
            String name = reader.nextName();
            if (name.equals("WorkteamArn")) {
                subscribedWorkteam.setWorkteamArn(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MarketplaceTitle")) {
                subscribedWorkteam.setMarketplaceTitle(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("SellerName")) {
                subscribedWorkteam.setSellerName(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("MarketplaceDescription")) {
                subscribedWorkteam.setMarketplaceDescription(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else if (name.equals("ListingId")) {
                subscribedWorkteam.setListingId(StringJsonUnmarshaller.getInstance()
                        .unmarshall(context));
            } else {
                reader.skipValue();
            }
        }
        reader.endObject();
        return subscribedWorkteam;
    }

    private static SubscribedWorkteamJsonUnmarshaller instance;

    public static SubscribedWorkteamJsonUnmarshaller getInstance() {
        if (instance == null)
            instance = new SubscribedWorkteamJsonUnmarshaller();
        return instance;
    }
}
