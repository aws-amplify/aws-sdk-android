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

package com.amazonaws.services.amazonrelationaldatabaseservice.model;

import java.io.Serializable;

/**
 * <p>
 * Contains the cause of an installation media failure. Installation media is
 * used for a DB engine that requires an on-premises customer provided license,
 * such as Microsoft SQL Server.
 * </p>
 */
public class InstallationMediaFailureCause implements Serializable {
    /**
     * <p>
     * The reason that an installation media import failed.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The reason that an installation media import failed.
     * </p>
     *
     * @return <p>
     *         The reason that an installation media import failed.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The reason that an installation media import failed.
     * </p>
     *
     * @param message <p>
     *            The reason that an installation media import failed.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The reason that an installation media import failed.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The reason that an installation media import failed.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public InstallationMediaFailureCause withMessage(String message) {
        this.message = message;
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
        if (getMessage() != null)
            sb.append("Message: " + getMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstallationMediaFailureCause == false)
            return false;
        InstallationMediaFailureCause other = (InstallationMediaFailureCause) obj;

        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        return true;
    }
}
