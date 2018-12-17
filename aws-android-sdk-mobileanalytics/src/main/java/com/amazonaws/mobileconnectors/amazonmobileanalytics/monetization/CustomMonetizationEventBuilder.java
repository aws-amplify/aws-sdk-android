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
 * Builds monetization events representing a purchase from an IAP framework not
 * defined by a specific builder. The store attribute must be set by the user.
 * This Builder will return null if the Store, ProductId, Quantity, and either
 * the Formatted Localized Price or Price and Currency are not set.
 * <p>
 * The example below demonstrates how to create a monetization event after you
 * receive a purchase confirmation from the IAP framework you are using. You are
 * responsible for storing and making sure that the bare minimum attributes
 * required to build a Custom Purchase Event are available for use at this time.
 * Note that the builder will maintain the values of its internal variables
 * between builds.
 * </p>
 * Example:
 *
 * <pre class="prettyprint">
 * // get the event client from your MobileAnalyticsManager instance
 * EventClient eventClient = mobileAnalyticsManager.getEventClient();
 *
 * // create a builder that can record purchase events for the IAP Framework you
 * // are using
 * CustomMonetizationEventBuilder builder = CustomMonetizationEventBuilder.create(eventClient);
 *
 * // build the monetization event with at minimum the store, product id, quantity,
 * // and price information
 * // The price information can be supplied in either of the following ways:
 * // - The price as a double (i.e. 1.99) and the currency as a currency code (i.e.
 * // &quot;USD&quot;). This method is preferred as it provides more accuracy in the
 * // monetization reports
 * // - The formatted localized price of the item as a string (i.e. &quot;$1.99&quot;)
 * // You may also build with any additional available attributes that the IAP
 * // Framework provides such as Transaction ID
 *
 * // Price and currency
 * Event purchaseEvent = builder.withStore(&quot;Custom Store&quot;).withProductId(&quot;com.yourgame.sword&quot;)
 *         .withItemPrice(1.99).withCurrency(&quot;USD&quot;).withQuantity(1).build();
 *
 * // Formatted Price
 * purchaseEvent = builder.withStore(&quot;Custom Store&quot;).withProductId(&quot;com.yourgame.sword&quot;)
 *         .withFormattedItemPrice(&quot;$1.99&quot;).withQuantity(1).build();
 *
 * // record the monetization event
 * eventClient.recordEvent(purchaseEvent);
 * </pre>
 * @deprecated The Amazon Mobile Analytics SDK for Android is deprecated as of release 2.9.0. Please use the Amazon Pinpoint SDK for Android along with Amazon Pinpoint service instead.
 */
@Deprecated
public class CustomMonetizationEventBuilder extends MonetizationEventBuilder {

    private static final String TAG = "CustomMonetizationEventBuilder";

    /**
     * Create a CustomMonetizationEventBuilder with the specified Event client
     *
     * @param eventClient The event client to use when creating monetization
     *            events
     * @return a CustomMonetizationEventBuilder to build monetization events
     *         from a Non-Specific IAP Framework
     */
    public static CustomMonetizationEventBuilder create(EventClient eventClient) {
        return new CustomMonetizationEventBuilder(eventClient);
    }

    /**
     * Sets the store in which the transaction is taking place (Required)
     *
     * @param store The store in which the transaction is taking place
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withStore(String store) {
        setStore(store);
        return this;
    }

    /**
     * Sets the product identifier field of the item being purchased (Required)
     *
     * @param productId The product id representing the item being purchased
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * Sets the quantity of the item being purchased (Required)
     *
     * @param quantity The quantity of the item being purchased
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withQuantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * Sets the formatted localized price of the item being purchased (Required
     * if numerical price and currency are not specified)
     *
     * @param formattedItemPrice The formatted localized price of the item
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withFormattedItemPrice(String formattedItemPrice) {
        setFormattedItemPrice(formattedItemPrice);
        return this;
    }

    /**
     * Sets the numerical price of the item being purchased (Required if
     * formatted localized price is not specified)
     *
     * @param itemPrice The numerical price of the item
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withItemPrice(double itemPrice) {
        setItemPrice(itemPrice);
        return this;
    }

    /**
     * Sets the currency of the item being purchased (Required if formatted
     * localized price is not specified)
     *
     * @param currency The currency code of the currency used to purchase this
     *            item (i.e. "USD")
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    /**
     * The transaction identifier of the purchase (Optional)
     *
     * @param transactionId The transaction id of the purchase
     * @return this for chaining
     */
    public CustomMonetizationEventBuilder withTransactionId(String transactionId) {
        setTransactionId(transactionId);
        return this;
    }

    /**
     * Construct a CustomMonetizationEventBuilder with the specified EventClient
     *
     * @param eventClient The EventClient to use when building the event
     */
    protected CustomMonetizationEventBuilder(EventClient eventClient) {
        super(eventClient);
    }

    @Override
    protected boolean isValid() {
        // we must always have the store, product id, quantity, either formatted
        // localized price or item price and currency
        if (getStore() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the store");
            return false;
        }

        if (getProductId() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            Log.w(TAG, "Custom Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getCurrency() == null || getItemPrice() == null) {
            if (getFormattedItemPrice() == null) {
                Log.w(TAG,
                        "Custom Monetization event is not valid: it requires the formatted localized price or the currency and price");
                return false;
            }
        }

        return true;
    }
}
