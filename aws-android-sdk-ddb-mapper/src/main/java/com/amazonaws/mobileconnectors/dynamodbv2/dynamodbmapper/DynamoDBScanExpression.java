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

package com.amazonaws.mobileconnectors.dynamodbv2.dynamodbmapper;

import com.amazonaws.services.dynamodbv2.model.AttributeValue;
import com.amazonaws.services.dynamodbv2.model.ComparisonOperator;
import com.amazonaws.services.dynamodbv2.model.Condition;
import com.amazonaws.services.dynamodbv2.model.ConditionalOperator;
import com.amazonaws.services.dynamodbv2.model.ScanRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Options for filtering results from a scan operation. For example, callers can
 * specify filter conditions so that only objects whose attributes match
 * different conditions are returned (see {@link ComparisonOperator} for more
 * information on the available comparison types).
 *
 * @see DynamoDBMapper#scan(Class, DynamoDBScanExpression)
 */
public class DynamoDBScanExpression {

    /** Optional filter to limit the results of the scan. */
    private Map<String, Condition> scanFilter;

    /** The exclusive start key for this scan. */
    private Map<String, AttributeValue> exclusiveStartKey;

    /** The limit of items to scan during this scan. */
    private Integer limit;

    /**
     * The total number of segments into which the scan will be divided. Only
     * required for parallel scan operation.
     */
    private Integer totalSegments;

    /**
     * The ID (zero-based) of the segment to be scanned. Only required for
     * parallel scan operation.
     */
    private Integer segment;

    /**
     * The logical operator on the filter conditions of this scan.
     */
    private String conditionalOperator;

    /**
     * Evaluates the scan results and returns only the desired values.
     * <p>
     * The condition you specify is applied to the items scanned; any items that
     * do not match the expression are not returned.
     */
    private String filterExpression;

    /**
     * One or more substitution variables for simplifying complex expressions.
     * The following are some use cases for an ExpressionAttributeName:
     * <ul>
     * <li>
     * <p>
     * Shorten an attribute name that is very long or unwieldy in an expression.
     * </li>
     * <li>
     * <p>
     * Create a placeholder for repeating occurrences of an attribute name in an
     * expression.</li>
     * <li>
     * <p>
     * Prevent special characters in an attribute name from being misinterpreted
     * in an expression.</li>
     * </ul>
     * <p>
     * Use the <b>#</b> character in an expression to dereference an attribute
     * name. For example, consider the following expression:
     * <ul>
     * <li>
     * <p>
     * <code>order.customerInfo.LastName = "Smith" OR
     * order.customerInfo.LastName = "Jones"</code></li>
     * </ul>
     * <p>
     * Now suppose that you specified the following for
     * <i>ExpressionAttributeNames</i>:
     * <ul>
     * <li>
     * <p>
     * <code>{"n":"order.customerInfo.LastName"}</code></li>
     * </ul>
     * <p>
     * The expression can now be simplified as follows:
     * <ul>
     * <li>
     * <p>
     * <code>#n = "Smith" OR #n = "Jones"</code></li>
     * </ul>
     */
    private java.util.Map<String, String> expressionAttributeNames;

    /**
     * One or more values that can be substituted in an expression.
     * <p>
     * Use the <b>:</b> character in an expression to dereference an attribute
     * value. For example, consider the following expression:
     * <ul>
     * <li>
     * <p>
     * <code>ProductStatus IN
     * ("Available","Backordered","Discontinued")</code></li>
     * </ul>
     * <p>
     * Now suppose that you specified the following for
     * <i>ExpressionAttributeValues</i>:
     * <ul>
     * <li>
     * <p>
     * <code>{
     * "a":{"S":"Available"}, "b":{"S":"Backordered"},
     * "d":{"S":"Discontinued"} }</code></li>
     * </ul>
     * <p>
     * The expression can now be simplified as follows:
     * <ul>
     * <li>
     * <p>
     * <code>ProductStatus IN
     * (:a,:b,:c)</code></li>
     * </ul>
     */
    private java.util.Map<String, AttributeValue> expressionAttributeValues;

