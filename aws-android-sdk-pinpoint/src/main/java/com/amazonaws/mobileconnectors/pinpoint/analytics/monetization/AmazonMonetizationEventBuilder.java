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
 *
 * Builds monetization events representing an Amazon purchase. This Builder
 * automatically sets the store attribute to "Amazon". This Builder will return
 * null if the ProductId, Currency, Item Price, or Quantity are not set.
 *
 * Example:
 *
 * // create a builder that can record purchase events for Amazon IAP
 * AmazonMonetizationEventBuilder builder = AmazonMonetizationEventBuilder
 * .create(pinpointManager.getAnalyticsClient());
 *
 * // build the monetization event with the product id, currency, item price,
 * // and
 * // quantity
 * // product id and item price are obtained from the Item object
 * // Amazon IAP currently only supports a quantity of 1
 * Event purchaseEvent = builder.withProductId(purchasedItem.getSku())
 * .withFormattedItemPrice(purchasedItem.getPrice()).withQuantity(1).build();
 *
 * // record the monetization event
 * pinpointManager.getAnalyticsClient().recordEvent(purchaseEvent);
 *
 */
public class AmazonMonetizationEventBuilder extends MonetizationEventBuilder {

    private static final com.amazonaws.logging.Log log = LogFactory.getLog(AmazonMonetizationEventBuilder.class);

    /**
     * Construct a AmazonMonetizationEventBuilder with the specified EventClient
     *
     * @param analyticsClient The EventClient to use when building the event
     */
    protected AmazonMonetizationEventBuilder(AnalyticsClient analyticsClient) {
        super(analyticsClient);
        setStore(AMAZON_STORE);
    }

    /**
     * Create a AmazonMonetizationEventBuilder with the specified Event client
     *
     * @param analyticsClient The event client to use when creating monetization
     *                        events
     * @return a AmazonMonetizationEventBuilder to build monetization events
     * from the Amazon IAP API
     */
    public static AmazonMonetizationEventBuilder create(AnalyticsClient analyticsClient) {
        return new AmazonMonetizationEventBuilder(analyticsClient);
    }

    /**
     * Sets the product identifier field of the item being purchased
     *
     * @param productId The product id representing the item being purchased
     * @return this for chaining
     */
    public AmazonMonetizationEventBuilder withProductId(String productId) {
        setProductId(productId);
        return this;
    }

    /**
     * Sets the formatted localized price of the item being purchased (accessed
     * from the getPrice() method of the Item class).
     *
     * @param formattedItemPrice The localized formatted price of the item
     * @return this for chaining
     * @deprecated Will be removed. Please set Currency and Item Price. Replaced by
     * {@link #withCurrency(String)} and {@link #withItemPrice(Double)}
     */
    @Deprecated
    public AmazonMonetizationEventBuilder withFormattedItemPrice(String formattedItemPrice) {
        setFormattedItemPrice(formattedItemPrice);
        return this;
    }

    /**
     * Sets the quantity of the item being purchased.
     *
     * @param quantity Currently, Amazon IAP only supports purchasing 1 item at
     *                 a time.
     * @return this for chaining
     */
    public AmazonMonetizationEventBuilder withQuantity(Double quantity) {
        setQuantity(quantity);
        return this;
    }

    /**
     * Sets the item price of the item purchased.
     *
     * @param itemPrice The numerical price of the item
     * @return this for chaining
     */
    public AmazonMonetizationEventBuilder withItemPrice(Double itemPrice) {
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
    public AmazonMonetizationEventBuilder withCurrency(String currency) {
        setCurrency(currency);
        return this;
    }

    @Override
    protected boolean isValid() {
        // we must always have a product id, quantity, and store
        if (getProductId() == null) {
            log.warn("Amazon Monetization event is not valid: it is missing the product id");
            return false;
        }

        if (getQuantity() == null) {
            log.warn("Amazon Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (getFormattedItemPrice() == null) {
            if (getCurrency() == null) {
                log.warn("Amazon Monetization event is not valid: it is missing the localized currency");
                return false;
            } else if (getItemPrice() == null) {
                log.warn("Amazon Monetization event is not valid: it is missing the localized item price");
                return false;
            }
        }

        return true;
    }
}
