/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;

/**
 * Application Response.
 */
public class ApplicationResponse implements Serializable {
    /**
     * The unique application ID.
     */
    private String id;

    /**
     * The display name of the application.
     */
    private String name;

    /**
     * The unique application ID.
     *
     * @return The unique application ID.
     */
    public String getId() {
        return id;
    }

    /**
     * The unique application ID.
     *
     * @param id The unique application ID.
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * The unique application ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param id The unique application ID.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * The display name of the application.
     *
     * @return The display name of the application.
     */
    public String getName() {
        return name;
    }

    /**
     * The display name of the application.
     *
     * @param name The display name of the application.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The display name of the application.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The display name of the application.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ApplicationResponse withName(String name) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationResponse == false)
            return false;
        ApplicationResponse other = (ApplicationResponse) obj;

        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
