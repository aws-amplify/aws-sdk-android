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

package com.amazonaws.services.kafka.model;

import java.io.Serializable;

/**
 * 
 <p>
 * Indicates whether you want to enable or disable the Node Exporter.
 * </p>
 */
public class NodeExporterInfo implements Serializable {
    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     */
    private Boolean enabledInBroker;

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @return <p>
     *         Indicates whether you want to enable or disable the Node
     *         Exporter.
     *         </p>
     */
    public Boolean isEnabledInBroker() {
        return enabledInBroker;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @return <p>
     *         Indicates whether you want to enable or disable the Node
     *         Exporter.
     *         </p>
     */
    public Boolean getEnabledInBroker() {
        return enabledInBroker;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @param enabledInBroker <p>
     *            Indicates whether you want to enable or disable the Node
     *            Exporter.
     *            </p>
     */
    public void setEnabledInBroker(Boolean enabledInBroker) {
        this.enabledInBroker = enabledInBroker;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param enabledInBroker <p>
     *            Indicates whether you want to enable or disable the Node
     *            Exporter.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeExporterInfo withEnabledInBroker(Boolean enabledInBroker) {
        this.enabledInBroker = enabledInBroker;
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
        if (getEnabledInBroker() != null)
            sb.append("EnabledInBroker: " + getEnabledInBroker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEnabledInBroker() == null) ? 0 : getEnabledInBroker().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeExporterInfo == false)
            return false;
        NodeExporterInfo other = (NodeExporterInfo) obj;

        if (other.getEnabledInBroker() == null ^ this.getEnabledInBroker() == null)
            return false;
        if (other.getEnabledInBroker() != null
                && other.getEnabledInBroker().equals(this.getEnabledInBroker()) == false)
            return false;
        return true;
    }
}
