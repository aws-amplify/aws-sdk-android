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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

public class DescribePlatformVersionResult implements Serializable {
    /**
     * <p>
     * Detailed information about the platform version.
     * </p>
     */
    private PlatformDescription platformDescription;

    /**
     * <p>
     * Detailed information about the platform version.
     * </p>
     *
     * @return <p>
     *         Detailed information about the platform version.
     *         </p>
     */
    public PlatformDescription getPlatformDescription() {
        return platformDescription;
    }

    /**
     * <p>
     * Detailed information about the platform version.
     * </p>
     *
     * @param platformDescription <p>
     *            Detailed information about the platform version.
     *            </p>
     */
    public void setPlatformDescription(PlatformDescription platformDescription) {
        this.platformDescription = platformDescription;
    }

    /**
     * <p>
     * Detailed information about the platform version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param platformDescription <p>
     *            Detailed information about the platform version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribePlatformVersionResult withPlatformDescription(
            PlatformDescription platformDescription) {
        this.platformDescription = platformDescription;
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
        if (getPlatformDescription() != null)
            sb.append("PlatformDescription: " + getPlatformDescription());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformDescription() == null) ? 0 : getPlatformDescription().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribePlatformVersionResult == false)
            return false;
        DescribePlatformVersionResult other = (DescribePlatformVersionResult) obj;

        if (other.getPlatformDescription() == null ^ this.getPlatformDescription() == null)
            return false;
        if (other.getPlatformDescription() != null
                && other.getPlatformDescription().equals(this.getPlatformDescription()) == false)
            return false;
        return true;
    }
}
