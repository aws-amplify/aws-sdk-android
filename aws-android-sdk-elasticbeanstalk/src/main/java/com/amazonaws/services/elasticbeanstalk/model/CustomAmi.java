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

package com.amazonaws.services.elasticbeanstalk.model;

import java.io.Serializable;

/**
 * <p>
 * A custom AMI available to platforms.
 * </p>
 */
public class CustomAmi implements Serializable {
    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     */
    private String virtualizationType;

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     */
    private String imageId;

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     *
     * @return <p>
     *         The type of virtualization used to create the custom AMI.
     *         </p>
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     *
     * @param virtualizationType <p>
     *            The type of virtualization used to create the custom AMI.
     *            </p>
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization used to create the custom AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param virtualizationType <p>
     *            The type of virtualization used to create the custom AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAmi withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     *
     * @return <p>
     *         THe ID of the image used to create the custom AMI.
     *         </p>
     */
    public String getImageId() {
        return imageId;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     *
     * @param imageId <p>
     *            THe ID of the image used to create the custom AMI.
     *            </p>
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * THe ID of the image used to create the custom AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param imageId <p>
     *            THe ID of the image used to create the custom AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CustomAmi withImageId(String imageId) {
        this.imageId = imageId;
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
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getImageId() != null)
            sb.append("ImageId: " + getImageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CustomAmi == false)
            return false;
        CustomAmi other = (CustomAmi) obj;

        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null
                && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        return true;
    }
}
