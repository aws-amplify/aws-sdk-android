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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Describes the locations in which a given accelerator type or set of types is
 * present in a given region.
 * </p>
 */
public class DescribeAcceleratorOfferingsRequest extends AmazonWebServiceRequest implements
        Serializable {
    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     */
    private String locationType;

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     */
    private java.util.List<String> acceleratorTypes;

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @return <p>
     *         The location type that you want to describe accelerator type
     *         offerings for. It can assume the following values: region: will
     *         return the accelerator type offering at the regional level.
     *         availability-zone: will return the accelerator type offering at
     *         the availability zone level. availability-zone-id: will return
     *         the accelerator type offering at the availability zone level
     *         returning the availability zone id.
     *         </p>
     * @see LocationType
     */
    public String getLocationType() {
        return locationType;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type that you want to describe accelerator type
     *            offerings for. It can assume the following values: region:
     *            will return the accelerator type offering at the regional
     *            level. availability-zone: will return the accelerator type
     *            offering at the availability zone level. availability-zone-id:
     *            will return the accelerator type offering at the availability
     *            zone level returning the availability zone id.
     *            </p>
     * @see LocationType
     */
    public void setLocationType(String locationType) {
        this.locationType = locationType;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
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
     *            The location type that you want to describe accelerator type
     *            offerings for. It can assume the following values: region:
     *            will return the accelerator type offering at the regional
     *            level. availability-zone: will return the accelerator type
     *            offering at the availability zone level. availability-zone-id:
     *            will return the accelerator type offering at the availability
     *            zone level returning the availability zone id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationType
     */
    public DescribeAcceleratorOfferingsRequest withLocationType(String locationType) {
        this.locationType = locationType;
        return this;
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     * <b>Allowed Values: </b>region, availability-zone, availability-zone-id
     *
     * @param locationType <p>
     *            The location type that you want to describe accelerator type
     *            offerings for. It can assume the following values: region:
     *            will return the accelerator type offering at the regional
     *            level. availability-zone: will return the accelerator type
     *            offering at the availability zone level. availability-zone-id:
     *            will return the accelerator type offering at the availability
     *            zone level returning the availability zone id.
     *            </p>
     * @see LocationType
     */
    public void setLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
    }

    /**
     * <p>
     * The location type that you want to describe accelerator type offerings
     * for. It can assume the following values: region: will return the
     * accelerator type offering at the regional level. availability-zone: will
     * return the accelerator type offering at the availability zone level.
     * availability-zone-id: will return the accelerator type offering at the
     * availability zone level returning the availability zone id.
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
     *            The location type that you want to describe accelerator type
     *            offerings for. It can assume the following values: region:
     *            will return the accelerator type offering at the regional
     *            level. availability-zone: will return the accelerator type
     *            offering at the availability zone level. availability-zone-id:
     *            will return the accelerator type offering at the availability
     *            zone level returning the availability zone id.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LocationType
     */
    public DescribeAcceleratorOfferingsRequest withLocationType(LocationType locationType) {
        this.locationType = locationType.toString();
        return this;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     *
     * @return <p>
     *         The list of accelerator types to describe.
     *         </p>
     */
    public java.util.List<String> getAcceleratorTypes() {
        return acceleratorTypes;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     *
     * @param acceleratorTypes <p>
     *            The list of accelerator types to describe.
     *            </p>
     */
    public void setAcceleratorTypes(java.util.Collection<String> acceleratorTypes) {
        if (acceleratorTypes == null) {
            this.acceleratorTypes = null;
            return;
        }

        this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes);
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            The list of accelerator types to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorOfferingsRequest withAcceleratorTypes(String... acceleratorTypes) {
        if (getAcceleratorTypes() == null) {
            this.acceleratorTypes = new java.util.ArrayList<String>(acceleratorTypes.length);
        }
        for (String value : acceleratorTypes) {
            this.acceleratorTypes.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of accelerator types to describe.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param acceleratorTypes <p>
     *            The list of accelerator types to describe.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeAcceleratorOfferingsRequest withAcceleratorTypes(
            java.util.Collection<String> acceleratorTypes) {
        setAcceleratorTypes(acceleratorTypes);
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
        if (getLocationType() != null)
            sb.append("locationType: " + getLocationType() + ",");
        if (getAcceleratorTypes() != null)
            sb.append("acceleratorTypes: " + getAcceleratorTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getLocationType() == null) ? 0 : getLocationType().hashCode());
        hashCode = prime * hashCode
                + ((getAcceleratorTypes() == null) ? 0 : getAcceleratorTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAcceleratorOfferingsRequest == false)
            return false;
        DescribeAcceleratorOfferingsRequest other = (DescribeAcceleratorOfferingsRequest) obj;

        if (other.getLocationType() == null ^ this.getLocationType() == null)
            return false;
        if (other.getLocationType() != null
                && other.getLocationType().equals(this.getLocationType()) == false)
            return false;
        if (other.getAcceleratorTypes() == null ^ this.getAcceleratorTypes() == null)
            return false;
        if (other.getAcceleratorTypes() != null
                && other.getAcceleratorTypes().equals(this.getAcceleratorTypes()) == false)
            return false;
        return true;
    }
}
