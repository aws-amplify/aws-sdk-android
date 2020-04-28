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

package com.amazonaws.services.amazonroute53.model;

import java.io.Serializable;

/**
 * <p>
 * (Private hosted zones only) A complex type that contains information about an
 * Amazon VPC.
 * </p>
 */
public class VPC implements Serializable {
    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     */
    private String vPCRegion;

    /**
     * <p>
     * (Private hosted zones only) The ID of an Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     */
    private String vPCId;

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     *
     * @return <p>
     *         (Private hosted zones only) The region that an Amazon VPC was
     *         created in.
     *         </p>
     * @see VPCRegion
     */
    public String getVPCRegion() {
        return vPCRegion;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     *
     * @param vPCRegion <p>
     *            (Private hosted zones only) The region that an Amazon VPC was
     *            created in.
     *            </p>
     * @see VPCRegion
     */
    public void setVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     *
     * @param vPCRegion <p>
     *            (Private hosted zones only) The region that an Amazon VPC was
     *            created in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VPCRegion
     */
    public VPC withVPCRegion(String vPCRegion) {
        this.vPCRegion = vPCRegion;
        return this;
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     *
     * @param vPCRegion <p>
     *            (Private hosted zones only) The region that an Amazon VPC was
     *            created in.
     *            </p>
     * @see VPCRegion
     */
    public void setVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
    }

    /**
     * <p>
     * (Private hosted zones only) The region that an Amazon VPC was created in.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     * <b>Allowed Values: </b>us-east-1, us-east-2, us-west-1, us-west-2,
     * eu-west-1, eu-west-2, eu-west-3, eu-central-1, ap-east-1, me-south-1,
     * us-gov-west-1, us-gov-east-1, us-iso-east-1, us-isob-east-1,
     * ap-southeast-1, ap-southeast-2, ap-south-1, ap-northeast-1,
     * ap-northeast-2, ap-northeast-3, eu-north-1, sa-east-1, ca-central-1,
     * cn-north-1, af-south-1
     *
     * @param vPCRegion <p>
     *            (Private hosted zones only) The region that an Amazon VPC was
     *            created in.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see VPCRegion
     */
    public VPC withVPCRegion(VPCRegion vPCRegion) {
        this.vPCRegion = vPCRegion.toString();
        return this;
    }

    /**
     * <p>
     * (Private hosted zones only) The ID of an Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @return <p>
     *         (Private hosted zones only) The ID of an Amazon VPC.
     *         </p>
     */
    public String getVPCId() {
        return vPCId;
    }

    /**
     * <p>
     * (Private hosted zones only) The ID of an Amazon VPC.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param vPCId <p>
     *            (Private hosted zones only) The ID of an Amazon VPC.
     *            </p>
     */
    public void setVPCId(String vPCId) {
        this.vPCId = vPCId;
    }

    /**
     * <p>
     * (Private hosted zones only) The ID of an Amazon VPC.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     *
     * @param vPCId <p>
     *            (Private hosted zones only) The ID of an Amazon VPC.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public VPC withVPCId(String vPCId) {
        this.vPCId = vPCId;
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
        if (getVPCRegion() != null)
            sb.append("VPCRegion: " + getVPCRegion() + ",");
        if (getVPCId() != null)
            sb.append("VPCId: " + getVPCId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVPCRegion() == null) ? 0 : getVPCRegion().hashCode());
        hashCode = prime * hashCode + ((getVPCId() == null) ? 0 : getVPCId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VPC == false)
            return false;
        VPC other = (VPC) obj;

        if (other.getVPCRegion() == null ^ this.getVPCRegion() == null)
            return false;
        if (other.getVPCRegion() != null
                && other.getVPCRegion().equals(this.getVPCRegion()) == false)
            return false;
        if (other.getVPCId() == null ^ this.getVPCId() == null)
            return false;
        if (other.getVPCId() != null && other.getVPCId().equals(this.getVPCId()) == false)
            return false;
        return true;
    }
}
