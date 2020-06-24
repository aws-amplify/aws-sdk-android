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

package com.amazonaws.services.codecommit.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the output of a put repository triggers operation.
 * </p>
 */
public class PutRepositoryTriggersResult implements Serializable {
    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     */
    private String configurationId;

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     *
     * @return <p>
     *         The system-generated unique ID for the create or update
     *         operation.
     *         </p>
     */
    public String getConfigurationId() {
        return configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     *
     * @param configurationId <p>
     *            The system-generated unique ID for the create or update
     *            operation.
     *            </p>
     */
    public void setConfigurationId(String configurationId) {
        this.configurationId = configurationId;
    }

    /**
     * <p>
     * The system-generated unique ID for the create or update operation.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param configurationId <p>
     *            The system-generated unique ID for the create or update
     *            operation.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PutRepositoryTriggersResult withConfigurationId(String configurationId) {
        this.configurationId = configurationId;
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
        if (getConfigurationId() != null)
            sb.append("configurationId: " + getConfigurationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getConfigurationId() == null) ? 0 : getConfigurationId().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutRepositoryTriggersResult == false)
            return false;
        PutRepositoryTriggersResult other = (PutRepositoryTriggersResult) obj;

        if (other.getConfigurationId() == null ^ this.getConfigurationId() == null)
            return false;
        if (other.getConfigurationId() != null
                && other.getConfigurationId().equals(this.getConfigurationId()) == false)
            return false;
        return true;
    }
}
