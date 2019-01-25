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

package com.amazonaws.services.cognitoidentityprovider.model;

import java.io.Serializable;

public class CreateResourceServerResult implements Serializable {
    /**
     * <p>
     * The newly created resource server.
     * </p>
     */
    private ResourceServerType resourceServer;

    /**
     * <p>
     * The newly created resource server.
     * </p>
     *
     * @return <p>
     *         The newly created resource server.
     *         </p>
     */
    public ResourceServerType getResourceServer() {
        return resourceServer;
    }

    /**
     * <p>
     * The newly created resource server.
     * </p>
     *
     * @param resourceServer <p>
     *            The newly created resource server.
     *            </p>
     */
    public void setResourceServer(ResourceServerType resourceServer) {
        this.resourceServer = resourceServer;
    }

    /**
     * <p>
     * The newly created resource server.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resourceServer <p>
     *            The newly created resource server.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public CreateResourceServerResult withResourceServer(ResourceServerType resourceServer) {
        this.resourceServer = resourceServer;
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
        if (getResourceServer() != null)
            sb.append("ResourceServer: " + getResourceServer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getResourceServer() == null) ? 0 : getResourceServer().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceServerResult == false)
            return false;
        CreateResourceServerResult other = (CreateResourceServerResult) obj;

        if (other.getResourceServer() == null ^ this.getResourceServer() == null)
            return false;
        if (other.getResourceServer() != null
                && other.getResourceServer().equals(this.getResourceServer()) == false)
            return false;
        return true;
    }
}
