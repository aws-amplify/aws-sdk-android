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
 * Prometheus settings.
 * </p>
 */
public class Prometheus implements Serializable {
    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     */
    private JmxExporter jmxExporter;

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     */
    private NodeExporter nodeExporter;

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     * 
     * @return <p>
     *         Indicates whether you want to enable or disable the JMX Exporter.
     *         </p>
     */
    public JmxExporter getJmxExporter() {
        return jmxExporter;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p>
     * 
     * @param jmxExporter <p>
     *            Indicates whether you want to enable or disable the JMX
     *            Exporter.
     *            </p>
     */
    public void setJmxExporter(JmxExporter jmxExporter) {
        this.jmxExporter = jmxExporter;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the JMX Exporter.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param jmxExporter <p>
     *            Indicates whether you want to enable or disable the JMX
     *            Exporter.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prometheus withJmxExporter(JmxExporter jmxExporter) {
        this.jmxExporter = jmxExporter;
        return this;
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
    public NodeExporter getNodeExporter() {
        return nodeExporter;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p>
     * 
     * @param nodeExporter <p>
     *            Indicates whether you want to enable or disable the Node
     *            Exporter.
     *            </p>
     */
    public void setNodeExporter(NodeExporter nodeExporter) {
        this.nodeExporter = nodeExporter;
    }

    /**
     * 
     <p>
     * Indicates whether you want to enable or disable the Node Exporter.
     * </p> <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param nodeExporter <p>
     *            Indicates whether you want to enable or disable the Node
     *            Exporter.
     *            </p> @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Prometheus withNodeExporter(NodeExporter nodeExporter) {
        this.nodeExporter = nodeExporter;
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
        if (getJmxExporter() != null)
            sb.append("JmxExporter: " + getJmxExporter() + ",");
        if (getNodeExporter() != null)
            sb.append("NodeExporter: " + getNodeExporter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getJmxExporter() == null) ? 0 : getJmxExporter().hashCode());
        hashCode = prime * hashCode
                + ((getNodeExporter() == null) ? 0 : getNodeExporter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Prometheus == false)
            return false;
        Prometheus other = (Prometheus) obj;

        if (other.getJmxExporter() == null ^ this.getJmxExporter() == null)
            return false;
        if (other.getJmxExporter() != null
                && other.getJmxExporter().equals(this.getJmxExporter()) == false)
            return false;
        if (other.getNodeExporter() == null ^ this.getNodeExporter() == null)
            return false;
        if (other.getNodeExporter() != null
                && other.getNodeExporter().equals(this.getNodeExporter()) == false)
            return false;
        return true;
    }
}
