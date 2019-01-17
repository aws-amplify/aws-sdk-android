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
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.util.StringUtil;

/**
 * Base class for handling the required attributes and metrics for monetization
 * Events. Currently, AmazonMonetizationEventBuilder is used to create
 * monetization events for Amazon purchases, GooglePlayMonetizationEventBuilder
 * is used to create monetization events for Google Play purchases and
 * VirtualMonetizationEventBuilder is used to create monetization events for
 * virtual In-Game Store purchases. This class can be extended if you need to
 * record monetization events from other purchase frameworks. Derived classes
 * must override the isValid method so that MonetizationEventBuilder knows if
 * the derived builder is in a valid state. Derived builders should then call
 * the appropriate setters on this class to build a monetization event
 * appropriate for their framework. When creating derived classes, the following
 * setters must be called on this class or else the builder will return null
 * <ul>
 * <li>The ProductId must be set</li>
 * <li>The Quantity must be set</li>
 * <li>The Store must be set</li>
 * <li>Either the (Currency and ItemPrice) or the ForrmattedItemPrice must be
 * set</li>
 * </ul>
 */

public abstract class MonetizationEventBuilder {

    static final String PURCHASE_EVENT_NAME = "_monetization.purchase";
    static final String PURCHASE_EVENT_QUANTITY_METRIC = "_quantity";
    static final String PURCHASE_EVENT_ITEM_PRICE_METRIC = "_item_price";
    static final String PURCHASE_EVENT_PRODUCT_ID_ATTR = "_product_id";
    static final String PURCHASE_EVENT_PRICE_FORMATTED_ATTR = "_item_price_formatted";
    static final String PURCHASE_EVENT_STORE_ATTR = "_store";
    static final String PURCHASE_EVENT_LOCALE_ATTR = "_locale";
    static final String PURCHASE_EVENT_TRANSACTION_ID_ATTR = "_transaction_id";
    static final String PURCHASE_EVENT_CURRENCY_ATTR = "_currency";
    static final String AMAZON_STORE = "Amazon";
    static final String GOOGLE_PLAY_STORE = "Google Play";
    static final String VIRTUAL_STORE = "Virtual";
    private static final Log log = LogFactory.getLog(MonetizationEventBuilder.class);
    private final AnalyticsClient analyticsClient;
    private String productId;
    private String store;
    private Double quantity;
    private String formattedItemPrice;
    private Double itemPrice;
    private String transactionId;
    private String currency;

    /**
     * Creates a MonetizationEventBuilder with the specified EventClient
     *
     * @param analyticsClient The EventClient to use when building events
     */
    protected MonetizationEventBuilder(AnalyticsClient analyticsClient) {
        this.analyticsClient = analyticsClient;
    }

    /**
     * Builds a monetization event.
     *
     * @return A monetization event that can be recorded. If the builder is in
     * an invalid state, this method returns null.
     */
    public AnalyticsEvent build() {
        AnalyticsEvent purchaseEvent = null;
        if (isValid() && doBaseValidation()) {
            purchaseEvent = analyticsClient.createEvent(PURCHASE_EVENT_NAME);
            purchaseEvent.addAttribute(PURCHASE_EVENT_PRODUCT_ID_ATTR, productId);
            purchaseEvent.addAttribute(PURCHASE_EVENT_STORE_ATTR, store);
            purchaseEvent.addMetric(PURCHASE_EVENT_QUANTITY_METRIC, quantity);

            if (formattedItemPrice != null) {
                purchaseEvent.addAttribute(PURCHASE_EVENT_PRICE_FORMATTED_ATTR, formattedItemPrice);
            }

            if (itemPrice != null) {
                purchaseEvent.addMetric(PURCHASE_EVENT_ITEM_PRICE_METRIC, itemPrice);
            }

            if (transactionId != null) {
                purchaseEvent.addAttribute(PURCHASE_EVENT_TRANSACTION_ID_ATTR, transactionId);
            }

            if (currency != null) {
                purchaseEvent.addAttribute(PURCHASE_EVENT_CURRENCY_ATTR, currency);
            }
        }

        return purchaseEvent;
    }

