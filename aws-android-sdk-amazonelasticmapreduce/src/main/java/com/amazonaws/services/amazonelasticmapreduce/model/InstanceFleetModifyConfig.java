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

package com.amazonaws.services.amazonelasticmapreduce.model;

import java.io.Serializable;

/**
 * <p>
 * Configuration parameters for an instance fleet modification request.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions
 * 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 */
public class InstanceFleetModifyConfig implements Serializable {
    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     */
    private String instanceFleetId;

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more
     * information see <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer targetOnDemandCapacity;

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more
     * information, see <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     */
    private Integer targetSpotCapacity;

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     *
     * @return <p>
     *         A unique identifier for the instance fleet.
     *         </p>
     */
    public String getInstanceFleetId() {
        return instanceFleetId;
    }

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     *
     * @param instanceFleetId <p>
     *            A unique identifier for the instance fleet.
     *            </p>
     */
    public void setInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
    }

    /**
     * <p>
     * A unique identifier for the instance fleet.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param instanceFleetId <p>
     *            A unique identifier for the instance fleet.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetModifyConfig withInstanceFleetId(String instanceFleetId) {
        this.instanceFleetId = instanceFleetId;
        return this;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more
     * information see <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The target capacity of On-Demand units for the instance fleet.
     *         For more information see
     *         <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     *         </p>
     */
    public Integer getTargetOnDemandCapacity() {
        return targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more
     * information see <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetOnDemandCapacity <p>
     *            The target capacity of On-Demand units for the instance fleet.
     *            For more information see
     *            <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     *            </p>
     */
    public void setTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
    }

    /**
     * <p>
     * The target capacity of On-Demand units for the instance fleet. For more
     * information see <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetOnDemandCapacity <p>
     *            The target capacity of On-Demand units for the instance fleet.
     *            For more information see
     *            <a>InstanceFleetConfig$TargetOnDemandCapacity</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetModifyConfig withTargetOnDemandCapacity(Integer targetOnDemandCapacity) {
        this.targetOnDemandCapacity = targetOnDemandCapacity;
        return this;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more
     * information, see <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @return <p>
     *         The target capacity of Spot units for the instance fleet. For
     *         more information, see
     *         <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     *         </p>
     */
    public Integer getTargetSpotCapacity() {
        return targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more
     * information, see <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetSpotCapacity <p>
     *            The target capacity of Spot units for the instance fleet. For
     *            more information, see
     *            <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     *            </p>
     */
    public void setTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
    }

    /**
     * <p>
     * The target capacity of Spot units for the instance fleet. For more
     * information, see <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - <br/>
     *
     * @param targetSpotCapacity <p>
     *            The target capacity of Spot units for the instance fleet. For
     *            more information, see
     *            <a>InstanceFleetConfig$TargetSpotCapacity</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstanceFleetModifyConfig withTargetSpotCapacity(Integer targetSpotCapacity) {
        this.targetSpotCapacity = targetSpotCapacity;
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
        if (getInstanceFleetId() != null)
            sb.append("InstanceFleetId: " + getInstanceFleetId() + ",");
        if (getTargetOnDemandCapacity() != null)
            sb.append("TargetOnDemandCapacity: " + getTargetOnDemandCapacity() + ",");
        if (getTargetSpotCapacity() != null)
            sb.append("TargetSpotCapacity: " + getTargetSpotCapacity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getInstanceFleetId() == null) ? 0 : getInstanceFleetId().hashCode());
        hashCode = prime
                * hashCode
                + ((getTargetOnDemandCapacity() == null) ? 0 : getTargetOnDemandCapacity()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTargetSpotCapacity() == null) ? 0 : getTargetSpotCapacity().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceFleetModifyConfig == false)
            return false;
        InstanceFleetModifyConfig other = (InstanceFleetModifyConfig) obj;

        if (other.getInstanceFleetId() == null ^ this.getInstanceFleetId() == null)
            return false;
        if (other.getInstanceFleetId() != null
                && other.getInstanceFleetId().equals(this.getInstanceFleetId()) == false)
            return false;
        if (other.getTargetOnDemandCapacity() == null ^ this.getTargetOnDemandCapacity() == null)
            return false;
        if (other.getTargetOnDemandCapacity() != null
                && other.getTargetOnDemandCapacity().equals(this.getTargetOnDemandCapacity()) == false)
            return false;
        if (other.getTargetSpotCapacity() == null ^ this.getTargetSpotCapacity() == null)
            return false;
        if (other.getTargetSpotCapacity() != null
                && other.getTargetSpotCapacity().equals(this.getTargetSpotCapacity()) == false)
            return false;
        return true;
    }
}
