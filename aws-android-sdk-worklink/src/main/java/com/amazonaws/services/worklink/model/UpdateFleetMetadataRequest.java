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

package com.amazonaws.services.worklink.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates fleet metadata, such as DisplayName.
 * </p>
 */
public class UpdateFleetMetadataRequest extends AmazonWebServiceRequest implements Serializable {
    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     */
    private String fleetArn;

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is
     * passed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     */
    private String displayName;

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through
     * the closest AWS Region to users, which may be outside of your home
     * Region.
     * </p>
     */
    private Boolean optimizeForEndUserLocation;

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @return <p>
     *         The ARN of the fleet.
     *         </p>
     */
    public String getFleetArn() {
        return fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     */
    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The ARN of the fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>20 - 2048<br/>
     *
     * @param fleetArn <p>
     *            The ARN of the fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFleetMetadataRequest withFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
        return this;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is
     * passed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @return <p>
     *         The fleet name to display. The existing DisplayName is unset if
     *         null is passed.
     *         </p>
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is
     * passed.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The fleet name to display. The existing DisplayName is unset
     *            if null is passed.
     *            </p>
     */
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The fleet name to display. The existing DisplayName is unset if null is
     * passed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 100<br/>
     *
     * @param displayName <p>
     *            The fleet name to display. The existing DisplayName is unset
     *            if null is passed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFleetMetadataRequest withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through
     * the closest AWS Region to users, which may be outside of your home
     * Region.
     * </p>
     *
     * @return <p>
     *         The option to optimize for better performance by routing traffic
     *         through the closest AWS Region to users, which may be outside of
     *         your home Region.
     *         </p>
     */
    public Boolean isOptimizeForEndUserLocation() {
        return optimizeForEndUserLocation;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through
     * the closest AWS Region to users, which may be outside of your home
     * Region.
     * </p>
     *
     * @return <p>
     *         The option to optimize for better performance by routing traffic
     *         through the closest AWS Region to users, which may be outside of
     *         your home Region.
     *         </p>
     */
    public Boolean getOptimizeForEndUserLocation() {
        return optimizeForEndUserLocation;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through
     * the closest AWS Region to users, which may be outside of your home
     * Region.
     * </p>
     *
     * @param optimizeForEndUserLocation <p>
     *            The option to optimize for better performance by routing
     *            traffic through the closest AWS Region to users, which may be
     *            outside of your home Region.
     *            </p>
     */
    public void setOptimizeForEndUserLocation(Boolean optimizeForEndUserLocation) {
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
    }

    /**
     * <p>
     * The option to optimize for better performance by routing traffic through
     * the closest AWS Region to users, which may be outside of your home
     * Region.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param optimizeForEndUserLocation <p>
     *            The option to optimize for better performance by routing
     *            traffic through the closest AWS Region to users, which may be
     *            outside of your home Region.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public UpdateFleetMetadataRequest withOptimizeForEndUserLocation(
            Boolean optimizeForEndUserLocation) {
        this.optimizeForEndUserLocation = optimizeForEndUserLocation;
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
        if (getFleetArn() != null)
            sb.append("FleetArn: " + getFleetArn() + ",");
        if (getDisplayName() != null)
            sb.append("DisplayName: " + getDisplayName() + ",");
        if (getOptimizeForEndUserLocation() != null)
            sb.append("OptimizeForEndUserLocation: " + getOptimizeForEndUserLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode
                + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime
                * hashCode
                + ((getOptimizeForEndUserLocation() == null) ? 0 : getOptimizeForEndUserLocation()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateFleetMetadataRequest == false)
            return false;
        UpdateFleetMetadataRequest other = (UpdateFleetMetadataRequest) obj;

        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null
                && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getOptimizeForEndUserLocation() == null
                ^ this.getOptimizeForEndUserLocation() == null)
            return false;
        if (other.getOptimizeForEndUserLocation() != null
                && other.getOptimizeForEndUserLocation().equals(
                        this.getOptimizeForEndUserLocation()) == false)
            return false;
        return true;
    }
}
