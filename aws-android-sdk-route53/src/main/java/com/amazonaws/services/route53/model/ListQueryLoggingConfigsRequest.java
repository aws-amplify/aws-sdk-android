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

package com.amazonaws.services.route53.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Lists the configurations for DNS query logging that are associated with the
 * current AWS account or the configuration that is associated with a specified
 * hosted zone.
 * </p>
 * <p>
 * For more information about DNS query logs, see <a href=
 * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_CreateQueryLoggingConfig.html"
 * >CreateQueryLoggingConfig</a>. Additional information, including the format
 * of DNS query logs, appears in <a href=
 * "https://docs.aws.amazon.com/Route53/latest/DeveloperGuide/query-logs.html"
 * >Logging DNS Queries</a> in the <i>Amazon Route 53 Developer Guide</i>.
 * </p>
 */
public class ListQueryLoggingConfigsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is
     * associated with a hosted zone, specify the ID in
     * <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID,
     * <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * (Optional) If the current AWS account has more than
     * <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this
     * value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of
     * <code>NextToken</code> from the previous response and specify that value
     * for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     */
    private String nextToken;

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you
     * want Amazon Route 53 to return in response to the current request. If the
     * current AWS account has more than <code>MaxResults</code> configurations,
     * use the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53
     * returns up to 100 configurations.
     * </p>
     */
    private String maxResults;

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is
     * associated with a hosted zone, specify the ID in
     * <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID,
     * <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         (Optional) If you want to list the query logging configuration
     *         that is associated with a hosted zone, specify the ID in
     *         <code>HostedZoneId</code>.
     *         </p>
     *         <p>
     *         If you don't specify a hosted zone ID,
     *         <code>ListQueryLoggingConfigs</code> returns all of the
     *         configurations that are associated with the current AWS account.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is
     * associated with a hosted zone, specify the ID in
     * <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID,
     * <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            (Optional) If you want to list the query logging configuration
     *            that is associated with a hosted zone, specify the ID in
     *            <code>HostedZoneId</code>.
     *            </p>
     *            <p>
     *            If you don't specify a hosted zone ID,
     *            <code>ListQueryLoggingConfigs</code> returns all of the
     *            configurations that are associated with the current AWS
     *            account.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * (Optional) If you want to list the query logging configuration that is
     * associated with a hosted zone, specify the ID in
     * <code>HostedZoneId</code>.
     * </p>
     * <p>
     * If you don't specify a hosted zone ID,
     * <code>ListQueryLoggingConfigs</code> returns all of the configurations
     * that are associated with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            (Optional) If you want to list the query logging configuration
     *            that is associated with a hosted zone, specify the ID in
     *            <code>HostedZoneId</code>.
     *            </p>
     *            <p>
     *            If you don't specify a hosted zone ID,
     *            <code>ListQueryLoggingConfigs</code> returns all of the
     *            configurations that are associated with the current AWS
     *            account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than
     * <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this
     * value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of
     * <code>NextToken</code> from the previous response and specify that value
     * for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @return <p>
     *         (Optional) If the current AWS account has more than
     *         <code>MaxResults</code> query logging configurations, use
     *         <code>NextToken</code> to get the second and subsequent pages of
     *         results.
     *         </p>
     *         <p>
     *         For the first <code>ListQueryLoggingConfigs</code> request, omit
     *         this value.
     *         </p>
     *         <p>
     *         For the second and subsequent requests, get the value of
     *         <code>NextToken</code> from the previous response and specify
     *         that value for <code>NextToken</code> in the request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than
     * <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this
     * value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of
     * <code>NextToken</code> from the previous response and specify that value
     * for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            (Optional) If the current AWS account has more than
     *            <code>MaxResults</code> query logging configurations, use
     *            <code>NextToken</code> to get the second and subsequent pages
     *            of results.
     *            </p>
     *            <p>
     *            For the first <code>ListQueryLoggingConfigs</code> request,
     *            omit this value.
     *            </p>
     *            <p>
     *            For the second and subsequent requests, get the value of
     *            <code>NextToken</code> from the previous response and specify
     *            that value for <code>NextToken</code> in the request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * (Optional) If the current AWS account has more than
     * <code>MaxResults</code> query logging configurations, use
     * <code>NextToken</code> to get the second and subsequent pages of results.
     * </p>
     * <p>
     * For the first <code>ListQueryLoggingConfigs</code> request, omit this
     * value.
     * </p>
     * <p>
     * For the second and subsequent requests, get the value of
     * <code>NextToken</code> from the previous response and specify that value
     * for <code>NextToken</code> in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 256<br/>
     *
     * @param nextToken <p>
     *            (Optional) If the current AWS account has more than
     *            <code>MaxResults</code> query logging configurations, use
     *            <code>NextToken</code> to get the second and subsequent pages
     *            of results.
     *            </p>
     *            <p>
     *            For the first <code>ListQueryLoggingConfigs</code> request,
     *            omit this value.
     *            </p>
     *            <p>
     *            For the second and subsequent requests, get the value of
     *            <code>NextToken</code> from the previous response and specify
     *            that value for <code>NextToken</code> in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you
     * want Amazon Route 53 to return in response to the current request. If the
     * current AWS account has more than <code>MaxResults</code> configurations,
     * use the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53
     * returns up to 100 configurations.
     * </p>
     *
     * @return <p>
     *         (Optional) The maximum number of query logging configurations
     *         that you want Amazon Route 53 to return in response to the
     *         current request. If the current AWS account has more than
     *         <code>MaxResults</code> configurations, use the value of <a href=
     *         "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *         >NextToken</a> in the response to get the next page of results.
     *         </p>
     *         <p>
     *         If you don't specify a value for <code>MaxResults</code>, Route
     *         53 returns up to 100 configurations.
     *         </p>
     */
    public String getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you
     * want Amazon Route 53 to return in response to the current request. If the
     * current AWS account has more than <code>MaxResults</code> configurations,
     * use the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53
     * returns up to 100 configurations.
     * </p>
     *
     * @param maxResults <p>
     *            (Optional) The maximum number of query logging configurations
     *            that you want Amazon Route 53 to return in response to the
     *            current request. If the current AWS account has more than
     *            <code>MaxResults</code> configurations, use the value of <a
     *            href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *            >NextToken</a> in the response to get the next page of
     *            results.
     *            </p>
     *            <p>
     *            If you don't specify a value for <code>MaxResults</code>,
     *            Route 53 returns up to 100 configurations.
     *            </p>
     */
    public void setMaxResults(String maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * (Optional) The maximum number of query logging configurations that you
     * want Amazon Route 53 to return in response to the current request. If the
     * current AWS account has more than <code>MaxResults</code> configurations,
     * use the value of <a href=
     * "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     * >NextToken</a> in the response to get the next page of results.
     * </p>
     * <p>
     * If you don't specify a value for <code>MaxResults</code>, Route 53
     * returns up to 100 configurations.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxResults <p>
     *            (Optional) The maximum number of query logging configurations
     *            that you want Amazon Route 53 to return in response to the
     *            current request. If the current AWS account has more than
     *            <code>MaxResults</code> configurations, use the value of <a
     *            href=
     *            "https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListQueryLoggingConfigs.html#API_ListQueryLoggingConfigs_RequestSyntax"
     *            >NextToken</a> in the response to get the next page of
     *            results.
     *            </p>
     *            <p>
     *            If you don't specify a value for <code>MaxResults</code>,
     *            Route 53 returns up to 100 configurations.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListQueryLoggingConfigsRequest withMaxResults(String maxResults) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
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

        if (obj instanceof ListQueryLoggingConfigsRequest == false)
            return false;
        ListQueryLoggingConfigsRequest other = (ListQueryLoggingConfigsRequest) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
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
