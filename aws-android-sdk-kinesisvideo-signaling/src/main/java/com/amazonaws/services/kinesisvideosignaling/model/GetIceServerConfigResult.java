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

public class GetIceServerConfigResult implements Serializable {
    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     */
    private java.util.List<IceServer> iceServerList = new java.util.ArrayList<IceServer>();

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     *
     * @return <p>
     *         The list of ICE server information objects.
     *         </p>
     */
    public java.util.List<IceServer> getIceServerList() {
        return iceServerList;
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     *
     * @param iceServerList <p>
     *            The list of ICE server information objects.
     *            </p>
     */
    public void setIceServerList(java.util.Collection<IceServer> iceServerList) {
        if (iceServerList == null) {
            this.iceServerList = null;
            return;
        }

        this.iceServerList = new java.util.ArrayList<IceServer>(iceServerList);
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iceServerList <p>
     *            The list of ICE server information objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIceServerConfigResult withIceServerList(IceServer... iceServerList) {
        if (getIceServerList() == null) {
            this.iceServerList = new java.util.ArrayList<IceServer>(iceServerList.length);
        }
        for (IceServer value : iceServerList) {
            this.iceServerList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of ICE server information objects.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param iceServerList <p>
     *            The list of ICE server information objects.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetIceServerConfigResult withIceServerList(java.util.Collection<IceServer> iceServerList) {
        setIceServerList(iceServerList);
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
        if (getIceServerList() != null)
            sb.append("IceServerList: " + getIceServerList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getIceServerList() == null) ? 0 : getIceServerList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetIceServerConfigResult == false)
            return false;
        GetIceServerConfigResult other = (GetIceServerConfigResult) obj;

        if (other.getIceServerList() == null ^ this.getIceServerList() == null)
            return false;
        if (other.getIceServerList() != null
                && other.getIceServerList().equals(this.getIceServerList()) == false)
            return false;
        return true;
    }
}
