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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates the parameter values for stack instances for the specified accounts,
 * within the specified Regions. A stack instance refers to a stack in a
 * specific account and Region.
 * </p>
 * <p>
 * You can only update stack instances in Regions and accounts where they
 * already exist; to create additional stack instances, use <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_CreateStackInstances.html"
 * >CreateStackInstances</a>.
 * </p>
 * <p>
 * During stack set updates, any parameters overridden for a stack instance are
 * not updated, but retain their overridden value.
 * </p>
 * <p>
 * You can only update the parameter <i>values</i> that are specified in the
 * stack set; to add or delete a parameter itself, use <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
 * >UpdateStackSet</a> to update the stack set template. If you add a parameter
 * to a template, before you can override the parameter value specified in the
 * stack set you must first use <a href=
 * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
 * >UpdateStackSet</a> to update all stack instances with the updated template
 * and parameter value specified in the stack set. Once a stack instance has
 * been updated with the new parameter, you can then override the parameter
 * value using <code>UpdateStackInstances</code>.
 * </p>
 */
public class UpdateStackInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack
     * instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     */
    private String stackSetName;

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of one or more AWS
     * accounts for which you want to update parameter values for stack
     * instances. The overridden parameter values will be applied to all stack
     * instances in the specified accounts and Regions.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     */
    private java.util.List<String> accounts;

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * for which you want to update parameter values for stack instances. If
     * your update targets OUs, the overridden parameter values only apply to
     * the accounts that are currently in the target OUs and their child OUs.
     * Accounts added to the target OUs and their child OUs in the future won't
     * use the overridden values.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     */
    private DeploymentTargets deploymentTargets;

    /**
     * <p>
     * The names of one or more Regions in which you want to update parameter
     * values for stack instances. The overridden parameter values will be
     * applied to all stack instances in the specified accounts and Regions.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * A list of input parameters whose values you want to update for the
     * specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in
     * the specified accounts and Regions. When specifying parameters and their
     * values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and
     * specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as
     * <code>true</code>. (You cannot specify both a value and set
     * <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack
     * set, specify a parameter list but do not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this
     * property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack
     * instance are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in
     * the stack set; to add or delete a parameter itself, use
     * <code>UpdateStackSet</code> to update the stack set template. If you add
     * a parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     */
    private java.util.List<Parameter> parameterOverrides;

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack
     * instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @return <p>
     *         The name or unique ID of the stack set associated with the stack
     *         instances.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack
     * instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set associated with the
     *            stack instances.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set associated with the stack
     * instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern:
     * </b>[a-zA-Z][-a-zA-Z0-9]*(?::[a-zA-Z0-9]{8}-[a-zA-Z0-9]{4}-[a-
     * zA-Z0-9]{4}-[a-zA-Z0-9]{4}-[a-zA-Z0-9]{12})?<br/>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set associated with the
     *            stack instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of one or more AWS
     * accounts for which you want to update parameter values for stack
     * instances. The overridden parameter values will be applied to all stack
     * instances in the specified accounts and Regions.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @return <p>
     *         [<code>Self-managed</code> permissions] The names of one or more
     *         AWS accounts for which you want to update parameter values for
     *         stack instances. The overridden parameter values will be applied
     *         to all stack instances in the specified accounts and Regions.
     *         </p>
     *         <p>
     *         You can specify <code>Accounts</code> or
     *         <code>DeploymentTargets</code>, but not both.
     *         </p>
     */
    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of one or more AWS
     * accounts for which you want to update parameter values for stack
     * instances. The overridden parameter values will be applied to all stack
     * instances in the specified accounts and Regions.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The names of one or
     *            more AWS accounts for which you want to update parameter
     *            values for stack instances. The overridden parameter values
     *            will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     */
    public void setAccounts(java.util.Collection<String> accounts) {
        if (accounts == null) {
            this.accounts = null;
            return;
        }

        this.accounts = new java.util.ArrayList<String>(accounts);
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of one or more AWS
     * accounts for which you want to update parameter values for stack
     * instances. The overridden parameter values will be applied to all stack
     * instances in the specified accounts and Regions.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The names of one or
     *            more AWS accounts for which you want to update parameter
     *            values for stack instances. The overridden parameter values
     *            will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withAccounts(String... accounts) {
        if (getAccounts() == null) {
            this.accounts = new java.util.ArrayList<String>(accounts.length);
        }
        for (String value : accounts) {
            this.accounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of one or more AWS
     * accounts for which you want to update parameter values for stack
     * instances. The overridden parameter values will be applied to all stack
     * instances in the specified accounts and Regions.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The names of one or
     *            more AWS accounts for which you want to update parameter
     *            values for stack instances. The overridden parameter values
     *            will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * for which you want to update parameter values for stack instances. If
     * your update targets OUs, the overridden parameter values only apply to
     * the accounts that are currently in the target OUs and their child OUs.
     * Accounts added to the target OUs and their child OUs in the future won't
     * use the overridden values.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] The AWS Organizations
     *         accounts for which you want to update parameter values for stack
     *         instances. If your update targets OUs, the overridden parameter
     *         values only apply to the accounts that are currently in the
     *         target OUs and their child OUs. Accounts added to the target OUs
     *         and their child OUs in the future won't use the overridden
     *         values.
     *         </p>
     *         <p>
     *         You can specify <code>Accounts</code> or
     *         <code>DeploymentTargets</code>, but not both.
     *         </p>
     */
    public DeploymentTargets getDeploymentTargets() {
        return deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * for which you want to update parameter values for stack instances. If
     * your update targets OUs, the overridden parameter values only apply to
     * the accounts that are currently in the target OUs and their child OUs.
     * Accounts added to the target OUs and their child OUs in the future won't
     * use the overridden values.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts for which you want to update parameter
     *            values for stack instances. If your update targets OUs, the
     *            overridden parameter values only apply to the accounts that
     *            are currently in the target OUs and their child OUs. Accounts
     *            added to the target OUs and their child OUs in the future
     *            won't use the overridden values.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     */
    public void setDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * for which you want to update parameter values for stack instances. If
     * your update targets OUs, the overridden parameter values only apply to
     * the accounts that are currently in the target OUs and their child OUs.
     * Accounts added to the target OUs and their child OUs in the future won't
     * use the overridden values.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts for which you want to update parameter
     *            values for stack instances. If your update targets OUs, the
     *            overridden parameter values only apply to the accounts that
     *            are currently in the target OUs and their child OUs. Accounts
     *            added to the target OUs and their child OUs in the future
     *            won't use the overridden values.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    /**
     * <p>
     * The names of one or more Regions in which you want to update parameter
     * values for stack instances. The overridden parameter values will be
     * applied to all stack instances in the specified accounts and Regions.
     * </p>
     *
     * @return <p>
     *         The names of one or more Regions in which you want to update
     *         parameter values for stack instances. The overridden parameter
     *         values will be applied to all stack instances in the specified
     *         accounts and Regions.
     *         </p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The names of one or more Regions in which you want to update parameter
     * values for stack instances. The overridden parameter values will be
     * applied to all stack instances in the specified accounts and Regions.
     * </p>
     *
     * @param regions <p>
     *            The names of one or more Regions in which you want to update
     *            parameter values for stack instances. The overridden parameter
     *            values will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     */
    public void setRegions(java.util.Collection<String> regions) {
        if (regions == null) {
            this.regions = null;
            return;
        }

        this.regions = new java.util.ArrayList<String>(regions);
    }

    /**
     * <p>
     * The names of one or more Regions in which you want to update parameter
     * values for stack instances. The overridden parameter values will be
     * applied to all stack instances in the specified accounts and Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The names of one or more Regions in which you want to update
     *            parameter values for stack instances. The overridden parameter
     *            values will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withRegions(String... regions) {
        if (getRegions() == null) {
            this.regions = new java.util.ArrayList<String>(regions.length);
        }
        for (String value : regions) {
            this.regions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The names of one or more Regions in which you want to update parameter
     * values for stack instances. The overridden parameter values will be
     * applied to all stack instances in the specified accounts and Regions.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The names of one or more Regions in which you want to update
     *            parameter values for stack instances. The overridden parameter
     *            values will be applied to all stack instances in the specified
     *            accounts and Regions.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
        return this;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the
     * specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in
     * the specified accounts and Regions. When specifying parameters and their
     * values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and
     * specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as
     * <code>true</code>. (You cannot specify both a value and set
     * <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack
     * set, specify a parameter list but do not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this
     * property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack
     * instance are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in
     * the stack set; to add or delete a parameter itself, use
     * <code>UpdateStackSet</code> to update the stack set template. If you add
     * a parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     *
     * @return <p>
     *         A list of input parameters whose values you want to update for
     *         the specified stack instances.
     *         </p>
     *         <p>
     *         Any overridden parameter values will be applied to all stack
     *         instances in the specified accounts and Regions. When specifying
     *         parameters and their values, be aware of how AWS CloudFormation
     *         sets parameter values during stack instance update operations:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         To override the current value for a parameter, include the
     *         parameter and specify its value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To leave a parameter set to its present value, you can do one of
     *         the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Do not include the parameter in the list.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Include the parameter and specify <code>UsePreviousValue</code>
     *         as <code>true</code>. (You cannot specify both a value and set
     *         <code>UsePreviousValue</code> to <code>true</code>.)
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         To set all overridden parameter back to the values specified in
     *         the stack set, specify a parameter list but do not include any
     *         parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         To leave all parameters set to their present values, do not
     *         specify this property at all.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         During stack set updates, any parameter values overridden for a
     *         stack instance are not updated, but retain their overridden
     *         value.
     *         </p>
     *         <p>
     *         You can only override the parameter <i>values</i> that are
     *         specified in the stack set; to add or delete a parameter itself,
     *         use <code>UpdateStackSet</code> to update the stack set template.
     *         If you add a parameter to a template, before you can override the
     *         parameter value specified in the stack set you must first use <a
     *         href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     *         >UpdateStackSet</a> to update all stack instances with the
     *         updated template and parameter value specified in the stack set.
     *         Once a stack instance has been updated with the new parameter,
     *         you can then override the parameter value using
     *         <code>UpdateStackInstances</code>.
     *         </p>
     */
    public java.util.List<Parameter> getParameterOverrides() {
        return parameterOverrides;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the
     * specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in
     * the specified accounts and Regions. When specifying parameters and their
     * values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and
     * specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as
     * <code>true</code>. (You cannot specify both a value and set
     * <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack
     * set, specify a parameter list but do not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this
     * property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack
     * instance are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in
     * the stack set; to add or delete a parameter itself, use
     * <code>UpdateStackSet</code> to update the stack set template. If you add
     * a parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     *
     * @param parameterOverrides <p>
     *            A list of input parameters whose values you want to update for
     *            the specified stack instances.
     *            </p>
     *            <p>
     *            Any overridden parameter values will be applied to all stack
     *            instances in the specified accounts and Regions. When
     *            specifying parameters and their values, be aware of how AWS
     *            CloudFormation sets parameter values during stack instance
     *            update operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To override the current value for a parameter, include the
     *            parameter and specify its value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave a parameter set to its present value, you can do one
     *            of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Do not include the parameter in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Include the parameter and specify
     *            <code>UsePreviousValue</code> as <code>true</code>. (You
     *            cannot specify both a value and set
     *            <code>UsePreviousValue</code> to <code>true</code>.)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            To set all overridden parameter back to the values specified
     *            in the stack set, specify a parameter list but do not include
     *            any parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave all parameters set to their present values, do not
     *            specify this property at all.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            During stack set updates, any parameter values overridden for
     *            a stack instance are not updated, but retain their overridden
     *            value.
     *            </p>
     *            <p>
     *            You can only override the parameter <i>values</i> that are
     *            specified in the stack set; to add or delete a parameter
     *            itself, use <code>UpdateStackSet</code> to update the stack
     *            set template. If you add a parameter to a template, before you
     *            can override the parameter value specified in the stack set
     *            you must first use <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     *            >UpdateStackSet</a> to update all stack instances with the
     *            updated template and parameter value specified in the stack
     *            set. Once a stack instance has been updated with the new
     *            parameter, you can then override the parameter value using
     *            <code>UpdateStackInstances</code>.
     *            </p>
     */
    public void setParameterOverrides(java.util.Collection<Parameter> parameterOverrides) {
        if (parameterOverrides == null) {
            this.parameterOverrides = null;
            return;
        }

        this.parameterOverrides = new java.util.ArrayList<Parameter>(parameterOverrides);
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the
     * specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in
     * the specified accounts and Regions. When specifying parameters and their
     * values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and
     * specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as
     * <code>true</code>. (You cannot specify both a value and set
     * <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack
     * set, specify a parameter list but do not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this
     * property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack
     * instance are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in
     * the stack set; to add or delete a parameter itself, use
     * <code>UpdateStackSet</code> to update the stack set template. If you add
     * a parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterOverrides <p>
     *            A list of input parameters whose values you want to update for
     *            the specified stack instances.
     *            </p>
     *            <p>
     *            Any overridden parameter values will be applied to all stack
     *            instances in the specified accounts and Regions. When
     *            specifying parameters and their values, be aware of how AWS
     *            CloudFormation sets parameter values during stack instance
     *            update operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To override the current value for a parameter, include the
     *            parameter and specify its value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave a parameter set to its present value, you can do one
     *            of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Do not include the parameter in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Include the parameter and specify
     *            <code>UsePreviousValue</code> as <code>true</code>. (You
     *            cannot specify both a value and set
     *            <code>UsePreviousValue</code> to <code>true</code>.)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            To set all overridden parameter back to the values specified
     *            in the stack set, specify a parameter list but do not include
     *            any parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave all parameters set to their present values, do not
     *            specify this property at all.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            During stack set updates, any parameter values overridden for
     *            a stack instance are not updated, but retain their overridden
     *            value.
     *            </p>
     *            <p>
     *            You can only override the parameter <i>values</i> that are
     *            specified in the stack set; to add or delete a parameter
     *            itself, use <code>UpdateStackSet</code> to update the stack
     *            set template. If you add a parameter to a template, before you
     *            can override the parameter value specified in the stack set
     *            you must first use <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     *            >UpdateStackSet</a> to update all stack instances with the
     *            updated template and parameter value specified in the stack
     *            set. Once a stack instance has been updated with the new
     *            parameter, you can then override the parameter value using
     *            <code>UpdateStackInstances</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withParameterOverrides(Parameter... parameterOverrides) {
        if (getParameterOverrides() == null) {
            this.parameterOverrides = new java.util.ArrayList<Parameter>(parameterOverrides.length);
        }
        for (Parameter value : parameterOverrides) {
            this.parameterOverrides.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of input parameters whose values you want to update for the
     * specified stack instances.
     * </p>
     * <p>
     * Any overridden parameter values will be applied to all stack instances in
     * the specified accounts and Regions. When specifying parameters and their
     * values, be aware of how AWS CloudFormation sets parameter values during
     * stack instance update operations:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To override the current value for a parameter, include the parameter and
     * specify its value.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave a parameter set to its present value, you can do one of the
     * following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Do not include the parameter in the list.
     * </p>
     * </li>
     * <li>
     * <p>
     * Include the parameter and specify <code>UsePreviousValue</code> as
     * <code>true</code>. (You cannot specify both a value and set
     * <code>UsePreviousValue</code> to <code>true</code>.)
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * To set all overridden parameter back to the values specified in the stack
     * set, specify a parameter list but do not include any parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * To leave all parameters set to their present values, do not specify this
     * property at all.
     * </p>
     * </li>
     * </ul>
     * <p>
     * During stack set updates, any parameter values overridden for a stack
     * instance are not updated, but retain their overridden value.
     * </p>
     * <p>
     * You can only override the parameter <i>values</i> that are specified in
     * the stack set; to add or delete a parameter itself, use
     * <code>UpdateStackSet</code> to update the stack set template. If you add
     * a parameter to a template, before you can override the parameter value
     * specified in the stack set you must first use <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     * >UpdateStackSet</a> to update all stack instances with the updated
     * template and parameter value specified in the stack set. Once a stack
     * instance has been updated with the new parameter, you can then override
     * the parameter value using <code>UpdateStackInstances</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param parameterOverrides <p>
     *            A list of input parameters whose values you want to update for
     *            the specified stack instances.
     *            </p>
     *            <p>
     *            Any overridden parameter values will be applied to all stack
     *            instances in the specified accounts and Regions. When
     *            specifying parameters and their values, be aware of how AWS
     *            CloudFormation sets parameter values during stack instance
     *            update operations:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            To override the current value for a parameter, include the
     *            parameter and specify its value.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave a parameter set to its present value, you can do one
     *            of the following:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Do not include the parameter in the list.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            Include the parameter and specify
     *            <code>UsePreviousValue</code> as <code>true</code>. (You
     *            cannot specify both a value and set
     *            <code>UsePreviousValue</code> to <code>true</code>.)
     *            </p>
     *            </li>
     *            </ul>
     *            </li>
     *            <li>
     *            <p>
     *            To set all overridden parameter back to the values specified
     *            in the stack set, specify a parameter list but do not include
     *            any parameters.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            To leave all parameters set to their present values, do not
     *            specify this property at all.
     *            </p>
     *            </li>
     *            </ul>
     *            <p>
     *            During stack set updates, any parameter values overridden for
     *            a stack instance are not updated, but retain their overridden
     *            value.
     *            </p>
     *            <p>
     *            You can only override the parameter <i>values</i> that are
     *            specified in the stack set; to add or delete a parameter
     *            itself, use <code>UpdateStackSet</code> to update the stack
     *            set template. If you add a parameter to a template, before you
     *            can override the parameter value specified in the stack set
     *            you must first use <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/APIReference/API_UpdateStackSet.html"
     *            >UpdateStackSet</a> to update all stack instances with the
     *            updated template and parameter value specified in the stack
     *            set. Once a stack instance has been updated with the new
     *            parameter, you can then override the parameter value using
     *            <code>UpdateStackInstances</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withParameterOverrides(
            java.util.Collection<Parameter> parameterOverrides) {
        setParameterOverrides(parameterOverrides);
        return this;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     *
     * @return <p>
     *         Preferences for how AWS CloudFormation performs this stack set
     *         operation.
     *         </p>
     */
    public StackSetOperationPreferences getOperationPreferences() {
        return operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     *
     * @param operationPreferences <p>
     *            Preferences for how AWS CloudFormation performs this stack set
     *            operation.
     *            </p>
     */
    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param operationPreferences <p>
     *            Preferences for how AWS CloudFormation performs this stack set
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withOperationPreferences(
            StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @return <p>
     *         The unique identifier for this stack set operation.
     *         </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to
     *         ensure that AWS CloudFormation performs the stack set operation
     *         only once, even if you retry the request multiple times. You
     *         might retry stack set operation requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         If you don't specify an operation ID, the SDK generates one
     *         automatically.
     *         </p>
     */
    public String getOperationId() {
        return operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique identifier for this stack set operation.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You might retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     */
    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You might retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     *
     * @param operationId <p>
     *            The unique identifier for this stack set operation.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You might retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateStackInstancesRequest withOperationId(String operationId) {
        this.operationId = operationId;
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
        if (getStackSetName() != null)
            sb.append("StackSetName: " + getStackSetName() + ",");
        if (getAccounts() != null)
            sb.append("Accounts: " + getAccounts() + ",");
        if (getDeploymentTargets() != null)
            sb.append("DeploymentTargets: " + getDeploymentTargets() + ",");
        if (getRegions() != null)
            sb.append("Regions: " + getRegions() + ",");
        if (getParameterOverrides() != null)
            sb.append("ParameterOverrides: " + getParameterOverrides() + ",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: " + getOperationPreferences() + ",");
        if (getOperationId() != null)
            sb.append("OperationId: " + getOperationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getStackSetName() == null) ? 0 : getStackSetName().hashCode());
        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime * hashCode
                + ((getDeploymentTargets() == null) ? 0 : getDeploymentTargets().hashCode());
        hashCode = prime * hashCode + ((getRegions() == null) ? 0 : getRegions().hashCode());
        hashCode = prime * hashCode
                + ((getParameterOverrides() == null) ? 0 : getParameterOverrides().hashCode());
        hashCode = prime * hashCode
                + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode
                + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStackInstancesRequest == false)
            return false;
        UpdateStackInstancesRequest other = (UpdateStackInstancesRequest) obj;

        if (other.getStackSetName() == null ^ this.getStackSetName() == null)
            return false;
        if (other.getStackSetName() != null
                && other.getStackSetName().equals(this.getStackSetName()) == false)
            return false;
        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getDeploymentTargets() == null ^ this.getDeploymentTargets() == null)
            return false;
        if (other.getDeploymentTargets() != null
                && other.getDeploymentTargets().equals(this.getDeploymentTargets()) == false)
            return false;
        if (other.getRegions() == null ^ this.getRegions() == null)
            return false;
        if (other.getRegions() != null && other.getRegions().equals(this.getRegions()) == false)
            return false;
        if (other.getParameterOverrides() == null ^ this.getParameterOverrides() == null)
            return false;
        if (other.getParameterOverrides() != null
                && other.getParameterOverrides().equals(this.getParameterOverrides()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null
                && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
