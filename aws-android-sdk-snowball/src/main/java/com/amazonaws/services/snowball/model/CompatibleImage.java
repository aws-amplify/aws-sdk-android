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
 * A JSON-formatted object that describes a compatible Amazon Machine Image
 * (AMI), including the ID and name for a Snowball Edge AMI. This AMI is
 * compatible with the device's physical hardware requirements, and it should be
 * able to be run in an SBE1 instance on the device.
 * </p>
 */
public class CompatibleImage implements Serializable {
    /**
     * <p>
     * The unique identifier for an individual Snowball Edge AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String amiId;

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String name;

    /**
     * <p>
     * The unique identifier for an individual Snowball Edge AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The unique identifier for an individual Snowball Edge AMI.
     *         </p>
     */
    public String getAmiId() {
        return amiId;
    }

    /**
     * <p>
     * The unique identifier for an individual Snowball Edge AMI.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param amiId <p>
     *            The unique identifier for an individual Snowball Edge AMI.
     *            </p>
     */
    public void setAmiId(String amiId) {
        this.amiId = amiId;
    }

    /**
     * <p>
     * The unique identifier for an individual Snowball Edge AMI.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param amiId <p>
     *            The unique identifier for an individual Snowball Edge AMI.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleImage withAmiId(String amiId) {
        this.amiId = amiId;
        return this;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         The optional name of a compatible image.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The optional name of a compatible image.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The optional name of a compatible image.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param name <p>
     *            The optional name of a compatible image.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CompatibleImage withName(String name) {
        this.name = name;
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmiId() == null) ? 0 : getAmiId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompatibleImage == false)
            return false;
        CompatibleImage other = (CompatibleImage) obj;

        if (other.getAmiId() == null ^ this.getAmiId() == null)
            return false;
        if (other.getAmiId() != null && other.getAmiId().equals(this.getAmiId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
