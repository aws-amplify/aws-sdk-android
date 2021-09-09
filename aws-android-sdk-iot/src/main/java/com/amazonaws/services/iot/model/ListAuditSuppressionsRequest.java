/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists your Device Defender audit listings.
 * </p>
 * <p>
 * Requires permission to access the <a href=
 * "https://docs.aws.amazon.com/service-authorization/latest/reference/list_awsiot.html#awsiot-actions-as-permissions"
 * >ListAuditSuppressions</a> action.
 * </p>
 */
public class ListAuditSuppressionsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     */
    private String checkName;

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     */
    private ResourceIdentifier resourceIdentifier;

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by
     * expiration date or not. If parameter isn't provided,
     * <code>ascendingOrder=true</code>.
     * </p>
     */
    private Boolean ascendingOrder;

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @return <p>
     *         An audit check name. Checks must be enabled for your account.
     *         (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *         list of all checks, including those that are enabled or use
     *         <code>UpdateAccountAuditConfiguration</code> to select which
     *         checks are enabled.)
     *         </p>
     */
    public String getCheckName() {
        return checkName;
    }

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     *
     * @param checkName <p>
     *            An audit check name. Checks must be enabled for your account.
     *            (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *            list of all checks, including those that are enabled or use
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     */
    public void setCheckName(String checkName) {
        this.checkName = checkName;
    }

    /**
     * <p>
     * An audit check name. Checks must be enabled for your account. (Use
     * <code>DescribeAccountAuditConfiguration</code> to see the list of all
     * checks, including those that are enabled or use
     * <code>UpdateAccountAuditConfiguration</code> to select which checks are
     * enabled.)
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param checkName <p>
     *            An audit check name. Checks must be enabled for your account.
     *            (Use <code>DescribeAccountAuditConfiguration</code> to see the
     *            list of all checks, including those that are enabled or use
     *            <code>UpdateAccountAuditConfiguration</code> to select which
     *            checks are enabled.)
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditSuppressionsRequest withCheckName(String checkName) {
        this.checkName = checkName;
        return this;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     *
     * @return <p>
     *         Information that identifies the noncompliant resource.
     *         </p>
     */
    public ResourceIdentifier getResourceIdentifier() {
        return resourceIdentifier;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     *
     * @param resourceIdentifier <p>
     *            Information that identifies the noncompliant resource.
     *            </p>
     */
    public void setResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
    }

    /**
     * <p>
     * Information that identifies the noncompliant resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceIdentifier <p>
     *            Information that identifies the noncompliant resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditSuppressionsRequest withResourceIdentifier(ResourceIdentifier resourceIdentifier) {
        this.resourceIdentifier = resourceIdentifier;
        return this;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by
     * expiration date or not. If parameter isn't provided,
     * <code>ascendingOrder=true</code>.
     * </p>
     *
     * @return <p>
     *         Determines whether suppressions are listed in ascending order by
     *         expiration date or not. If parameter isn't provided,
     *         <code>ascendingOrder=true</code>.
     *         </p>
     */
    public Boolean isAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by
     * expiration date or not. If parameter isn't provided,
     * <code>ascendingOrder=true</code>.
     * </p>
     *
     * @return <p>
     *         Determines whether suppressions are listed in ascending order by
     *         expiration date or not. If parameter isn't provided,
     *         <code>ascendingOrder=true</code>.
     *         </p>
     */
    public Boolean getAscendingOrder() {
        return ascendingOrder;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by
     * expiration date or not. If parameter isn't provided,
     * <code>ascendingOrder=true</code>.
     * </p>
     *
     * @param ascendingOrder <p>
     *            Determines whether suppressions are listed in ascending order
     *            by expiration date or not. If parameter isn't provided,
     *            <code>ascendingOrder=true</code>.
     *            </p>
     */
    public void setAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
    }

    /**
     * <p>
     * Determines whether suppressions are listed in ascending order by
     * expiration date or not. If parameter isn't provided,
     * <code>ascendingOrder=true</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ascendingOrder <p>
     *            Determines whether suppressions are listed in ascending order
     *            by expiration date or not. If parameter isn't provided,
     *            <code>ascendingOrder=true</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditSuppressionsRequest withAscendingOrder(Boolean ascendingOrder) {
        this.ascendingOrder = ascendingOrder;
        return this;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @return <p>
     *         The token for the next set of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token for the next set of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token for the next set of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditSuppressionsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @return <p>
     *         The maximum number of results to return at one time. The default
     *         is 25.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return at one time. The default is 25.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 250<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return at one time. The
     *            default is 25.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListAuditSuppressionsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getCheckName() != null)
            sb.append("checkName: " + getCheckName() + ",");
        if (getResourceIdentifier() != null)
            sb.append("resourceIdentifier: " + getResourceIdentifier() + ",");
        if (getAscendingOrder() != null)
            sb.append("ascendingOrder: " + getAscendingOrder() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("maxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCheckName() == null) ? 0 : getCheckName().hashCode());
        hashCode = prime * hashCode
                + ((getResourceIdentifier() == null) ? 0 : getResourceIdentifier().hashCode());
        hashCode = prime * hashCode
                + ((getAscendingOrder() == null) ? 0 : getAscendingOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAuditSuppressionsRequest == false)
            return false;
        ListAuditSuppressionsRequest other = (ListAuditSuppressionsRequest) obj;

        if (other.getCheckName() == null ^ this.getCheckName() == null)
            return false;
        if (other.getCheckName() != null
                && other.getCheckName().equals(this.getCheckName()) == false)
            return false;
        if (other.getResourceIdentifier() == null ^ this.getResourceIdentifier() == null)
            return false;
        if (other.getResourceIdentifier() != null
                && other.getResourceIdentifier().equals(this.getResourceIdentifier()) == false)
            return false;
        if (other.getAscendingOrder() == null ^ this.getAscendingOrder() == null)
            return false;
        if (other.getAscendingOrder() != null
                && other.getAscendingOrder().equals(this.getAscendingOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }
}
