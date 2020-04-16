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
 * Specifies the connection endpoint.
 * </p>
 */
public class AwsRdsDbInstanceEndpoint implements Serializable {
    /**
     * <p>
     * Specifies the DNS address of the DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String address;

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     */
    private Integer port;

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String hostedZoneId;

    /**
     * <p>
     * Specifies the DNS address of the DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Specifies the DNS address of the DB instance.
     *         </p>
     */
    public String getAddress() {
        return address;
    }

    /**
     * <p>
     * Specifies the DNS address of the DB instance.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param address <p>
     *            Specifies the DNS address of the DB instance.
     *            </p>
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * <p>
     * Specifies the DNS address of the DB instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param address <p>
     *            Specifies the DNS address of the DB instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceEndpoint withAddress(String address) {
        this.address = address;
        return this;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     *
     * @return <p>
     *         Specifies the port that the database engine is listening on.
     *         </p>
     */
    public Integer getPort() {
        return port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     *
     * @param port <p>
     *            Specifies the port that the database engine is listening on.
     *            </p>
     */
    public void setPort(Integer port) {
        this.port = port;
    }

    /**
     * <p>
     * Specifies the port that the database engine is listening on.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param port <p>
     *            Specifies the port that the database engine is listening on.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceEndpoint withPort(Integer port) {
        this.port = port;
        return this;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         Specifies the ID that Amazon Route 53 assigns when you create a
     *         hosted zone.
     *         </p>
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param hostedZoneId <p>
     *            Specifies the ID that Amazon Route 53 assigns when you create
     *            a hosted zone.
     *            </p>
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * Specifies the ID that Amazon Route 53 assigns when you create a hosted
     * zone.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param hostedZoneId <p>
     *            Specifies the ID that Amazon Route 53 assigns when you create
     *            a hosted zone.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AwsRdsDbInstanceEndpoint withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
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
        if (getAddress() != null)
            sb.append("Address: " + getAddress() + ",");
        if (getPort() != null)
            sb.append("Port: " + getPort() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddress() == null) ? 0 : getAddress().hashCode());
        hashCode = prime * hashCode + ((getPort() == null) ? 0 : getPort().hashCode());
        hashCode = prime * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsRdsDbInstanceEndpoint == false)
            return false;
        AwsRdsDbInstanceEndpoint other = (AwsRdsDbInstanceEndpoint) obj;

        if (other.getAddress() == null ^ this.getAddress() == null)
            return false;
        if (other.getAddress() != null && other.getAddress().equals(this.getAddress()) == false)
            return false;
        if (other.getPort() == null ^ this.getPort() == null)
            return false;
        if (other.getPort() != null && other.getPort().equals(this.getPort()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        return true;
    }
}
