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

package com.amazonaws.services.directconnect.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an AWS Direct Connect location.
 * </p>
 */
public class Location implements Serializable {
    /**
     * <p>
     * The code for the location.
     * </p>
     */
    private String locationCode;

    /**
     * <p>
     * The name of the location. This includes the name of the colocation
     * partner and the physical site of the building.
     * </p>
     */
    private String locationName;

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     */
    private java.util.List<String> availablePortSpeeds;

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     */
    private java.util.List<String> availableProviders;

    /**
     * <p>
     * The code for the location.
     * </p>
     *
     * @return <p>
     *         The code for the location.
     *         </p>
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * <p>
     * The code for the location.
     * </p>
     *
     * @param locationCode <p>
     *            The code for the location.
     *            </p>
     */
    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * <p>
     * The code for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param locationCode <p>
     *            The code for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withLocationCode(String locationCode) {
        this.locationCode = locationCode;
        return this;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation
     * partner and the physical site of the building.
     * </p>
     *
     * @return <p>
     *         The name of the location. This includes the name of the
     *         colocation partner and the physical site of the building.
     *         </p>
     */
    public String getLocationName() {
        return locationName;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation
     * partner and the physical site of the building.
     * </p>
     *
     * @param locationName <p>
     *            The name of the location. This includes the name of the
     *            colocation partner and the physical site of the building.
     *            </p>
     */
    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    /**
     * <p>
     * The name of the location. This includes the name of the colocation
     * partner and the physical site of the building.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param locationName <p>
     *            The name of the location. This includes the name of the
     *            colocation partner and the physical site of the building.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withLocationName(String locationName) {
        this.locationName = locationName;
        return this;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     *
     * @return <p>
     *         The AWS Region for the location.
     *         </p>
     */
    public String getRegion() {
        return region;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     *
     * @param region <p>
     *            The AWS Region for the location.
     *            </p>
     */
    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The AWS Region for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param region <p>
     *            The AWS Region for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     *
     * @return <p>
     *         The available port speeds for the location.
     *         </p>
     */
    public java.util.List<String> getAvailablePortSpeeds() {
        return availablePortSpeeds;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     *
     * @param availablePortSpeeds <p>
     *            The available port speeds for the location.
     *            </p>
     */
    public void setAvailablePortSpeeds(java.util.Collection<String> availablePortSpeeds) {
        if (availablePortSpeeds == null) {
            this.availablePortSpeeds = null;
            return;
        }

        this.availablePortSpeeds = new java.util.ArrayList<String>(availablePortSpeeds);
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availablePortSpeeds <p>
     *            The available port speeds for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withAvailablePortSpeeds(String... availablePortSpeeds) {
        if (getAvailablePortSpeeds() == null) {
            this.availablePortSpeeds = new java.util.ArrayList<String>(availablePortSpeeds.length);
        }
        for (String value : availablePortSpeeds) {
            this.availablePortSpeeds.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The available port speeds for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availablePortSpeeds <p>
     *            The available port speeds for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withAvailablePortSpeeds(java.util.Collection<String> availablePortSpeeds) {
        setAvailablePortSpeeds(availablePortSpeeds);
        return this;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     *
     * @return <p>
     *         The name of the service provider for the location.
     *         </p>
     */
    public java.util.List<String> getAvailableProviders() {
        return availableProviders;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     *
     * @param availableProviders <p>
     *            The name of the service provider for the location.
     *            </p>
     */
    public void setAvailableProviders(java.util.Collection<String> availableProviders) {
        if (availableProviders == null) {
            this.availableProviders = null;
            return;
        }

        this.availableProviders = new java.util.ArrayList<String>(availableProviders);
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableProviders <p>
     *            The name of the service provider for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withAvailableProviders(String... availableProviders) {
        if (getAvailableProviders() == null) {
            this.availableProviders = new java.util.ArrayList<String>(availableProviders.length);
        }
        for (String value : availableProviders) {
            this.availableProviders.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The name of the service provider for the location.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param availableProviders <p>
     *            The name of the service provider for the location.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Location withAvailableProviders(java.util.Collection<String> availableProviders) {
        setAvailableProviders(availableProviders);
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
        if (getLocationCode() != null)
            sb.append("locationCode: " + getLocationCode() + ",");
        if (getLocationName() != null)
            sb.append("locationName: " + getLocationName() + ",");
        if (getRegion() != null)
            sb.append("region: " + getRegion() + ",");
        if (getAvailablePortSpeeds() != null)
            sb.append("availablePortSpeeds: " + getAvailablePortSpeeds() + ",");
        if (getAvailableProviders() != null)
            sb.append("availableProviders: " + getAvailableProviders());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocationCode() == null) ? 0 : getLocationCode().hashCode());
        hashCode = prime * hashCode
                + ((getLocationName() == null) ? 0 : getLocationName().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode
                + ((getAvailablePortSpeeds() == null) ? 0 : getAvailablePortSpeeds().hashCode());
        hashCode = prime * hashCode
                + ((getAvailableProviders() == null) ? 0 : getAvailableProviders().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;

        if (other.getLocationCode() == null ^ this.getLocationCode() == null)
            return false;
        if (other.getLocationCode() != null
                && other.getLocationCode().equals(this.getLocationCode()) == false)
            return false;
        if (other.getLocationName() == null ^ this.getLocationName() == null)
            return false;
        if (other.getLocationName() != null
                && other.getLocationName().equals(this.getLocationName()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAvailablePortSpeeds() == null ^ this.getAvailablePortSpeeds() == null)
            return false;
        if (other.getAvailablePortSpeeds() != null
                && other.getAvailablePortSpeeds().equals(this.getAvailablePortSpeeds()) == false)
            return false;
        if (other.getAvailableProviders() == null ^ this.getAvailableProviders() == null)
            return false;
        if (other.getAvailableProviders() != null
                && other.getAvailableProviders().equals(this.getAvailableProviders()) == false)
            return false;
        return true;
    }
}