    /**
     * Determines if all builder methods on this builder have been called
     *
     * @return true if this builder can create a Monetization event, false
     * otherwise
     */
    protected abstract boolean isValid();

    /**
     * Accessor for the product identifier
     *
     * @return The product identifier that will be used to build the
     * monetization event
     */
    protected String getProductId() {
        return productId;
    }

    /**
     * Sets the product id to use when building the monetization event
     *
     * @param productId The product id of the item being purchased
     */
    protected void setProductId(String productId) {
        this.productId = productId;
    }

    /**
     * Accessor for the quantity
     *
     * @return The quantity that will be used to build the monetization event
     */
    protected Double getQuantity() {
        return quantity;
    }

    /**
     * Sets the quantity that will be used to build the monetization event
     *
     * @param quantity The quantity of items purchased
     */
    protected void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    /**
     * Accessor for the item price
     *
     * @return The numerical item price that will be used to build the
     * monetization event
     */
    protected Double getItemPrice() {
        return itemPrice;
    }

    /**
     * Sets the numerical item price to use when building the monetization event
     *
     * @param itemPrice the price of the item being purchased
     */
    protected void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    /**
     * Accessor for the formatted item price
     *
     * @return The formatted item price that will be used to build the
     * monetization event. Price should be formatted for the locale and
     * currency representing the transaction.
     * @deprecated Will be removed. Please set Currency and Item Price
     */
    @Deprecated
    protected String getFormattedItemPrice() {
        return formattedItemPrice;
    }

    /**
     * Sets the formatted item price (in its local currency) to use when
     * building the monetization event
     *
     * @param formattedItemPrice the formatted item price in its local currency
     * @deprecated Will be removed. Please set Currency and Item Price
     */
    @Deprecated
    protected void setFormattedItemPrice(String formattedItemPrice) {
        this.formattedItemPrice = formattedItemPrice;
    }

    /**
     * Accessor for the currency
     *
     * @return The currency that will be used to build the monetization event
     */
    protected String getCurrency() {
        return currency;
    }

    /**
     * Sets the item price currency to use when building the monetization event
     *
     * @param currency the ISO currency code or virtual curreny name of the item
     *                 price
     */
    protected void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * Accessor for the store
     *
     * @return The store that will be used to build the monetization event
     */
    protected String getStore() {
        return store;
    }

    /**
     * Sets the name of the Store where this purchase was made. For example
     * "Google Play" for purchases originating from Google Play, "Amazon" for
     * purchases originating from Amazon, or "Virtual" if the purchase was
     * performed in your in-game store.
     *
     * @param store The store of the purchase
     */
    protected void setStore(String store) {
        this.store = store;
    }

    /**
     * Accessor for the transaction identifier
     *
     * @return The transaction identifier that will be used to build the
     * monetization event
     */
    protected String getTransactionId() {
        return transactionId;
    }

    /**
     * Sets the transaction id to use when building the monetization event
     *
     * @param transactionId the transaction id of the purchase
     */
    protected void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    private boolean doBaseValidation() {

        if (analyticsClient == null) {
            log.warn("Cannot build Monetization event: the analyticsClient is null");
            return false;
        }

        // we must always have a product id, quantity, and store
        if (StringUtil.isNullOrEmpty(productId)) {
            log.warn("Base Monetization event is not valid: it is missing the product id");
            return false;
        }

        if (quantity == null) {
            log.warn("Base Monetization event is not valid: it is missing the quantity");
            return false;
        }

        if (StringUtil.isNullOrEmpty(store)) {
            log.warn("Base Monetization event is not valid: it is missing the store");
            return false;
        }

        // we must always have the (currency and price) or formatted price
        if (StringUtil.isNullOrEmpty(currency) || itemPrice == null) {
            if (StringUtil.isNullOrEmpty(formattedItemPrice)) {
                log.warn("Base Monetization event is not valid: it requires the currency and price");
                return false;
            }
        }

        return true;
    }
}
