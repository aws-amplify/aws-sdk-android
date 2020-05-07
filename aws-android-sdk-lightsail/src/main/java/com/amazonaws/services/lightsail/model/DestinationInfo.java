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

package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the destination of a record.
 * </p>
 */
public class DestinationInfo implements Serializable {
    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String id;

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     */
    private String service;

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The ID of the resource created at the destination.
     *         </p>
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the resource created at the destination.
     *            </p>
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The ID of the resource created at the destination.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param id <p>
     *            The ID of the resource created at the destination.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DestinationInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @return <p>
     *         The destination service of the record.
     *         </p>
     */
    public String getService() {
        return service;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param service <p>
     *            The destination service of the record.
     *            </p>
     */
    public void setService(String service) {
        this.service = service;
    }

    /**
     * <p>
     * The destination service of the record.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>.*\S.*<br/>
     *
     * @param service <p>
     *            The destination service of the record.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DestinationInfo withService(String service) {
        this.service = service;
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
        if (getId() != null)
            sb.append("id: " + getId() + ",");
        if (getService() != null)
            sb.append("service: " + getService());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getService() == null) ? 0 : getService().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DestinationInfo == false)
            return false;
        DestinationInfo other = (DestinationInfo) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getService() == null ^ this.getService() == null)
            return false;
        if (other.getService() != null && other.getService().equals(this.getService()) == false)
            return false;
        return true;
    }
}
