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
 * A JSON-formatted object that contains the IDs for an Amazon Machine Image
 * (AMI), including the Amazon EC2 AMI ID and the Snowball Edge AMI ID. Each AMI
 * has these two IDs to simplify identifying the AMI in both the AWS Cloud and
 * on the device.
 * </p>
 */
public class Ec2AmiResource implements Serializable {
    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})<br/>
     */
    private String amiId;

    /**
     * <p>
     * The ID of the AMI on the Snowball Edge device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String snowballAmiId;

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})<br/>
     *
     * @return <p>
     *         The ID of the AMI in Amazon EC2.
     *         </p>
     */
    public String getAmiId() {
        return amiId;
    }

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})<br/>
     *
     * @param amiId <p>
     *            The ID of the AMI in Amazon EC2.
     *            </p>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The ID of the AMI in Amazon EC2.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>12 - 21<br/>
     * <b>Pattern: </b>(ami-[0-9a-f]{8})|(ami-[0-9a-f]{17})<br/>
     *
     * @param amiId <p>
     *            The ID of the AMI in Amazon EC2.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2AmiResource withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * <p>
     * The ID of the AMI on the Snowball Edge device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The ID of the AMI on the Snowball Edge device.
     *         </p>
     */
    public String getSnowballAmiId() {
        return snowballAmiId;
    }

    /**
     * <p>
     * The ID of the AMI on the Snowball Edge device.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param snowballAmiId <p>
     *            The ID of the AMI on the Snowball Edge device.
     *            </p>
     */
    public void setSnowballAmiId(String snowballAmiId) {
        this.snowballAmiId = snowballAmiId;
    }

    /**
     * <p>
     * The ID of the AMI on the Snowball Edge device.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param snowballAmiId <p>
     *            The ID of the AMI on the Snowball Edge device.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Ec2AmiResource withSnowballAmiId(String snowballAmiId) {
        this.snowballAmiId = snowballAmiId;
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
        if (getAmiId() != null)
            sb.append("AmiId: " + getAmiId() + ",");
        if (getSnowballAmiId() != null)
            sb.append("SnowballAmiId: " + getSnowballAmiId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode
                + ((getSnowballAmiId() == null) ? 0 : getSnowballAmiId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Ec2AmiResource == false)
            return false;
        Ec2AmiResource other = (Ec2AmiResource) obj;

        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getSnowballAmiId() == null ^ this.getSnowballAmiId() == null)
            return false;
        if (other.getSnowballAmiId() != null
                && other.getSnowballAmiId().equals(this.getSnowballAmiId()) == false)
            return false;
        return true;
    }
}
