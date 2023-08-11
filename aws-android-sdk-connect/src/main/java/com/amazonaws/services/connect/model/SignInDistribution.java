/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * The distribution of sign in traffic between the instance and its replica(s).
 * </p>
 */
public class SignInDistribution implements Serializable {
    /**
     * <p>
     * The Amazon Web Services Region of the sign in distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     */
    private String region;

    /**
     * <p>
     * Whether sign in distribution is enabled.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The Amazon Web Services Region of the sign in distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @return <p>
     *         The Amazon Web Services Region of the sign in distribution.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the sign in distribution.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region of the sign in distribution.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the sign in distribution.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>8 - 31<br/>
     * <b>Pattern: </b>[a-z]{2}(-[a-z]+){1,2}(-[0-9])?<br/>
     *
     * @param region <p>
     *            The Amazon Web Services Region of the sign in distribution.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignInDistribution withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * Whether sign in distribution is enabled.
     * </p>
     *
     * @return <p>
     *         Whether sign in distribution is enabled.
     *         </p>
     */
    public Boolean isEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether sign in distribution is enabled.
     * </p>
     *
     * @return <p>
     *         Whether sign in distribution is enabled.
     *         </p>
     */
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * <p>
     * Whether sign in distribution is enabled.
     * </p>
     *
     * @param enabled <p>
     *            Whether sign in distribution is enabled.
     *            </p>
     */
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Whether sign in distribution is enabled.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabled <p>
     *            Whether sign in distribution is enabled.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SignInDistribution withEnabled(Boolean enabled) {
        this.enabled = enabled;
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
        if (getRegion() != null)
            sb.append("Region: " + getRegion() + ",");
        if (getEnabled() != null)
            sb.append("Enabled: " + getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignInDistribution == false)
            return false;
        SignInDistribution other = (SignInDistribution) obj;

        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }
}
