/*
 * Copyright 2010-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;

/**
 * <p>
 * The user-specified preferences for how AWS CloudFormation performs a stack
 * set operation.
 * </p>
 * <p>
 * For more information on maximum concurrent accounts and failure tolerance,
 * see <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
 * >Stack set operation options</a>.
 * </p>
 */
public class StackSetOperationPreferences implements Serializable {
    /**
     * <p>
     * The order of the Regions in where you want to perform the stack
     * operation.
     * </p>
     */
    private java.util.List<String> regionOrder;

    /**
     * <p>
     * The number of accounts, per Region, for which this operation can fail
     * before AWS CloudFormation stops the operation in that Region. If the
     * operation is stopped in a Region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent Regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer failureToleranceCount;

    /**
     * <p>
     * The percentage of accounts, per Region, for which this stack operation
     * can fail before AWS CloudFormation stops the operation in that Region. If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt
     * the operation in any subsequent Regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds <i>down</i> to the next whole
     * number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer failureTolerancePercentage;

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at
     * most one more than the <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer maxConcurrentCount;

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. This
     * is true except in cases where rounding down would result is zero. In this
     * case, CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer maxConcurrentPercentage;

    /**
     * <p>
     * The order of the Regions in where you want to perform the stack
     * operation.
     * </p>
     *
     * @return <p>
     *         The order of the Regions in where you want to perform the stack
     *         operation.
     *         </p>
     */
    public java.util.List<String> getRegionOrder() {
        return regionOrder;
    }

    /**
     * <p>
     * The order of the Regions in where you want to perform the stack
     * operation.
     * </p>
     *
     * @param regionOrder <p>
     *            The order of the Regions in where you want to perform the
     *            stack operation.
     *            </p>
     */
    public void setRegionOrder(java.util.Collection<String> regionOrder) {
        if (regionOrder == null) {
            this.regionOrder = null;
            return;
        }

        this.regionOrder = new java.util.ArrayList<String>(regionOrder);
    }

