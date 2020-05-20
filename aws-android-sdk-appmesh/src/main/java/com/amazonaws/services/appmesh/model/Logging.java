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

package com.amazonaws.services.appmesh.model;

import java.io.Serializable;

/**
 * <p>
 * An object that represents the logging information for a virtual node.
 * </p>
 */
public class Logging implements Serializable {
    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     */
    private AccessLog accessLog;

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     *
     * @return <p>
     *         The access log configuration for a virtual node.
     *         </p>
     */
    public AccessLog getAccessLog() {
        return accessLog;
    }

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     *
     * @param accessLog <p>
     *            The access log configuration for a virtual node.
     *            </p>
     */
    public void setAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
    }

    /**
     * <p>
     * The access log configuration for a virtual node.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param accessLog <p>
     *            The access log configuration for a virtual node.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Logging withAccessLog(AccessLog accessLog) {
        this.accessLog = accessLog;
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
        if (getAccessLog() != null)
            sb.append("accessLog: " + getAccessLog());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccessLog() == null) ? 0 : getAccessLog().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Logging == false)
            return false;
        Logging other = (Logging) obj;

        if (other.getAccessLog() == null ^ this.getAccessLog() == null)
            return false;
        if (other.getAccessLog() != null
                && other.getAccessLog().equals(this.getAccessLog()) == false)
            return false;
        return true;
    }
}
