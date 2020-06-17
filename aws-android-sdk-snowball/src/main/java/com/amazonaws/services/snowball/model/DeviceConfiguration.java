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

package com.amazonaws.services.snowball.model;

import java.io.Serializable;

/**
 * <p>
 * The container for <code>SnowconeDeviceConfiguration</code>.
 * </p>
 */
public class DeviceConfiguration implements Serializable {
    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone
     * job.
     * </p>
     */
    private SnowconeDeviceConfiguration snowconeDeviceConfiguration;

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone
     * job.
     * </p>
     *
     * @return <p>
     *         Returns information about the device configuration for an AWS
     *         Snowcone job.
     *         </p>
     */
    public SnowconeDeviceConfiguration getSnowconeDeviceConfiguration() {
        return snowconeDeviceConfiguration;
    }

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone
     * job.
     * </p>
     *
     * @param snowconeDeviceConfiguration <p>
     *            Returns information about the device configuration for an AWS
     *            Snowcone job.
     *            </p>
     */
    public void setSnowconeDeviceConfiguration(
            SnowconeDeviceConfiguration snowconeDeviceConfiguration) {
        this.snowconeDeviceConfiguration = snowconeDeviceConfiguration;
    }

    /**
     * <p>
     * Returns information about the device configuration for an AWS Snowcone
     * job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param snowconeDeviceConfiguration <p>
     *            Returns information about the device configuration for an AWS
     *            Snowcone job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceConfiguration withSnowconeDeviceConfiguration(
            SnowconeDeviceConfiguration snowconeDeviceConfiguration) {
        this.snowconeDeviceConfiguration = snowconeDeviceConfiguration;
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
        if (getSnowconeDeviceConfiguration() != null)
            sb.append("SnowconeDeviceConfiguration: " + getSnowconeDeviceConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getSnowconeDeviceConfiguration() == null) ? 0
                        : getSnowconeDeviceConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceConfiguration == false)
            return false;
        DeviceConfiguration other = (DeviceConfiguration) obj;

        if (other.getSnowconeDeviceConfiguration() == null
                ^ this.getSnowconeDeviceConfiguration() == null)
            return false;
        if (other.getSnowconeDeviceConfiguration() != null
                && other.getSnowconeDeviceConfiguration().equals(
                        this.getSnowconeDeviceConfiguration()) == false)
            return false;
        return true;
    }
}
