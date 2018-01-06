/*
 * Copyright 2011-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.s3.model.analytics;

import java.util.List;

/**
 *  Abstract class representing an operator that acts on N number of predicates.
 */
abstract class AnalyticsNAryOperator extends AnalyticsFilterPredicate {

    private final List<AnalyticsFilterPredicate> operands;

    public AnalyticsNAryOperator(List<AnalyticsFilterPredicate> operands) {
        this.operands = operands;
    }

    public List<AnalyticsFilterPredicate> getOperands() {
        return operands;
    }
}
