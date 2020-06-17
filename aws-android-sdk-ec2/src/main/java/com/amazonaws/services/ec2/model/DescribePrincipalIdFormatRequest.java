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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the ID format settings for the root user and all IAM roles and IAM
 * users that have explicitly specified a longer ID (17-character ID)
 * preference.
 * </p>
 * <p>
 * By default, all IAM roles and IAM users default to the same ID settings as
 * the root user, unless they explicitly override the settings. This request is
 * useful for identifying those IAM users and IAM roles that have overridden the
 * default ID settings.
 * </p>
 * <p>
 * The following resource types support longer IDs: <code>bundle</code> |
 * <code>conversion-task</code> | <code>customer-gateway</code> |
 * <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
 * <code>elastic-ip-association</code> | <code>export-task</code> |
 * <code>flow-log</code> | <code>image</code> | <code>import-task</code> |
 * <code>instance</code> | <code>internet-gateway</code> |
 * <code>network-acl</code> | <code>network-acl-association</code> |
 * <code>network-interface</code> | <code>network-interface-attachment</code> |
 * <code>prefix-list</code> | <code>reservation</code> |
 * <code>route-table</code> | <code>route-table-association</code> |
 * <code>security-group</code> | <code>snapshot</code> | <code>subnet</code> |
 * <code>subnet-cidr-block-association</code> | <code>volume</code> |
 * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
 * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
 * <code>vpn-connection</code> | <code>vpn-gateway</code>.
 * </p>
 */
public class DescribePrincipalIdFormatRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     */
    private Boolean dryRun;

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     */
    private java.util.List<String> resources;

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned NextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     */
    private Integer maxResults;

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean isDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @return <p>
     *         Checks whether you have the required permissions for the action,
     *         without actually making the request, and provides an error
     *         response. If you have the required permissions, the error
     *         response is <code>DryRunOperation</code>. Otherwise, it is
     *         <code>UnauthorizedOperation</code>.
     *         </p>
     */
    public Boolean getDryRun() {
        return dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     */
    public void setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
    }

    /**
     * <p>
     * Checks whether you have the required permissions for the action, without
     * actually making the request, and provides an error response. If you have
     * the required permissions, the error response is
     * <code>DryRunOperation</code>. Otherwise, it is
     * <code>UnauthorizedOperation</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param dryRun <p>
     *            Checks whether you have the required permissions for the
     *            action, without actually making the request, and provides an
     *            error response. If you have the required permissions, the
     *            error response is <code>DryRunOperation</code>. Otherwise, it
     *            is <code>UnauthorizedOperation</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrincipalIdFormatRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     *
     * @return <p>
     *         The type of resource: <code>bundle</code> |
     *         <code>conversion-task</code> | <code>customer-gateway</code> |
     *         <code>dhcp-options</code> | <code>elastic-ip-allocation</code> |
     *         <code>elastic-ip-association</code> | <code>export-task</code> |
     *         <code>flow-log</code> | <code>image</code> |
     *         <code>import-task</code> | <code>instance</code> |
     *         <code>internet-gateway</code> | <code>network-acl</code> |
     *         <code>network-acl-association</code> |
     *         <code>network-interface</code> |
     *         <code>network-interface-attachment</code> |
     *         <code>prefix-list</code> | <code>reservation</code> |
     *         <code>route-table</code> | <code>route-table-association</code> |
     *         <code>security-group</code> | <code>snapshot</code> |
     *         <code>subnet</code> | <code>subnet-cidr-block-association</code>
     *         | <code>volume</code> | <code>vpc</code> |
     *         <code>vpc-cidr-block-association</code> |
     *         <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     *         <code>vpn-connection</code> | <code>vpn-gateway</code>
     *         </p>
     */
    public java.util.List<String> getResources() {
        return resources;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     *
     * @param resources <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>instance</code> | <code>internet-gateway</code> |
     *            <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>reservation</code> |
     *            <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>snapshot</code> |
     *            <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> |
     *            <code>volume</code> | <code>vpc</code> |
     *            <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>
     *            </p>
     */
    public void setResources(java.util.Collection<String> resources) {
        if (resources == null) {
            this.resources = null;
            return;
        }

        this.resources = new java.util.ArrayList<String>(resources);
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>instance</code> | <code>internet-gateway</code> |
     *            <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>reservation</code> |
     *            <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>snapshot</code> |
     *            <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> |
     *            <code>volume</code> | <code>vpc</code> |
     *            <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrincipalIdFormatRequest withResources(String... resources) {
        if (getResources() == null) {
            this.resources = new java.util.ArrayList<String>(resources.length);
        }
        for (String value : resources) {
            this.resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The type of resource: <code>bundle</code> | <code>conversion-task</code>
     * | <code>customer-gateway</code> | <code>dhcp-options</code> |
     * <code>elastic-ip-allocation</code> | <code>elastic-ip-association</code>
     * | <code>export-task</code> | <code>flow-log</code> | <code>image</code> |
     * <code>import-task</code> | <code>instance</code> |
     * <code>internet-gateway</code> | <code>network-acl</code> |
     * <code>network-acl-association</code> | <code>network-interface</code> |
     * <code>network-interface-attachment</code> | <code>prefix-list</code> |
     * <code>reservation</code> | <code>route-table</code> |
     * <code>route-table-association</code> | <code>security-group</code> |
     * <code>snapshot</code> | <code>subnet</code> |
     * <code>subnet-cidr-block-association</code> | <code>volume</code> |
     * <code>vpc</code> | <code>vpc-cidr-block-association</code> |
     * <code>vpc-endpoint</code> | <code>vpc-peering-connection</code> |
     * <code>vpn-connection</code> | <code>vpn-gateway</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resources <p>
     *            The type of resource: <code>bundle</code> |
     *            <code>conversion-task</code> | <code>customer-gateway</code> |
     *            <code>dhcp-options</code> | <code>elastic-ip-allocation</code>
     *            | <code>elastic-ip-association</code> |
     *            <code>export-task</code> | <code>flow-log</code> |
     *            <code>image</code> | <code>import-task</code> |
     *            <code>instance</code> | <code>internet-gateway</code> |
     *            <code>network-acl</code> |
     *            <code>network-acl-association</code> |
     *            <code>network-interface</code> |
     *            <code>network-interface-attachment</code> |
     *            <code>prefix-list</code> | <code>reservation</code> |
     *            <code>route-table</code> |
     *            <code>route-table-association</code> |
     *            <code>security-group</code> | <code>snapshot</code> |
     *            <code>subnet</code> |
     *            <code>subnet-cidr-block-association</code> |
     *            <code>volume</code> | <code>vpc</code> |
     *            <code>vpc-cidr-block-association</code> |
     *            <code>vpc-endpoint</code> |
     *            <code>vpc-peering-connection</code> |
     *            <code>vpn-connection</code> | <code>vpn-gateway</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrincipalIdFormatRequest withResources(java.util.Collection<String> resources) {
        setResources(resources);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned NextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @return <p>
     *         The maximum number of results to return in a single call. To
     *         retrieve the remaining results, make another call with the
     *         returned NextToken value.
     *         </p>
     */
    public Integer getMaxResults() {
        return maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned NextToken value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned NextToken value.
     *            </p>
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in a single call. To retrieve the
     * remaining results, make another call with the returned NextToken value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 1000<br/>
     *
     * @param maxResults <p>
     *            The maximum number of results to return in a single call. To
     *            retrieve the remaining results, make another call with the
     *            returned NextToken value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrincipalIdFormatRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @return <p>
     *         The token to request the next page of results.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The token to request the next page of results.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nextToken <p>
     *            The token to request the next page of results.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePrincipalIdFormatRequest withNextToken(String nextToken) {
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
        if (getDryRun() != null)
            sb.append("DryRun: " + getDryRun() + ",");
        if (getResources() != null)
            sb.append("Resources: " + getResources() + ",");
        if (getMaxResults() != null)
            sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null)
            sb.append("NextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDryRun() == null) ? 0 : getDryRun().hashCode());
        hashCode = prime * hashCode + ((getResources() == null) ? 0 : getResources().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePrincipalIdFormatRequest == false)
            return false;
        DescribePrincipalIdFormatRequest other = (DescribePrincipalIdFormatRequest) obj;

        if (other.getDryRun() == null ^ this.getDryRun() == null)
            return false;
        if (other.getDryRun() != null && other.getDryRun().equals(this.getDryRun()) == false)
            return false;
        if (other.getResources() == null ^ this.getResources() == null)
            return false;
        if (other.getResources() != null
                && other.getResources().equals(this.getResources()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null
                && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
