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

import com.amazonaws.services.s3.model.ListBucketAnalyticsConfigurationsResult;
import com.amazonaws.services.s3.model.analytics.AnalyticsConfiguration;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilter;
import com.amazonaws.services.s3.model.analytics.AnalyticsPrefixPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3BucketDestination;
import com.amazonaws.services.s3.model.analytics.AnalyticsS3ExportFileFormat;
import com.amazonaws.services.s3.model.analytics.AnalyticsTagPredicate;
import com.amazonaws.services.s3.model.analytics.AnalyticsAndOperator;
import com.amazonaws.services.s3.model.analytics.AnalyticsFilterPredicate;
import com.amazonaws.services.s3.model.GetBucketAnalyticsConfigurationResult;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysis;
import com.amazonaws.services.s3.model.analytics.StorageClassAnalysisSchemaVersion;

import java.util.List;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class BucketAnalyticsSaxUnmarshallerTest {
    private static final String GET_RESPONSE = "/resources/unmarshalling/AnalyticsConfiguration.xml";
    private static final String LIST_RESPONSE = "/resources/unmarshalling/ListBucketAnalyticsConfigurationsResponse.xml";

    @Test
    public void getResponse_unmarshalls_properly() throws Exception {
        AnalyticsConfiguration configuration = parseGetAnalyticsConfigurationResponse(GET_RESPONSE).getAnalyticsConfiguration();
        AnalyticsFilter filter = configuration.getFilter();
        StorageClassAnalysis storageClassAnalysis = configuration.getStorageClassAnalysis();

        assertEquals("analytics-id", configuration.getId());

        assertNotNull(filter);
        List<AnalyticsFilterPredicate> operands = ((AnalyticsAndOperator) filter.getPredicate()).getOperands();
        assertEquals(2, operands.size());
        assertEquals("documents/", ((AnalyticsPrefixPredicate) operands.get(0)).getPrefix());
        assertEquals("foo", ((AnalyticsTagPredicate) operands.get(1)).getTag().getKey());
        assertEquals("bar", ((AnalyticsTagPredicate) operands.get(1)).getTag().getValue());

        assertEquals(StorageClassAnalysisSchemaVersion.V_1.toString(), storageClassAnalysis.getDataExport().getOutputSchemaVersion());
        AnalyticsS3BucketDestination s3BucketDestination = storageClassAnalysis.getDataExport().getDestination().getS3BucketDestination();
        assertEquals(AnalyticsS3ExportFileFormat.CSV.toString(), s3BucketDestination.getFormat());
        assertEquals("123456789", s3BucketDestination.getBucketAccountId());
        assertEquals("arn:aws:s3:::destination-bucket", s3BucketDestination.getBucketArn());
        assertEquals("destination-prefix", s3BucketDestination.getPrefix());
    }

    @Test
    public void listResponse_unmarshalls_properly() throws Exception {
        ListBucketAnalyticsConfigurationsResult result = parseListAnalyticsConfigurationResponse(LIST_RESPONSE);

        assertTrue(result.isTruncated());
        assertEquals("token1", result.getContinuationToken());
        assertEquals("token2", result.getNextContinuationToken());

        List<AnalyticsConfiguration> analyticsConfigurationList = result.getAnalyticsConfigurationList();
        assertEquals(2, analyticsConfigurationList.size());

        // Test first analytics configuration
        AnalyticsConfiguration configuration = analyticsConfigurationList.get(0);
        AnalyticsFilter filter = configuration.getFilter();
        StorageClassAnalysis storageClassAnalysis = configuration.getStorageClassAnalysis();

        assertEquals("XXX", configuration.getId());
        assertNotNull(filter);
        List<AnalyticsFilterPredicate> operands = ((AnalyticsAndOperator) filter.getPredicate()).getOperands();
        assertEquals(2, operands.size());
        assertEquals("documents/", ((AnalyticsPrefixPredicate) operands.get(0)).getPrefix());
        assertEquals("foo", ((AnalyticsTagPredicate) operands.get(1)).getTag().getKey());
        assertEquals("bar", ((AnalyticsTagPredicate) operands.get(1)).getTag().getValue());
        assertEquals(StorageClassAnalysisSchemaVersion.V_1.toString(), storageClassAnalysis.getDataExport().getOutputSchemaVersion());
        AnalyticsS3BucketDestination s3BucketDestination = storageClassAnalysis.getDataExport().getDestination().getS3BucketDestination();
        assertEquals(AnalyticsS3ExportFileFormat.CSV.toString(), s3BucketDestination.getFormat());
        assertEquals("123456789", s3BucketDestination.getBucketAccountId());
        assertEquals("arn:aws:s3:::destination-bucket", s3BucketDestination.getBucketArn());
        assertEquals("destination-prefix", s3BucketDestination.getPrefix());

        // Test second analytics configuration
        configuration = analyticsConfigurationList.get(1);
        storageClassAnalysis = configuration.getStorageClassAnalysis();
        assertEquals("YYY", configuration.getId());
        assertEquals("prefix", ((AnalyticsPrefixPredicate) configuration.getFilter().getPredicate()).getPrefix());
        assertEquals("V_2", storageClassAnalysis.getDataExport().getOutputSchemaVersion());
        s3BucketDestination = storageClassAnalysis.getDataExport().getDestination().getS3BucketDestination();
        assertEquals("JSON", s3BucketDestination.getFormat());
        assertEquals("123", s3BucketDestination.getBucketAccountId());
        assertEquals("arn:aws:s3:::bucket2", s3BucketDestination.getBucketArn());
        assertEquals("prefix2", s3BucketDestination.getPrefix());
    }

    /**
     * @param resourceLocation
     *            Location of resource containing XML to unmarshall
     * @return Marshalled response
     */
    private GetBucketAnalyticsConfigurationResult parseGetAnalyticsConfigurationResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseGetBucketAnalyticsConfigurationResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }

    private ListBucketAnalyticsConfigurationsResult parseListAnalyticsConfigurationResponse(String resourceLocation) throws Exception {
        return new XmlResponsesSaxParser()
                .parseListBucketAnalyticsConfigurationResponse(getClass().getResourceAsStream(resourceLocation))
                .getResult();
    }

}
