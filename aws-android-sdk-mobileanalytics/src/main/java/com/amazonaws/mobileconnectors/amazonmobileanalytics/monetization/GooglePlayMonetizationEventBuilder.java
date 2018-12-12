/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import android.util.Log;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;

/**
 * Builds monetization events representing a Google Play purchase. This Builder
 * automatically sets the store attribute to "Google Play". This Builder will
 * return null if the ProductId, Formatted Localized Price, Quantity, or
 * TransactionId are not set.
 * <p>
 * The example below demonstrates how to create a monetization event after you
 * receive the purchase <code>org.json.JSONObject</code> on the completion of a
 * purchase using Google's In App Billing API. Since Google does not give you
 * any product information in the purchase object, you must have a way to access
 * your store inventory when the purchase is being finalized. In the example
 * below, we use a <code>org.json.JSONObject</code> that was returned by a
 * request to Google's In App Billing API for product skus.
 * </p>
 * Example:
 *
 * <pre class="prettyprint">
 * // get the event client from your MobileAnalyticsManager instance
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 *
 * // create a builder that can record purchase events for Google Play IAP
 * GooglePlayMonetizationEventBuilder builder = GooglePlayMonetizationEventBuilder.create(eventClient);
 *
 * // build the monetization event with the product id, formatted item price,
 * // transaction id, and quantity
 * // product id and formatted item price can be obtained from the JSONObject
 * // returned by a product sku request to Google's In App Billing API
 * // transaction id is obtained from the Purchase object that is returned upon the
 * // completion of a purchase
 * // Google IAP currently only supports a quantity of 1
 * Event purchaseEvent = builder.withProductId(sku).withFormattedItemPrice(price)
 *         .withTransactionId(purchase.getOrderId()).withQuantity(1).build();
 *
 * // record the monetization event
 * eventClient.recordEvent(purchaseEvent);
 * </pre>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class GooglePlayMonetizationEventBuilder extends MonetizationEventBuilder {

    private static final String TAG = "GooglePlayMonetizationEventBuilder";

    /**
     * Create a GooglePlayMonetizationEventBuilder with the specified Event
     * client
     *
     * @param eventClient The event client to use when creating monetization
     *            events
     * @return a GooglePlayMonetizationEventBuilder to build monetization events
     *         from the Google Play IAB API
     */
    public static GooglePlayMonetizationEventBuilder create(EventClient eventClient) {
        return new GooglePlayMonetizationEventBuilder(eventClient);
    }

    /**
     * Sets the product identifier field of the item being purchased.
     *
     * @param productId The product id representing the item being purchased
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * Sets the formatted localized item price of the item being purchased
     * (accessed from the product item details price field after calling
     * getSkuDetails()).
     *
     * @param formattedItemPrice The localized formatted price of the item
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withFormattedItemPrice(String formattedItemPrice) {
        setFormattedItemPrice(formattedItemPrice);
        return this;
    }

    /**
     * Sets the quantity of the item purchased.
     *
     * @param quantity Currently, Google Play only supports purchasing 1 item at
     *            a time.
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withQuantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * The transaction identifier of the purchase.
     *
     * @param transactionId The orderId found in the INAPP_PURCHASE_DATA of a
     *            purchase request
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * Construct a GooglePlayMonetizationEventBuilder with the specified
     * EventClient
     *
     * @param eventClient The EventClient to use when building the event
     */
    protected GooglePlayMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
        setStore(GOOGLE_PLAY_STORE);
    }

    /**
     * Returns true only if the ProductId, Quantity, Formatted Item Price, and
     * Transaction Id are set
     */
    @Override
    protected boolean isValid() {
        // we must always have a product id, quantity, and store
        if (getProductId() == null) {
            Log.w(TAG, "Cannot build Google Monetization event: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            Log.w(TAG, "Google Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getFormattedItemPrice() == null) {
            Log.w(TAG,
                    "Google Monetization event is not valid: it is missing the formatted localized price");
            return false;
        }

        if (getTransactionId() == null) {
            Log.w(TAG, "Google Monetization event is not valid: it is missing the transaction id");
            return false;
        }

        return true;
    }
}
