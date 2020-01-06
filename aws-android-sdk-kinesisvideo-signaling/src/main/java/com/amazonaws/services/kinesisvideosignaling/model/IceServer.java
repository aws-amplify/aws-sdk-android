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

package com.amazonaws.services.kinesisvideosignaling.model;

import java.io.Serializable;

/**
 * <p>
 * A structure for the ICE server connection data.
 * </p>
 */
public class IceServer implements Serializable {
    /**
     * <p>
     * An array of URIs, in the form specified in the <a href=
     * "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     * >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the
     * different addresses and/or protocols that can be used to reach the TURN
     * server.
     * </p>
     */
    private java.util.List<String> uris = new java.util.ArrayList<String>();

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String username;

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     */
    private String password;

    /**
     * <p>
     * The period of time, in seconds, during which the username and password
     * are valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 86400<br/>
     */
    private Integer ttl;

    /**
     * <p>
     * An array of URIs, in the form specified in the <a href=
     * "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     * >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the
     * different addresses and/or protocols that can be used to reach the TURN
     * server.
     * </p>
     *
     * @return <p>
     *         An array of URIs, in the form specified in the <a href=
     *         "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *         >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide
     *         the different addresses and/or protocols that can be used to
     *         reach the TURN server.
     *         </p>
     */
    public java.util.List<String> getUris() {
        return uris;
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a href=
     * "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     * >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the
     * different addresses and/or protocols that can be used to reach the TURN
     * server.
     * </p>
     *
     * @param uris <p>
     *            An array of URIs, in the form specified in the <a href=
     *            "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *            >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs
     *            provide the different addresses and/or protocols that can be
     *            used to reach the TURN server.
     *            </p>
     */
    public void setUris(java.util.Collection<String> uris) {
        if (uris == null) {
            this.uris = null;
            return;
        }

        this.uris = new java.util.ArrayList<String>(uris);
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a href=
     * "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     * >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the
     * different addresses and/or protocols that can be used to reach the TURN
     * server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uris <p>
     *            An array of URIs, in the form specified in the <a href=
     *            "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *            >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs
     *            provide the different addresses and/or protocols that can be
     *            used to reach the TURN server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IceServer withUris(String... uris) {
        if (getUris() == null) {
            this.uris = new java.util.ArrayList<String>(uris.length);
        }
        for (String value : uris) {
            this.uris.add(value);
        }
        return this;
    }

    /**
     * <p>
     * An array of URIs, in the form specified in the <a href=
     * "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     * >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs provide the
     * different addresses and/or protocols that can be used to reach the TURN
     * server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param uris <p>
     *            An array of URIs, in the form specified in the <a href=
     *            "https://tools.ietf.org/html/draft-petithuguenin-behave-turn-uris-03"
     *            >I-D.petithuguenin-behave-turn-uris</a> spec. These URIs
     *            provide the different addresses and/or protocols that can be
     *            used to reach the TURN server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IceServer withUris(java.util.Collection<String> uris) {
        setUris(uris);
        return this;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         A username to login to the ICE server.
     *         </p>
     */
    public String getUsername() {
        return username;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param username <p>
     *            A username to login to the ICE server.
     *            </p>
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * <p>
     * A username to login to the ICE server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param username <p>
     *            A username to login to the ICE server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IceServer withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @return <p>
     *         A password to login to the ICE server.
     *         </p>
     */
    public String getPassword() {
        return password;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param password <p>
     *            A password to login to the ICE server.
     *            </p>
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * A password to login to the ICE server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_.-]+<br/>
     *
     * @param password <p>
     *            A password to login to the ICE server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IceServer withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password
     * are valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 86400<br/>
     *
     * @return <p>
     *         The period of time, in seconds, during which the username and
     *         password are valid.
     *         </p>
     */
    public Integer getTtl() {
        return ttl;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password
     * are valid.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 86400<br/>
     *
     * @param ttl <p>
     *            The period of time, in seconds, during which the username and
     *            password are valid.
     *            </p>
     */
    public void setTtl(Integer ttl) {
        this.ttl = ttl;
    }

    /**
     * <p>
     * The period of time, in seconds, during which the username and password
     * are valid.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>30 - 86400<br/>
     *
     * @param ttl <p>
     *            The period of time, in seconds, during which the username and
     *            password are valid.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public IceServer withTtl(Integer ttl) {
        this.ttl = ttl;
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
        if (getUris() != null)
            sb.append("Uris: " + getUris() + ",");
        if (getUsername() != null)
            sb.append("Username: " + getUsername() + ",");
        if (getPassword() != null)
            sb.append("Password: " + getPassword() + ",");
        if (getTtl() != null)
            sb.append("Ttl: " + getTtl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUris() == null) ? 0 : getUris().hashCode());
        hashCode = prime * hashCode + ((getUsername() == null) ? 0 : getUsername().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getTtl() == null) ? 0 : getTtl().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IceServer == false)
            return false;
        IceServer other = (IceServer) obj;

        if (other.getUris() == null ^ this.getUris() == null)
            return false;
        if (other.getUris() != null && other.getUris().equals(this.getUris()) == false)
            return false;
        if (other.getUsername() == null ^ this.getUsername() == null)
            return false;
        if (other.getUsername() != null && other.getUsername().equals(this.getUsername()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getTtl() == null ^ this.getTtl() == null)
            return false;
        if (other.getTtl() != null && other.getTtl().equals(this.getTtl()) == false)
            return false;
        return true;
    }
}
