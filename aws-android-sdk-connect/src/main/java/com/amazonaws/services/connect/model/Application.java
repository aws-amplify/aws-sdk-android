/*
 * Copyright 2010-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.connect.model;

import java.io.Serializable;

/**
 * <p>
 * This API is in preview release for Amazon Connect and is subject to change.
 * </p>
 * <p>
 * A third-party application's metadata.
 * </p>
 */
public class Application implements Serializable {
    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String namespace;

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the
     * <code>ACCESS</code> permission is supported.
     * </p>
     */
    private java.util.List<String> applicationPermissions;

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <p>
     *         Namespace of the application that you want to give access to.
     *         </p>
     */
    public String getNamespace() {
        return namespace;
    }

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param namespace <p>
     *            Namespace of the application that you want to give access to.
     *            </p>
     */
    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    /**
     * <p>
     * Namespace of the application that you want to give access to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param namespace <p>
     *            Namespace of the application that you want to give access to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withNamespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the
     * <code>ACCESS</code> permission is supported.
     * </p>
     *
     * @return <p>
     *         The permissions that the agent is granted on the application.
     *         Only the <code>ACCESS</code> permission is supported.
     *         </p>
     */
    public java.util.List<String> getApplicationPermissions() {
        return applicationPermissions;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the
     * <code>ACCESS</code> permission is supported.
     * </p>
     *
     * @param applicationPermissions <p>
     *            The permissions that the agent is granted on the application.
     *            Only the <code>ACCESS</code> permission is supported.
     *            </p>
     */
    public void setApplicationPermissions(java.util.Collection<String> applicationPermissions) {
        if (applicationPermissions == null) {
            this.applicationPermissions = null;
            return;
        }

        this.applicationPermissions = new java.util.ArrayList<String>(applicationPermissions);
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the
     * <code>ACCESS</code> permission is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationPermissions <p>
     *            The permissions that the agent is granted on the application.
     *            Only the <code>ACCESS</code> permission is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withApplicationPermissions(String... applicationPermissions) {
        if (getApplicationPermissions() == null) {
            this.applicationPermissions = new java.util.ArrayList<String>(
                    applicationPermissions.length);
        }
        for (String value : applicationPermissions) {
            this.applicationPermissions.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The permissions that the agent is granted on the application. Only the
     * <code>ACCESS</code> permission is supported.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param applicationPermissions <p>
     *            The permissions that the agent is granted on the application.
     *            Only the <code>ACCESS</code> permission is supported.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Application withApplicationPermissions(
            java.util.Collection<String> applicationPermissions) {
        setApplicationPermissions(applicationPermissions);
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
        if (getNamespace() != null)
            sb.append("Namespace: " + getNamespace() + ",");
        if (getApplicationPermissions() != null)
            sb.append("ApplicationPermissions: " + getApplicationPermissions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNamespace() == null) ? 0 : getNamespace().hashCode());
        hashCode = prime
                * hashCode
                + ((getApplicationPermissions() == null) ? 0 : getApplicationPermissions()
                        .hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Application == false)
            return false;
        Application other = (Application) obj;

        if (other.getNamespace() == null ^ this.getNamespace() == null)
            return false;
        if (other.getNamespace() != null
                && other.getNamespace().equals(this.getNamespace()) == false)
            return false;
        if (other.getApplicationPermissions() == null ^ this.getApplicationPermissions() == null)
            return false;
        if (other.getApplicationPermissions() != null
                && other.getApplicationPermissions().equals(this.getApplicationPermissions()) == false)
            return false;
        return true;
    }
}
