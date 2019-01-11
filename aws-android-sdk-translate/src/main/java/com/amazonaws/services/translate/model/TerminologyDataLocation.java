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

package com.amazonaws.services.translate.model;

import java.io.Serializable;

/**
 * <p>
 * The location of the custom terminology data.
 * </p>
 */
public class TerminologyDataLocation implements Serializable {
    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String repositoryType;

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     */
    private String location;

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         The repository type for the custom terminology data.
     *         </p>
     */
    public String getRepositoryType() {
        return repositoryType;
    }

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param repositoryType <p>
     *            The repository type for the custom terminology data.
     *            </p>
     */
    public void setRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
    }

    /**
     * <p>
     * The repository type for the custom terminology data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param repositoryType <p>
     *            The repository type for the custom terminology data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyDataLocation withRepositoryType(String repositoryType) {
        this.repositoryType = repositoryType;
        return this;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @return <p>
     *         The location of the custom terminology data.
     *         </p>
     */
    public String getLocation() {
        return location;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param location <p>
     *            The location of the custom terminology data.
     *            </p>
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The location of the custom terminology data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 10000<br/>
     * <b>Pattern: </b>[\P{M}\p{M}]{0,10000}<br/>
     *
     * @param location <p>
     *            The location of the custom terminology data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TerminologyDataLocation withLocation(String location) {
        this.location = location;
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
        if (getRepositoryType() != null)
            sb.append("RepositoryType: " + getRepositoryType() + ",");
        if (getLocation() != null)
            sb.append("Location: " + getLocation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getRepositoryType() == null) ? 0 : getRepositoryType().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TerminologyDataLocation == false)
            return false;
        TerminologyDataLocation other = (TerminologyDataLocation) obj;

        if (other.getRepositoryType() == null ^ this.getRepositoryType() == null)
            return false;
        if (other.getRepositoryType() != null
                && other.getRepositoryType().equals(this.getRepositoryType()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        return true;
    }
}
