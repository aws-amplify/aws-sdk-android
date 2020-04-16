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
 * The details of network-related information about a finding.
 * </p>
 */
public class Network implements Serializable {
    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     */
    private String direction;

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String protocol;

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceIpV4;

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceIpV6;

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     */
    private Integer sourcePort;

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceDomain;

    /**
     * <p>
     * The source media access control (MAC) address of network-related
     * information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String sourceMac;

    /**
     * <p>
     * The destination IPv4 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String destinationIpV4;

    /**
     * <p>
     * The destination IPv6 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String destinationIpV6;

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     */
    private Integer destinationPort;

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String destinationDomain;

    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     *
     * @return <p>
     *         The direction of network traffic associated with a finding.
     *         </p>
     * @see NetworkDirection
     */
    public String getDirection() {
        return direction;
    }

    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     *
     * @param direction <p>
     *            The direction of network traffic associated with a finding.
     *            </p>
     * @see NetworkDirection
     */
    public void setDirection(String direction) {
        this.direction = direction;
    }

    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     *
     * @param direction <p>
     *            The direction of network traffic associated with a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkDirection
     */
    public Network withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     *
     * @param direction <p>
     *            The direction of network traffic associated with a finding.
     *            </p>
     * @see NetworkDirection
     */
    public void setDirection(NetworkDirection direction) {
        this.direction = direction.toString();
    }

