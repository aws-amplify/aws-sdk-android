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

/**
 * <p>
 * Describes a Spot Fleet request.
 * </p>
 */
public class SpotFleetRequestConfig implements Serializable {
    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     */
    private String activityStatus;

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     */
    private java.util.Date createTime;

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     */
    private SpotFleetRequestConfigData spotFleetRequestConfig;

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     */
    private String spotFleetRequestId;

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     */
    private String spotFleetRequestState;

    /**
     * <p>
     * The tags for a Spot Fleet resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @return <p>
     *         The progress of the Spot Fleet request. If there is an error, the
     *         status is <code>error</code>. After all requests are placed, the
     *         status is <code>pending_fulfillment</code>. If the size of the
     *         fleet is equal to or greater than its target capacity, the status
     *         is <code>fulfilled</code>. If the size of the fleet is decreased,
     *         the status is <code>pending_termination</code> while Spot
     *         Instances are terminating.
     *         </p>
     * @see ActivityStatus
     */
    public String getActivityStatus() {
        return activityStatus;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the Spot Fleet request. If there is an error,
     *            the status is <code>error</code>. After all requests are
     *            placed, the status is <code>pending_fulfillment</code>. If the
     *            size of the fleet is equal to or greater than its target
     *            capacity, the status is <code>fulfilled</code>. If the size of
     *            the fleet is decreased, the status is
     *            <code>pending_termination</code> while Spot Instances are
     *            terminating.
     *            </p>
     * @see ActivityStatus
     */
    public void setActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the Spot Fleet request. If there is an error,
     *            the status is <code>error</code>. After all requests are
     *            placed, the status is <code>pending_fulfillment</code>. If the
     *            size of the fleet is equal to or greater than its target
     *            capacity, the status is <code>fulfilled</code>. If the size of
     *            the fleet is decreased, the status is
     *            <code>pending_termination</code> while Spot Instances are
     *            terminating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStatus
     */
    public SpotFleetRequestConfig withActivityStatus(String activityStatus) {
        this.activityStatus = activityStatus;
        return this;
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the Spot Fleet request. If there is an error,
     *            the status is <code>error</code>. After all requests are
     *            placed, the status is <code>pending_fulfillment</code>. If the
     *            size of the fleet is equal to or greater than its target
     *            capacity, the status is <code>fulfilled</code>. If the size of
     *            the fleet is decreased, the status is
     *            <code>pending_termination</code> while Spot Instances are
     *            terminating.
     *            </p>
     * @see ActivityStatus
     */
    public void setActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
    }

    /**
     * <p>
     * The progress of the Spot Fleet request. If there is an error, the status
     * is <code>error</code>. After all requests are placed, the status is
     * <code>pending_fulfillment</code>. If the size of the fleet is equal to or
     * greater than its target capacity, the status is <code>fulfilled</code>.
     * If the size of the fleet is decreased, the status is
     * <code>pending_termination</code> while Spot Instances are terminating.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>error, pending_fulfillment, pending_termination,
     * fulfilled
     *
     * @param activityStatus <p>
     *            The progress of the Spot Fleet request. If there is an error,
     *            the status is <code>error</code>. After all requests are
     *            placed, the status is <code>pending_fulfillment</code>. If the
     *            size of the fleet is equal to or greater than its target
     *            capacity, the status is <code>fulfilled</code>. If the size of
     *            the fleet is decreased, the status is
     *            <code>pending_termination</code> while Spot Instances are
     *            terminating.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see ActivityStatus
     */
    public SpotFleetRequestConfig withActivityStatus(ActivityStatus activityStatus) {
        this.activityStatus = activityStatus.toString();
        return this;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     *
     * @return <p>
     *         The creation date and time of the request.
     *         </p>
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     *
     * @param createTime <p>
     *            The creation date and time of the request.
     *            </p>
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The creation date and time of the request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param createTime <p>
     *            The creation date and time of the request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfig withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The configuration of the Spot Fleet request.
     *         </p>
     */
    public SpotFleetRequestConfigData getSpotFleetRequestConfig() {
        return spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestConfig <p>
     *            The configuration of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestConfig(SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
    }

    /**
     * <p>
     * The configuration of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestConfig <p>
     *            The configuration of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfig withSpotFleetRequestConfig(
            SpotFleetRequestConfigData spotFleetRequestConfig) {
        this.spotFleetRequestConfig = spotFleetRequestConfig;
        return this;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @return <p>
     *         The ID of the Spot Fleet request.
     *         </p>
     */
    public String getSpotFleetRequestId() {
        return spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     */
    public void setSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
    }

    /**
     * <p>
     * The ID of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param spotFleetRequestId <p>
     *            The ID of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfig withSpotFleetRequestId(String spotFleetRequestId) {
        this.spotFleetRequestId = spotFleetRequestId;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @return <p>
     *         The state of the Spot Fleet request.
     *         </p>
     * @see BatchState
     */
    public String getSpotFleetRequestState() {
        return spotFleetRequestState;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState <p>
     *            The state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setSpotFleetRequestState(String spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState <p>
     *            The state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public SpotFleetRequestConfig withSpotFleetRequestState(String spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState <p>
     *            The state of the Spot Fleet request.
     *            </p>
     * @see BatchState
     */
    public void setSpotFleetRequestState(BatchState spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState.toString();
    }

    /**
     * <p>
     * The state of the Spot Fleet request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>submitted, active, cancelled, failed,
     * cancelled_running, cancelled_terminating, modifying
     *
     * @param spotFleetRequestState <p>
     *            The state of the Spot Fleet request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see BatchState
     */
    public SpotFleetRequestConfig withSpotFleetRequestState(BatchState spotFleetRequestState) {
        this.spotFleetRequestState = spotFleetRequestState.toString();
        return this;
    }

    /**
     * <p>
     * The tags for a Spot Fleet resource.
     * </p>
     *
     * @return <p>
     *         The tags for a Spot Fleet resource.
     *         </p>
     */
    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags for a Spot Fleet resource.
     * </p>
     *
     * @param tags <p>
     *            The tags for a Spot Fleet resource.
     *            </p>
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags for a Spot Fleet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for a Spot Fleet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfig withTags(Tag... tags) {
        if (getTags() == null) {
            this.tags = new java.util.ArrayList<Tag>(tags.length);
        }
        for (Tag value : tags) {
            this.tags.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The tags for a Spot Fleet resource.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param tags <p>
     *            The tags for a Spot Fleet resource.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotFleetRequestConfig withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getActivityStatus() != null)
            sb.append("ActivityStatus: " + getActivityStatus() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getSpotFleetRequestConfig() != null)
            sb.append("SpotFleetRequestConfig: " + getSpotFleetRequestConfig() + ",");
        if (getSpotFleetRequestId() != null)
            sb.append("SpotFleetRequestId: " + getSpotFleetRequestId() + ",");
        if (getSpotFleetRequestState() != null)
            sb.append("SpotFleetRequestState: " + getSpotFleetRequestState() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getActivityStatus() == null) ? 0 : getActivityStatus().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotFleetRequestConfig() == null) ? 0 : getSpotFleetRequestConfig()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getSpotFleetRequestId() == null) ? 0 : getSpotFleetRequestId().hashCode());
        hashCode = prime
                * hashCode
                + ((getSpotFleetRequestState() == null) ? 0 : getSpotFleetRequestState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotFleetRequestConfig == false)
            return false;
        SpotFleetRequestConfig other = (SpotFleetRequestConfig) obj;

        if (other.getActivityStatus() == null ^ this.getActivityStatus() == null)
            return false;
        if (other.getActivityStatus() != null
                && other.getActivityStatus().equals(this.getActivityStatus()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null
                && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getSpotFleetRequestConfig() == null ^ this.getSpotFleetRequestConfig() == null)
            return false;
        if (other.getSpotFleetRequestConfig() != null
                && other.getSpotFleetRequestConfig().equals(this.getSpotFleetRequestConfig()) == false)
            return false;
        if (other.getSpotFleetRequestId() == null ^ this.getSpotFleetRequestId() == null)
            return false;
        if (other.getSpotFleetRequestId() != null
                && other.getSpotFleetRequestId().equals(this.getSpotFleetRequestId()) == false)
            return false;
        if (other.getSpotFleetRequestState() == null ^ this.getSpotFleetRequestState() == null)
            return false;
        if (other.getSpotFleetRequestState() != null
                && other.getSpotFleetRequestState().equals(this.getSpotFleetRequestState()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }
}
