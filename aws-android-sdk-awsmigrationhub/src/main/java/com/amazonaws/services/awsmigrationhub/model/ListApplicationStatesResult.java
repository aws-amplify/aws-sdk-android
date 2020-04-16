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

package com.amazonaws.services.awsmigrationhub.model;

import java.io.Serializable;

public class ListApplicationStatesResult implements Serializable {
    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     */
    private java.util.List<ApplicationState> applicationStateList;

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     *
     * @return <p>
     *         A list of Applications that exist in Application Discovery
     *         Service.
     *         </p>
     */
    public java.util.List<ApplicationState> getApplicationStateList() {
        return applicationStateList;
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     *
     * @param applicationStateList <p>
     *            A list of Applications that exist in Application Discovery
     *            Service.
     *            </p>
     */
    public void setApplicationStateList(java.util.Collection<ApplicationState> applicationStateList) {
        if (applicationStateList == null) {
            this.applicationStateList = null;
            return;
        }

        this.applicationStateList = new java.util.ArrayList<ApplicationState>(applicationStateList);
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationStateList <p>
     *            A list of Applications that exist in Application Discovery
     *            Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesResult withApplicationStateList(
            ApplicationState... applicationStateList) {
        if (getApplicationStateList() == null) {
            this.applicationStateList = new java.util.ArrayList<ApplicationState>(
                    applicationStateList.length);
        }
        for (ApplicationState value : applicationStateList) {
            this.applicationStateList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of Applications that exist in Application Discovery Service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationStateList <p>
     *            A list of Applications that exist in Application Discovery
     *            Service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesResult withApplicationStateList(
            java.util.Collection<ApplicationState> applicationStateList) {
        setApplicationStateList(applicationStateList);
        return this;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @return <p>
     *         If a <code>NextToken</code> was returned by a previous call,
     *         there are more results available. To retrieve the next page of
     *         results, make the call again using the returned token in
     *         <code>NextToken</code>.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If a <code>NextToken</code> was returned by a previous call,
     *            there are more results available. To retrieve the next page of
     *            results, make the call again using the returned token in
     *            <code>NextToken</code>.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a <code>NextToken</code> was returned by a previous call, there are
     * more results available. To retrieve the next page of results, make the
     * call again using the returned token in <code>NextToken</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 2048<br/>
     * <b>Pattern: </b>^[a-zA-Z0-9\/\+\=]{0,2048}$<br/>
     *
     * @param nextToken <p>
     *            If a <code>NextToken</code> was returned by a previous call,
     *            there are more results available. To retrieve the next page of
     *            results, make the call again using the returned token in
     *            <code>NextToken</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListApplicationStatesResult withNextToken(String nextToken) {
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
        if (getApplicationStateList() != null)
            sb.append("ApplicationStateList: " + getApplicationStateList() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationStateList() == null) ? 0 : getApplicationStateList().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListApplicationStatesResult == false)
            return false;
        ListApplicationStatesResult other = (ListApplicationStatesResult) obj;

        if (other.getApplicationStateList() == null ^ this.getApplicationStateList() == null)
            return false;
        if (other.getApplicationStateList() != null
                && other.getApplicationStateList().equals(this.getApplicationStateList()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
