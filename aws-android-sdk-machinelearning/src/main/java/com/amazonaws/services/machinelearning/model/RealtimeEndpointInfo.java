/*
 * Copyright 2010-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the real-time endpoint information for an <code>MLModel</code>.
 * </p>
 */
public class RealtimeEndpointInfo implements Serializable {
    /**
     * <p>
     * The maximum processing rate for the real-time endpoint for
     * <code>MLModel</code>, measured in incoming requests per second.
     * </p>
     */
    private Integer peakRequestsPerSecond;

    /**
     * <p>
     * The time that the request to create the real-time endpoint for the
     * <code>MLModel</code> was received. The time is expressed in epoch time.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The URI that specifies where to send real-time prediction requests for
     * the <code>MLModel</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * The application must wait until the real-time endpoint is ready before
     * using this URI.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     */
    private String endpointUrl;

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     */
    private String endpointStatus;

    /**
     * <p>
     * The maximum processing rate for the real-time endpoint for
     * <code>MLModel</code>, measured in incoming requests per second.
     * </p>
     *
     * @return <p>
     *         The maximum processing rate for the real-time endpoint for
     *         <code>MLModel</code>, measured in incoming requests per second.
     *         </p>
     */
    public Integer getPeakRequestsPerSecond() {
        return peakRequestsPerSecond;
    }

    /**
     * <p>
     * The maximum processing rate for the real-time endpoint for
     * <code>MLModel</code>, measured in incoming requests per second.
     * </p>
     *
     * @param peakRequestsPerSecond <p>
     *            The maximum processing rate for the real-time endpoint for
     *            <code>MLModel</code>, measured in incoming requests per
     *            second.
     *            </p>
     */
    public void setPeakRequestsPerSecond(Integer peakRequestsPerSecond) {
        this.peakRequestsPerSecond = peakRequestsPerSecond;
    }

    /**
     * <p>
     * The maximum processing rate for the real-time endpoint for
     * <code>MLModel</code>, measured in incoming requests per second.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param peakRequestsPerSecond <p>
     *            The maximum processing rate for the real-time endpoint for
     *            <code>MLModel</code>, measured in incoming requests per
     *            second.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeEndpointInfo withPeakRequestsPerSecond(Integer peakRequestsPerSecond) {
        this.peakRequestsPerSecond = peakRequestsPerSecond;
        return this;
    }

    /**
     * <p>
     * The time that the request to create the real-time endpoint for the
     * <code>MLModel</code> was received. The time is expressed in epoch time.
     * </p>
     *
     * @return <p>
     *         The time that the request to create the real-time endpoint for
     *         the <code>MLModel</code> was received. The time is expressed in
     *         epoch time.
     *         </p>
     */
    public java.util.Date getCreatedAt() {
        return createdAt;
    }

    /**
     * <p>
     * The time that the request to create the real-time endpoint for the
     * <code>MLModel</code> was received. The time is expressed in epoch time.
     * </p>
     *
     * @param createdAt <p>
     *            The time that the request to create the real-time endpoint for
     *            the <code>MLModel</code> was received. The time is expressed
     *            in epoch time.
     *            </p>
     */
    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time that the request to create the real-time endpoint for the
     * <code>MLModel</code> was received. The time is expressed in epoch time.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createdAt <p>
     *            The time that the request to create the real-time endpoint for
     *            the <code>MLModel</code> was received. The time is expressed
     *            in epoch time.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeEndpointInfo withCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * <p>
     * The URI that specifies where to send real-time prediction requests for
     * the <code>MLModel</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * The application must wait until the real-time endpoint is ready before
     * using this URI.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @return <p>
     *         The URI that specifies where to send real-time prediction
     *         requests for the <code>MLModel</code>.
     *         </p>
     *         <note><title>Note</title>
     *         <p>
     *         The application must wait until the real-time endpoint is ready
     *         before using this URI.
     *         </p>
     *         </note>
     */
    public String getEndpointUrl() {
        return endpointUrl;
    }

