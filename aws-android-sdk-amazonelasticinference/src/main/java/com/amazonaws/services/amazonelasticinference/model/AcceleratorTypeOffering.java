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

package com.amazonaws.services.amazonelasticinference.model;

import java.io.Serializable;

/**
 * <p>
 * The offering for an Elastic Inference Accelerator type.
 * </p>
 */
public class AcceleratorTypeOffering implements Serializable {
    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     */
    private String acceleratorType;

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     */
    private String locationType;

    /**
     * <p>
     * The location for the offering. It will return either the region,
     * availability zone or availability zone id for the offering depending on
     * the locationType value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String location;

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @return <p>
     *         The name of the Elastic Inference Accelerator type.
     *         </p>
     */
    public String getAcceleratorType() {
        return acceleratorType;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorType <p>
     *            The name of the Elastic Inference Accelerator type.
     *            </p>
     */
    public void setAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
    }

    /**
     * <p>
     * The name of the Elastic Inference Accelerator type.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Pattern: </b>^\S+$<br/>
     *
     * @param acceleratorType <p>
     *            The name of the Elastic Inference Accelerator type.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorTypeOffering withAcceleratorType(String acceleratorType) {
        this.acceleratorType = acceleratorType;
        return this;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @return <p>
     *         The location type for the offering. It can assume the following
     *         values: region: defines that the offering is at the regional
     *         level. availability-zone: defines that the offering is at the
     *         availability zone level. availability-zone-id: defines that the
     *         offering is at the availability zone level, defined by the
     *         availability zone id.
     *         </p>
     * @see LocationType
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type for the offering. It can assume the
     *            following values: region: defines that the offering is at the
     *            regional level. availability-zone: defines that the offering
     *            is at the availability zone level. availability-zone-id:
     *            defines that the offering is at the availability zone level,
     *            defined by the availability zone id.
     *            </p>
     * @see LocationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type for the offering. It can assume the
     *            following values: region: defines that the offering is at the
     *            regional level. availability-zone: defines that the offering
     *            is at the availability zone level. availability-zone-id:
     *            defines that the offering is at the availability zone level,
     *            defined by the availability zone id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationType
     */
    public AcceleratorTypeOffering withLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type for the offering. It can assume the
     *            following values: region: defines that the offering is at the
     *            regional level. availability-zone: defines that the offering
     *            is at the availability zone level. availability-zone-id:
     *            defines that the offering is at the availability zone level,
     *            defined by the availability zone id.
     *            </p>
     * @see LocationType
     */
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
    }

    /**
     * <p>
     * The location type for the offering. It can assume the following values:
     * region: defines that the offering is at the regional level.
     * availability-zone: defines that the offering is at the availability zone
     * level. availability-zone-id: defines that the offering is at the
     * availability zone level, defined by the availability zone id.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type for the offering. It can assume the
     *            following values: region: defines that the offering is at the
     *            regional level. availability-zone: defines that the offering
     *            is at the availability zone level. availability-zone-id:
     *            defines that the offering is at the availability zone level,
     *            defined by the availability zone id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationType
     */
    public AcceleratorTypeOffering withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region,
     * availability zone or availability zone id for the offering depending on
     * the locationType value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return <p>
     *         The location for the offering. It will return either the region,
     *         availability zone or availability zone id for the offering
     *         depending on the locationType value.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region,
     * availability zone or availability zone id for the offering depending on
     * the locationType value.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param location <p>
     *            The location for the offering. It will return either the
     *            region, availability zone or availability zone id for the
     *            offering depending on the locationType value.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location for the offering. It will return either the region,
     * availability zone or availability zone id for the offering depending on
     * the locationType value.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param location <p>
     *            The location for the offering. It will return either the
     *            region, availability zone or availability zone id for the
     *            offering depending on the locationType value.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AcceleratorTypeOffering withLocation(String location) {
        this.location = location;
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
        if (getAcceleratorType() != null)
            sb.append("acceleratorType: " + getAcceleratorType() + ",");
        if (getLocationType() != null)
            sb.append("locationType: " + getLocationType() + ",");
        if (getLocation() != null)
            sb.append("location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getAcceleratorType() == null) ? 0 : getAcceleratorType().hashCode());
        hashCode = prime * hashCode
                + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AcceleratorTypeOffering == false)
            return false;
        AcceleratorTypeOffering other = (AcceleratorTypeOffering) obj;

        if (other.getAcceleratorType() == null ^ this.getAcceleratorType() == null)
            return false;
        if (other.getAcceleratorType() != null
                && other.getAcceleratorType().equals(this.getAcceleratorType()) == false)
            return false;
        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null
                && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
