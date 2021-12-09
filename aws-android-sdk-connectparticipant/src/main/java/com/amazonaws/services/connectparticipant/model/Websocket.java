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

/**
 * <p>
 * The websocket for the participant's connection.
 * </p>
 */
public class Websocket implements Serializable {
    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     */
    private String url;

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     */
    private String connectionExpiry;

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @return <p>
     *         The URL of the websocket.
     *         </p>
     */
    public String getUrl() {
        return url;
    }

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param url <p>
     *            The URL of the websocket.
     *            </p>
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the websocket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2000<br/>
     *
     * @param url <p>
     *            The URL of the websocket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Websocket withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @return <p>
     *         The URL expiration timestamp in ISO date format.
     *         </p>
     *         <p>
     *         It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For
     *         example, 2019-11-08T02:41:28.172Z.
     *         </p>
     */
    public String getConnectionExpiry() {
        return connectionExpiry;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     *
     * @param connectionExpiry <p>
     *            The URL expiration timestamp in ISO date format.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     */
    public void setConnectionExpiry(String connectionExpiry) {
        this.connectionExpiry = connectionExpiry;
    }

    /**
     * <p>
     * The URL expiration timestamp in ISO date format.
     * </p>
     * <p>
     * It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ. For example,
     * 2019-11-08T02:41:28.172Z.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param connectionExpiry <p>
     *            The URL expiration timestamp in ISO date format.
     *            </p>
     *            <p>
     *            It's specified in ISO 8601 format: yyyy-MM-ddThh:mm:ss.SSSZ.
     *            For example, 2019-11-08T02:41:28.172Z.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Websocket withConnectionExpiry(String connectionExpiry) {
        this.connectionExpiry = connectionExpiry;
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
        if (getUrl() != null)
            sb.append("Url: " + getUrl() + ",");
        if (getConnectionExpiry() != null)
            sb.append("ConnectionExpiry: " + getConnectionExpiry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode
                + ((getConnectionExpiry() == null) ? 0 : getConnectionExpiry().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Websocket == false)
            return false;
        Websocket other = (Websocket) obj;

        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getConnectionExpiry() == null ^ this.getConnectionExpiry() == null)
            return false;
        if (other.getConnectionExpiry() != null
                && other.getConnectionExpiry().equals(this.getConnectionExpiry()) == false)
            return false;
        return true;
    }
}
