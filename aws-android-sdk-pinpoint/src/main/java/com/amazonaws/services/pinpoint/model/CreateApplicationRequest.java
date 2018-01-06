/*
 * Copyright 2010-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Application Request.
 */
public class CreateApplicationRequest implements Serializable {
    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     */
    private String name;

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     *
     * @return The display name of the application. Used in the Amazon Pinpoint
     *         console.
     */
    public String getName() {
        return name;
    }

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     *
     * @param name The display name of the application. Used in the Amazon
     *            Pinpoint console.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * The display name of the application. Used in the Amazon Pinpoint console.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name The display name of the application. Used in the Amazon
     *            Pinpoint console.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationRequest withName(String name) {
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
        if (getName() != null)
            sb.append("Name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationRequest == false)
            return false;
        CreateApplicationRequest other = (CreateApplicationRequest) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
