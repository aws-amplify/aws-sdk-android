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

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 */
public class ListTrafficPolicyInstancesByHostedZoneResult implements Serializable {
    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for
     * each traffic policy instance that matches the elements in the request.
     * </p>
     */
    private java.util.List<TrafficPolicyInstance> trafficPolicyInstances;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String trafficPolicyInstanceNameMarker;

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     */
    private String trafficPolicyInstanceTypeMarker;

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to
     * be listed. If the response was truncated, you can get the next group of
     * traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and
     * specifying the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request
     * parameters.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicyInstancesByHostedZone</code> request that
     * produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for
     * each traffic policy instance that matches the elements in the request.
     * </p>
     *
     * @return <p>
     *         A list that contains one <code>TrafficPolicyInstance</code>
     *         element for each traffic policy instance that matches the
     *         elements in the request.
     *         </p>
     */
    public java.util.List<TrafficPolicyInstance> getTrafficPolicyInstances() {
        return trafficPolicyInstances;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for
     * each traffic policy instance that matches the elements in the request.
     * </p>
     *
     * @param trafficPolicyInstances <p>
     *            A list that contains one <code>TrafficPolicyInstance</code>
     *            element for each traffic policy instance that matches the
     *            elements in the request.
     *            </p>
     */
    public void setTrafficPolicyInstances(
            java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        if (trafficPolicyInstances == null) {
            this.trafficPolicyInstances = null;
            return;
        }

        this.trafficPolicyInstances = new java.util.ArrayList<TrafficPolicyInstance>(
                trafficPolicyInstances);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for
     * each traffic policy instance that matches the elements in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicyInstances <p>
     *            A list that contains one <code>TrafficPolicyInstance</code>
     *            element for each traffic policy instance that matches the
     *            elements in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstances(
            TrafficPolicyInstance... trafficPolicyInstances) {
        if (getTrafficPolicyInstances() == null) {
            this.trafficPolicyInstances = new java.util.ArrayList<TrafficPolicyInstance>(
                    trafficPolicyInstances.length);
        }
        for (TrafficPolicyInstance value : trafficPolicyInstances) {
            this.trafficPolicyInstances.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for
     * each traffic policy instance that matches the elements in the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param trafficPolicyInstances <p>
     *            A list that contains one <code>TrafficPolicyInstance</code>
     *            element for each traffic policy instance that matches the
     *            elements in the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstances(
            java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        setTrafficPolicyInstances(trafficPolicyInstances);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     *         first traffic policy instance in the next group of traffic policy
     *         instances.
     *         </p>
     */
    public String getTrafficPolicyInstanceNameMarker() {
        return trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code> is the name of
     *            the first traffic policy instance in the next group of traffic
     *            policy instances.
     *            </p>
     */
    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code> is the name of
     *            the first traffic policy instance in the next group of traffic
     *            policy instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceNameMarker(
            String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @return <p>
     *         If <code>IsTruncated</code> is true,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of
     *         the resource record sets that are associated with the first
     *         traffic policy instance in the next group of traffic policy
     *         instances.
     *         </p>
     * @see RRType
     */
    public String getTrafficPolicyInstanceTypeMarker() {
        return trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If <code>IsTruncated</code> is true,
     *            <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type
     *            of the resource record sets that are associated with the first
     *            traffic policy instance in the next group of traffic policy
     *            instances.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If <code>IsTruncated</code> is true,
     *            <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type
     *            of the resource record sets that are associated with the first
     *            traffic policy instance in the next group of traffic policy
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceTypeMarker(
            String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If <code>IsTruncated</code> is true,
     *            <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type
     *            of the resource record sets that are associated with the first
     *            traffic policy instance in the next group of traffic policy
     *            instances.
     *            </p>
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * resource record sets that are associated with the first traffic policy
     * instance in the next group of traffic policy instances.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, NAPTR, PTR, SRV, SPF,
     * AAAA, CAA
     *
     * @param trafficPolicyInstanceTypeMarker <p>
     *            If <code>IsTruncated</code> is true,
     *            <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type
     *            of the resource record sets that are associated with the first
     *            traffic policy instance in the next group of traffic policy
     *            instances.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceTypeMarker(
            RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to
     * be listed. If the response was truncated, you can get the next group of
     * traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and
     * specifying the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request
     * parameters.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policy
     *         instances to be listed. If the response was truncated, you can
     *         get the next group of traffic policy instances by submitting
     *         another <code>ListTrafficPolicyInstancesByHostedZone</code>
     *         request and specifying the values of
     *         <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding
     *         request parameters.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to
     * be listed. If the response was truncated, you can get the next group of
     * traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and
     * specifying the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request
     * parameters.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more traffic policy
     *         instances to be listed. If the response was truncated, you can
     *         get the next group of traffic policy instances by submitting
     *         another <code>ListTrafficPolicyInstancesByHostedZone</code>
     *         request and specifying the values of
     *         <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding
     *         request parameters.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to
     * be listed. If the response was truncated, you can get the next group of
     * traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and
     * specifying the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request
     * parameters.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policy
     *            instances to be listed. If the response was truncated, you can
     *            get the next group of traffic policy instances by submitting
     *            another <code>ListTrafficPolicyInstancesByHostedZone</code>
     *            request and specifying the values of
     *            <code>HostedZoneIdMarker</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code>, and
     *            <code>TrafficPolicyInstanceTypeMarker</code> in the
     *            corresponding request parameters.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to
     * be listed. If the response was truncated, you can get the next group of
     * traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and
     * specifying the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request
     * parameters.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more traffic policy
     *            instances to be listed. If the response was truncated, you can
     *            get the next group of traffic policy instances by submitting
     *            another <code>ListTrafficPolicyInstancesByHostedZone</code>
     *            request and specifying the values of
     *            <code>HostedZoneIdMarker</code>,
     *            <code>TrafficPolicyInstanceNameMarker</code>, and
     *            <code>TrafficPolicyInstanceTypeMarker</code> in the
     *            corresponding request parameters.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicyInstancesByHostedZone</code> request that
     * produced the current response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>MaxItems</code>
     *         parameter in the
     *         <code>ListTrafficPolicyInstancesByHostedZone</code> request that
     *         produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicyInstancesByHostedZone</code> request that
     * produced the current response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>MaxItems</code>
     *            parameter in the
     *            <code>ListTrafficPolicyInstancesByHostedZone</code> request
     *            that produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in
     * the <code>ListTrafficPolicyInstancesByHostedZone</code> request that
     * produced the current response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>MaxItems</code>
     *            parameter in the
     *            <code>ListTrafficPolicyInstancesByHostedZone</code> request
     *            that produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListTrafficPolicyInstancesByHostedZoneResult withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getTrafficPolicyInstances() != null)
            sb.append("TrafficPolicyInstances: " + getTrafficPolicyInstances() + ",");
        if (getTrafficPolicyInstanceNameMarker() != null)
            sb.append("TrafficPolicyInstanceNameMarker: " + getTrafficPolicyInstanceNameMarker()
                    + ",");
        if (getTrafficPolicyInstanceTypeMarker() != null)
            sb.append("TrafficPolicyInstanceTypeMarker: " + getTrafficPolicyInstanceTypeMarker()
                    + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstances() == null) ? 0 : getTrafficPolicyInstances()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceNameMarker() == null) ? 0
                        : getTrafficPolicyInstanceNameMarker().hashCode());
        hashCode = prime
                * hashCode
                + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0
                        : getTrafficPolicyInstanceTypeMarker().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPolicyInstancesByHostedZoneResult == false)
            return false;
        ListTrafficPolicyInstancesByHostedZoneResult other = (ListTrafficPolicyInstancesByHostedZoneResult) obj;

        if (other.getTrafficPolicyInstances() == null ^ this.getTrafficPolicyInstances() == null)
            return false;
        if (other.getTrafficPolicyInstances() != null
                && other.getTrafficPolicyInstances().equals(this.getTrafficPolicyInstances()) == false)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() == null
                ^ this.getTrafficPolicyInstanceNameMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null
                && other.getTrafficPolicyInstanceNameMarker().equals(
                        this.getTrafficPolicyInstanceNameMarker()) == false)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() == null
                ^ this.getTrafficPolicyInstanceTypeMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null
                && other.getTrafficPolicyInstanceTypeMarker().equals(
                        this.getTrafficPolicyInstanceTypeMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
