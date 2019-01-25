/**
 * Copyright 2016-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 * http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.mobileconnectors.pinpoint.analytics.monetization;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;

/**
 * Builds monetization events representing a Google Play purchase. This Builder
 * automatically sets the store attribute to "Google Play". This Builder will
 * return null if the ProductId, Currency, Item Price, Quantity, or
 * TransactionId are not set.
 *
 * The example below demonstrates how to create a monetization event after you
 * receive the purchase <code>org.json.JSONObject</code> on the completion of a
 * purchase using Google's In App Billing API. Since Google does not give you
 * any product information in the purchase object, you must have a way to access
 * your store inventory when the purchase is being finalized. In the example
 * below, we use a <code>org.json.JSONObject</code> that was returned by a
 * request to Google's In App Billing API for product skus.
 *
 * Example:
 *
 * // create a builder that can record purchase events for Google Play IAP
 * GooglePlayMonetizationEventBuilder builder = GooglePlayMonetizationEventBuilder.create(pinpointManager.getAnalyticsClient());
 *
 * // build the monetization event with the product id, formatted item price,
 * // transaction id, and quantity
 * // product id and formatted item price can be obtained from the JSONObject
 * // returned by a product sku request to Google's In App Billing API
 * // transaction id is obtained from the Purchase object that is returned upon the
 * // completion of a purchase
 * // Google IAP currently only supports a quantity of 1
 * Analytics Event purchaseEvent = builder.withProductId(sku).withFormattedItemPrice(price)
 * .withTransactionId(purchase.getOrderId()).withQuantity(1).build();
 *
 * // record the monetization event
 * pinpointManager.getAnalyticsClient().recordEvent(purchaseEvent);
 */
public class GooglePlayMonetizationEventBuilder
        extends MonetizationEventBuilder {

    private static final com.amazonaws.logging.Log log = LogFactory.getLog(GooglePlayMonetizationEventBuilder.class);

    /**
     * Construct a GooglePlayMonetizationEventBuilder with the specified
     * EventClient
     *
     * @param analyticsClient The EventClient to use when building the event
     */
    protected GooglePlayMonetizationEventBuilder(AnalyticsClient analyticsClient) {
        super(analyticsClient);
        setStore(GOOGLE_PLAY_STORE);
    }

    /**
     * Create a GooglePlayMonetizationEventBuilder with the specified Event
     * client
     *
     * @param analyticsClient The event client to use when creating monetization
     *                        events
     * @return a GooglePlayMonetizationEventBuilder to build monetization events
     * from the Google Play IAB API
     */
    public static GooglePlayMonetizationEventBuilder create(AnalyticsClient analyticsClient) {
        return new GooglePlayMonetizationEventBuilder(analyticsClient);
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
     * @deprecated Will be removed. Please set Currency and Item Price. Replaced by
     * {@link #withCurrency(String)} and {@link #withItemPrice(Double)
     */
    @Deprecated
    public GooglePlayMonetizationEventBuilder withFormattedItemPrice(String formattedItemPrice) {
        setFormattedItemPrice(formattedItemPrice);
        return this;
    }

    /**
     * Sets the quantity of the item purchased.
     *
     * @param quantity Currently, Google Play only supports purchasing 1 item at
     *                 a time.
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withQuantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * Sets the item price of the item purchased.
     *
     * @param itemPrice The numerical price of the item
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withItemPrice(Double itemPrice) {
        setItemPrice(itemPrice);
        return this;
    }

    /**
     * Sets the currency of the item purchased.
     *
     * @param currency The currency code of the currency used to purchase this
     *                 item (i.e. "USD" or "$")
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * The transaction identifier of the purchase.
     *
     * @param transactionId The orderId found in the INAPP_PURCHASE_DATA of a
     *                      purchase request
     * @return this for chaining
     */
    public GooglePlayMonetizationEventBuilder withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * Returns true only if the ProductId, Quantity, Currency, Item Price, and
     * Transaction Id are set
     */
    @Override
    protected boolean isValid() {
        // we must always have a product id, quantity, and store
        if (getProductId() == null) {
            log.warn("Cannot build Google Monetization event: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            log.warn("Google Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getFormattedItemPrice() == null) {
            if (getCurrency() == null) {
                log.warn("Google Monetization event is not valid: it is missing the localized currency");
                return false;
            } else if (getItemPrice() == null) {
                log.warn("Google Monetization event is not valid: it is missing the localized item price");
                return false;
            }
        }

        if (getTransactionId() == null) {
            log.warn("Google Monetization event is not valid: it is missing the transaction id");
            return false;
        }

        return true;
    }
}
