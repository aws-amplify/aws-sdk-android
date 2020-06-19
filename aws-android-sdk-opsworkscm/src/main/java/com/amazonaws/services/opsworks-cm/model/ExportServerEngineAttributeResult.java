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
package com.amazonaws.services.opsworks-cm.model;

import java.io.Serializable;


public class ExportServerEngineAttributeResult implements Serializable {
    /**
     * <p>The requested engine attribute pair with attribute name and value.</p>
     */
    private EngineAttribute engineAttribute;

    /**
     * <p>The server name used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     */
    private String serverName;

    /**
     * <p>The requested engine attribute pair with attribute name and value.</p>
     *
     * @return <p>The requested engine attribute pair with attribute name and value.</p>
     */
    public EngineAttribute getEngineAttribute() {
        return engineAttribute;
    }

    /**
     * <p>The requested engine attribute pair with attribute name and value.</p>
     *
     * @param engineAttribute <p>The requested engine attribute pair with attribute name and value.</p>
     */
    public void setEngineAttribute(EngineAttribute engineAttribute) {
        this.engineAttribute = engineAttribute;
    }

    /**
     * <p>The requested engine attribute pair with attribute name and value.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param engineAttribute <p>The requested engine attribute pair with attribute name and value.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportServerEngineAttributeResult withEngineAttribute(EngineAttribute engineAttribute) {
        this.engineAttribute = engineAttribute;
        return this;
    }

    /**
     * <p>The server name used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @return <p>The server name used in the request.</p>
     */
    public String getServerName() {
        return serverName;
    }

    /**
     * <p>The server name used in the request.</p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The server name used in the request.</p>
     */
    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    /**
     * <p>The server name used in the request.</p>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 40<br/>
     * <b>Pattern: </b>[a-zA-Z][a-zA-Z0-9\-]*<br/>
     *
     * @param serverName <p>The server name used in the request.</p>
     *
     * @return A reference to this updated object so that method calls can be chained together.
     */
    public ExportServerEngineAttributeResult withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEngineAttribute() != null) sb.append("EngineAttribute: " + getEngineAttribute() + ",");
        if (getServerName() != null) sb.append("ServerName: " + getServerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEngineAttribute() == null) ? 0 : getEngineAttribute().hashCode());
        hashCode = prime * hashCode + ((getServerName() == null) ? 0 : getServerName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ExportServerEngineAttributeResult == false) return false;
        ExportServerEngineAttributeResult other = (ExportServerEngineAttributeResult)obj;

        if (other.getEngineAttribute() == null ^ this.getEngineAttribute() == null) return false;
        if (other.getEngineAttribute() != null && other.getEngineAttribute().equals(this.getEngineAttribute()) == false) return false;
        if (other.getServerName() == null ^ this.getServerName() == null) return false;
        if (other.getServerName() != null && other.getServerName().equals(this.getServerName()) == false) return false;
        return true;
    }
}
