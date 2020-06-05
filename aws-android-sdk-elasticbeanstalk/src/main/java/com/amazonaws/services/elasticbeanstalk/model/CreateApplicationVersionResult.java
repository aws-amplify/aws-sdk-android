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
 * Result message wrapping a single description of an application version.
 * </p>
 */
public class CreateApplicationVersionResult implements Serializable {
    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     */
    private ApplicationVersionDescription applicationVersion;

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     *
     * @return <p>
     *         The <a>ApplicationVersionDescription</a> of the application
     *         version.
     *         </p>
     */
    public ApplicationVersionDescription getApplicationVersion() {
        return applicationVersion;
    }

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     *
     * @param applicationVersion <p>
     *            The <a>ApplicationVersionDescription</a> of the application
     *            version.
     *            </p>
     */
    public void setApplicationVersion(ApplicationVersionDescription applicationVersion) {
        this.applicationVersion = applicationVersion;
    }

    /**
     * <p>
     * The <a>ApplicationVersionDescription</a> of the application version.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationVersion <p>
     *            The <a>ApplicationVersionDescription</a> of the application
     *            version.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateApplicationVersionResult withApplicationVersion(
            ApplicationVersionDescription applicationVersion) {
        this.applicationVersion = applicationVersion;
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
        if (getApplicationVersion() != null)
            sb.append("ApplicationVersion: " + getApplicationVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getApplicationVersion() == null) ? 0 : getApplicationVersion().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateApplicationVersionResult == false)
            return false;
        CreateApplicationVersionResult other = (CreateApplicationVersionResult) obj;

        if (other.getApplicationVersion() == null ^ this.getApplicationVersion() == null)
            return false;
        if (other.getApplicationVersion() != null
                && other.getApplicationVersion().equals(this.getApplicationVersion()) == false)
            return false;
        return true;
    }
}
