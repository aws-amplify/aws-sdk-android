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
 * In the response to a <code>ListHostedZonesByVPC</code> request, the
 * <code>HostedZoneSummaries</code> element contains one
 * <code>HostedZoneSummary</code> element for each hosted zone that the
 * specified Amazon VPC is associated with. Each <code>HostedZoneSummary</code>
 * element contains the hosted zone name and ID, and information about who owns
 * the hosted zone.
 * </p>
 */
public class HostedZoneSummary implements Serializable {
    /**
     * <p>
     * The Route 53 hosted zone ID of a private hosted zone that the specified
     * VPC is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * The name of the private hosted zone, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String name;

    /**
     * <p>
     * The owner of a private hosted zone that the specified VPC is associated
     * with. The owner can be either an AWS account or an AWS service.
     * </p>
     */
    private HostedZoneOwner owner;

    /**
     * <p>
     * The Route 53 hosted zone ID of a private hosted zone that the specified
     * VPC is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @return <p>
     *         The Route 53 hosted zone ID of a private hosted zone that the
     *         specified VPC is associated with.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * The Route 53 hosted zone ID of a private hosted zone that the specified
     * VPC is associated with.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The Route 53 hosted zone ID of a private hosted zone that the
     *            specified VPC is associated with.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The Route 53 hosted zone ID of a private hosted zone that the specified
     * VPC is associated with.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 32<br/>
     *
     * @param hostedZoneId <p>
     *            The Route 53 hosted zone ID of a private hosted zone that the
     *            specified VPC is associated with.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneSummary withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * <p>
     * The name of the private hosted zone, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         The name of the private hosted zone, such as
     *         <code>example.com</code>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the private hosted zone, such as <code>example.com</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the private hosted zone, such as
     *            <code>example.com</code>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the private hosted zone, such as <code>example.com</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param name <p>
     *            The name of the private hosted zone, such as
     *            <code>example.com</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The owner of a private hosted zone that the specified VPC is associated
     * with. The owner can be either an AWS account or an AWS service.
     * </p>
     *
     * @return <p>
     *         The owner of a private hosted zone that the specified VPC is
     *         associated with. The owner can be either an AWS account or an AWS
     *         service.
     *         </p>
     */
    public HostedZoneOwner getOwner() {
        return owner;
    }

    /**
     * <p>
     * The owner of a private hosted zone that the specified VPC is associated
     * with. The owner can be either an AWS account or an AWS service.
     * </p>
     *
     * @param owner <p>
     *            The owner of a private hosted zone that the specified VPC is
     *            associated with. The owner can be either an AWS account or an
     *            AWS service.
     *            </p>
     */
    public void setOwner(HostedZoneOwner owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The owner of a private hosted zone that the specified VPC is associated
     * with. The owner can be either an AWS account or an AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param owner <p>
     *            The owner of a private hosted zone that the specified VPC is
     *            associated with. The owner can be either an AWS account or an
     *            AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public HostedZoneSummary withOwner(HostedZoneOwner owner) {
        this.owner = owner;
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
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getOwner() != null)
            sb.append("Owner: " + getOwner());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HostedZoneSummary == false)
            return false;
        HostedZoneSummary other = (HostedZoneSummary) obj;

        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        return true;
    }
}
