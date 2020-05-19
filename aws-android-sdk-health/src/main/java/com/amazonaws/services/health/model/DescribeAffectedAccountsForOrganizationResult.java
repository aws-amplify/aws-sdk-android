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

package com.amazonaws.services.health.model;

import java.io.Serializable;

public class DescribeAffectedAccountsForOrganizationResult implements Serializable {
    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     */
    private java.util.List<String> affectedAccounts;

    /**
     * The new value for the eventScopeCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     */
    private String eventScopeCode;

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     *
     * @return <p>
     *         A JSON set of elements of the affected accounts.
     *         </p>
     */
    public java.util.List<String> getAffectedAccounts() {
        return affectedAccounts;
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     *
     * @param affectedAccounts <p>
     *            A JSON set of elements of the affected accounts.
     *            </p>
     */
    public void setAffectedAccounts(java.util.Collection<String> affectedAccounts) {
        if (affectedAccounts == null) {
            this.affectedAccounts = null;
            return;
        }

        this.affectedAccounts = new java.util.ArrayList<String>(affectedAccounts);
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param affectedAccounts <p>
     *            A JSON set of elements of the affected accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedAccountsForOrganizationResult withAffectedAccounts(
            String... affectedAccounts) {
        if (getAffectedAccounts() == null) {
            this.affectedAccounts = new java.util.ArrayList<String>(affectedAccounts.length);
        }
        for (String value : affectedAccounts) {
            this.affectedAccounts.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A JSON set of elements of the affected accounts.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param affectedAccounts <p>
     *            A JSON set of elements of the affected accounts.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedAccountsForOrganizationResult withAffectedAccounts(
            java.util.Collection<String> affectedAccounts) {
        setAffectedAccounts(affectedAccounts);
        return this;
    }

    /**
     * Returns the value of the eventScopeCode property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @return The value of the eventScopeCode property for this object.
     * @see EventScopeCode
     */
    public String getEventScopeCode() {
        return eventScopeCode;
    }

    /**
     * Sets the value of eventScopeCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @see EventScopeCode
     */
    public void setEventScopeCode(String eventScopeCode) {
        this.eventScopeCode = eventScopeCode;
    }

    /**
     * Sets the value of the eventScopeCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventScopeCode
     */
    public DescribeAffectedAccountsForOrganizationResult withEventScopeCode(String eventScopeCode) {
        this.eventScopeCode = eventScopeCode;
        return this;
    }

    /**
     * Sets the value of eventScopeCode
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @see EventScopeCode
     */
    public void setEventScopeCode(EventScopeCode eventScopeCode) {
        this.eventScopeCode = eventScopeCode.toString();
    }

    /**
     * Sets the value of the eventScopeCode property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PUBLIC, ACCOUNT_SPECIFIC, NONE
     *
     * @param eventScopeCode The new value for the eventScopeCode property for
     *            this object.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see EventScopeCode
     */
    public DescribeAffectedAccountsForOrganizationResult withEventScopeCode(
            EventScopeCode eventScopeCode) {
        this.eventScopeCode = eventScopeCode.toString();
        return this;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @return <p>
     *         If the results of a search are large, only a portion of the
     *         results are returned, and a <code>nextToken</code> pagination
     *         token is returned in the response. To retrieve the next batch of
     *         results, reissue the search request and include the returned
     *         token. When all results have been returned, the response does not
     *         contain a pagination token value.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the results of a search are large, only a portion of the results are
     * returned, and a <code>nextToken</code> pagination token is returned in
     * the response. To retrieve the next batch of results, reissue the search
     * request and include the returned token. When all results have been
     * returned, the response does not contain a pagination token value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>4 - 10000<br/>
     * <b>Pattern: </b>[a-zA-Z0-9=/+_.-]{4,10000}<br/>
     *
     * @param nextToken <p>
     *            If the results of a search are large, only a portion of the
     *            results are returned, and a <code>nextToken</code> pagination
     *            token is returned in the response. To retrieve the next batch
     *            of results, reissue the search request and include the
     *            returned token. When all results have been returned, the
     *            response does not contain a pagination token value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAffectedAccountsForOrganizationResult withNextToken(String nextToken) {
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
        if (getAffectedAccounts() != null)
            sb.append("affectedAccounts: " + getAffectedAccounts() + ",");
        if (getEventScopeCode() != null)
            sb.append("eventScopeCode: " + getEventScopeCode() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAffectedAccounts() == null) ? 0 : getAffectedAccounts().hashCode());
        hashCode = prime * hashCode
                + ((getEventScopeCode() == null) ? 0 : getEventScopeCode().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAffectedAccountsForOrganizationResult == false)
            return false;
        DescribeAffectedAccountsForOrganizationResult other = (DescribeAffectedAccountsForOrganizationResult) obj;

        if (other.getAffectedAccounts() == null ^ this.getAffectedAccounts() == null)
            return false;
        if (other.getAffectedAccounts() != null
                && other.getAffectedAccounts().equals(this.getAffectedAccounts()) == false)
            return false;
        if (other.getEventScopeCode() == null ^ this.getEventScopeCode() == null)
            return false;
        if (other.getEventScopeCode() != null
                && other.getEventScopeCode().equals(this.getEventScopeCode()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
