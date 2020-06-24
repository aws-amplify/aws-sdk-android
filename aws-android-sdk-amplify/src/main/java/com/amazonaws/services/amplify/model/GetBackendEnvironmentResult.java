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

package com.amazonaws.services.amplify.model;

import java.io.Serializable;

/**
 * <p>
 * The result structure for the get backend environment result.
 * </p>
 */
public class GetBackendEnvironmentResult implements Serializable {
    /**
     * <p>
     * Describes the backend environment for an Amplify app.
     * </p>
     */
    private BackendEnvironment backendEnvironment;

    /**
     * <p>
     * Describes the backend environment for an Amplify app.
     * </p>
     *
     * @return <p>
     *         Describes the backend environment for an Amplify app.
     *         </p>
     */
    public BackendEnvironment getBackendEnvironment() {
        return backendEnvironment;
    }

    /**
     * <p>
     * Describes the backend environment for an Amplify app.
     * </p>
     *
     * @param backendEnvironment <p>
     *            Describes the backend environment for an Amplify app.
     *            </p>
     */
    public void setBackendEnvironment(BackendEnvironment backendEnvironment) {
        this.backendEnvironment = backendEnvironment;
    }

    /**
     * <p>
     * Describes the backend environment for an Amplify app.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param backendEnvironment <p>
     *            Describes the backend environment for an Amplify app.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public GetBackendEnvironmentResult withBackendEnvironment(BackendEnvironment backendEnvironment) {
        this.backendEnvironment = backendEnvironment;
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
        if (getBackendEnvironment() != null)
            sb.append("backendEnvironment: " + getBackendEnvironment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getBackendEnvironment() == null) ? 0 : getBackendEnvironment().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackendEnvironmentResult == false)
            return false;
        GetBackendEnvironmentResult other = (GetBackendEnvironmentResult) obj;

        if (other.getBackendEnvironment() == null ^ this.getBackendEnvironment() == null)
            return false;
        if (other.getBackendEnvironment() != null
                && other.getBackendEnvironment().equals(this.getBackendEnvironment()) == false)
            return false;
        return true;
    }
}
