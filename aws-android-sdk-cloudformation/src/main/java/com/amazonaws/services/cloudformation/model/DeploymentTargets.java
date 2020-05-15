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
 * [<code>Service-managed</code> permissions] The AWS Organizations accounts to
 * which StackSets deploys. StackSets does not deploy stack instances to the
 * organization master account, even if the master account is in your
 * organization or in an OU in your organization.
 * </p>
 * <p>
 * For update operations, you can specify either <code>Accounts</code> or
 * <code>OrganizationalUnitIds</code>. For create and delete operations, specify
 * <code>OrganizationalUnitIds</code>.
 * </p>
 */
public class DeploymentTargets implements Serializable {
    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack
     * set updates.
     * </p>
     */
    private java.util.List<String> accounts;

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs to which
     * StackSets deploys.
     * </p>
     */
    private java.util.List<String> organizationalUnitIds;

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack
     * set updates.
     * </p>
     *
     * @return <p>
     *         The names of one or more AWS accounts for which you want to
     *         deploy stack set updates.
     *         </p>
     */
    public java.util.List<String> getAccounts() {
        return accounts;
    }

    /**
     * <p>
     * The names of one or more AWS accounts for which you want to deploy stack
     * set updates.
     * </p>
     *
     * @param accounts <p>
     *            The names of one or more AWS accounts for which you want to
     *            deploy stack set updates.
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
     * The names of one or more AWS accounts for which you want to deploy stack
     * set updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            The names of one or more AWS accounts for which you want to
     *            deploy stack set updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTargets withAccounts(String... accounts) {
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
     * The names of one or more AWS accounts for which you want to deploy stack
     * set updates.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accounts <p>
     *            The names of one or more AWS accounts for which you want to
     *            deploy stack set updates.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTargets withAccounts(java.util.Collection<String> accounts) {
        setAccounts(accounts);
        return this;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs to which
     * StackSets deploys.
     * </p>
     *
     * @return <p>
     *         The organization root ID or organizational unit (OU) IDs to which
     *         StackSets deploys.
     *         </p>
     */
    public java.util.List<String> getOrganizationalUnitIds() {
        return organizationalUnitIds;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs to which
     * StackSets deploys.
     * </p>
     *
     * @param organizationalUnitIds <p>
     *            The organization root ID or organizational unit (OU) IDs to
     *            which StackSets deploys.
     *            </p>
     */
    public void setOrganizationalUnitIds(java.util.Collection<String> organizationalUnitIds) {
        if (organizationalUnitIds == null) {
            this.organizationalUnitIds = null;
            return;
        }

        this.organizationalUnitIds = new java.util.ArrayList<String>(organizationalUnitIds);
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs to which
     * StackSets deploys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnitIds <p>
     *            The organization root ID or organizational unit (OU) IDs to
     *            which StackSets deploys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTargets withOrganizationalUnitIds(String... organizationalUnitIds) {
        if (getOrganizationalUnitIds() == null) {
            this.organizationalUnitIds = new java.util.ArrayList<String>(
                    organizationalUnitIds.length);
        }
        for (String value : organizationalUnitIds) {
            this.organizationalUnitIds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The organization root ID or organizational unit (OU) IDs to which
     * StackSets deploys.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param organizationalUnitIds <p>
     *            The organization root ID or organizational unit (OU) IDs to
     *            which StackSets deploys.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeploymentTargets withOrganizationalUnitIds(
            java.util.Collection<String> organizationalUnitIds) {
        setOrganizationalUnitIds(organizationalUnitIds);
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
        if (getAccounts() != null)
            sb.append("Accounts: " + getAccounts() + ",");
        if (getOrganizationalUnitIds() != null)
            sb.append("OrganizationalUnitIds: " + getOrganizationalUnitIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccounts() == null) ? 0 : getAccounts().hashCode());
        hashCode = prime
                * hashCode
                + ((getOrganizationalUnitIds() == null) ? 0 : getOrganizationalUnitIds().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentTargets == false)
            return false;
        DeploymentTargets other = (DeploymentTargets) obj;

        if (other.getAccounts() == null ^ this.getAccounts() == null)
            return false;
        if (other.getAccounts() != null && other.getAccounts().equals(this.getAccounts()) == false)
            return false;
        if (other.getOrganizationalUnitIds() == null ^ this.getOrganizationalUnitIds() == null)
            return false;
        if (other.getOrganizationalUnitIds() != null
                && other.getOrganizationalUnitIds().equals(this.getOrganizationalUnitIds()) == false)
            return false;
        return true;
    }
}
