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

package com.amazonaws.services.iotsitewise.model;

import java.io.Serializable;

/**
 * <p>
 * Contains a gateway's platform information.
 * </p>
 */
public class GatewayPlatform implements Serializable {
    /**
     * <p>
     * A gateway that runs on AWS IoT Greengrass.
     * </p>
     */
    private Greengrass greengrass;

    /**
     * <p>
     * A gateway that runs on AWS IoT Greengrass.
     * </p>
     *
     * @return <p>
     *         A gateway that runs on AWS IoT Greengrass.
     *         </p>
     */
    public Greengrass getGreengrass() {
        return greengrass;
    }

    /**
     * <p>
     * A gateway that runs on AWS IoT Greengrass.
     * </p>
     *
     * @param greengrass <p>
     *            A gateway that runs on AWS IoT Greengrass.
     *            </p>
     */
    public void setGreengrass(Greengrass greengrass) {
        this.greengrass = greengrass;
    }

    /**
     * <p>
     * A gateway that runs on AWS IoT Greengrass.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param greengrass <p>
     *            A gateway that runs on AWS IoT Greengrass.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GatewayPlatform withGreengrass(Greengrass greengrass) {
        this.greengrass = greengrass;
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
        if (getGreengrass() != null)
            sb.append("greengrass: " + getGreengrass());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGreengrass() == null) ? 0 : getGreengrass().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GatewayPlatform == false)
            return false;
        GatewayPlatform other = (GatewayPlatform) obj;

        if (other.getGreengrass() == null ^ this.getGreengrass() == null)
            return false;
        if (other.getGreengrass() != null
                && other.getGreengrass().equals(this.getGreengrass()) == false)
            return false;
        return true;
    }
}
