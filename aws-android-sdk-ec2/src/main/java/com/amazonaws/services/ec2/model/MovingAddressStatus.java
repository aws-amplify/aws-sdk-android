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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the status of a moving Elastic IP address.
 * </p>
 */
public class MovingAddressStatus implements Serializable {
    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     */
    private String moveStatus;

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     */
    private String publicIp;

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @return <p>
     *         The status of the Elastic IP address that's being moved to the
     *         EC2-VPC platform, or restored to the EC2-Classic platform.
     *         </p>
     * @see MoveStatus
     */
    public String getMoveStatus() {
        return moveStatus;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus <p>
     *            The status of the Elastic IP address that's being moved to the
     *            EC2-VPC platform, or restored to the EC2-Classic platform.
     *            </p>
     * @see MoveStatus
     */
    public void setMoveStatus(String moveStatus) {
        this.moveStatus = moveStatus;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus <p>
     *            The status of the Elastic IP address that's being moved to the
     *            EC2-VPC platform, or restored to the EC2-Classic platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MoveStatus
     */
    public MovingAddressStatus withMoveStatus(String moveStatus) {
        this.moveStatus = moveStatus;
        return this;
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus <p>
     *            The status of the Elastic IP address that's being moved to the
     *            EC2-VPC platform, or restored to the EC2-Classic platform.
     *            </p>
     * @see MoveStatus
     */
    public void setMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus.toString();
    }

    /**
     * <p>
     * The status of the Elastic IP address that's being moved to the EC2-VPC
     * platform, or restored to the EC2-Classic platform.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>movingToVpc, restoringToClassic
     *
     * @param moveStatus <p>
     *            The status of the Elastic IP address that's being moved to the
     *            EC2-VPC platform, or restored to the EC2-Classic platform.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see MoveStatus
     */
    public MovingAddressStatus withMoveStatus(MoveStatus moveStatus) {
        this.moveStatus = moveStatus.toString();
        return this;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     *
     * @return <p>
     *         The Elastic IP address.
     *         </p>
     */
    public String getPublicIp() {
        return publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     *
     * @param publicIp <p>
     *            The Elastic IP address.
     *            </p>
     */
    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    /**
     * <p>
     * The Elastic IP address.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param publicIp <p>
     *            The Elastic IP address.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public MovingAddressStatus withPublicIp(String publicIp) {
        this.publicIp = publicIp;
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
        if (getMoveStatus() != null)
            sb.append("MoveStatus: " + getMoveStatus() + ",");
        if (getPublicIp() != null)
            sb.append("PublicIp: " + getPublicIp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMoveStatus() == null) ? 0 : getMoveStatus().hashCode());
        hashCode = prime * hashCode + ((getPublicIp() == null) ? 0 : getPublicIp().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MovingAddressStatus == false)
            return false;
        MovingAddressStatus other = (MovingAddressStatus) obj;

        if (other.getMoveStatus() == null ^ this.getMoveStatus() == null)
            return false;
        if (other.getMoveStatus() != null
                && other.getMoveStatus().equals(this.getMoveStatus()) == false)
            return false;
        if (other.getPublicIp() == null ^ this.getPublicIp() == null)
            return false;
        if (other.getPublicIp() != null && other.getPublicIp().equals(this.getPublicIp()) == false)
            return false;
        return true;
    }
}
