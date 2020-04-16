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

package com.amazonaws.services.ec2imagebuilder.model;

import java.io.Serializable;

/**
 * <p>
 * The resources produced by this image.
 * </p>
 */
public class OutputResources implements Serializable {
    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     */
    private java.util.List<Ami> amis;

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     *
     * @return <p>
     *         The EC2 AMIs created by this image.
     *         </p>
     */
    public java.util.List<Ami> getAmis() {
        return amis;
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     *
     * @param amis <p>
     *            The EC2 AMIs created by this image.
     *            </p>
     */
    public void setAmis(java.util.Collection<Ami> amis) {
        if (amis == null) {
            this.amis = null;
            return;
        }

        this.amis = new java.util.ArrayList<Ami>(amis);
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amis <p>
     *            The EC2 AMIs created by this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputResources withAmis(Ami... amis) {
        if (getAmis() == null) {
            this.amis = new java.util.ArrayList<Ami>(amis.length);
        }
        for (Ami value : amis) {
            this.amis.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The EC2 AMIs created by this image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param amis <p>
     *            The EC2 AMIs created by this image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OutputResources withAmis(java.util.Collection<Ami> amis) {
        setAmis(amis);
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
        if (getAmis() != null)
            sb.append("amis: " + getAmis());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmis() == null) ? 0 : getAmis().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OutputResources == false)
            return false;
        OutputResources other = (OutputResources) obj;

        if (other.getAmis() == null ^ this.getAmis() == null)
            return false;
        if (other.getAmis() != null && other.getAmis().equals(this.getAmis()) == false)
            return false;
        return true;
    }
}
