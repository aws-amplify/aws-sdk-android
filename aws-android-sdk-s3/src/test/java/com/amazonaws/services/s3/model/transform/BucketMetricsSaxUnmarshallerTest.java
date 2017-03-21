/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.transform;

import com.amazonaws.services.s3.model.GetBucketMetricsConfigurationResult;
import com.amazonaws.services.s3.model.ListBucketMetricsConfigurationsResult;
import com.amazonaws.services.s3.model.metrics.MetricsAndOperator;
import com.amazonaws.services.s3.model.metrics.MetricsFilter;
import com.amazonaws.services.s3.model.metrics.MetricsFilterPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsConfiguration;
import com.amazonaws.services.s3.model.metrics.MetricsPrefixPredicate;
import com.amazonaws.services.s3.model.metrics.MetricsTagPredicate;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BucketMetricsSaxUnmarshallerTest {

    private static final String GET_RESPONSE = "/resources/unmarshalling/MetricsConfiguration.xml";
    private static final String LIST_RESPONSE = "/resources/unmarshalling/ListBucketMetricsConfigurationsResponse.xml";

    @Test
    public void getResponse_unmarshalls_properly() throws Exception {
        MetricsConfiguration configuration = parseGetBucketMetricsConfigurationResponse(GET_RESPONSE).getMetricsConfiguration();
        MetricsFilter filter = configuration.getFilter();

        assertEquals("metrics-id", configuration.getId());
        List<MetricsFilterPredicate> operands = ((MetricsAndOperator) filter.getPredicate()).getOperands();
        assertEquals(3, operands.size());
        assertEquals("documents/", ((MetricsPrefixPredicate) operands.get(0)).getPrefix());
        assertEquals("foo", ((MetricsTagPredicate) operands.get(1)).getTag().getKey());
        assertEquals("bar", ((MetricsTagPredicate) operands.get(1)).getTag().getValue());
        assertEquals("", ((MetricsTagPredicate) operands.get(2)).getTag().getKey());
        assertEquals("", ((MetricsTagPredicate) operands.get(2)).getTag().getValue());
    }

    @Test
    public void listResponse_unmarshalls_properly() throws Exception {
        ListBucketMetricsConfigurationsResult result = parseListBucketMetricsConfigurationsResponse(LIST_RESPONSE);

        assertTrue(result.isTruncated());
        assertEquals("token1", result.getContinuationToken());
        assertEquals("token2", result.getNextContinuationToken());

        List<MetricsConfiguration> metricsConfigurationList = result.getMetricsConfigurationList();
        assertEquals(2, metricsConfigurationList.size());

        // Test first metrics configuration
        MetricsConfiguration configuration = metricsConfigurationList.get(0);
        MetricsFilter filter = configuration.getFilter();

        assertEquals("id1", configuration.getId());
        assertNotNull(filter);
        List<MetricsFilterPredicate> operands = ((MetricsAndOperator) filter.getPredicate()).getOperands();
        assertEquals(2, operands.size());
        assertEquals("documents/", ((MetricsPrefixPredicate) operands.get(0)).getPrefix());
        assertEquals("foo", ((MetricsTagPredicate) operands.get(1)).getTag().getKey());
        assertEquals("bar", ((MetricsTagPredicate) operands.get(1)).getTag().getValue());

        // Test second metrics configuration
        configuration = metricsConfigurationList.get(1);
        assertEquals("id2", configuration.getId());
        MetricsTagPredicate tagPredicate = (MetricsTagPredicate) configuration.getFilter().getPredicate();
        assertEquals("key", tagPredicate.getTag().getKey());
        assertEquals("value", tagPredicate.getTag().getValue());
    }

    /**
     * @param resourceLocation
     *            Location of resource containing XML to unmarshall
     * @return Marshalled response
     */
    private GetBucketMetricsConfigurationResult parseGetBucketMetricsConfigurationResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseGetBucketMetricsConfigurationResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }

    private ListBucketMetricsConfigurationsResult parseListBucketMetricsConfigurationsResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseListBucketMetricsConfigurationsResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }
}
