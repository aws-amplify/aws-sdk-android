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

package com.amazonaws.services.a4b.model;

import java.io.Serializable;

public class GetProfileResult implements Serializable {
    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     */
    private Profile profile;

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     *
     * @return <p>
     *         The details of the room profile requested. Required.
     *         </p>
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     *
     * @param profile <p>
     *            The details of the room profile requested. Required.
     *            </p>
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     * <p>
     * The details of the room profile requested. Required.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param profile <p>
     *            The details of the room profile requested. Required.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetProfileResult withProfile(Profile profile) {
        this.profile = profile;
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
        if (getProfile() != null)
            sb.append("Profile: " + getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetProfileResult == false)
            return false;
        GetProfileResult other = (GetProfileResult) obj;

        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }
}
