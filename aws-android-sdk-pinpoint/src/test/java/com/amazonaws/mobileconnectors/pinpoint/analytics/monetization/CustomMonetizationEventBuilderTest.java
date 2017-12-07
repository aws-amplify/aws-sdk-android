/**
 * Copyright 2016-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.util.Map;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.annotation.Config;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsClient;
import com.amazonaws.mobileconnectors.pinpoint.analytics.AnalyticsEvent;
import com.amazonaws.mobileconnectors.pinpoint.analytics.MobileAnalyticsTestBase;
import com.amazonaws.mobileconnectors.pinpoint.analytics.utils.AnalyticsContextBuilder;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.PinpointContext;
import com.amazonaws.mobileconnectors.pinpoint.internal.core.configuration.AndroidPreferencesConfiguration;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.hamcrest.Matchers.nullValue;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

@RunWith(RobolectricTestRunner.class)
@Config(manifest = Config.NONE)
public class CustomMonetizationEventBuilderTest
        extends MobileAnalyticsTestBase {

    AnalyticsClient mockEventClient = Mockito.mock(AnalyticsClient.class);
    @Mock
    AndroidPreferencesConfiguration mockConfiguration;
    private AnalyticsClient target;

    private static void verifyMonetizationEvent(CustomMonetizationEventBuilder builder,
                                                       boolean successfulBuild,
                                                       String store,
                                                       String productId,
                                                       Double quantity,
                                                       String formattedPrice,
                                                       Double itemPrice,
                                                       String currency,
                                                       String transactionId) {

        if (store != null) {
            builder.setStore(store);
        }
        if (productId != null) {
            builder.setProductId(productId);
        }
        if (quantity != null) {
            builder.setQuantity(quantity);
        }
        if (formattedPrice != null) {
            builder.setFormattedItemPrice(formattedPrice);
        }
        if (itemPrice != null) {
            builder.setItemPrice(itemPrice);
        }
        if (currency != null) {
            builder.setCurrency(currency);
        }
        if (transactionId != null) {
            builder.setTransactionId(transactionId);
        }

        AnalyticsEvent purchaseEvent = builder.build();

        if (successfulBuild) {
            assertThat(purchaseEvent, is(not(nullValue())));
            assertThat(purchaseEvent.getEventType(),
                              is(MonetizationEventBuilder.PURCHASE_EVENT_NAME));

            Map<String, String> attributes = purchaseEvent.getAllAttributes();
            assertThat(attributes
                               .get(MonetizationEventBuilder.PURCHASE_EVENT_STORE_ATTR),
                              is(store));
            assertThat(attributes
                               .get(MonetizationEventBuilder.PURCHASE_EVENT_PRODUCT_ID_ATTR),
                              is(productId));
            if (currency != null) {
                assertThat(attributes
                                   .get(MonetizationEventBuilder.PURCHASE_EVENT_CURRENCY_ATTR),
                                  is(currency));
            } else {
                assertThat(attributes
                                   .get(MonetizationEventBuilder.PURCHASE_EVENT_CURRENCY_ATTR),
                                  is(nullValue()));
            }
            if (formattedPrice != null) {
                assertThat(
                                  attributes
                                          .get(MonetizationEventBuilder.PURCHASE_EVENT_PRICE_FORMATTED_ATTR),
                                  is(formattedPrice));
            } else {
                assertThat(
                                  attributes
                                          .get(MonetizationEventBuilder.PURCHASE_EVENT_PRICE_FORMATTED_ATTR),
                                  is(nullValue()));
            }
            if (transactionId != null) {
                assertThat(
                                  attributes
                                          .get(MonetizationEventBuilder.PURCHASE_EVENT_TRANSACTION_ID_ATTR),
                                  is(transactionId));
            } else {
                assertThat(
                                  attributes
                                          .get(MonetizationEventBuilder.PURCHASE_EVENT_TRANSACTION_ID_ATTR),
                                  is(nullValue()));
            }

            Map<String, Double> metrics = purchaseEvent.getAllMetrics();
            assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_QUANTITY_METRIC)
                               .doubleValue(), is(quantity));
            if (itemPrice != null) {
                assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_ITEM_PRICE_METRIC)
                                   .doubleValue(), is(itemPrice));
            } else {
                assertThat(metrics.get(MonetizationEventBuilder.PURCHASE_EVENT_ITEM_PRICE_METRIC),
                                  is(nullValue()));
            }

        } else {
            assertThat(purchaseEvent, is(nullValue()));
        }
    }

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);

        when(mockConfiguration.optString("versionKey", "ver"))
                .thenReturn("ver");
        when(mockConfiguration.optBoolean("isAnalyticsEnabled", true))
                .thenReturn(true);

        PinpointContext mockContext = new AnalyticsContextBuilder()
                                              .withConfiguration(mockConfiguration)
                                              .withContext(RuntimeEnvironment.application
                                                                   .getApplicationContext())
                                              .build();

        target = new AnalyticsClient(mockContext);
        AnalyticsEvent testEvent = target.createEvent(MonetizationEventBuilder.PURCHASE_EVENT_NAME);
        when(mockEventClient
                     .createEvent(MonetizationEventBuilder.PURCHASE_EVENT_NAME))
                .thenReturn(
                                   testEvent);
    }

    @Test
    public void build_storeNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, null, "com.amazon.item", 1.0,
                                       "$1.99", 1.99, "USD",
                                       "123456ABCDEFG");
    }

    @Test
    public void build_storeEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "", "com.amazon.item", 1.0,
                                       "$1.99", 1.99, "USD",
                                       "123456ABCDEFG");
    }

    @Test
    public void build_productIdNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store", null, 1.0,
                                       "$1.99", 1.99, "USD",
                                       "123456ABCDEFG");
    }

    @Test
    public void build_productIdEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store", "", 1.0,
                                       "$1.99", 1.99, "USD",
                                       "123456ABCDEFG");
    }

    // ==================== ITEM PRICE COMBINATIONS ====================

    @Test
    public void build_quantityNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", null, "$1.99",
                                       1.99, "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceNotSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, null, null,
                                       null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceNotSet_currencySet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, null, null,
                                       "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceNotSet_currencyEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, null, null,
                                       "", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, null, 1.99,
                                       null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceSet_currencySet_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, null, 1.99,
                                       "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceNotSet_itemPriceSet_currencyEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, null, 1.99,
                                       "", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceNotSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       null, null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceNotSet_currencySet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       null, "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceNotSet_currencyEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       null, "", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceSet_currencySet_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceSet_itemPriceSet_currencySet_conflictingPrices_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$2.99",
                                       1.99, "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPricSet_itemPriceSet_currencyEmpty_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceEmpty_itemPriceNotSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "", null,
                                       null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceEmpty_itemPriceNotSet_currencySet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "", null,
                                       "USD", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceEmpty_itemPriceNotSet_currencyEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "", null,
                                       "", "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceEmpty_itemPriceSet_currencyNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "", 1.99,
                                       null, "123456ABCDEFG");
    }

    @Test
    public void build_formattedPriceEmpty_itemPriceSet_currencySet_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "", 1.99,
                                       "USD", "123456ABCDEFG");
    }

    // ================== END ITEM PRICE COMBINATIONS ==================

    @Test
    public void build_formattedPricEmpty_itemPriceSet_currencyEmpty_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "", 1.99,
                                       "", "123456ABCDEFG");
    }

    @Test
    public void build_transactionIdNotSet_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "USD", null);
    }

    @Test
    public void build_transactionIdEmpty_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "USD", "");
    }

    @Test
    public void build_eventClientNotSet_returnsNull() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(null);
        verifyMonetizationEvent(builder, false, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "USD", "123456ABCDEFG");
    }

    @Test
    public void build_allValuesSet_returnsEvent() {
        CustomMonetizationEventBuilder builder = new CustomMonetizationEventBuilder(mockEventClient);
        verifyMonetizationEvent(builder, true, "Custom Store",
                                       "com.amazon.item", 1.0, "$1.99",
                                       1.99, "USD", "123456ABCDEFG");
    }

}
