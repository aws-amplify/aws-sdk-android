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

package com.amazonaws.services.organizations.model;

import java.io.Serializable;

public class ListAWSServiceAccessForOrganizationResult implements Serializable {
    /**
     * <p>
     * A list of the service principals for the services that are enabled to
     * integrate with your organization. Each principal is a structure that
     * includes the name and the date that it was enabled for integration with
     * AWS Organizations.
     * </p>
     */
    private java.util.List<EnabledServicePrincipal> enabledServicePrincipals;

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the service principals for the services that are enabled to
     * integrate with your organization. Each principal is a structure that
     * includes the name and the date that it was enabled for integration with
     * AWS Organizations.
     * </p>
     *
     * @return <p>
     *         A list of the service principals for the services that are
     *         enabled to integrate with your organization. Each principal is a
     *         structure that includes the name and the date that it was enabled
     *         for integration with AWS Organizations.
     *         </p>
     */
    public java.util.List<EnabledServicePrincipal> getEnabledServicePrincipals() {
        return enabledServicePrincipals;
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to
     * integrate with your organization. Each principal is a structure that
     * includes the name and the date that it was enabled for integration with
     * AWS Organizations.
     * </p>
     *
     * @param enabledServicePrincipals <p>
     *            A list of the service principals for the services that are
     *            enabled to integrate with your organization. Each principal is
     *            a structure that includes the name and the date that it was
     *            enabled for integration with AWS Organizations.
     *            </p>
     */
    public void setEnabledServicePrincipals(
            java.util.Collection<EnabledServicePrincipal> enabledServicePrincipals) {
        if (enabledServicePrincipals == null) {
            this.enabledServicePrincipals = null;
            return;
        }

        this.enabledServicePrincipals = new java.util.ArrayList<EnabledServicePrincipal>(
                enabledServicePrincipals);
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to
     * integrate with your organization. Each principal is a structure that
     * includes the name and the date that it was enabled for integration with
     * AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledServicePrincipals <p>
     *            A list of the service principals for the services that are
     *            enabled to integrate with your organization. Each principal is
     *            a structure that includes the name and the date that it was
     *            enabled for integration with AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAWSServiceAccessForOrganizationResult withEnabledServicePrincipals(
            EnabledServicePrincipal... enabledServicePrincipals) {
        if (getEnabledServicePrincipals() == null) {
            this.enabledServicePrincipals = new java.util.ArrayList<EnabledServicePrincipal>(
                    enabledServicePrincipals.length);
        }
        for (EnabledServicePrincipal value : enabledServicePrincipals) {
            this.enabledServicePrincipals.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the service principals for the services that are enabled to
     * integrate with your organization. Each principal is a structure that
     * includes the name and the date that it was enabled for integration with
     * AWS Organizations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledServicePrincipals <p>
     *            A list of the service principals for the services that are
     *            enabled to integrate with your organization. Each principal is
     *            a structure that includes the name and the date that it was
     *            enabled for integration with AWS Organizations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAWSServiceAccessForOrganizationResult withEnabledServicePrincipals(
            java.util.Collection<EnabledServicePrincipal> enabledServicePrincipals) {
        setEnabledServicePrincipals(enabledServicePrincipals);
        return this;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     *
     * @return <p>
     *         If present, indicates that more output is available than is
     *         included in the current response. Use this value in the
     *         <code>NextToken</code> request parameter in a subsequent call to
     *         the operation to get the next part of the output. You should
     *         repeat this until the <code>NextToken</code> response element
     *         comes back as <code>null</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If present, indicates that more output is available than is included in
     * the current response. Use this value in the <code>NextToken</code>
     * request parameter in a subsequent call to the operation to get the next
     * part of the output. You should repeat this until the
     * <code>NextToken</code> response element comes back as <code>null</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            If present, indicates that more output is available than is
     *            included in the current response. Use this value in the
     *            <code>NextToken</code> request parameter in a subsequent call
     *            to the operation to get the next part of the output. You
     *            should repeat this until the <code>NextToken</code> response
     *            element comes back as <code>null</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAWSServiceAccessForOrganizationResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getEnabledServicePrincipals() != null)
            sb.append("EnabledServicePrincipals: " + getEnabledServicePrincipals() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getEnabledServicePrincipals() == null) ? 0 : getEnabledServicePrincipals()
                        .hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAWSServiceAccessForOrganizationResult == false)
            return false;
        ListAWSServiceAccessForOrganizationResult other = (ListAWSServiceAccessForOrganizationResult) obj;

        if (other.getEnabledServicePrincipals() == null
                ^ this.getEnabledServicePrincipals() == null)
            return false;
        if (other.getEnabledServicePrincipals() != null
                && other.getEnabledServicePrincipals().equals(this.getEnabledServicePrincipals()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
