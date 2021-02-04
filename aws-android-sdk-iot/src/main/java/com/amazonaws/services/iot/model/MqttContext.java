/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.iot.model;

import java.io.Serializable;

/**
 * <p>
 * Specifies the MQTT context to use for the test authorizer request
 * </p>
 */
public class MqttContext implements Serializable {
    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     */
    private String username;

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     */
    private java.nio.ByteBuffer password;

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     */
    private String clientId;

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The value of the <code>username</code> key in an MQTT
     *         authorization request.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param username <p>
     *            The value of the <code>username</code> key in an MQTT
     *            authorization request.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * The value of the <code>username</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param username <p>
     *            The value of the <code>username</code> key in an MQTT
     *            authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttContext withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The value of the <code>password</code> key in an MQTT
     *         authorization request.
     *         </p>
     */
    public java.nio.ByteBuffer getPassword() {
        return password;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param password <p>
     *            The value of the <code>password</code> key in an MQTT
     *            authorization request.
     *            </p>
     */
    public void setPassword(java.nio.ByteBuffer password) {
        this.password = password;
    }

    /**
     * <p>
     * The value of the <code>password</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param password <p>
     *            The value of the <code>password</code> key in an MQTT
     *            authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttContext withPassword(java.nio.ByteBuffer password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @return <p>
     *         The value of the <code>clientId</code> key in an MQTT
     *         authorization request.
     *         </p>
     */
    public String getClientId() {
        return clientId;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param clientId <p>
     *            The value of the <code>clientId</code> key in an MQTT
     *            authorization request.
     *            </p>
     */
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The value of the <code>clientId</code> key in an MQTT authorization
     * request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 65535<br/>
     *
     * @param clientId <p>
     *            The value of the <code>clientId</code> key in an MQTT
     *            authorization request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MqttContext withClientId(String clientId) {
        this.clientId = clientId;
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
        if (getUsername() != null)
            sb.append("username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("password: " + getPassword() + ",");
        if (getClientId() != null)
            sb.append("clientId: " + getClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MqttContext == false)
            return false;
        MqttContext other = (MqttContext) obj;

        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        return true;
    }
}
