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

package com.amazonaws.services.awssecurityhub.model;

import java.io.Serializable;

/**
 * <p>
 * Details about the network interface
 * </p>
 */
public class AwsEc2NetworkInterfaceDetails implements Serializable {
    /**
     * <p>
     * The network interface attachment.
     * </p>
     */
    private AwsEc2NetworkInterfaceAttachment attachment;

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String networkInterfaceId;

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     */
    private java.util.List<AwsEc2NetworkInterfaceSecurityGroup> securityGroups;

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     */
    private Boolean sourceDestCheck;

    /**
     * <p>
     * The network interface attachment.
     * </p>
     *
     * @return <p>
     *         The network interface attachment.
     *         </p>
     */
    public AwsEc2NetworkInterfaceAttachment getAttachment() {
        return attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     *
     * @param attachment <p>
     *            The network interface attachment.
     *            </p>
     */
    public void setAttachment(AwsEc2NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The network interface attachment.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attachment <p>
     *            The network interface attachment.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceDetails withAttachment(AwsEc2NetworkInterfaceAttachment attachment) {
        this.attachment = attachment;
        return this;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the network interface.
     *         </p>
     */
    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     */
    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    /**
     * <p>
     * The ID of the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param networkInterfaceId <p>
     *            The ID of the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceDetails withNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
        return this;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     *
     * @return <p>
     *         Security groups for the network interface.
     *         </p>
     */
    public java.util.List<AwsEc2NetworkInterfaceSecurityGroup> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     *
     * @param securityGroups <p>
     *            Security groups for the network interface.
     *            </p>
     */
    public void setSecurityGroups(
            java.util.Collection<AwsEc2NetworkInterfaceSecurityGroup> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<AwsEc2NetworkInterfaceSecurityGroup>(
                securityGroups);
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            Security groups for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceDetails withSecurityGroups(
            AwsEc2NetworkInterfaceSecurityGroup... securityGroups) {
        if (getSecurityGroups() == null) {
            this.securityGroups = new java.util.ArrayList<AwsEc2NetworkInterfaceSecurityGroup>(
                    securityGroups.length);
        }
        for (AwsEc2NetworkInterfaceSecurityGroup value : securityGroups) {
            this.securityGroups.add(value);
        }
        return this;
    }

    /**
     * <p>
     * Security groups for the network interface.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param securityGroups <p>
     *            Security groups for the network interface.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceDetails withSecurityGroups(
            java.util.Collection<AwsEc2NetworkInterfaceSecurityGroup> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @return <p>
     *         Indicates whether traffic to or from the instance is validated.
     *         </p>
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @return <p>
     *         Indicates whether traffic to or from the instance is validated.
     *         </p>
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     *
     * @param sourceDestCheck <p>
     *            Indicates whether traffic to or from the instance is
     *            validated.
     *            </p>
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }

    /**
     * <p>
     * Indicates whether traffic to or from the instance is validated.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourceDestCheck <p>
     *            Indicates whether traffic to or from the instance is
     *            validated.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsEc2NetworkInterfaceDetails withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
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
        if (getAttachment() != null)
            sb.append("Attachment: " + getAttachment() + ",");
        if (getNetworkInterfaceId() != null)
            sb.append("NetworkInterfaceId: " + getNetworkInterfaceId() + ",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: " + getSecurityGroups() + ",");
        if (getSourceDestCheck() != null)
            sb.append("SourceDestCheck: " + getSourceDestCheck());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode
                + ((getNetworkInterfaceId() == null) ? 0 : getNetworkInterfaceId().hashCode());
        hashCode = prime * hashCode
                + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDestCheck() == null) ? 0 : getSourceDestCheck().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkInterfaceDetails == false)
            return false;
        AwsEc2NetworkInterfaceDetails other = (AwsEc2NetworkInterfaceDetails) obj;

        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null
                && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getNetworkInterfaceId() == null ^ this.getNetworkInterfaceId() == null)
            return false;
        if (other.getNetworkInterfaceId() != null
                && other.getNetworkInterfaceId().equals(this.getNetworkInterfaceId()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null
                && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getSourceDestCheck() == null ^ this.getSourceDestCheck() == null)
            return false;
        if (other.getSourceDestCheck() != null
                && other.getSourceDestCheck().equals(this.getSourceDestCheck()) == false)
            return false;
        return true;
    }
}
