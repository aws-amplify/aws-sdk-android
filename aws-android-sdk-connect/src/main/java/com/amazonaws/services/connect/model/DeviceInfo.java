/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information regarding the device.
 * </p>
 */
public class DeviceInfo implements Serializable {
    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String platformName;

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String platformVersion;

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     */
    private String operatingSystem;

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         Name of the platform that the participant used for the call.
     *         </p>
     */
    public String getPlatformName() {
        return platformName;
    }

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param platformName <p>
     *            Name of the platform that the participant used for the call.
     *            </p>
     */
    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    /**
     * <p>
     * Name of the platform that the participant used for the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param platformName <p>
     *            Name of the platform that the participant used for the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceInfo withPlatformName(String platformName) {
        this.platformName = platformName;
        return this;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         Version of the platform that the participant used for the call.
     *         </p>
     */
    public String getPlatformVersion() {
        return platformVersion;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param platformVersion <p>
     *            Version of the platform that the participant used for the
     *            call.
     *            </p>
     */
    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * Version of the platform that the participant used for the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param platformVersion <p>
     *            Version of the platform that the participant used for the
     *            call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceInfo withPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
        return this;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @return <p>
     *         Operating system that the participant used for the call.
     *         </p>
     */
    public String getOperatingSystem() {
        return operatingSystem;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param operatingSystem <p>
     *            Operating system that the participant used for the call.
     *            </p>
     */
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that the participant used for the call.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 128<br/>
     *
     * @param operatingSystem <p>
     *            Operating system that the participant used for the call.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DeviceInfo withOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
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
        if (getPlatformName() != null)
            sb.append("PlatformName: " + getPlatformName() + ",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: " + getPlatformVersion() + ",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: " + getOperatingSystem());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getPlatformName() == null) ? 0 : getPlatformName().hashCode());
        hashCode = prime * hashCode
                + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode
                + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeviceInfo == false)
            return false;
        DeviceInfo other = (DeviceInfo) obj;

        if (other.getPlatformName() == null ^ this.getPlatformName() == null)
            return false;
        if (other.getPlatformName() != null
                && other.getPlatformName().equals(this.getPlatformName()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null
                && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null
                && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        return true;
    }
}
