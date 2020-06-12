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
 * Deletes stack instances for the specified accounts, in the specified Regions.
 * </p>
 */
public class DeleteStackInstancesRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack
     * instances for.
     * </p>
     */
    private String stackSetName;

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of the AWS accounts
     * that you want to delete stack instances for.
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
     * from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     */
    private DeploymentTargets deploymentTargets;

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     */
    private java.util.List<String> regions;

    /**
     * <p>
     * Preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't
     * delete the stacks. You can't reassociate a retained stack or add an
     * existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     */
    private Boolean retainStacks;

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You can retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     * <b>Pattern: </b>[a-zA-Z0-9][-a-zA-Z0-9]*<br/>
     */
    private String operationId;

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack
     * instances for.
     * </p>
     *
     * @return <p>
     *         The name or unique ID of the stack set that you want to delete
     *         stack instances for.
     *         </p>
     */
    public String getStackSetName() {
        return stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack
     * instances for.
     * </p>
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to delete
     *            stack instances for.
     *            </p>
     */
    public void setStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that you want to delete stack
     * instances for.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param stackSetName <p>
     *            The name or unique ID of the stack set that you want to delete
     *            stack instances for.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withStackSetName(String stackSetName) {
        this.stackSetName = stackSetName;
        return this;
    }

    /**
     * <p>
     * [<code>Self-managed</code> permissions] The names of the AWS accounts
     * that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @return <p>
     *         [<code>Self-managed</code> permissions] The names of the AWS
     *         accounts that you want to delete stack instances for.
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
     * [<code>Self-managed</code> permissions] The names of the AWS accounts
     * that you want to delete stack instances for.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @param accounts <p>
     *            [<code>Self-managed</code> permissions] The names of the AWS
     *            accounts that you want to delete stack instances for.
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
     * [<code>Self-managed</code> permissions] The names of the AWS accounts
     * that you want to delete stack instances for.
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
     *            [<code>Self-managed</code> permissions] The names of the AWS
     *            accounts that you want to delete stack instances for.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withAccounts(String... accounts) {
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
     * [<code>Self-managed</code> permissions] The names of the AWS accounts
     * that you want to delete stack instances for.
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
     *            [<code>Self-managed</code> permissions] The names of the AWS
     *            accounts that you want to delete stack instances for.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * [<code>Service-managed</code> permissions] The AWS Organizations accounts
     * from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @return <p>
     *         [<code>Service-managed</code> permissions] The AWS Organizations
     *         accounts from which to delete stack instances.
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
     * from which to delete stack instances.
     * </p>
     * <p>
     * You can specify <code>Accounts</code> or <code>DeploymentTargets</code>,
     * but not both.
     * </p>
     *
     * @param deploymentTargets <p>
     *            [<code>Service-managed</code> permissions] The AWS
     *            Organizations accounts from which to delete stack instances.
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
     * from which to delete stack instances.
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
     *            Organizations accounts from which to delete stack instances.
     *            </p>
     *            <p>
     *            You can specify <code>Accounts</code> or
     *            <code>DeploymentTargets</code>, but not both.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withDeploymentTargets(DeploymentTargets deploymentTargets) {
        this.deploymentTargets = deploymentTargets;
        return this;
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     *
     * @return <p>
     *         The Regions where you want to delete stack set instances.
     *         </p>
     */
    public java.util.List<String> getRegions() {
        return regions;
    }

    /**
     * <p>
     * The Regions where you want to delete stack set instances.
     * </p>
     *
     * @param regions <p>
     *            The Regions where you want to delete stack set instances.
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
     * The Regions where you want to delete stack set instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The Regions where you want to delete stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withRegions(String... regions) {
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
     * The Regions where you want to delete stack set instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param regions <p>
     *            The Regions where you want to delete stack set instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withRegions(java.util.Collection<String> regions) {
        setRegions(regions);
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
    public DeleteStackInstancesRequest withOperationPreferences(
            StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
        return this;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't
     * delete the stacks. You can't reassociate a retained stack or add an
     * existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     *
     * @return <p>
     *         Removes the stack instances from the specified stack set, but
     *         doesn't delete the stacks. You can't reassociate a retained stack
     *         or add an existing, saved stack to a new stack set.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *         >Stack set operation options</a>.
     *         </p>
     */
    public Boolean isRetainStacks() {
        return retainStacks;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't
     * delete the stacks. You can't reassociate a retained stack or add an
     * existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     *
     * @return <p>
     *         Removes the stack instances from the specified stack set, but
     *         doesn't delete the stacks. You can't reassociate a retained stack
     *         or add an existing, saved stack to a new stack set.
     *         </p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *         >Stack set operation options</a>.
     *         </p>
     */
    public Boolean getRetainStacks() {
        return retainStacks;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't
     * delete the stacks. You can't reassociate a retained stack or add an
     * existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     *
     * @param retainStacks <p>
     *            Removes the stack instances from the specified stack set, but
     *            doesn't delete the stacks. You can't reassociate a retained
     *            stack or add an existing, saved stack to a new stack set.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *            >Stack set operation options</a>.
     *            </p>
     */
    public void setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
    }

    /**
     * <p>
     * Removes the stack instances from the specified stack set, but doesn't
     * delete the stacks. You can't reassociate a retained stack or add an
     * existing, saved stack to a new stack set.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     * >Stack set operation options</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param retainStacks <p>
     *            Removes the stack instances from the specified stack set, but
     *            doesn't delete the stacks. You can't reassociate a retained
     *            stack or add an existing, saved stack to a new stack set.
     *            </p>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-concepts.html#stackset-ops-options"
     *            >Stack set operation options</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
        return this;
    }

    /**
     * <p>
     * The unique identifier for this stack set operation.
     * </p>
     * <p>
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You can retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
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
     *         If you don't specify an operation ID, the SDK generates one
     *         automatically.
     *         </p>
     *         <p>
     *         The operation ID also functions as an idempotency token, to
     *         ensure that AWS CloudFormation performs the stack set operation
     *         only once, even if you retry the request multiple times. You can
     *         retry stack set operation requests to ensure that AWS
     *         CloudFormation successfully received them.
     *         </p>
     *         <p>
     *         Repeating this stack set operation with a new operation ID
     *         retries all stack instances whose status is <code>OUTDATED</code>
     *         .
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
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You can retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
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
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You can retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            Repeating this stack set operation with a new operation ID
     *            retries all stack instances whose status is
     *            <code>OUTDATED</code>.
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
     * If you don't specify an operation ID, the SDK generates one
     * automatically.
     * </p>
     * <p>
     * The operation ID also functions as an idempotency token, to ensure that
     * AWS CloudFormation performs the stack set operation only once, even if
     * you retry the request multiple times. You can retry stack set operation
     * requests to ensure that AWS CloudFormation successfully received them.
     * </p>
     * <p>
     * Repeating this stack set operation with a new operation ID retries all
     * stack instances whose status is <code>OUTDATED</code>.
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
     *            If you don't specify an operation ID, the SDK generates one
     *            automatically.
     *            </p>
     *            <p>
     *            The operation ID also functions as an idempotency token, to
     *            ensure that AWS CloudFormation performs the stack set
     *            operation only once, even if you retry the request multiple
     *            times. You can retry stack set operation requests to ensure
     *            that AWS CloudFormation successfully received them.
     *            </p>
     *            <p>
     *            Repeating this stack set operation with a new operation ID
     *            retries all stack instances whose status is
     *            <code>OUTDATED</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeleteStackInstancesRequest withOperationId(String operationId) {
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
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: " + getOperationPreferences() + ",");
        if (getRetainStacks() != null)
            sb.append("RetainStacks: " + getRetainStacks() + ",");
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
                + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode
                + ((getRetainStacks() == null) ? 0 : getRetainStacks().hashCode());
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

        if (obj instanceof DeleteStackInstancesRequest == false)
            return false;
        DeleteStackInstancesRequest other = (DeleteStackInstancesRequest) obj;

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
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null
                && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getRetainStacks() == null ^ this.getRetainStacks() == null)
            return false;
        if (other.getRetainStacks() != null
                && other.getRetainStacks().equals(this.getRetainStacks()) == false)
            return false;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null
                && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        return true;
    }
}