    /**
     * Returns the scan filter as a map of attribute names to conditions.
     *
     * @return The scan filter as a map of attribute names to conditions.
     */
    public Map<String, Condition> getScanFilter() {
        return scanFilter;
    }

    /**
     * Sets the scan filter to the map of attribute names to conditions given.
     *
     * @param scanFilter The map of attribute names to conditions to use when
     *            filtering scan results.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setScanFilter(Map<String, Condition> scanFilter) {
        this.scanFilter = scanFilter;
    }

    /**
     * Sets the scan filter to the map of attribute names to conditions given
     * and returns a pointer to this object for method-chaining.
     *
     * @param scanFilter The map of attribute names to conditions to use when
     *            filtering scan results.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withScanFilter(Map<String, Condition> scanFilter) {
        setScanFilter(scanFilter);
        return this;
    }

    /**
     * Adds a new filter condition to the current scan filter.
     *
     * @param attributeName The name of the attribute on which the specified
     *            condition operates.
     * @param condition The condition which describes how the specified
     *            attribute is compared and if a row of data is included in the
     *            results returned by the scan operation.
     */
    public void addFilterCondition(String attributeName, Condition condition) {
        if (scanFilter == null) {
            scanFilter = new HashMap<String, Condition>();
        }

        scanFilter.put(attributeName, condition);
    }

    /**
     * Adds a new filter condition to the current scan filter and returns a
     * pointer to this object for method-chaining.
     *
     * @param attributeName The name of the attribute on which the specified
     *            condition operates.
     * @param condition The condition which describes how the specified
     *            attribute is compared and if a row of data is included in the
     *            results returned by the scan operation.
     * @return updated {@link DynamoDBScanExpression}
     */
    public DynamoDBScanExpression withFilterConditionEntry(String attributeName, Condition condition) {
        if (scanFilter == null) {
            scanFilter = new HashMap<String, Condition>();
        }

        scanFilter.put(attributeName, condition);
        return this;
    }

