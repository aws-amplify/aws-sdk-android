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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Opens ports for a specific Amazon Lightsail instance, and specifies the IP
 * addresses allowed to connect to the instance through the ports, and the
 * protocol.
 * </p>
 * <p>
 * The <code>OpenInstancePublicPorts</code> action supports tag-based access
 * control via resource tags applied to the resource identified by
 * <code>instanceName</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class OpenInstancePublicPortsRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * An object to describe the ports to open for the specified instance.
     * </p>
     */
    private PortInfo portInfo;

    /**
     * <p>
     * The name of the instance for which to open ports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * An object to describe the ports to open for the specified instance.
     * </p>
     *
     * @return <p>
     *         An object to describe the ports to open for the specified
     *         instance.
     *         </p>
     */
    public PortInfo getPortInfo() {
        return portInfo;
    }

    /**
     * <p>
     * An object to describe the ports to open for the specified instance.
     * </p>
     *
     * @param portInfo <p>
     *            An object to describe the ports to open for the specified
     *            instance.
     *            </p>
     */
    public void setPortInfo(PortInfo portInfo) {
        this.portInfo = portInfo;
    }

    /**
     * <p>
     * An object to describe the ports to open for the specified instance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param portInfo <p>
     *            An object to describe the ports to open for the specified
     *            instance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpenInstancePublicPortsRequest withPortInfo(PortInfo portInfo) {
        this.portInfo = portInfo;
        return this;
    }

    /**
     * <p>
     * The name of the instance for which to open ports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance for which to open ports.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the instance for which to open ports.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance for which to open ports.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance for which to open ports.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance for which to open ports.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OpenInstancePublicPortsRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
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
        if (getPortInfo() != null)
            sb.append("portInfo: " + getPortInfo() + ",");
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPortInfo() == null) ? 0 : getPortInfo().hashCode());
        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenInstancePublicPortsRequest == false)
            return false;
        OpenInstancePublicPortsRequest other = (OpenInstancePublicPortsRequest) obj;

        if (other.getPortInfo() == null ^ this.getPortInfo() == null)
            return false;
        if (other.getPortInfo() != null && other.getPortInfo().equals(this.getPortInfo()) == false)
            return false;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        return true;
    }
}
