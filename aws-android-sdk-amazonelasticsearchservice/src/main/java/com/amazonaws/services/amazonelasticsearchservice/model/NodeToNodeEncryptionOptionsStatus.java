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

package com.amazonaws.services.amazonelasticsearchservice.model;

import java.io.Serializable;

/**
 * <p>
 * Status of the node-to-node encryption options for the specified Elasticsearch
 * domain.
 * </p>
 */
public class NodeToNodeEncryptionOptionsStatus implements Serializable {
    /**
     * <p>
     * Specifies the node-to-node encryption options for the specified
     * Elasticsearch domain.
     * </p>
     */
    private NodeToNodeEncryptionOptions options;

    /**
     * <p>
     * Specifies the status of the node-to-node encryption options for the
     * specified Elasticsearch domain.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * Specifies the node-to-node encryption options for the specified
     * Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the node-to-node encryption options for the specified
     *         Elasticsearch domain.
     *         </p>
     */
    public NodeToNodeEncryptionOptions getOptions() {
        return options;
    }

    /**
     * <p>
     * Specifies the node-to-node encryption options for the specified
     * Elasticsearch domain.
     * </p>
     *
     * @param options <p>
     *            Specifies the node-to-node encryption options for the
     *            specified Elasticsearch domain.
     *            </p>
     */
    public void setOptions(NodeToNodeEncryptionOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Specifies the node-to-node encryption options for the specified
     * Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            Specifies the node-to-node encryption options for the
     *            specified Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeToNodeEncryptionOptionsStatus withOptions(NodeToNodeEncryptionOptions options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * Specifies the status of the node-to-node encryption options for the
     * specified Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         Specifies the status of the node-to-node encryption options for
     *         the specified Elasticsearch domain.
     *         </p>
     */
    public OptionStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * Specifies the status of the node-to-node encryption options for the
     * specified Elasticsearch domain.
     * </p>
     *
     * @param status <p>
     *            Specifies the status of the node-to-node encryption options
     *            for the specified Elasticsearch domain.
     *            </p>
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * Specifies the status of the node-to-node encryption options for the
     * specified Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            Specifies the status of the node-to-node encryption options
     *            for the specified Elasticsearch domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public NodeToNodeEncryptionOptionsStatus withStatus(OptionStatus status) {
        this.status = status;
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
        if (getOptions() != null)
            sb.append("Options: " + getOptions() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeToNodeEncryptionOptionsStatus == false)
            return false;
        NodeToNodeEncryptionOptionsStatus other = (NodeToNodeEncryptionOptionsStatus) obj;

        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }
}
