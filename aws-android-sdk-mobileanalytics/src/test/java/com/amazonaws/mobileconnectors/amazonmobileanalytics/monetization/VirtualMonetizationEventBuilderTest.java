/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *    http://aws.amazon.com/apache2.0
 *
 * This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES
 * OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and
 * limitations under the License.
 */

package com.amazonaws.mobileconnectors.amazonmobileanalytics.monetization;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import com.amazonaws.mobileconnectors.amazonmobileanalytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.EventClient;
import com.amazonaws.mobileconnectors.amazonmobileanalytics.internal.event.MockInternalEvent;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

import java.util.Map;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class VirtualMonetizationEventBuilderTest extends MobileAnalyticsTestBase {

    EventClient mockEventClient = Mockito.mock(EventClient.class);

    @Before
    public void setup() {
        AnalyticsEvent testEvent = MockInternalEvent.newInstance(
                MonetizationEventBuilder.PURCHASE_EVENT_NAME, 0l);
        when(mockEventClient.createEvent(MonetizationEventBuilder.PURCHASE_EVENT_NAME)).thenReturn(
                testEvent);
    }

    @Test
    public void build_productIdNotSet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, null, .99, 1.0, "Coins");
    }

    @Test
    public void build_productIdEmpty_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, "", .99, 1.0, "Coins");
    }

    @Test
    public void build_quantityNotSet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, "com.amazon.item", .99, null, "Coins");
    }

    @Test
    public void build_eventClientNotSet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(null);
        verifyMonetizationEvent(builder, false, "com.amazon.item", .99, 1.0, "Coins");
    }

    @Test
    public void build_noPriceSet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, "com.amazon.item", null, 1.0, "Coins");
    }

    @Test
    public void build_noCurrencySet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, "com.amazon.item", .99, 1.0, null);
    }

    @Test
    public void build_emptyCurrencySet_returnsNull() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, false, "com.amazon.item", .99, 1.0, "");
    }

    @Test
    public void build_allValuesSet_returnsEvent() {
        VirtualMonetizationEventBuilder builder = new VirtualMonetizationEventBuilder(
                mockEventClient);
        verifyMonetizationEvent(builder, true, "com.amazon.item", .99, 1.0, "Coins");
    }

    private static void verifyMonetizationEvent(VirtualMonetizationEventBuilder builder,
            boolean successfulBuild, String productId, Double itemPrice,
            Double quantity, String currency) {

        if (productId != null) {
            builder.setProductId(productId);
        }
        if (itemPrice != null) {
            builder.setItemPrice(itemPrice);
        }
        if (quantity != null) {
            builder.setQuantity(quantity);
        }
        if (currency != null) {
            builder.withCurrency(currency);
        }

        AnalyticsEvent purchaseEvent = builder.build();

        if (successfulBuild) {
            assertThat(purchaseEvent, is(not(nullValue())));
            assertThat(purchaseEvent.getEventType(),
                    is(MonetizationEventBuilder.PURCHASE_EVENT_NAME));

            Map<String, String> attributes = purchaseEvent.getAllAttributes();
            assertThat(attributes.get(MonetizationEventBuilder.PURCHASE_EVENT_PRODUCT_ID_ATTR),
                    is(productId));
            assertThat(
                    attributes.get(MonetizationEventBuilder.PURCHASE_EVENT_PRICE_FORMATTED_ATTR),
                    is(nullValue()));
            assertThat(attributes.get(MonetizationEventBuilder.PURCHASE_EVENT_TRANSACTION_ID_ATTR),
                    is(nullValue()));
            assertThat(attributes.get(MonetizationEventBuilder.PURCHASE_EVENT_STORE_ATTR),
                    is(MonetizationEventBuilder.VIRTUAL_STORE));
            assertThat(attributes.get(MonetizationEventBuilder.PURCHASE_EVENT_CURRENCY_ATTR),
                    is(currency));

            Map<String, Double> metrics = purchaseEvent.getAllMetrics();
            assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_QUANTITY_METRIC)
                    .doubleValue(), is(quantity));
            if (metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_ITEM_PRICE_METRIC) == null) {
                assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_ITEM_PRICE_METRIC),
                        is(nullValue()));
            } else {
                assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_ITEM_PRICE_METRIC)
                        .doubleValue(), is(itemPrice));
            }

        } else {
            assertThat(purchaseEvent, is(nullValue()));
        }
    }

}