    /**
     * <p>
     * The order of the Regions in where you want to perform the stack
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionOrder <p>
     *            The order of the Regions in where you want to perform the
     *            stack operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withRegionOrder(String... regionOrder) {
        if (getRegionOrder() == null) {
            this.regionOrder = new java.util.ArrayList<String>(regionOrder.length);
        }
        for (String value : regionOrder) {
            this.regionOrder.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The order of the Regions in where you want to perform the stack
     * operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regionOrder <p>
     *            The order of the Regions in where you want to perform the
     *            stack operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withRegionOrder(java.util.Collection<String> regionOrder) {
        setRegionOrder(regionOrder);
        return this;
    }

    /**
     * <p>
     * The number of accounts, per Region, for which this operation can fail
     * before AWS CloudFormation stops the operation in that Region. If the
     * operation is stopped in a Region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent Regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of accounts, per Region, for which this operation can
     *         fail before AWS CloudFormation stops the operation in that
     *         Region. If the operation is stopped in a Region, AWS
     *         CloudFormation doesn't attempt the operation in any subsequent
     *         Regions.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>FailureToleranceCount</code> or
     *         <code>FailureTolerancePercentage</code> (but not both).
     *         </p>
     */
    public Integer getFailureToleranceCount() {
        return failureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per Region, for which this operation can fail
     * before AWS CloudFormation stops the operation in that Region. If the
     * operation is stopped in a Region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent Regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failureToleranceCount <p>
     *            The number of accounts, per Region, for which this operation
     *            can fail before AWS CloudFormation stops the operation in that
     *            Region. If the operation is stopped in a Region, AWS
     *            CloudFormation doesn't attempt the operation in any subsequent
     *            Regions.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>FailureToleranceCount</code> or
     *            <code>FailureTolerancePercentage</code> (but not both).
     *            </p>
     */
    public void setFailureToleranceCount(Integer failureToleranceCount) {
        this.failureToleranceCount = failureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per Region, for which this operation can fail
     * before AWS CloudFormation stops the operation in that Region. If the
     * operation is stopped in a Region, AWS CloudFormation doesn't attempt the
     * operation in any subsequent Regions.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code> (but not both).
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param failureToleranceCount <p>
     *            The number of accounts, per Region, for which this operation
     *            can fail before AWS CloudFormation stops the operation in that
     *            Region. If the operation is stopped in a Region, AWS
     *            CloudFormation doesn't attempt the operation in any subsequent
     *            Regions.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>FailureToleranceCount</code> or
     *            <code>FailureTolerancePercentage</code> (but not both).
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withFailureToleranceCount(Integer failureToleranceCount) {
        this.failureToleranceCount = failureToleranceCount;
        return this;
    }

    /**
     * <p>
     * The percentage of accounts, per Region, for which this stack operation
     * can fail before AWS CloudFormation stops the operation in that Region. If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt
     * the operation in any subsequent Regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds <i>down</i> to the next whole
     * number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of accounts, per Region, for which this stack
     *         operation can fail before AWS CloudFormation stops the operation
     *         in that Region. If the operation is stopped in a Region, AWS
     *         CloudFormation doesn't attempt the operation in any subsequent
     *         Regions.
     *         </p>
     *         <p>
     *         When calculating the number of accounts based on the specified
     *         percentage, AWS CloudFormation rounds <i>down</i> to the next
     *         whole number.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>FailureToleranceCount</code> or
     *         <code>FailureTolerancePercentage</code>, but not both.
     *         </p>
     */
    public Integer getFailureTolerancePercentage() {
        return failureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per Region, for which this stack operation
     * can fail before AWS CloudFormation stops the operation in that Region. If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt
     * the operation in any subsequent Regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds <i>down</i> to the next whole
     * number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param failureTolerancePercentage <p>
     *            The percentage of accounts, per Region, for which this stack
     *            operation can fail before AWS CloudFormation stops the
     *            operation in that Region. If the operation is stopped in a
     *            Region, AWS CloudFormation doesn't attempt the operation in
     *            any subsequent Regions.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS CloudFormation rounds <i>down</i> to the next
     *            whole number.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>FailureToleranceCount</code> or
     *            <code>FailureTolerancePercentage</code>, but not both.
     *            </p>
     */
    public void setFailureTolerancePercentage(Integer failureTolerancePercentage) {
        this.failureTolerancePercentage = failureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per Region, for which this stack operation
     * can fail before AWS CloudFormation stops the operation in that Region. If
     * the operation is stopped in a Region, AWS CloudFormation doesn't attempt
     * the operation in any subsequent Regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds <i>down</i> to the next whole
     * number.
     * </p>
     * <p>
     * Conditional: You must specify either <code>FailureToleranceCount</code>
     * or <code>FailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param failureTolerancePercentage <p>
     *            The percentage of accounts, per Region, for which this stack
     *            operation can fail before AWS CloudFormation stops the
     *            operation in that Region. If the operation is stopped in a
     *            Region, AWS CloudFormation doesn't attempt the operation in
     *            any subsequent Regions.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS CloudFormation rounds <i>down</i> to the next
     *            whole number.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>FailureToleranceCount</code> or
     *            <code>FailureTolerancePercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withFailureTolerancePercentage(
            Integer failureTolerancePercentage) {
        this.failureTolerancePercentage = failureTolerancePercentage;
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at
     * most one more than the <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of accounts in which to perform this operation
     *         at one time. This is dependent on the value of
     *         <code>FailureToleranceCount</code>—
     *         <code>MaxConcurrentCount</code> is at most one more than the
     *         <code>FailureToleranceCount</code> .
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the <i>maximum</i> for
     *         operations. For large deployments, under certain circumstances
     *         the actual number of accounts acted upon concurrently may be
     *         lower due to service throttling.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>MaxConcurrentCount</code> or
     *         <code>MaxConcurrentPercentage</code>, but not both.
     *         </p>
     */
    public Integer getMaxConcurrentCount() {
        return maxConcurrentCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at
     * most one more than the <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxConcurrentCount <p>
     *            The maximum number of accounts in which to perform this
     *            operation at one time. This is dependent on the value of
     *            <code>FailureToleranceCount</code>—
     *            <code>MaxConcurrentCount</code> is at most one more than the
     *            <code>FailureToleranceCount</code> .
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the <i>maximum</i> for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>MaxConcurrentCount</code> or
     *            <code>MaxConcurrentPercentage</code>, but not both.
     *            </p>
     */
    public void setMaxConcurrentCount(Integer maxConcurrentCount) {
        this.maxConcurrentCount = maxConcurrentCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>FailureToleranceCount</code>—<code>MaxConcurrentCount</code> is at
     * most one more than the <code>FailureToleranceCount</code> .
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param maxConcurrentCount <p>
     *            The maximum number of accounts in which to perform this
     *            operation at one time. This is dependent on the value of
     *            <code>FailureToleranceCount</code>—
     *            <code>MaxConcurrentCount</code> is at most one more than the
     *            <code>FailureToleranceCount</code> .
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the <i>maximum</i> for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>MaxConcurrentCount</code> or
     *            <code>MaxConcurrentPercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withMaxConcurrentCount(Integer maxConcurrentCount) {
        this.maxConcurrentCount = maxConcurrentCount;
        return this;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. This
     * is true except in cases where rounding down would result is zero. In this
     * case, CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @return <p>
     *         The maximum percentage of accounts in which to perform this
     *         operation at one time.
     *         </p>
     *         <p>
     *         When calculating the number of accounts based on the specified
     *         percentage, AWS CloudFormation rounds down to the next whole
     *         number. This is true except in cases where rounding down would
     *         result is zero. In this case, CloudFormation sets the number as
     *         one instead.
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the <i>maximum</i> for
     *         operations. For large deployments, under certain circumstances
     *         the actual number of accounts acted upon concurrently may be
     *         lower due to service throttling.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>MaxConcurrentCount</code> or
     *         <code>MaxConcurrentPercentage</code>, but not both.
     *         </p>
     */
    public Integer getMaxConcurrentPercentage() {
        return maxConcurrentPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. This
     * is true except in cases where rounding down would result is zero. In this
     * case, CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxConcurrentPercentage <p>
     *            The maximum percentage of accounts in which to perform this
     *            operation at one time.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS CloudFormation rounds down to the next whole
     *            number. This is true except in cases where rounding down would
     *            result is zero. In this case, CloudFormation sets the number
     *            as one instead.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the <i>maximum</i> for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>MaxConcurrentCount</code> or
     *            <code>MaxConcurrentPercentage</code>, but not both.
     *            </p>
     */
    public void setMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
        this.maxConcurrentPercentage = maxConcurrentPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS CloudFormation rounds down to the next whole number. This
     * is true except in cases where rounding down would result is zero. In this
     * case, CloudFormation sets the number as one instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the <i>maximum</i> for
     * operations. For large deployments, under certain circumstances the actual
     * number of accounts acted upon concurrently may be lower due to service
     * throttling.
     * </p>
     * <p>
     * Conditional: You must specify either <code>MaxConcurrentCount</code> or
     * <code>MaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param maxConcurrentPercentage <p>
     *            The maximum percentage of accounts in which to perform this
     *            operation at one time.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS CloudFormation rounds down to the next whole
     *            number. This is true except in cases where rounding down would
     *            result is zero. In this case, CloudFormation sets the number
     *            as one instead.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the <i>maximum</i> for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>MaxConcurrentCount</code> or
     *            <code>MaxConcurrentPercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public StackSetOperationPreferences withMaxConcurrentPercentage(Integer maxConcurrentPercentage) {
        this.maxConcurrentPercentage = maxConcurrentPercentage;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRegionOrder() != null)
            sb.append("RegionOrder: " + getRegionOrder() + ",");
        if (getFailureToleranceCount() != null)
            sb.append("FailureToleranceCount: " + getFailureToleranceCount() + ",");
        if (getFailureTolerancePercentage() != null)
            sb.append("FailureTolerancePercentage: " + getFailureTolerancePercentage() + ",");
        if (getMaxConcurrentCount() != null)
            sb.append("MaxConcurrentCount: " + getMaxConcurrentCount() + ",");
        if (getMaxConcurrentPercentage() != null)
            sb.append("MaxConcurrentPercentage: " + getMaxConcurrentPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRegionOrder() == null) ? 0 : getRegionOrder().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureToleranceCount() == null) ? 0 : getFailureToleranceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getFailureTolerancePercentage() == null) ? 0 : getFailureTolerancePercentage()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxConcurrentCount() == null) ? 0 : getMaxConcurrentCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getMaxConcurrentPercentage() == null) ? 0 : getMaxConcurrentPercentage()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationPreferences == false)
            return false;
        StackSetOperationPreferences other = (StackSetOperationPreferences) obj;

        if (other.getRegionOrder() == null ^ this.getRegionOrder() == null)
            return false;
        if (other.getRegionOrder() != null
                && other.getRegionOrder().equals(this.getRegionOrder()) == false)
            return false;
        if (other.getFailureToleranceCount() == null ^ this.getFailureToleranceCount() == null)
            return false;
        if (other.getFailureToleranceCount() != null
                && other.getFailureToleranceCount().equals(this.getFailureToleranceCount()) == false)
            return false;
        if (other.getFailureTolerancePercentage() == null
                ^ this.getFailureTolerancePercentage() == null)
            return false;
        if (other.getFailureTolerancePercentage() != null
                && other.getFailureTolerancePercentage().equals(
                        this.getFailureTolerancePercentage()) == false)
            return false;
        if (other.getMaxConcurrentCount() == null ^ this.getMaxConcurrentCount() == null)
            return false;
        if (other.getMaxConcurrentCount() != null
                && other.getMaxConcurrentCount().equals(this.getMaxConcurrentCount()) == false)
            return false;
        if (other.getMaxConcurrentPercentage() == null ^ this.getMaxConcurrentPercentage() == null)
            return false;
        if (other.getMaxConcurrentPercentage() != null
                && other.getMaxConcurrentPercentage().equals(this.getMaxConcurrentPercentage()) == false)
            return false;
        return true;
    }
}
