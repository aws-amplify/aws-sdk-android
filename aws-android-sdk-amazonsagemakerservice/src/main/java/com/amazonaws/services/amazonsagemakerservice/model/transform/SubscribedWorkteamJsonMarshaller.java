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
import com.amazonaws.util.json.AwsJsonWriter;

/**
 * JSON marshaller for POJO SubscribedWorkteam
 */
class SubscribedWorkteamJsonMarshaller {

    public void marshall(SubscribedWorkteam subscribedWorkteam, AwsJsonWriter jsonWriter)
            throws Exception {
        jsonWriter.beginObject();
        if (subscribedWorkteam.getWorkteamArn() != null) {
            String workteamArn = subscribedWorkteam.getWorkteamArn();
            jsonWriter.name("WorkteamArn");
            jsonWriter.value(workteamArn);
        }
        if (subscribedWorkteam.getMarketplaceTitle() != null) {
            String marketplaceTitle = subscribedWorkteam.getMarketplaceTitle();
            jsonWriter.name("MarketplaceTitle");
            jsonWriter.value(marketplaceTitle);
        }
        if (subscribedWorkteam.getSellerName() != null) {
            String sellerName = subscribedWorkteam.getSellerName();
            jsonWriter.name("SellerName");
            jsonWriter.value(sellerName);
        }
        if (subscribedWorkteam.getMarketplaceDescription() != null) {
            String marketplaceDescription = subscribedWorkteam.getMarketplaceDescription();
            jsonWriter.name("MarketplaceDescription");
            jsonWriter.value(marketplaceDescription);
        }
        if (subscribedWorkteam.getListingId() != null) {
            String listingId = subscribedWorkteam.getListingId();
            jsonWriter.name("ListingId");
            jsonWriter.value(listingId);
        }
        jsonWriter.endObject();
    }

    private static SubscribedWorkteamJsonMarshaller instance;

    public static SubscribedWorkteamJsonMarshaller getInstance() {
        if (instance == null)
            instance = new SubscribedWorkteamJsonMarshaller();
        return instance;
    }
}
