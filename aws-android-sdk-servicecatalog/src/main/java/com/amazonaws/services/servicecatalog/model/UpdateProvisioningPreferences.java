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

package com.amazonaws.services.servicecatalog.model;

import java.io.Serializable;

/**
 * <p>
 * The user-defined preferences that will be applied when updating a provisioned
 * product. Not all preferences are applicable to all provisioned product types.
 * </p>
 */
public class UpdateProvisioningPreferences implements Serializable {
    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned
     * product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the
     * <code>STACKSET</code> constraint. To get the list of accounts in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the
     * <code>STACKSET</code> constraint.
     * </p>
     */
    private java.util.List<String> stackSetAccounts;

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the
     * <code>STACKSET</code> constraint. To get the list of regions in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the
     * <code>STACKSET</code> constraint.
     * </p>
     */
    private java.util.List<String> stackSetRegions;

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail
     * before AWS Service Catalog stops the operation in that region. If the
     * operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer stackSetFailureToleranceCount;

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation
     * can fail before AWS Service Catalog stops the operation in that region.
     * If the operation is stopped in a region, AWS Service Catalog doesn't
     * attempt the operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer stackSetFailureTolerancePercentage;

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>.
     * <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     */
    private Integer stackSetMaxConcurrencyCount;

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * This is true except in cases where rounding down would result is zero. In
     * this case, AWS Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     */
    private Integer stackSetMaxConcurrencyPercentage;

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     */
    private String stackSetOperationType;

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned
     * product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the
     * <code>STACKSET</code> constraint. To get the list of accounts in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the
     * <code>STACKSET</code> constraint.
     * </p>
     *
     * @return <p>
     *         One or more AWS accounts that will have access to the provisioned
     *         product.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         The AWS accounts specified should be within the list of accounts
     *         in the <code>STACKSET</code> constraint. To get the list of
     *         accounts in the <code>STACKSET</code> constraint, use the
     *         <code>DescribeProvisioningParameters</code> operation.
     *         </p>
     *         <p>
     *         If no values are specified, the default value is all accounts
     *         from the <code>STACKSET</code> constraint.
     *         </p>
     */
    public java.util.List<String> getStackSetAccounts() {
        return stackSetAccounts;
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned
     * product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the
     * <code>STACKSET</code> constraint. To get the list of accounts in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the
     * <code>STACKSET</code> constraint.
     * </p>
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts that will have access to the
     *            provisioned product.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The AWS accounts specified should be within the list of
     *            accounts in the <code>STACKSET</code> constraint. To get the
     *            list of accounts in the <code>STACKSET</code> constraint, use
     *            the <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all accounts
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     */
    public void setStackSetAccounts(java.util.Collection<String> stackSetAccounts) {
        if (stackSetAccounts == null) {
            this.stackSetAccounts = null;
            return;
        }

        this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts);
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned
     * product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the
     * <code>STACKSET</code> constraint. To get the list of accounts in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the
     * <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts that will have access to the
     *            provisioned product.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The AWS accounts specified should be within the list of
     *            accounts in the <code>STACKSET</code> constraint. To get the
     *            list of accounts in the <code>STACKSET</code> constraint, use
     *            the <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all accounts
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetAccounts(String... stackSetAccounts) {
        if (getStackSetAccounts() == null) {
            this.stackSetAccounts = new java.util.ArrayList<String>(stackSetAccounts.length);
        }
        for (String value : stackSetAccounts) {
            this.stackSetAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS accounts that will have access to the provisioned
     * product.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The AWS accounts specified should be within the list of accounts in the
     * <code>STACKSET</code> constraint. To get the list of accounts in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all accounts from the
     * <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetAccounts <p>
     *            One or more AWS accounts that will have access to the
     *            provisioned product.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The AWS accounts specified should be within the list of
     *            accounts in the <code>STACKSET</code> constraint. To get the
     *            list of accounts in the <code>STACKSET</code> constraint, use
     *            the <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all accounts
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetAccounts(
            java.util.Collection<String> stackSetAccounts) {
        setStackSetAccounts(stackSetAccounts);
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the
     * <code>STACKSET</code> constraint. To get the list of regions in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the
     * <code>STACKSET</code> constraint.
     * </p>
     *
     * @return <p>
     *         One or more AWS Regions where the provisioned product will be
     *         available.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         The specified regions should be within the list of regions from
     *         the <code>STACKSET</code> constraint. To get the list of regions
     *         in the <code>STACKSET</code> constraint, use the
     *         <code>DescribeProvisioningParameters</code> operation.
     *         </p>
     *         <p>
     *         If no values are specified, the default value is all regions from
     *         the <code>STACKSET</code> constraint.
     *         </p>
     */
    public java.util.List<String> getStackSetRegions() {
        return stackSetRegions;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the
     * <code>STACKSET</code> constraint. To get the list of regions in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the
     * <code>STACKSET</code> constraint.
     * </p>
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where the provisioned product will be
     *            available.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The specified regions should be within the list of regions
     *            from the <code>STACKSET</code> constraint. To get the list of
     *            regions in the <code>STACKSET</code> constraint, use the
     *            <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all regions
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     */
    public void setStackSetRegions(java.util.Collection<String> stackSetRegions) {
        if (stackSetRegions == null) {
            this.stackSetRegions = null;
            return;
        }

        this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions);
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the
     * <code>STACKSET</code> constraint. To get the list of regions in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the
     * <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where the provisioned product will be
     *            available.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The specified regions should be within the list of regions
     *            from the <code>STACKSET</code> constraint. To get the list of
     *            regions in the <code>STACKSET</code> constraint, use the
     *            <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all regions
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetRegions(String... stackSetRegions) {
        if (getStackSetRegions() == null) {
            this.stackSetRegions = new java.util.ArrayList<String>(stackSetRegions.length);
        }
        for (String value : stackSetRegions) {
            this.stackSetRegions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * One or more AWS Regions where the provisioned product will be available.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * The specified regions should be within the list of regions from the
     * <code>STACKSET</code> constraint. To get the list of regions in the
     * <code>STACKSET</code> constraint, use the
     * <code>DescribeProvisioningParameters</code> operation.
     * </p>
     * <p>
     * If no values are specified, the default value is all regions from the
     * <code>STACKSET</code> constraint.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetRegions <p>
     *            One or more AWS Regions where the provisioned product will be
     *            available.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            The specified regions should be within the list of regions
     *            from the <code>STACKSET</code> constraint. To get the list of
     *            regions in the <code>STACKSET</code> constraint, use the
     *            <code>DescribeProvisioningParameters</code> operation.
     *            </p>
     *            <p>
     *            If no values are specified, the default value is all regions
     *            from the <code>STACKSET</code> constraint.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetRegions(
            java.util.Collection<String> stackSetRegions) {
        setStackSetRegions(stackSetRegions);
        return this;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail
     * before AWS Service Catalog stops the operation in that region. If the
     * operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The number of accounts, per region, for which this operation can
     *         fail before AWS Service Catalog stops the operation in that
     *         region. If the operation is stopped in a region, AWS Service
     *         Catalog doesn't attempt the operation in any subsequent regions.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>StackSetFailureToleranceCount</code> or
     *         <code>StackSetFailureTolerancePercentage</code>, but not both.
     *         </p>
     *         <p>
     *         The default value is <code>0</code> if no value is specified.
     *         </p>
     */
    public Integer getStackSetFailureToleranceCount() {
        return stackSetFailureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail
     * before AWS Service Catalog stops the operation in that region. If the
     * operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param stackSetFailureToleranceCount <p>
     *            The number of accounts, per region, for which this operation
     *            can fail before AWS Service Catalog stops the operation in
     *            that region. If the operation is stopped in a region, AWS
     *            Service Catalog doesn't attempt the operation in any
     *            subsequent regions.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetFailureToleranceCount</code> or
     *            <code>StackSetFailureTolerancePercentage</code>, but not both.
     *            </p>
     *            <p>
     *            The default value is <code>0</code> if no value is specified.
     *            </p>
     */
    public void setStackSetFailureToleranceCount(Integer stackSetFailureToleranceCount) {
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
    }

    /**
     * <p>
     * The number of accounts, per region, for which this operation can fail
     * before AWS Service Catalog stops the operation in that region. If the
     * operation is stopped in a region, AWS Service Catalog doesn't attempt the
     * operation in any subsequent regions.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * The default value is <code>0</code> if no value is specified.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param stackSetFailureToleranceCount <p>
     *            The number of accounts, per region, for which this operation
     *            can fail before AWS Service Catalog stops the operation in
     *            that region. If the operation is stopped in a region, AWS
     *            Service Catalog doesn't attempt the operation in any
     *            subsequent regions.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetFailureToleranceCount</code> or
     *            <code>StackSetFailureTolerancePercentage</code>, but not both.
     *            </p>
     *            <p>
     *            The default value is <code>0</code> if no value is specified.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetFailureToleranceCount(
            Integer stackSetFailureToleranceCount) {
        this.stackSetFailureToleranceCount = stackSetFailureToleranceCount;
        return this;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation
     * can fail before AWS Service Catalog stops the operation in that region.
     * If the operation is stopped in a region, AWS Service Catalog doesn't
     * attempt the operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return <p>
     *         The percentage of accounts, per region, for which this stack
     *         operation can fail before AWS Service Catalog stops the operation
     *         in that region. If the operation is stopped in a region, AWS
     *         Service Catalog doesn't attempt the operation in any subsequent
     *         regions.
     *         </p>
     *         <p>
     *         When calculating the number of accounts based on the specified
     *         percentage, AWS Service Catalog rounds down to the next whole
     *         number.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>StackSetFailureToleranceCount</code> or
     *         <code>StackSetFailureTolerancePercentage</code>, but not both.
     *         </p>
     */
    public Integer getStackSetFailureTolerancePercentage() {
        return stackSetFailureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation
     * can fail before AWS Service Catalog stops the operation in that region.
     * If the operation is stopped in a region, AWS Service Catalog doesn't
     * attempt the operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param stackSetFailureTolerancePercentage <p>
     *            The percentage of accounts, per region, for which this stack
     *            operation can fail before AWS Service Catalog stops the
     *            operation in that region. If the operation is stopped in a
     *            region, AWS Service Catalog doesn't attempt the operation in
     *            any subsequent regions.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS Service Catalog rounds down to the next whole
     *            number.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetFailureToleranceCount</code> or
     *            <code>StackSetFailureTolerancePercentage</code>, but not both.
     *            </p>
     */
    public void setStackSetFailureTolerancePercentage(Integer stackSetFailureTolerancePercentage) {
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
    }

    /**
     * <p>
     * The percentage of accounts, per region, for which this stack operation
     * can fail before AWS Service Catalog stops the operation in that region.
     * If the operation is stopped in a region, AWS Service Catalog doesn't
     * attempt the operation in any subsequent regions.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetFailureToleranceCount</code> or
     * <code>StackSetFailureTolerancePercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param stackSetFailureTolerancePercentage <p>
     *            The percentage of accounts, per region, for which this stack
     *            operation can fail before AWS Service Catalog stops the
     *            operation in that region. If the operation is stopped in a
     *            region, AWS Service Catalog doesn't attempt the operation in
     *            any subsequent regions.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS Service Catalog rounds down to the next whole
     *            number.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetFailureToleranceCount</code> or
     *            <code>StackSetFailureTolerancePercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetFailureTolerancePercentage(
            Integer stackSetFailureTolerancePercentage) {
        this.stackSetFailureTolerancePercentage = stackSetFailureTolerancePercentage;
        return this;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>.
     * <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @return <p>
     *         The maximum number of accounts in which to perform this operation
     *         at one time. This is dependent on the value of
     *         <code>StackSetFailureToleranceCount</code>.
     *         <code>StackSetMaxConcurrentCount</code> is at most one more than
     *         the <code>StackSetFailureToleranceCount</code>.
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the maximum for
     *         operations. For large deployments, under certain circumstances
     *         the actual number of accounts acted upon concurrently may be
     *         lower due to service throttling.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>StackSetMaxConcurrentCount</code> or
     *         <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *         </p>
     */
    public Integer getStackSetMaxConcurrencyCount() {
        return stackSetMaxConcurrencyCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>.
     * <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param stackSetMaxConcurrencyCount <p>
     *            The maximum number of accounts in which to perform this
     *            operation at one time. This is dependent on the value of
     *            <code>StackSetFailureToleranceCount</code>.
     *            <code>StackSetMaxConcurrentCount</code> is at most one more
     *            than the <code>StackSetFailureToleranceCount</code>.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the maximum for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetMaxConcurrentCount</code> or
     *            <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *            </p>
     */
    public void setStackSetMaxConcurrencyCount(Integer stackSetMaxConcurrencyCount) {
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
    }

    /**
     * <p>
     * The maximum number of accounts in which to perform this operation at one
     * time. This is dependent on the value of
     * <code>StackSetFailureToleranceCount</code>.
     * <code>StackSetMaxConcurrentCount</code> is at most one more than the
     * <code>StackSetFailureToleranceCount</code>.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - <br/>
     *
     * @param stackSetMaxConcurrencyCount <p>
     *            The maximum number of accounts in which to perform this
     *            operation at one time. This is dependent on the value of
     *            <code>StackSetFailureToleranceCount</code>.
     *            <code>StackSetMaxConcurrentCount</code> is at most one more
     *            than the <code>StackSetFailureToleranceCount</code>.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the maximum for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetMaxConcurrentCount</code> or
     *            <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetMaxConcurrencyCount(
            Integer stackSetMaxConcurrencyCount) {
        this.stackSetMaxConcurrencyCount = stackSetMaxConcurrencyCount;
        return this;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * This is true except in cases where rounding down would result is zero. In
     * this case, AWS Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
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
     *         percentage, AWS Service Catalog rounds down to the next whole
     *         number. This is true except in cases where rounding down would
     *         result is zero. In this case, AWS Service Catalog sets the number
     *         as <code>1</code> instead.
     *         </p>
     *         <p>
     *         Note that this setting lets you specify the maximum for
     *         operations. For large deployments, under certain circumstances
     *         the actual number of accounts acted upon concurrently may be
     *         lower due to service throttling.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <p>
     *         Conditional: You must specify either
     *         <code>StackSetMaxConcurrentCount</code> or
     *         <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *         </p>
     */
    public Integer getStackSetMaxConcurrencyPercentage() {
        return stackSetMaxConcurrencyPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * This is true except in cases where rounding down would result is zero. In
     * this case, AWS Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param stackSetMaxConcurrencyPercentage <p>
     *            The maximum percentage of accounts in which to perform this
     *            operation at one time.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS Service Catalog rounds down to the next whole
     *            number. This is true except in cases where rounding down would
     *            result is zero. In this case, AWS Service Catalog sets the
     *            number as <code>1</code> instead.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the maximum for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetMaxConcurrentCount</code> or
     *            <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *            </p>
     */
    public void setStackSetMaxConcurrencyPercentage(Integer stackSetMaxConcurrencyPercentage) {
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
    }

    /**
     * <p>
     * The maximum percentage of accounts in which to perform this operation at
     * one time.
     * </p>
     * <p>
     * When calculating the number of accounts based on the specified
     * percentage, AWS Service Catalog rounds down to the next whole number.
     * This is true except in cases where rounding down would result is zero. In
     * this case, AWS Service Catalog sets the number as <code>1</code> instead.
     * </p>
     * <p>
     * Note that this setting lets you specify the maximum for operations. For
     * large deployments, under certain circumstances the actual number of
     * accounts acted upon concurrently may be lower due to service throttling.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <p>
     * Conditional: You must specify either
     * <code>StackSetMaxConcurrentCount</code> or
     * <code>StackSetMaxConcurrentPercentage</code>, but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 100<br/>
     *
     * @param stackSetMaxConcurrencyPercentage <p>
     *            The maximum percentage of accounts in which to perform this
     *            operation at one time.
     *            </p>
     *            <p>
     *            When calculating the number of accounts based on the specified
     *            percentage, AWS Service Catalog rounds down to the next whole
     *            number. This is true except in cases where rounding down would
     *            result is zero. In this case, AWS Service Catalog sets the
     *            number as <code>1</code> instead.
     *            </p>
     *            <p>
     *            Note that this setting lets you specify the maximum for
     *            operations. For large deployments, under certain circumstances
     *            the actual number of accounts acted upon concurrently may be
     *            lower due to service throttling.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <p>
     *            Conditional: You must specify either
     *            <code>StackSetMaxConcurrentCount</code> or
     *            <code>StackSetMaxConcurrentPercentage</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateProvisioningPreferences withStackSetMaxConcurrencyPercentage(
            Integer stackSetMaxConcurrencyPercentage) {
        this.stackSetMaxConcurrencyPercentage = stackSetMaxConcurrencyPercentage;
        return this;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     *
     * @return <p>
     *         Determines what action AWS Service Catalog performs to a stack
     *         set or a stack instance represented by the provisioned product.
     *         The default value is <code>UPDATE</code> if nothing is specified.
     *         </p>
     *         <p>
     *         Applicable only to a <code>CFN_STACKSET</code> provisioned
     *         product type.
     *         </p>
     *         <dl>
     *         <dt>CREATE</dt>
     *         <dd>
     *         <p>
     *         Creates a new stack instance in the stack set represented by the
     *         provisioned product. In this case, only new stack instances are
     *         created based on accounts and regions; if new ProductId or
     *         ProvisioningArtifactID are passed, they will be ignored.
     *         </p>
     *         </dd>
     *         <dt>UPDATE</dt>
     *         <dd>
     *         <p>
     *         Updates the stack set represented by the provisioned product and
     *         also its stack instances.
     *         </p>
     *         </dd>
     *         <dt>DELETE</dt>
     *         <dd>
     *         <p>
     *         Deletes a stack instance in the stack set represented by the
     *         provisioned product.
     *         </p>
     *         </dd>
     *         </dl>
     * @see StackSetOperationType
     */
    public String getStackSetOperationType() {
        return stackSetOperationType;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     *
     * @param stackSetOperationType <p>
     *            Determines what action AWS Service Catalog performs to a stack
     *            set or a stack instance represented by the provisioned
     *            product. The default value is <code>UPDATE</code> if nothing
     *            is specified.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <dl>
     *            <dt>CREATE</dt>
     *            <dd>
     *            <p>
     *            Creates a new stack instance in the stack set represented by
     *            the provisioned product. In this case, only new stack
     *            instances are created based on accounts and regions; if new
     *            ProductId or ProvisioningArtifactID are passed, they will be
     *            ignored.
     *            </p>
     *            </dd>
     *            <dt>UPDATE</dt>
     *            <dd>
     *            <p>
     *            Updates the stack set represented by the provisioned product
     *            and also its stack instances.
     *            </p>
     *            </dd>
     *            <dt>DELETE</dt>
     *            <dd>
     *            <p>
     *            Deletes a stack instance in the stack set represented by the
     *            provisioned product.
     *            </p>
     *            </dd>
     *            </dl>
     * @see StackSetOperationType
     */
    public void setStackSetOperationType(String stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     *
     * @param stackSetOperationType <p>
     *            Determines what action AWS Service Catalog performs to a stack
     *            set or a stack instance represented by the provisioned
     *            product. The default value is <code>UPDATE</code> if nothing
     *            is specified.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <dl>
     *            <dt>CREATE</dt>
     *            <dd>
     *            <p>
     *            Creates a new stack instance in the stack set represented by
     *            the provisioned product. In this case, only new stack
     *            instances are created based on accounts and regions; if new
     *            ProductId or ProvisioningArtifactID are passed, they will be
     *            ignored.
     *            </p>
     *            </dd>
     *            <dt>UPDATE</dt>
     *            <dd>
     *            <p>
     *            Updates the stack set represented by the provisioned product
     *            and also its stack instances.
     *            </p>
     *            </dd>
     *            <dt>DELETE</dt>
     *            <dd>
     *            <p>
     *            Deletes a stack instance in the stack set represented by the
     *            provisioned product.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationType
     */
    public UpdateProvisioningPreferences withStackSetOperationType(String stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType;
        return this;
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     *
     * @param stackSetOperationType <p>
     *            Determines what action AWS Service Catalog performs to a stack
     *            set or a stack instance represented by the provisioned
     *            product. The default value is <code>UPDATE</code> if nothing
     *            is specified.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <dl>
     *            <dt>CREATE</dt>
     *            <dd>
     *            <p>
     *            Creates a new stack instance in the stack set represented by
     *            the provisioned product. In this case, only new stack
     *            instances are created based on accounts and regions; if new
     *            ProductId or ProvisioningArtifactID are passed, they will be
     *            ignored.
     *            </p>
     *            </dd>
     *            <dt>UPDATE</dt>
     *            <dd>
     *            <p>
     *            Updates the stack set represented by the provisioned product
     *            and also its stack instances.
     *            </p>
     *            </dd>
     *            <dt>DELETE</dt>
     *            <dd>
     *            <p>
     *            Deletes a stack instance in the stack set represented by the
     *            provisioned product.
     *            </p>
     *            </dd>
     *            </dl>
     * @see StackSetOperationType
     */
    public void setStackSetOperationType(StackSetOperationType stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType.toString();
    }

    /**
     * <p>
     * Determines what action AWS Service Catalog performs to a stack set or a
     * stack instance represented by the provisioned product. The default value
     * is <code>UPDATE</code> if nothing is specified.
     * </p>
     * <p>
     * Applicable only to a <code>CFN_STACKSET</code> provisioned product type.
     * </p>
     * <dl>
     * <dt>CREATE</dt>
     * <dd>
     * <p>
     * Creates a new stack instance in the stack set represented by the
     * provisioned product. In this case, only new stack instances are created
     * based on accounts and regions; if new ProductId or ProvisioningArtifactID
     * are passed, they will be ignored.
     * </p>
     * </dd>
     * <dt>UPDATE</dt>
     * <dd>
     * <p>
     * Updates the stack set represented by the provisioned product and also its
     * stack instances.
     * </p>
     * </dd>
     * <dt>DELETE</dt>
     * <dd>
     * <p>
     * Deletes a stack instance in the stack set represented by the provisioned
     * product.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>CREATE, UPDATE, DELETE
     *
     * @param stackSetOperationType <p>
     *            Determines what action AWS Service Catalog performs to a stack
     *            set or a stack instance represented by the provisioned
     *            product. The default value is <code>UPDATE</code> if nothing
     *            is specified.
     *            </p>
     *            <p>
     *            Applicable only to a <code>CFN_STACKSET</code> provisioned
     *            product type.
     *            </p>
     *            <dl>
     *            <dt>CREATE</dt>
     *            <dd>
     *            <p>
     *            Creates a new stack instance in the stack set represented by
     *            the provisioned product. In this case, only new stack
     *            instances are created based on accounts and regions; if new
     *            ProductId or ProvisioningArtifactID are passed, they will be
     *            ignored.
     *            </p>
     *            </dd>
     *            <dt>UPDATE</dt>
     *            <dd>
     *            <p>
     *            Updates the stack set represented by the provisioned product
     *            and also its stack instances.
     *            </p>
     *            </dd>
     *            <dt>DELETE</dt>
     *            <dd>
     *            <p>
     *            Deletes a stack instance in the stack set represented by the
     *            provisioned product.
     *            </p>
     *            </dd>
     *            </dl>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see StackSetOperationType
     */
    public UpdateProvisioningPreferences withStackSetOperationType(
            StackSetOperationType stackSetOperationType) {
        this.stackSetOperationType = stackSetOperationType.toString();
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
        if (getStackSetAccounts() != null)
            sb.append("StackSetAccounts: " + getStackSetAccounts() + ",");
        if (getStackSetRegions() != null)
            sb.append("StackSetRegions: " + getStackSetRegions() + ",");
        if (getStackSetFailureToleranceCount() != null)
            sb.append("StackSetFailureToleranceCount: " + getStackSetFailureToleranceCount() + ",");
        if (getStackSetFailureTolerancePercentage() != null)
            sb.append("StackSetFailureTolerancePercentage: "
                    + getStackSetFailureTolerancePercentage() + ",");
        if (getStackSetMaxConcurrencyCount() != null)
            sb.append("StackSetMaxConcurrencyCount: " + getStackSetMaxConcurrencyCount() + ",");
        if (getStackSetMaxConcurrencyPercentage() != null)
            sb.append("StackSetMaxConcurrencyPercentage: " + getStackSetMaxConcurrencyPercentage()
                    + ",");
        if (getStackSetOperationType() != null)
            sb.append("StackSetOperationType: " + getStackSetOperationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetAccounts() == null) ? 0 : getStackSetAccounts().hashCode());
        hashCode = prime * hashCode
                + ((getStackSetRegions() == null) ? 0 : getStackSetRegions().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetFailureToleranceCount() == null) ? 0
                        : getStackSetFailureToleranceCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetFailureTolerancePercentage() == null) ? 0
                        : getStackSetFailureTolerancePercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetMaxConcurrencyCount() == null) ? 0
                        : getStackSetMaxConcurrencyCount().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetMaxConcurrencyPercentage() == null) ? 0
                        : getStackSetMaxConcurrencyPercentage().hashCode());
        hashCode = prime
                * hashCode
                + ((getStackSetOperationType() == null) ? 0 : getStackSetOperationType().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateProvisioningPreferences == false)
            return false;
        UpdateProvisioningPreferences other = (UpdateProvisioningPreferences) obj;

        if (other.getStackSetAccounts() == null ^ this.getStackSetAccounts() == null)
            return false;
        if (other.getStackSetAccounts() != null
                && other.getStackSetAccounts().equals(this.getStackSetAccounts()) == false)
            return false;
        if (other.getStackSetRegions() == null ^ this.getStackSetRegions() == null)
            return false;
        if (other.getStackSetRegions() != null
                && other.getStackSetRegions().equals(this.getStackSetRegions()) == false)
            return false;
        if (other.getStackSetFailureToleranceCount() == null
                ^ this.getStackSetFailureToleranceCount() == null)
            return false;
        if (other.getStackSetFailureToleranceCount() != null
                && other.getStackSetFailureToleranceCount().equals(
                        this.getStackSetFailureToleranceCount()) == false)
            return false;
        if (other.getStackSetFailureTolerancePercentage() == null
                ^ this.getStackSetFailureTolerancePercentage() == null)
            return false;
        if (other.getStackSetFailureTolerancePercentage() != null
                && other.getStackSetFailureTolerancePercentage().equals(
                        this.getStackSetFailureTolerancePercentage()) == false)
            return false;
        if (other.getStackSetMaxConcurrencyCount() == null
                ^ this.getStackSetMaxConcurrencyCount() == null)
            return false;
        if (other.getStackSetMaxConcurrencyCount() != null
                && other.getStackSetMaxConcurrencyCount().equals(
                        this.getStackSetMaxConcurrencyCount()) == false)
            return false;
        if (other.getStackSetMaxConcurrencyPercentage() == null
                ^ this.getStackSetMaxConcurrencyPercentage() == null)
            return false;
        if (other.getStackSetMaxConcurrencyPercentage() != null
                && other.getStackSetMaxConcurrencyPercentage().equals(
                        this.getStackSetMaxConcurrencyPercentage()) == false)
            return false;
        if (other.getStackSetOperationType() == null ^ this.getStackSetOperationType() == null)
            return false;
        if (other.getStackSetOperationType() != null
                && other.getStackSetOperationType().equals(this.getStackSetOperationType()) == false)
            return false;
        return true;
    }
}
