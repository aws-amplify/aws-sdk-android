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
 * Describes the data feed for a Spot Instance.
 * </p>
 */
public class SpotDatafeedSubscription implements Serializable {
    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     */
    private String bucket;

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     */
    private SpotInstanceStateFault fault;

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     */
    private String prefix;

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     */
    private String state;

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     *
     * @return <p>
     *         The Amazon S3 bucket where the Spot Instance data feed is
     *         located.
     *         </p>
     */
    public String getBucket() {
        return bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     *
     * @param bucket <p>
     *            The Amazon S3 bucket where the Spot Instance data feed is
     *            located.
     *            </p>
     */
    public void setBucket(String bucket) {
        this.bucket = bucket;
    }

    /**
     * <p>
     * The Amazon S3 bucket where the Spot Instance data feed is located.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param bucket <p>
     *            The Amazon S3 bucket where the Spot Instance data feed is
     *            located.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotDatafeedSubscription withBucket(String bucket) {
        this.bucket = bucket;
        return this;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     *
     * @return <p>
     *         The fault codes for the Spot Instance request, if any.
     *         </p>
     */
    public SpotInstanceStateFault getFault() {
        return fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     *
     * @param fault <p>
     *            The fault codes for the Spot Instance request, if any.
     *            </p>
     */
    public void setFault(SpotInstanceStateFault fault) {
        this.fault = fault;
    }

    /**
     * <p>
     * The fault codes for the Spot Instance request, if any.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param fault <p>
     *            The fault codes for the Spot Instance request, if any.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotDatafeedSubscription withFault(SpotInstanceStateFault fault) {
        this.fault = fault;
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     *
     * @return <p>
     *         The AWS account ID of the account.
     *         </p>
     */
    public String getOwnerId() {
        return ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     *
     * @param ownerId <p>
     *            The AWS account ID of the account.
     *            </p>
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ownerId <p>
     *            The AWS account ID of the account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotDatafeedSubscription withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     *
     * @return <p>
     *         The prefix that is prepended to data feed files.
     *         </p>
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     *
     * @param prefix <p>
     *            The prefix that is prepended to data feed files.
     *            </p>
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * <p>
     * The prefix that is prepended to data feed files.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefix <p>
     *            The prefix that is prepended to data feed files.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SpotDatafeedSubscription withPrefix(String prefix) {
        this.prefix = prefix;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @return <p>
     *         The state of the Spot Instance data feed subscription.
     *         </p>
     * @see DatafeedSubscriptionState
     */
    public String getState() {
        return state;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state <p>
     *            The state of the Spot Instance data feed subscription.
     *            </p>
     * @see DatafeedSubscriptionState
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state <p>
     *            The state of the Spot Instance data feed subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatafeedSubscriptionState
     */
    public SpotDatafeedSubscription withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state <p>
     *            The state of the Spot Instance data feed subscription.
     *            </p>
     * @see DatafeedSubscriptionState
     */
    public void setState(DatafeedSubscriptionState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The state of the Spot Instance data feed subscription.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Active, Inactive
     *
     * @param state <p>
     *            The state of the Spot Instance data feed subscription.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see DatafeedSubscriptionState
     */
    public SpotDatafeedSubscription withState(DatafeedSubscriptionState state) {
        this.state = state.toString();
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
        if (getBucket() != null)
            sb.append("Bucket: " + getBucket() + ",");
        if (getFault() != null)
            sb.append("Fault: " + getFault() + ",");
        if (getOwnerId() != null)
            sb.append("OwnerId: " + getOwnerId() + ",");
        if (getPrefix() != null)
            sb.append("Prefix: " + getPrefix() + ",");
        if (getState() != null)
            sb.append("State: " + getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBucket() == null) ? 0 : getBucket().hashCode());
        hashCode = prime * hashCode + ((getFault() == null) ? 0 : getFault().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPrefix() == null) ? 0 : getPrefix().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpotDatafeedSubscription == false)
            return false;
        SpotDatafeedSubscription other = (SpotDatafeedSubscription) obj;

        if (other.getBucket() == null ^ this.getBucket() == null)
            return false;
        if (other.getBucket() != null && other.getBucket().equals(this.getBucket()) == false)
            return false;
        if (other.getFault() == null ^ this.getFault() == null)
            return false;
        if (other.getFault() != null && other.getFault().equals(this.getFault()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPrefix() == null ^ this.getPrefix() == null)
            return false;
        if (other.getPrefix() != null && other.getPrefix().equals(this.getPrefix()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }
}
