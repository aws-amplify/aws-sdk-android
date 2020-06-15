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

/**
 * <p>
 * A smart home appliance that can connect to a central system. Any domestic
 * device can be a smart appliance.
 * </p>
 */
public class SmartHomeAppliance implements Serializable {
    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     */
    private String friendlyName;

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     */
    private String description;

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     */
    private String manufacturerName;

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     *
     * @return <p>
     *         The friendly name of the smart home appliance.
     *         </p>
     */
    public String getFriendlyName() {
        return friendlyName;
    }

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     *
     * @param friendlyName <p>
     *            The friendly name of the smart home appliance.
     *            </p>
     */
    public void setFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
    }

    /**
     * <p>
     * The friendly name of the smart home appliance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param friendlyName <p>
     *            The friendly name of the smart home appliance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmartHomeAppliance withFriendlyName(String friendlyName) {
        this.friendlyName = friendlyName;
        return this;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     *
     * @return <p>
     *         The description of the smart home appliance.
     *         </p>
     */
    public String getDescription() {
        return description;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     *
     * @param description <p>
     *            The description of the smart home appliance.
     *            </p>
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the smart home appliance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param description <p>
     *            The description of the smart home appliance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmartHomeAppliance withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     *
     * @return <p>
     *         The name of the manufacturer of the smart home appliance.
     *         </p>
     */
    public String getManufacturerName() {
        return manufacturerName;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     *
     * @param manufacturerName <p>
     *            The name of the manufacturer of the smart home appliance.
     *            </p>
     */
    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    /**
     * <p>
     * The name of the manufacturer of the smart home appliance.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param manufacturerName <p>
     *            The name of the manufacturer of the smart home appliance.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SmartHomeAppliance withManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
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
        if (getFriendlyName() != null)
            sb.append("FriendlyName: " + getFriendlyName() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getManufacturerName() != null)
            sb.append("ManufacturerName: " + getManufacturerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getFriendlyName() == null) ? 0 : getFriendlyName().hashCode());
        hashCode = prime * hashCode
                + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode
                + ((getManufacturerName() == null) ? 0 : getManufacturerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SmartHomeAppliance == false)
            return false;
        SmartHomeAppliance other = (SmartHomeAppliance) obj;

        if (other.getFriendlyName() == null ^ this.getFriendlyName() == null)
            return false;
        if (other.getFriendlyName() != null
                && other.getFriendlyName().equals(this.getFriendlyName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null
                && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getManufacturerName() == null ^ this.getManufacturerName() == null)
            return false;
        if (other.getManufacturerName() != null
                && other.getManufacturerName().equals(this.getManufacturerName()) == false)
            return false;
        return true;
    }
}