    /**
     * Returns the exclusive start key for this scan.
     *
     * @return the exclusive start key
     */
    public Map<String, AttributeValue> getExclusiveStartKey() {
        return exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this scan.
     *
     * @param exclusiveStartKey the exclusive start key.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setExclusiveStartKey(Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
    }

    /**
     * Sets the exclusive start key for this scan and returns a pointer to this
     * object for method-chaining.
     *
     * @param exclusiveStartKey a map of string to attribute value.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withExclusiveStartKey(
            Map<String, AttributeValue> exclusiveStartKey) {
        this.exclusiveStartKey = exclusiveStartKey;
        return this;
    }

    /**
     * Returns the limit of items to scan during this scan.
     * <p>
     * Use with caution. Please note that this is <b>not</b> the same as the
     * number of items to return from the scan operation -- the operation will
     * cease and return as soon as this many items are scanned, even if no
     * matching results are found. Furthermore, {@link PaginatedScanList} will
     * execute as many scan operations as necessary until it either reaches the
     * end of the result set as indicated by DynamoDB or enough elements are
     * available to fulfill the list operation (e.g. iteration). Therefore,
     * except when scanning without a scan filter, it's usually bad practice to
     * set a low limit, since doing so will often generate the same amount of
     * traffic to DynamoDB but with a greater number of round trips and
     * therefore more overall latency.
     *
     * @return the limit for scan.
     */
    public Integer getLimit() {
        return limit;
    }

    /**
     * Sets the limit of items to scan during this scan. Please note that this
     * is <b>not</b> the same as the number of items to return from the scan
     * operation -- the operation will cease and return as soon as this many
     * items are scanned, even if no matching results are found.
     *
     * @param limit the limit for scan operation.
     * @see DynamoDBScanExpression#getLimit()
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    /**
     * Sets the limit of items to scan and returns a pointer to this object for
     * method-chaining. Please note that this is <b>not</b> the same as the
     * number of items to return from the scan operation -- the operation will
     * cease and return as soon as this many items are scanned, even if no
     * matching results are found.
     *
     * @param limit the limit for scan operation.
     * @return updated {@link DynamoDBScanExpression}
     * @see DynamoDBScanExpression#getLimit()
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Returns the total number of segments into which the scan will be divided.
     *
     * @return the total segments.
     */
    public Integer getTotalSegments() {
        return totalSegments;
    }

    /**
     * Sets the total number of segments into which the scan will be divided.
     * 
     * @param totalSegments the total segments.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setTotalSegments(Integer totalSegments) {
        this.totalSegments = totalSegments;
    }

    /**
     * Sets the total number of segments into which the scan will be divided and
     * returns a pointer to this object for method-chaining.
     *
     * @param totalSegments the total segments.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withTotalSegments(Integer totalSegments) {
        setTotalSegments(totalSegments);
        return this;
    }

    /**
     * Returns the ID of the segment to be scanned.
     *
     * @return the id of the segment to be scanned.
     */
    public Integer getSegment() {
        return segment;
    }

    /**
     * Sets the ID of the segment to be scanned.
     *
     * @param segment the id of the segment to be scanned.
     */
    public void setSegment(Integer segment) {
        this.segment = segment;
    }

    /**
     * Sets the ID of the segment to be scanned and returns a pointer to this
     * object for method-chaining.
     *
     * @param segment the id of the segment to be scanned.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withSegment(Integer segment) {
        setSegment(segment);
        return this;
    }

    /**
     * Returns the logical operator on the filter conditions of this scan.
     *
     * @return the conditional operator.
     */
    public String getConditionalOperator() {
        return conditionalOperator;
    }

    /**
     * Sets the logical operator on the filter conditions of this scan.
     *
     * @param conditionalOperator the logical operator.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setConditionalOperator(String conditionalOperator) {
        this.conditionalOperator = conditionalOperator;
    }

    /**
     * Sets the logical operator on the filter conditions of this scan and
     * returns a pointer to this object for method-chaining.
     *
     * @param conditionalOperator the logical operator.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withConditionalOperator(String conditionalOperator) {
        setConditionalOperator(conditionalOperator);
        return this;
    }

    /**
     * Sets the logical operator on the filter conditions of this scan.
     *
     * @param conditionalOperator the logical operator.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setConditionalOperator(ConditionalOperator conditionalOperator) {
        setConditionalOperator(conditionalOperator.toString());
    }

    /**
     * Sets the logical operator on the filter conditions of this scan and
     * returns a pointer to this object for method-chaining.
     *
     * @param conditionalOperator the logical operator.
     * @return updated {@link DynamoDBScanExpression}
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withConditionalOperator(ConditionalOperator conditionalOperator) {
        return withConditionalOperator(conditionalOperator.toString());
    }

    /**
     * Evaluates the query results and returns only the desired values.
     * <p>
     * The condition you specify is applied to the items queried; any items that
     * do not match the expression are not returned.
     *
     * @return Evaluates the query results and returns only the desired values.
     *         <p>
     *         The condition you specify is applied to the items queried; any
     *         items that do not match the expression are not returned.
     * @see ScanRequest#getFilterExpression()
     */
    public String getFilterExpression() {
        return filterExpression;
    }

    /**
     * Evaluates the query results and returns only the desired values.
     * <p>
     * The condition you specify is applied to the items queried; any items that
     * do not match the expression are not returned.
     *
     * @param filterExpression Evaluates the query results and returns only the
     *            desired values.
     *            <p>
     *            The condition you specify is applied to the items queried; any
     *            items that do not match the expression are not returned.
     * @see ScanRequest#setFilterExpression(String)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
    }

    /**
     * Evaluates the query results and returns only the desired values.
     * <p>
     * The condition you specify is applied to the items queried; any items that
     * do not match the expression are not returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param filterExpression Evaluates the query results and returns only the
     *            desired values.
     *            <p>
     *            The condition you specify is applied to the items queried; any
     *            items that do not match the expression are not returned.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanRequest#withFilterExpression(String)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withFilterExpression(String filterExpression) {
        this.filterExpression = filterExpression;
        return this;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @return One or more substitution variables for simplifying complex
     *         expressions.
     * @see scanRequest#getExpressionAttributeNames()
     */
    public java.util.Map<String, String> getExpressionAttributeNames() {

        return expressionAttributeNames;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @param expressionAttributeNames One or more substitution variables for
     *            simplifying complex expressions.
     * @see ScanRequest#setExpressionAttributeNames(Map)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        this.expressionAttributeNames = expressionAttributeNames;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     *
     * @param expressionAttributeNames One or more substitution variables for
     *            simplifying complex expressions.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanRequest#withExpressionAttributeNames(Map)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withExpressionAttributeNames(
            java.util.Map<String, String> expressionAttributeNames) {
        setExpressionAttributeNames(expressionAttributeNames);
        return this;
    }

    /**
     * One or more substitution variables for simplifying complex expressions.
     * The method adds a new key-value pair into ExpressionAttributeNames
     * parameter, and returns a reference to this object so that method calls
     * can be chained together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeNames.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeNames.
     * @return updated {@link DynamoDBScanExpression}
     * @see ScanRequest#addExpressionAttributeNamesEntry(String, String)
     */
    public DynamoDBScanExpression addExpressionAttributeNamesEntry(String key,
            String value) {
        if (null == this.expressionAttributeNames) {
            this.expressionAttributeNames = new java.util.HashMap<String, String>();
        }
        if (this.expressionAttributeNames.containsKey(key)) {
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        }
        this.expressionAttributeNames.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeNames, setting
     * ExpressAttributesNames to null
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @return updated {@link DynamoDBScanExpression}
     */
    public DynamoDBScanExpression clearExpressionAttributeNamesEntries() {
        this.expressionAttributeNames = null;
        return this;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @return One or more values that can be substituted in an expression.
     * @see ScanRequest#getExpressionAttributeValues()
     */
    public java.util.Map<String, AttributeValue> getExpressionAttributeValues() {

        return expressionAttributeValues;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @param expressionAttributeValues One or more values that can be
     *            substituted in an expression.
     * @see ScanRequest#setExpressionAttributeValues(Map)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public void setExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        this.expressionAttributeValues = expressionAttributeValues;
    }

    /**
     * One or more values that can be substituted in an expression.
     *
     * @param expressionAttributeValues One or more values that can be
     *            substituted in an expression.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ScanRequest#withExpressionAttributeValues(Map)
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DynamoDBScanExpression withExpressionAttributeValues(
            java.util.Map<String, AttributeValue> expressionAttributeValues) {
        setExpressionAttributeValues(expressionAttributeValues);
        return this;
    }

    /**
     * One or more values that can be substituted in an expression. The method
     * adds a new key-value pair into ExpressionAttributeValues parameter, and
     * returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param key The key of the entry to be added into
     *            ExpressionAttributeValues.
     * @param value The corresponding value of the entry to be added into
     *            ExpressionAttributeValues.
     * @return updated {@link DynamoDBScanExpression}
     * @see ScanRequest#addExpressionAttributeValuesEntry(String,
     *      AttributeValue)
     */
    public DynamoDBScanExpression addExpressionAttributeValuesEntry(String key,
            AttributeValue value) {
        if (null == this.expressionAttributeValues) {
            this.expressionAttributeValues = new java.util.HashMap<String, AttributeValue>();
        }
        if (this.expressionAttributeValues.containsKey(key)) {
            throw new IllegalArgumentException("Duplicated keys ("
                    + key.toString() + ") are provided.");
        }
        this.expressionAttributeValues.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ExpressionAttributeValues, setting
     * ExpressionAttributeValues to null
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @return updated {@link DynamoDBScanExpression}
     */
    public DynamoDBScanExpression clearExpressionAttributeValuesEntries() {
        this.expressionAttributeValues = null;
        return this;
    }
}
