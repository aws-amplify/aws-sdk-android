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
 * Builds monetization events representing a purchase from a Virtual or In-Game
 * store. This Builder automatically sets the store attribute to "Virtual". This
 * Builder will return null if the ProductId, Price, Currency, or Quantity are
 * not set.
 * <p>
 * The example below shows how to record a monetization event for the purchase
 * of 1 sword that costs 500 Gold.
 * </p>
 * Example:
 *
 * <pre class="prettyprint">
 * // get the event client from your MobileAnalyticsManager instance
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 *
 * // create a builder that can record purchase events for a Virtual In Game Store
 * VirtualMonetizationEventBuilder builder = VirtualMonetizationEventBuilder.create(eventClient);
 *
 * // build the monetization event with the product id, item price, currency type,
 * // and quantity
 * Event purchaseEvent = builder.withProductId(&quot;com.yourgame.sword&quot;).withItemPrice(500)
 *         .withCurrency(&quot;Gold&quot;).withQuantity(1).build();
 *
 * // record the monetization event
 * eventClient.recordEvent(purchaseEvent);
 * </pre>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class VirtualMonetizationEventBuilder extends MonetizationEventBuilder {

    private static final String TAG = "VirtualMonetizationEventBuilder";

    /**
     * Create a VirtualMonetizationEventBuilder with the specified Event client
     *
     * @param eventClient The event client to use when creating monetization
     *            events
     * @return a VirtualMonetizationEventBuilder to build monetization events
     *         from a Virtual Store
     */
    public static VirtualMonetizationEventBuilder create(EventClient eventClient) {
        return new VirtualMonetizationEventBuilder(eventClient);
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
     *            item (i.e. Coins or Gold)
     * @return this for chaining
     */
    public VirtualMonetizationEventBuilder withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * Construct a VirtualMonetizationEventBuilder with the specified
     * EventClient
     *
     * @param eventClient The EventClient to use when building the event
     */
    protected VirtualMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
        setStore(VIRTUAL_STORE);
    }

    @Override
    protected boolean isValid() {
        // we must always have a product id, quantity, and store
        if (getProductId() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getItemPrice() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the numerical price");
            return false;
        }

        if (getCurrency() == null) {
            Log.w(TAG, "Virtual Monetization event is not valid: it is missing the currency");
            return false;
        }

        return true;
    }
}
