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
 * Returns temporary SSH keys you can use to connect to a specific virtual
 * private server, or <i>instance</i>.
 * </p>
 * <p>
 * The <code>get instance access details</code> operation supports tag-based
 * access control via resource tags applied to the resource identified by
 * <code>instance name</code>. For more information, see the <a href=
 * "https://lightsail.aws.amazon.com/ls/docs/en/articles/amazon-lightsail-controlling-access-using-tags"
 * >Lightsail Dev Guide</a>.
 * </p>
 */
public class GetInstanceAccessDetailsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     */
    private String instanceName;

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     */
    private String protocol;

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @return <p>
     *         The name of the instance to access.
     *         </p>
     */
    public String getInstanceName() {
        return instanceName;
    }

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance to access.
     *            </p>
     */
    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance to access.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>\w[\w\-]*\w<br/>
     *
     * @param instanceName <p>
     *            The name of the instance to access.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetInstanceAccessDetailsRequest withInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @return <p>
     *         The protocol to use to connect to your instance. Defaults to
     *         <code>ssh</code>.
     *         </p>
     * @see InstanceAccessProtocol
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol to use to connect to your instance. Defaults to
     *            <code>ssh</code>.
     *            </p>
     * @see InstanceAccessProtocol
     */
    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol to use to connect to your instance. Defaults to
     *            <code>ssh</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAccessProtocol
     */
    public GetInstanceAccessDetailsRequest withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol to use to connect to your instance. Defaults to
     *            <code>ssh</code>.
     *            </p>
     * @see InstanceAccessProtocol
     */
    public void setProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
    }

    /**
     * <p>
     * The protocol to use to connect to your instance. Defaults to
     * <code>ssh</code>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ssh, rdp
     *
     * @param protocol <p>
     *            The protocol to use to connect to your instance. Defaults to
     *            <code>ssh</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see InstanceAccessProtocol
     */
    public GetInstanceAccessDetailsRequest withProtocol(InstanceAccessProtocol protocol) {
        this.protocol = protocol.toString();
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
        if (getInstanceName() != null)
            sb.append("instanceName: " + getInstanceName() + ",");
        if (getProtocol() != null)
            sb.append("protocol: " + getProtocol());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getProtocol() == null) ? 0 : getProtocol().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetInstanceAccessDetailsRequest == false)
            return false;
        GetInstanceAccessDetailsRequest other = (GetInstanceAccessDetailsRequest) obj;

        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null
                && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getProtocol() == null ^ this.getProtocol() == null)
            return false;
        if (other.getProtocol() != null && other.getProtocol().equals(this.getProtocol()) == false)
            return false;
        return true;
    }
}
