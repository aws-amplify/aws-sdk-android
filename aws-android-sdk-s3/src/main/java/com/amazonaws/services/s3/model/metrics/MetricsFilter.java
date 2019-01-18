/*
 * Copyright 2011-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.metrics;

import java.io.Serializable;

/**
 * The filter used to describe a set of objects to include for metrics.
 * The metrics configuration will only include objects that meet the filter's criteria.
 *
 * A filter contains one of {@link MetricsPrefixPredicate}, {@link MetricsTagPredicate}
 * or {@link MetricsAndOperator}.
 */
public class MetricsFilter implements Serializable {

    private MetricsFilterPredicate predicate;

    /**
     * Constructor.
     */
    public MetricsFilter() { }

    /**
     * Constructor.
     * @param predicate the MetricsFilterPredicate.
     */
    public MetricsFilter(MetricsFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * @return the {@link MetricsFilterPredicate} to be used when evaluating a metrics filter.
     *
     * The predicate is one of {@link MetricsPrefixPredicate}, {@link MetricsTagPredicate}
     * or {@link MetricsAndOperator}.
     */
    public MetricsFilterPredicate getPredicate() {
        return predicate;
    }

    /**
     * @param predicate  the {@link MetricsFilterPredicate} to be used when evaluating a metrics filter.
     *
     * The predicate should be one of {@link MetricsPrefixPredicate}, {@link MetricsTagPredicate}
     * or {@link MetricsAndOperator}.
     */
    public void setPredicate(MetricsFilterPredicate predicate) {
        this.predicate = predicate;
    }

    /**
     * @param predicate  the {@link MetricsFilterPredicate} to be used when evaluating a metrics filter
     * @return the {@link MetricsFilter} object for method chaining.
     *
     * The predicate should be one of {@link MetricsPrefixPredicate}, {@link MetricsTagPredicate}
     * or {@link MetricsAndOperator}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public MetricsFilter withPredicate(MetricsFilterPredicate predicate) {
        setPredicate(predicate);
        return this;
    }
}