    /**
     * <p>
     * The URI that specifies where to send real-time prediction requests for
     * the <code>MLModel</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * The application must wait until the real-time endpoint is ready before
     * using this URI.
     * </p>
     * </note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @param endpointUrl <p>
     *            The URI that specifies where to send real-time prediction
     *            requests for the <code>MLModel</code>.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            The application must wait until the real-time endpoint is
     *            ready before using this URI.
     *            </p>
     *            </note>
     */
    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * The URI that specifies where to send real-time prediction requests for
     * the <code>MLModel</code>.
     * </p>
     * <note><title>Note</title>
     * <p>
     * The application must wait until the real-time endpoint is ready before
     * using this URI.
     * </p>
     * </note>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 2048<br/>
     * <b>Pattern: </b>https://[a-zA-Z0-9-.]*\.amazon(aws)?\.com[/]?<br/>
     *
     * @param endpointUrl <p>
     *            The URI that specifies where to send real-time prediction
     *            requests for the <code>MLModel</code>.
     *            </p>
     *            <note><title>Note</title>
     *            <p>
     *            The application must wait until the real-time endpoint is
     *            ready before using this URI.
     *            </p>
     *            </note>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public RealtimeEndpointInfo withEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
        return this;
    }

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     *
     * @return <p>
     *         The current status of the real-time endpoint for the
     *         <code>MLModel</code>. This element can have one of the following
     *         values:
     *         </p>
     *         <ul>
     *         <li> <code>NONE</code> - Endpoint does not exist or was previously
     *         deleted.</li>
     *         <li> <code>READY</code> - Endpoint is ready to be used for
     *         real-time predictions.</li>
     *         <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     *         </ul>
     * @see RealtimeEndpointStatus
     */
    public String getEndpointStatus() {
        return endpointStatus;
    }

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     *
     * @param endpointStatus <p>
     *            The current status of the real-time endpoint for the
     *            <code>MLModel</code>. This element can have one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li> <code>NONE</code> - Endpoint does not exist or was
     *            previously deleted.</li>
     *            <li> <code>READY</code> - Endpoint is ready to be used for
     *            real-time predictions.</li>
     *            <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     *            </ul>
     * @see RealtimeEndpointStatus
     */
    public void setEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
    }

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     *
     * @param endpointStatus <p>
     *            The current status of the real-time endpoint for the
     *            <code>MLModel</code>. This element can have one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li> <code>NONE</code> - Endpoint does not exist or was
     *            previously deleted.</li>
     *            <li> <code>READY</code> - Endpoint is ready to be used for
     *            real-time predictions.</li>
     *            <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealtimeEndpointStatus
     */
    public RealtimeEndpointInfo withEndpointStatus(String endpointStatus) {
        this.endpointStatus = endpointStatus;
        return this;
    }

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     *
     * @param endpointStatus <p>
     *            The current status of the real-time endpoint for the
     *            <code>MLModel</code>. This element can have one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li> <code>NONE</code> - Endpoint does not exist or was
     *            previously deleted.</li>
     *            <li> <code>READY</code> - Endpoint is ready to be used for
     *            real-time predictions.</li>
     *            <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     *            </ul>
     * @see RealtimeEndpointStatus
     */
    public void setEndpointStatus(RealtimeEndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
    }

    /**
     * <p>
     * The current status of the real-time endpoint for the <code>MLModel</code>
     * . This element can have one of the following values:
     * </p>
     * <ul>
     * <li> <code>NONE</code> - Endpoint does not exist or was previously
     * deleted.</li>
     * <li> <code>READY</code> - Endpoint is ready to be used for real-time
     * predictions.</li>
     * <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>NONE, READY, UPDATING, FAILED
     *
     * @param endpointStatus <p>
     *            The current status of the real-time endpoint for the
     *            <code>MLModel</code>. This element can have one of the
     *            following values:
     *            </p>
     *            <ul>
     *            <li> <code>NONE</code> - Endpoint does not exist or was
     *            previously deleted.</li>
     *            <li> <code>READY</code> - Endpoint is ready to be used for
     *            real-time predictions.</li>
     *            <li> <code>UPDATING</code> - Updating/creating the endpoint.</li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see RealtimeEndpointStatus
     */
    public RealtimeEndpointInfo withEndpointStatus(RealtimeEndpointStatus endpointStatus) {
        this.endpointStatus = endpointStatus.toString();
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
        if (getPeakRequestsPerSecond() != null)
            sb.append("PeakRequestsPerSecond: " + getPeakRequestsPerSecond() + ",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: " + getCreatedAt() + ",");
        if (getEndpointUrl() != null)
            sb.append("EndpointUrl: " + getEndpointUrl() + ",");
        if (getEndpointStatus() != null)
            sb.append("EndpointStatus: " + getEndpointStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getPeakRequestsPerSecond() == null) ? 0 : getPeakRequestsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode
                + ((getEndpointStatus() == null) ? 0 : getEndpointStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RealtimeEndpointInfo == false)
            return false;
        RealtimeEndpointInfo other = (RealtimeEndpointInfo) obj;

        if (other.getPeakRequestsPerSecond() == null ^ this.getPeakRequestsPerSecond() == null)
            return false;
        if (other.getPeakRequestsPerSecond() != null
                && other.getPeakRequestsPerSecond().equals(this.getPeakRequestsPerSecond()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null
                && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getEndpointUrl() == null ^ this.getEndpointUrl() == null)
            return false;
        if (other.getEndpointUrl() != null
                && other.getEndpointUrl().equals(this.getEndpointUrl()) == false)
            return false;
        if (other.getEndpointStatus() == null ^ this.getEndpointStatus() == null)
            return false;
        if (other.getEndpointStatus() != null
                && other.getEndpointStatus().equals(this.getEndpointStatus()) == false)
            return false;
        return true;
    }
}