    /**
     * <p>
     * The direction of network traffic associated with a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>IN, OUT
     *
     * @param direction <p>
     *            The direction of network traffic associated with a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see NetworkDirection
     */
    public Network withDirection(NetworkDirection direction) {
        this.direction = direction.toString();
        return this;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The protocol of network-related information about a finding.
     *         </p>
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param protocol <p>
     *            The protocol of network-related information about a finding.
     *            </p>
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param protocol <p>
     *            The protocol of network-related information about a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source IPv4 address of network-related information about a
     *         finding.
     *         </p>
     */
    public String getSourceIpV4() {
        return sourceIpV4;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceIpV4 <p>
     *            The source IPv4 address of network-related information about a
     *            finding.
     *            </p>
     */
    public void setSourceIpV4(String sourceIpV4) {
        this.sourceIpV4 = sourceIpV4;
    }

    /**
     * <p>
     * The source IPv4 address of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceIpV4 <p>
     *            The source IPv4 address of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withSourceIpV4(String sourceIpV4) {
        this.sourceIpV4 = sourceIpV4;
        return this;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source IPv6 address of network-related information about a
     *         finding.
     *         </p>
     */
    public String getSourceIpV6() {
        return sourceIpV6;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceIpV6 <p>
     *            The source IPv6 address of network-related information about a
     *            finding.
     *            </p>
     */
    public void setSourceIpV6(String sourceIpV6) {
        this.sourceIpV6 = sourceIpV6;
    }

    /**
     * <p>
     * The source IPv6 address of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceIpV6 <p>
     *            The source IPv6 address of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withSourceIpV6(String sourceIpV6) {
        this.sourceIpV6 = sourceIpV6;
        return this;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     *
     * @return <p>
     *         The source port of network-related information about a finding.
     *         </p>
     */
    public Integer getSourcePort() {
        return sourcePort;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     *
     * @param sourcePort <p>
     *            The source port of network-related information about a
     *            finding.
     *            </p>
     */
    public void setSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
    }

    /**
     * <p>
     * The source port of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param sourcePort <p>
     *            The source port of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withSourcePort(Integer sourcePort) {
        this.sourcePort = sourcePort;
        return this;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source domain of network-related information about a finding.
     *         </p>
     */
    public String getSourceDomain() {
        return sourceDomain;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceDomain <p>
     *            The source domain of network-related information about a
     *            finding.
     *            </p>
     */
    public void setSourceDomain(String sourceDomain) {
        this.sourceDomain = sourceDomain;
    }

    /**
     * <p>
     * The source domain of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceDomain <p>
     *            The source domain of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withSourceDomain(String sourceDomain) {
        this.sourceDomain = sourceDomain;
        return this;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related
     * information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The source media access control (MAC) address of network-related
     *         information about a finding.
     *         </p>
     */
    public String getSourceMac() {
        return sourceMac;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related
     * information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceMac <p>
     *            The source media access control (MAC) address of
     *            network-related information about a finding.
     *            </p>
     */
    public void setSourceMac(String sourceMac) {
        this.sourceMac = sourceMac;
    }

    /**
     * <p>
     * The source media access control (MAC) address of network-related
     * information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param sourceMac <p>
     *            The source media access control (MAC) address of
     *            network-related information about a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withSourceMac(String sourceMac) {
        this.sourceMac = sourceMac;
        return this;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The destination IPv4 address of network-related information about
     *         a finding.
     *         </p>
     */
    public String getDestinationIpV4() {
        return destinationIpV4;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationIpV4 <p>
     *            The destination IPv4 address of network-related information
     *            about a finding.
     *            </p>
     */
    public void setDestinationIpV4(String destinationIpV4) {
        this.destinationIpV4 = destinationIpV4;
    }

    /**
     * <p>
     * The destination IPv4 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationIpV4 <p>
     *            The destination IPv4 address of network-related information
     *            about a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withDestinationIpV4(String destinationIpV4) {
        this.destinationIpV4 = destinationIpV4;
        return this;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The destination IPv6 address of network-related information about
     *         a finding.
     *         </p>
     */
    public String getDestinationIpV6() {
        return destinationIpV6;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationIpV6 <p>
     *            The destination IPv6 address of network-related information
     *            about a finding.
     *            </p>
     */
    public void setDestinationIpV6(String destinationIpV6) {
        this.destinationIpV6 = destinationIpV6;
    }

    /**
     * <p>
     * The destination IPv6 address of network-related information about a
     * finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationIpV6 <p>
     *            The destination IPv6 address of network-related information
     *            about a finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withDestinationIpV6(String destinationIpV6) {
        this.destinationIpV6 = destinationIpV6;
        return this;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     *
     * @return <p>
     *         The destination port of network-related information about a
     *         finding.
     *         </p>
     */
    public Integer getDestinationPort() {
        return destinationPort;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     *
     * @param destinationPort <p>
     *            The destination port of network-related information about a
     *            finding.
     *            </p>
     */
    public void setDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
    }

    /**
     * <p>
     * The destination port of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param destinationPort <p>
     *            The destination port of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withDestinationPort(Integer destinationPort) {
        this.destinationPort = destinationPort;
        return this;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The destination domain of network-related information about a
     *         finding.
     *         </p>
     */
    public String getDestinationDomain() {
        return destinationDomain;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationDomain <p>
     *            The destination domain of network-related information about a
     *            finding.
     *            </p>
     */
    public void setDestinationDomain(String destinationDomain) {
        this.destinationDomain = destinationDomain;
    }

    /**
     * <p>
     * The destination domain of network-related information about a finding.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param destinationDomain <p>
     *            The destination domain of network-related information about a
     *            finding.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Network withDestinationDomain(String destinationDomain) {
        this.destinationDomain = destinationDomain;
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
        if (getDirection() != null)
            sb.append("Direction: " + getDirection() + ",");
        if (getProtocol() != null)
            sb.append("Protocol: " + getProtocol() + ",");
        if (getSourceIpV4() != null)
            sb.append("SourceIpV4: " + getSourceIpV4() + ",");
        if (getSourceIpV6() != null)
            sb.append("SourceIpV6: " + getSourceIpV6() + ",");
        if (getSourcePort() != null)
            sb.append("SourcePort: " + getSourcePort() + ",");
        if (getSourceDomain() != null)
            sb.append("SourceDomain: " + getSourceDomain() + ",");
        if (getSourceMac() != null)
            sb.append("SourceMac: " + getSourceMac() + ",");
        if (getDestinationIpV4() != null)
            sb.append("DestinationIpV4: " + getDestinationIpV4() + ",");
        if (getDestinationIpV6() != null)
            sb.append("DestinationIpV6: " + getDestinationIpV6() + ",");
        if (getDestinationPort() != null)
            sb.append("DestinationPort: " + getDestinationPort() + ",");
        if (getDestinationDomain() != null)
            sb.append("DestinationDomain: " + getDestinationDomain());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirection() == null) ? 0 : getDirection().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        hashCode = prime * hashCode + ((getSourceIpV4() == null) ? 0 : getSourceIpV4().hashCode());
        hashCode = prime * hashCode + ((getSourceIpV6() == null) ? 0 : getSourceIpV6().hashCode());
        hashCode = prime * hashCode + ((getSourcePort() == null) ? 0 : getSourcePort().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDomain() == null) ? 0 : getSourceDomain().hashCode());
        hashCode = prime * hashCode + ((getSourceMac() == null) ? 0 : getSourceMac().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationIpV4() == null) ? 0 : getDestinationIpV4().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationIpV6() == null) ? 0 : getDestinationIpV6().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationPort() == null) ? 0 : getDestinationPort().hashCode());
        hashCode = prime * hashCode
                + ((getDestinationDomain() == null) ? 0 : getDestinationDomain().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Network == false)
            return false;
        Network other = (Network) obj;

        if (other.getDirection() == null ^ this.getDirection() == null)
            return false;
        if (other.getDirection() != null
                && other.getDirection().equals(this.getDirection()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        if (other.getSourceIpV4() == null ^ this.getSourceIpV4() == null)
            return false;
        if (other.getSourceIpV4() != null
                && other.getSourceIpV4().equals(this.getSourceIpV4()) == false)
            return false;
        if (other.getSourceIpV6() == null ^ this.getSourceIpV6() == null)
            return false;
        if (other.getSourceIpV6() != null
                && other.getSourceIpV6().equals(this.getSourceIpV6()) == false)
            return false;
        if (other.getSourcePort() == null ^ this.getSourcePort() == null)
            return false;
        if (other.getSourcePort() != null
                && other.getSourcePort().equals(this.getSourcePort()) == false)
            return false;
        if (other.getSourceDomain() == null ^ this.getSourceDomain() == null)
            return false;
        if (other.getSourceDomain() != null
                && other.getSourceDomain().equals(this.getSourceDomain()) == false)
            return false;
        if (other.getSourceMac() == null ^ this.getSourceMac() == null)
            return false;
        if (other.getSourceMac() != null
                && other.getSourceMac().equals(this.getSourceMac()) == false)
            return false;
        if (other.getDestinationIpV4() == null ^ this.getDestinationIpV4() == null)
            return false;
        if (other.getDestinationIpV4() != null
                && other.getDestinationIpV4().equals(this.getDestinationIpV4()) == false)
            return false;
        if (other.getDestinationIpV6() == null ^ this.getDestinationIpV6() == null)
            return false;
        if (other.getDestinationIpV6() != null
                && other.getDestinationIpV6().equals(this.getDestinationIpV6()) == false)
            return false;
        if (other.getDestinationPort() == null ^ this.getDestinationPort() == null)
            return false;
        if (other.getDestinationPort() != null
                && other.getDestinationPort().equals(this.getDestinationPort()) == false)
            return false;
        if (other.getDestinationDomain() == null ^ this.getDestinationDomain() == null)
            return false;
        if (other.getDestinationDomain() != null
                && other.getDestinationDomain().equals(this.getDestinationDomain()) == false)
            return false;
        return true;
    }
}
