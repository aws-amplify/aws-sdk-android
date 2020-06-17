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

/**
 * <p>
 * A complex type that contains the response to a <code>ListHealthChecks</code>
 * request.
 * </p>
 */
public class ListHealthChecksResult implements Serializable {
    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for
     * each health check that is associated with the current AWS account.
     * </p>
     */
    private java.util.List<HealthCheck> healthChecks;

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the previous request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String marker;

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed.
     * If the response was truncated, you can get the next group of health
     * checks by submitting another <code>ListHealthChecks</code> request and
     * specifying the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first health check that Amazon
     * Route 53 returns if you submit another <code>ListHealthChecks</code>
     * request and specify the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     */
    private String nextMarker;

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHealthChecks</code> that produced the current
     * response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for
     * each health check that is associated with the current AWS account.
     * </p>
     *
     * @return <p>
     *         A complex type that contains one <code>HealthCheck</code> element
     *         for each health check that is associated with the current AWS
     *         account.
     *         </p>
     */
    public java.util.List<HealthCheck> getHealthChecks() {
        return healthChecks;
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for
     * each health check that is associated with the current AWS account.
     * </p>
     *
     * @param healthChecks <p>
     *            A complex type that contains one <code>HealthCheck</code>
     *            element for each health check that is associated with the
     *            current AWS account.
     *            </p>
     */
    public void setHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        if (healthChecks == null) {
            this.healthChecks = null;
            return;
        }

        this.healthChecks = new java.util.ArrayList<HealthCheck>(healthChecks);
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for
     * each health check that is associated with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthChecks <p>
     *            A complex type that contains one <code>HealthCheck</code>
     *            element for each health check that is associated with the
     *            current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withHealthChecks(HealthCheck... healthChecks) {
        if (getHealthChecks() == null) {
            this.healthChecks = new java.util.ArrayList<HealthCheck>(healthChecks.length);
        }
        for (HealthCheck value : healthChecks) {
            this.healthChecks.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains one <code>HealthCheck</code> element for
     * each health check that is associated with the current AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param healthChecks <p>
     *            A complex type that contains one <code>HealthCheck</code>
     *            element for each health check that is associated with the
     *            current AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withHealthChecks(java.util.Collection<HealthCheck> healthChecks) {
        setHealthChecks(healthChecks);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the previous request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         For the second and subsequent calls to
     *         <code>ListHealthChecks</code>, <code>Marker</code> is the value
     *         that you specified for the <code>marker</code> parameter in the
     *         previous request.
     *         </p>
     */
    public String getMarker() {
        return marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the previous request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param marker <p>
     *            For the second and subsequent calls to
     *            <code>ListHealthChecks</code>, <code>Marker</code> is the
     *            value that you specified for the <code>marker</code> parameter
     *            in the previous request.
     *            </p>
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHealthChecks</code>,
     * <code>Marker</code> is the value that you specified for the
     * <code>marker</code> parameter in the previous request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param marker <p>
     *            For the second and subsequent calls to
     *            <code>ListHealthChecks</code>, <code>Marker</code> is the
     *            value that you specified for the <code>marker</code> parameter
     *            in the previous request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed.
     * If the response was truncated, you can get the next group of health
     * checks by submitting another <code>ListHealthChecks</code> request and
     * specifying the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more health checks to be
     *         listed. If the response was truncated, you can get the next group
     *         of health checks by submitting another
     *         <code>ListHealthChecks</code> request and specifying the value of
     *         <code>NextMarker</code> in the <code>marker</code> parameter.
     *         </p>
     */
    public Boolean isIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed.
     * If the response was truncated, you can get the next group of health
     * checks by submitting another <code>ListHealthChecks</code> request and
     * specifying the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     *
     * @return <p>
     *         A flag that indicates whether there are more health checks to be
     *         listed. If the response was truncated, you can get the next group
     *         of health checks by submitting another
     *         <code>ListHealthChecks</code> request and specifying the value of
     *         <code>NextMarker</code> in the <code>marker</code> parameter.
     *         </p>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed.
     * If the response was truncated, you can get the next group of health
     * checks by submitting another <code>ListHealthChecks</code> request and
     * specifying the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more health checks to
     *            be listed. If the response was truncated, you can get the next
     *            group of health checks by submitting another
     *            <code>ListHealthChecks</code> request and specifying the value
     *            of <code>NextMarker</code> in the <code>marker</code>
     *            parameter.
     *            </p>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more health checks to be listed.
     * If the response was truncated, you can get the next group of health
     * checks by submitting another <code>ListHealthChecks</code> request and
     * specifying the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param isTruncated <p>
     *            A flag that indicates whether there are more health checks to
     *            be listed. If the response was truncated, you can get the next
     *            group of health checks by submitting another
     *            <code>ListHealthChecks</code> request and specifying the value
     *            of <code>NextMarker</code> in the <code>marker</code>
     *            parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first health check that Amazon
     * Route 53 returns if you submit another <code>ListHealthChecks</code>
     * request and specify the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @return <p>
     *         If <code>IsTruncated</code> is <code>true</code>, the value of
     *         <code>NextMarker</code> identifies the first health check that
     *         Amazon Route 53 returns if you submit another
     *         <code>ListHealthChecks</code> request and specify the value of
     *         <code>NextMarker</code> in the <code>marker</code> parameter.
     *         </p>
     */
    public String getNextMarker() {
        return nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first health check that Amazon
     * Route 53 returns if you submit another <code>ListHealthChecks</code>
     * request and specify the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextMarker</code> identifies the first health check that
     *            Amazon Route 53 returns if you submit another
     *            <code>ListHealthChecks</code> request and specify the value of
     *            <code>NextMarker</code> in the <code>marker</code> parameter.
     *            </p>
     */
    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of
     * <code>NextMarker</code> identifies the first health check that Amazon
     * Route 53 returns if you submit another <code>ListHealthChecks</code>
     * request and specify the value of <code>NextMarker</code> in the
     * <code>marker</code> parameter.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 64<br/>
     *
     * @param nextMarker <p>
     *            If <code>IsTruncated</code> is <code>true</code>, the value of
     *            <code>NextMarker</code> identifies the first health check that
     *            Amazon Route 53 returns if you submit another
     *            <code>ListHealthChecks</code> request and specify the value of
     *            <code>NextMarker</code> in the <code>marker</code> parameter.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHealthChecks</code> that produced the current
     * response.
     * </p>
     *
     * @return <p>
     *         The value that you specified for the <code>maxitems</code>
     *         parameter in the call to <code>ListHealthChecks</code> that
     *         produced the current response.
     *         </p>
     */
    public String getMaxItems() {
        return maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHealthChecks</code> that produced the current
     * response.
     * </p>
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHealthChecks</code> that
     *            produced the current response.
     *            </p>
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in
     * the call to <code>ListHealthChecks</code> that produced the current
     * response.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param maxItems <p>
     *            The value that you specified for the <code>maxitems</code>
     *            parameter in the call to <code>ListHealthChecks</code> that
     *            produced the current response.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListHealthChecksResult withMaxItems(String maxItems) {
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
        if (getHealthChecks() != null)
            sb.append("HealthChecks: " + getHealthChecks() + ",");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextMarker() != null)
            sb.append("NextMarker: " + getNextMarker() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHealthChecks() == null) ? 0 : getHealthChecks().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHealthChecksResult == false)
            return false;
        ListHealthChecksResult other = (ListHealthChecksResult) obj;

        if (other.getHealthChecks() == null ^ this.getHealthChecks() == null)
            return false;
        if (other.getHealthChecks() != null
                && other.getHealthChecks().equals(this.getHealthChecks()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null
                && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }
}
