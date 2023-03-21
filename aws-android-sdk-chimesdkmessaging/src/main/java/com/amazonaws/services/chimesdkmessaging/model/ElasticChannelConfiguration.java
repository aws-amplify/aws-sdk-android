/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.chimesdkmessaging.model;

import java.io.Serializable;

/**
 * <p>
 * The attributes required to configure and create an elastic channel. An
 * elastic channel can support a maximum of 1-million members.
 * </p>
 */
public class ElasticChannelConfiguration implements Serializable {
    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     */
    private Integer maximumSubChannels;

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     */
    private Integer targetMembershipsPerSubChannel;

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users.
     * Ceil of the calculated value is used in balancing members among
     * SubChannels of the elastic channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 40<br/>
     */
    private Integer minimumMembershipPercentage;

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @return <p>
     *         The maximum number of SubChannels that you want to allow in the
     *         elastic channel.
     *         </p>
     */
    public Integer getMaximumSubChannels() {
        return maximumSubChannels;
    }

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic
     * channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @param maximumSubChannels <p>
     *            The maximum number of SubChannels that you want to allow in
     *            the elastic channel.
     *            </p>
     */
    public void setMaximumSubChannels(Integer maximumSubChannels) {
        this.maximumSubChannels = maximumSubChannels;
    }

    /**
     * <p>
     * The maximum number of SubChannels that you want to allow in the elastic
     * channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @param maximumSubChannels <p>
     *            The maximum number of SubChannels that you want to allow in
     *            the elastic channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticChannelConfiguration withMaximumSubChannels(Integer maximumSubChannels) {
        this.maximumSubChannels = maximumSubChannels;
        return this;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @return <p>
     *         The maximum number of members allowed in a SubChannel.
     *         </p>
     */
    public Integer getTargetMembershipsPerSubChannel() {
        return targetMembershipsPerSubChannel;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @param targetMembershipsPerSubChannel <p>
     *            The maximum number of members allowed in a SubChannel.
     *            </p>
     */
    public void setTargetMembershipsPerSubChannel(Integer targetMembershipsPerSubChannel) {
        this.targetMembershipsPerSubChannel = targetMembershipsPerSubChannel;
    }

    /**
     * <p>
     * The maximum number of members allowed in a SubChannel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>2 - <br/>
     *
     * @param targetMembershipsPerSubChannel <p>
     *            The maximum number of members allowed in a SubChannel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticChannelConfiguration withTargetMembershipsPerSubChannel(
            Integer targetMembershipsPerSubChannel) {
        this.targetMembershipsPerSubChannel = targetMembershipsPerSubChannel;
        return this;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users.
     * Ceil of the calculated value is used in balancing members among
     * SubChannels of the elastic channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 40<br/>
     *
     * @return <p>
     *         The minimum allowed percentage of TargetMembershipsPerSubChannel
     *         users. Ceil of the calculated value is used in balancing members
     *         among SubChannels of the elastic channel.
     *         </p>
     */
    public Integer getMinimumMembershipPercentage() {
        return minimumMembershipPercentage;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users.
     * Ceil of the calculated value is used in balancing members among
     * SubChannels of the elastic channel.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 40<br/>
     *
     * @param minimumMembershipPercentage <p>
     *            The minimum allowed percentage of
     *            TargetMembershipsPerSubChannel users. Ceil of the calculated
     *            value is used in balancing members among SubChannels of the
     *            elastic channel.
     *            </p>
     */
    public void setMinimumMembershipPercentage(Integer minimumMembershipPercentage) {
        this.minimumMembershipPercentage = minimumMembershipPercentage;
    }

    /**
     * <p>
     * The minimum allowed percentage of TargetMembershipsPerSubChannel users.
     * Ceil of the calculated value is used in balancing members among
     * SubChannels of the elastic channel.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 40<br/>
     *
     * @param minimumMembershipPercentage <p>
     *            The minimum allowed percentage of
     *            TargetMembershipsPerSubChannel users. Ceil of the calculated
     *            value is used in balancing members among SubChannels of the
     *            elastic channel.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ElasticChannelConfiguration withMinimumMembershipPercentage(
            Integer minimumMembershipPercentage) {
        this.minimumMembershipPercentage = minimumMembershipPercentage;
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
        if (getMaximumSubChannels() != null)
            sb.append("MaximumSubChannels: " + getMaximumSubChannels() + ",");
        if (getTargetMembershipsPerSubChannel() != null)
            sb.append("TargetMembershipsPerSubChannel: " + getTargetMembershipsPerSubChannel()
                    + ",");
        if (getMinimumMembershipPercentage() != null)
            sb.append("MinimumMembershipPercentage: " + getMinimumMembershipPercentage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getMaximumSubChannels() == null) ? 0 : getMaximumSubChannels().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetMembershipsPerSubChannel() == null) ? 0
                        : getTargetMembershipsPerSubChannel().hashCode());
        hashCode = prime
                * hashCode
                + ((getMinimumMembershipPercentage() == null) ? 0
                        : getMinimumMembershipPercentage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ElasticChannelConfiguration == false)
            return false;
        ElasticChannelConfiguration other = (ElasticChannelConfiguration) obj;

        if (other.getMaximumSubChannels() == null ^ this.getMaximumSubChannels() == null)
            return false;
        if (other.getMaximumSubChannels() != null
                && other.getMaximumSubChannels().equals(this.getMaximumSubChannels()) == false)
            return false;
        if (other.getTargetMembershipsPerSubChannel() == null
                ^ this.getTargetMembershipsPerSubChannel() == null)
            return false;
        if (other.getTargetMembershipsPerSubChannel() != null
                && other.getTargetMembershipsPerSubChannel().equals(
                        this.getTargetMembershipsPerSubChannel()) == false)
            return false;
        if (other.getMinimumMembershipPercentage() == null
                ^ this.getMinimumMembershipPercentage() == null)
            return false;
        if (other.getMinimumMembershipPercentage() != null
                && other.getMinimumMembershipPercentage().equals(
                        this.getMinimumMembershipPercentage()) == false)
            return false;
        return true;
    }
}
