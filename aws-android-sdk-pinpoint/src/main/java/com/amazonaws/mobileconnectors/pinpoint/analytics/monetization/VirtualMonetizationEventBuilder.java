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

import com.amazonaws.logging.Log;
import com.amazonaws.logging.LogFactory;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;

/**
 * Builds monetization events representing a purchase from a Virtual or In-Game
 * store. This Builder automatically sets the store attribute to "Virtual". This
 * Builder will return null if the ProductId, Price, Currency, or Quantity are
 * not set.
 *
 * The example below shows how to record a monetization event for the purchase
 * of 1 sword that costs 500 Gold.
 *
 * Example:
 *
 * // create a builder that can record purchase events for a Virtual In Game Store
 * VirtualMonetizationEventBuilder builder = VirtualMonetizationEventBuilder.create(pinpointManager.getAnalyticsClient());
 *
 * // build the monetization event with the product id, item price, currency type,
 * // and quantity
 * AnalyticsEvent purchaseEvent = builder.withProductId("com.yourgame.sword").withItemPrice(500)
 * .withCurrency("Gold").withQuantity(1).build();
 *
 * // record the monetization event
 * pinpointManager.getAnalyticsClient().recordEvent(purchaseEvent);
 */
public class VirtualMonetizationEventBuilder extends MonetizationEventBuilder {

    private static final Log log =
            LogFactory.getLog(VirtualMonetizationEventBuilder.class);

    /**
     * Construct a VirtualMonetizationEventBuilder with the specified
     * EventClient
     *
     * @param analyticsClient The EventClient to use when building the event
     */
    protected VirtualMonetizationEventBuilder(AnalyticsClient analyticsClient) {
        super(analyticsClient);
        setStore(VIRTUAL_STORE);
    }

    /**
     * Create a VirtualMonetizationEventBuilder with the specified Event client
     *
     * @param analyticsClient The event client to use when creating monetization
     *                        events
     * @return a VirtualMonetizationEventBuilder to build monetization events
     * from a Virtual Store
     */
    public static VirtualMonetizationEventBuilder create(AnalyticsClient analyticsClient) {
        return new VirtualMonetizationEventBuilder(analyticsClient);
    }

    /**
     * Sets the product identifier field of the item being purchased.
     *
     * @param productId The product id representing the item being purchased
     * @return this for chaining
     */
    public VirtualMonetizationEventBuilder withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * Sets the numerical price of the item being purchased
     *
     * @param itemPrice The numerical price of the item
     * @return this for chaining
     */
    public VirtualMonetizationEventBuilder withItemPrice(double itemPrice) {
        setItemPrice(itemPrice);
        return this;
    }

    /**
     * Sets the quantity of the item being purchased.
     *
     * @param quantity The number of items purchased in this transaction
     * @return this for chaining
     */
    public VirtualMonetizationEventBuilder withQuantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * Sets the currency of the item being purchased.
     *
     * @param currency The name of the virtual currency used to purchase this
     *                 item (i.e. Coins or Gold)
     * @return this for chaining
     */
    public VirtualMonetizationEventBuilder withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    @Override
    protected boolean isValid() {
        // we must always have a product id, quantity, and store
        if (getProductId() == null) {
            log.warn("Virtual Monetization event is not valid: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            log.warn("Virtual Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getItemPrice() == null) {
            log.warn("Virtual Monetization event is not valid: it is missing the numerical price");
            return false;
        }

        if (getCurrency() == null) {
            log.warn("Virtual Monetization event is not valid: it is missing the currency");
            return false;
        }

        return true;
    }
}
