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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

public class ListQueryLoggingConfigsResult implements Serializable {
    /**
     * <p>
     * An array that contains one <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     * >QueryLoggingConfig</a> element for each configuration for DNS query
     * logging that is associated with the current AWS account.
     * </p>
     */
    private java.util.List<QueryLoggingConfig> queryLoggingConfigs;

    /**
     * <p>
     * If a response includes the last of the query logging configurations that
     * are associated with the current AWS account, <code>NextToken</code>
     * doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get
     * more configurations by submitting another <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     * >ListQueryLoggingConfigs</a> request. Get the value of
     * <code>NextToken</code> that Amazon Route 53 returned in the previous
     * response and include it in <code>NextToken</code> in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String nextToken;

    /**
     * <p>
     * An array that contains one <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     * >QueryLoggingConfig</a> element for each configuration for DNS query
     * logging that is associated with the current AWS account.
     * </p>
     *
     * @return <p>
     *         An array that contains one <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *         >QueryLoggingConfig</a> element for each configuration for DNS
     *         query logging that is associated with the current AWS account.
     *         </p>
     */
    public java.util.List<QueryLoggingConfig> getQueryLoggingConfigs() {
        return queryLoggingConfigs;
    }

    /**
     * <p>
     * An array that contains one <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     * >QueryLoggingConfig</a> element for each configuration for DNS query
     * logging that is associated with the current AWS account.
     * </p>
     *
     * @param queryLoggingConfigs <p>
     *            An array that contains one <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *            >QueryLoggingConfig</a> element for each configuration for DNS
     *            query logging that is associated with the current AWS account.
     *            </p>
     */
    public void setQueryLoggingConfigs(java.util.Collection<QueryLoggingConfig> queryLoggingConfigs) {
        if (queryLoggingConfigs == null) {
            this.queryLoggingConfigs = null;
            return;
        }

        this.queryLoggingConfigs = new java.util.ArrayList<QueryLoggingConfig>(queryLoggingConfigs);
    }

    /**
     * <p>
     * An array that contains one <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     * >QueryLoggingConfig</a> element for each configuration for DNS query
     * logging that is associated with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryLoggingConfigs <p>
     *            An array that contains one <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *            >QueryLoggingConfig</a> element for each configuration for DNS
     *            query logging that is associated with the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsResult withQueryLoggingConfigs(
            QueryLoggingConfig... queryLoggingConfigs) {
        if (getQueryLoggingConfigs() == null) {
            this.queryLoggingConfigs = new java.util.ArrayList<QueryLoggingConfig>(
                    queryLoggingConfigs.length);
        }
        for (QueryLoggingConfig value : queryLoggingConfigs) {
            this.queryLoggingConfigs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array that contains one <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     * >QueryLoggingConfig</a> element for each configuration for DNS query
     * logging that is associated with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queryLoggingConfigs <p>
     *            An array that contains one <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_QueryLoggingConfig.html"
     *            >QueryLoggingConfig</a> element for each configuration for DNS
     *            query logging that is associated with the current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsResult withQueryLoggingConfigs(
            java.util.Collection<QueryLoggingConfig> queryLoggingConfigs) {
        setQueryLoggingConfigs(queryLoggingConfigs);
        return this;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that
     * are associated with the current AWS account, <code>NextToken</code>
     * doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get
     * more configurations by submitting another <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     * >ListQueryLoggingConfigs</a> request. Get the value of
     * <code>NextToken</code> that Amazon Route 53 returned in the previous
     * response and include it in <code>NextToken</code> in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         If a response includes the last of the query logging
     *         configurations that are associated with the current AWS account,
     *         <code>NextToken</code> doesn't appear in the response.
     *         </p>
     *         <p>
     *         If a response doesn't include the last of the configurations, you
     *         can get more configurations by submitting another <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *         >ListQueryLoggingConfigs</a> request. Get the value of
     *         <code>NextToken</code> that Amazon Route 53 returned in the
     *         previous response and include it in <code>NextToken</code> in the
     *         next request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that
     * are associated with the current AWS account, <code>NextToken</code>
     * doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get
     * more configurations by submitting another <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     * >ListQueryLoggingConfigs</a> request. Get the value of
     * <code>NextToken</code> that Amazon Route 53 returned in the previous
     * response and include it in <code>NextToken</code> in the next request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            If a response includes the last of the query logging
     *            configurations that are associated with the current AWS
     *            account, <code>NextToken</code> doesn't appear in the
     *            response.
     *            </p>
     *            <p>
     *            If a response doesn't include the last of the configurations,
     *            you can get more configurations by submitting another <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *            >ListQueryLoggingConfigs</a> request. Get the value of
     *            <code>NextToken</code> that Amazon Route 53 returned in the
     *            previous response and include it in <code>NextToken</code> in
     *            the next request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If a response includes the last of the query logging configurations that
     * are associated with the current AWS account, <code>NextToken</code>
     * doesn't appear in the response.
     * </p>
     * <p>
     * If a response doesn't include the last of the configurations, you can get
     * more configurations by submitting another <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     * >ListQueryLoggingConfigs</a> request. Get the value of
     * <code>NextToken</code> that Amazon Route 53 returned in the previous
     * response and include it in <code>NextToken</code> in the next request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            If a response includes the last of the query logging
     *            configurations that are associated with the current AWS
     *            account, <code>NextToken</code> doesn't appear in the
     *            response.
     *            </p>
     *            <p>
     *            If a response doesn't include the last of the configurations,
     *            you can get more configurations by submitting another <a href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html"
     *            >ListQueryLoggingConfigs</a> request. Get the value of
     *            <code>NextToken</code> that Amazon Route 53 returned in the
     *            previous response and include it in <code>NextToken</code> in
     *            the next request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsResult withNextToken(String nextToken) {
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
        if (getQueryLoggingConfigs() != null)
            sb.append("QueryLoggingConfigs: " + getQueryLoggingConfigs() + ",");
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
                + ((getQueryLoggingConfigs() == null) ? 0 : getQueryLoggingConfigs().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListQueryLoggingConfigsResult == false)
            return false;
        ListQueryLoggingConfigsResult other = (ListQueryLoggingConfigsResult) obj;

        if (other.getQueryLoggingConfigs() == null ^ this.getQueryLoggingConfigs() == null)
            return false;
        if (other.getQueryLoggingConfigs() != null
                && other.getQueryLoggingConfigs().equals(this.getQueryLoggingConfigs()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
