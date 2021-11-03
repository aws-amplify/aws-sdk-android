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

package com.amazonaws.services.connectparticipant.model;

import java.io.Serializable;

public class CreateParticipantConnectionResult implements Serializable {
    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     */
    private Websocket websocket;

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication
     * token associated with the participant's connection.
     * </p>
     */
    private ConnectionCredentials connectionCredentials;

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     *
     * @return <p>
     *         Creates the participant's websocket connection.
     *         </p>
     */
    public Websocket getWebsocket() {
        return websocket;
    }

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     *
     * @param websocket <p>
     *            Creates the participant's websocket connection.
     *            </p>
     */
    public void setWebsocket(Websocket websocket) {
        this.websocket = websocket;
    }

    /**
     * <p>
     * Creates the participant's websocket connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param websocket <p>
     *            Creates the participant's websocket connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantConnectionResult withWebsocket(Websocket websocket) {
        this.websocket = websocket;
        return this;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication
     * token associated with the participant's connection.
     * </p>
     *
     * @return <p>
     *         Creates the participant's connection credentials. The
     *         authentication token associated with the participant's
     *         connection.
     *         </p>
     */
    public ConnectionCredentials getConnectionCredentials() {
        return connectionCredentials;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication
     * token associated with the participant's connection.
     * </p>
     *
     * @param connectionCredentials <p>
     *            Creates the participant's connection credentials. The
     *            authentication token associated with the participant's
     *            connection.
     *            </p>
     */
    public void setConnectionCredentials(ConnectionCredentials connectionCredentials) {
        this.connectionCredentials = connectionCredentials;
    }

    /**
     * <p>
     * Creates the participant's connection credentials. The authentication
     * token associated with the participant's connection.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionCredentials <p>
     *            Creates the participant's connection credentials. The
     *            authentication token associated with the participant's
     *            connection.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateParticipantConnectionResult withConnectionCredentials(
            ConnectionCredentials connectionCredentials) {
        this.connectionCredentials = connectionCredentials;
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
        if (getWebsocket() != null)
            sb.append("Websocket: " + getWebsocket() + ",");
        if (getConnectionCredentials() != null)
            sb.append("ConnectionCredentials: " + getConnectionCredentials());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getWebsocket() == null) ? 0 : getWebsocket().hashCode());
        hashCode = prime
                * hashCode
                + ((getConnectionCredentials() == null) ? 0 : getConnectionCredentials().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateParticipantConnectionResult == false)
            return false;
        CreateParticipantConnectionResult other = (CreateParticipantConnectionResult) obj;

        if (other.getWebsocket() == null ^ this.getWebsocket() == null)
            return false;
        if (other.getWebsocket() != null
                && other.getWebsocket().equals(this.getWebsocket()) == false)
            return false;
        if (other.getConnectionCredentials() == null ^ this.getConnectionCredentials() == null)
            return false;
        if (other.getConnectionCredentials() != null
                && other.getConnectionCredentials().equals(this.getConnectionCredentials()) == false)
            return false;
        return true;
    }
}
