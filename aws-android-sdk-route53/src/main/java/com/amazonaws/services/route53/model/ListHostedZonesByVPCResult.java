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

public class ListHostedZonesByVPCResult implements Serializable {
    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each
     * hosted zone that the specified Amazon VPC is associated with. Each
     * <code>HostedZoneSummary</code> element contains the hosted zone name and
     * ID, and information about who owns the hosted zone.
     * </p>
     */
    private java.util.List<HostedZoneSummary> hostedZoneSummaries;

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent
     * <code>ListHostedZonesByVPC</code> request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most
     * recent <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each
     * hosted zone that the specified Amazon VPC is associated with. Each
     * <code>HostedZoneSummary</code> element contains the hosted zone name and
     * ID, and information about who owns the hosted zone.
     * </p>
     *
     * @return <p>
     *         A list that contains one <code>HostedZoneSummary</code> element
     *         for each hosted zone that the specified Amazon VPC is associated
     *         with. Each <code>HostedZoneSummary</code> element contains the
     *         hosted zone name and ID, and information about who owns the
     *         hosted zone.
     *         </p>
     */
    public java.util.List<HostedZoneSummary> getHostedZoneSummaries() {
        return hostedZoneSummaries;
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each
     * hosted zone that the specified Amazon VPC is associated with. Each
     * <code>HostedZoneSummary</code> element contains the hosted zone name and
     * ID, and information about who owns the hosted zone.
     * </p>
     *
     * @param hostedZoneSummaries <p>
     *            A list that contains one <code>HostedZoneSummary</code>
     *            element for each hosted zone that the specified Amazon VPC is
     *            associated with. Each <code>HostedZoneSummary</code> element
     *            contains the hosted zone name and ID, and information about
     *            who owns the hosted zone.
     *            </p>
     */
    public void setHostedZoneSummaries(java.util.Collection<HostedZoneSummary> hostedZoneSummaries) {
        if (hostedZoneSummaries == null) {
            this.hostedZoneSummaries = null;
            return;
        }

        this.hostedZoneSummaries = new java.util.ArrayList<HostedZoneSummary>(hostedZoneSummaries);
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each
     * hosted zone that the specified Amazon VPC is associated with. Each
     * <code>HostedZoneSummary</code> element contains the hosted zone name and
     * ID, and information about who owns the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneSummaries <p>
     *            A list that contains one <code>HostedZoneSummary</code>
     *            element for each hosted zone that the specified Amazon VPC is
     *            associated with. Each <code>HostedZoneSummary</code> element
     *            contains the hosted zone name and ID, and information about
     *            who owns the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCResult withHostedZoneSummaries(
            HostedZoneSummary... hostedZoneSummaries) {
        if (getHostedZoneSummaries() == null) {
            this.hostedZoneSummaries = new java.util.ArrayList<HostedZoneSummary>(
                    hostedZoneSummaries.length);
        }
        for (HostedZoneSummary value : hostedZoneSummaries) {
            this.hostedZoneSummaries.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>HostedZoneSummary</code> element for each
     * hosted zone that the specified Amazon VPC is associated with. Each
     * <code>HostedZoneSummary</code> element contains the hosted zone name and
     * ID, and information about who owns the hosted zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hostedZoneSummaries <p>
     *            A list that contains one <code>HostedZoneSummary</code>
     *            element for each hosted zone that the specified Amazon VPC is
     *            associated with. Each <code>HostedZoneSummary</code> element
     *            contains the hosted zone name and ID, and information about
     *            who owns the hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCResult withHostedZoneSummaries(
            java.util.Collection<HostedZoneSummary> hostedZoneSummaries) {
        setHostedZoneSummaries(hostedZoneSummaries);
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent
     * <code>ListHostedZonesByVPC</code> request.
     * </p>
     *
     * @return <p>
     *         The value that you specified for <code>MaxItems</code> in the
     *         most recent <code>ListHostedZonesByVPC</code> request.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent
     * <code>ListHostedZonesByVPC</code> request.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for <code>MaxItems</code> in the
     *            most recent <code>ListHostedZonesByVPC</code> request.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for <code>MaxItems</code> in the most recent
     * <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for <code>MaxItems</code> in the
     *            most recent <code>ListHostedZonesByVPC</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most
     * recent <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The value that you specified for <code>NextToken</code> in the
     *         most recent <code>ListHostedZonesByVPC</code> request.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most
     * recent <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            The value that you specified for <code>NextToken</code> in the
     *            most recent <code>ListHostedZonesByVPC</code> request.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The value that you specified for <code>NextToken</code> in the most
     * recent <code>ListHostedZonesByVPC</code> request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param nextToken <p>
     *            The value that you specified for <code>NextToken</code> in the
     *            most recent <code>ListHostedZonesByVPC</code> request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByVPCResult withNextToken(String nextToken) {
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
        if (getHostedZoneSummaries() != null)
            sb.append("HostedZoneSummaries: " + getHostedZoneSummaries() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems() + ",");
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
                + ((getHostedZoneSummaries() == null) ? 0 : getHostedZoneSummaries().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesByVPCResult == false)
            return false;
        ListHostedZonesByVPCResult other = (ListHostedZonesByVPCResult) obj;

        if (other.getHostedZoneSummaries() == null ^ this.getHostedZoneSummaries() == null)
            return false;
        if (other.getHostedZoneSummaries() != null
                && other.getHostedZoneSummaries().equals(this.getHostedZoneSummaries()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
