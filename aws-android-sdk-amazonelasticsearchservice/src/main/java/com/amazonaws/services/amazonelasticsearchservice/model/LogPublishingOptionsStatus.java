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
 * The configured log publishing options for the domain and their current
 * status.
 * </p>
 */
public class LogPublishingOptionsStatus implements Serializable {
    /**
     * <p>
     * The log publishing options configured for the Elasticsearch domain.
     * </p>
     */
    private java.util.Map<String, LogPublishingOption> options;

    /**
     * <p>
     * The status of the log publishing options for the Elasticsearch domain.
     * See <code>OptionStatus</code> for the status information that's included.
     * </p>
     */
    private OptionStatus status;

    /**
     * <p>
     * The log publishing options configured for the Elasticsearch domain.
     * </p>
     *
     * @return <p>
     *         The log publishing options configured for the Elasticsearch
     *         domain.
     *         </p>
     */
    public java.util.Map<String, LogPublishingOption> getOptions() {
        return options;
    }

    /**
     * <p>
     * The log publishing options configured for the Elasticsearch domain.
     * </p>
     *
     * @param options <p>
     *            The log publishing options configured for the Elasticsearch
     *            domain.
     *            </p>
     */
    public void setOptions(java.util.Map<String, LogPublishingOption> options) {
        this.options = options;
    }

    /**
     * <p>
     * The log publishing options configured for the Elasticsearch domain.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param options <p>
     *            The log publishing options configured for the Elasticsearch
     *            domain.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogPublishingOptionsStatus withOptions(java.util.Map<String, LogPublishingOption> options) {
        this.options = options;
        return this;
    }

    /**
     * <p>
     * The log publishing options configured for the Elasticsearch domain.
     * </p>
     * <p>
     * The method adds a new key-value pair into Options parameter, and returns
     * a reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into Options.
     * @param value The corresponding value of the entry to be added into
     *            Options.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogPublishingOptionsStatus addOptionsEntry(String key, LogPublishingOption value) {
        if (null == this.options) {
            this.options = new java.util.HashMap<String, LogPublishingOption>();
        }
        if (this.options.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.options.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Options.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public LogPublishingOptionsStatus clearOptionsEntries() {
        this.options = null;
        return this;
    }

    /**
     * <p>
     * The status of the log publishing options for the Elasticsearch domain.
     * See <code>OptionStatus</code> for the status information that's included.
     * </p>
     *
     * @return <p>
     *         The status of the log publishing options for the Elasticsearch
     *         domain. See <code>OptionStatus</code> for the status information
     *         that's included.
     *         </p>
     */
    public OptionStatus getStatus() {
        return status;
    }

    /**
     * <p>
     * The status of the log publishing options for the Elasticsearch domain.
     * See <code>OptionStatus</code> for the status information that's included.
     * </p>
     *
     * @param status <p>
     *            The status of the log publishing options for the Elasticsearch
     *            domain. See <code>OptionStatus</code> for the status
     *            information that's included.
     *            </p>
     */
    public void setStatus(OptionStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the log publishing options for the Elasticsearch domain.
     * See <code>OptionStatus</code> for the status information that's included.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param status <p>
     *            The status of the log publishing options for the Elasticsearch
     *            domain. See <code>OptionStatus</code> for the status
     *            information that's included.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public LogPublishingOptionsStatus withStatus(OptionStatus status) {
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

        if (obj instanceof LogPublishingOptionsStatus == false)
            return false;
        LogPublishingOptionsStatus other = (LogPublishingOptionsStatus) obj;

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
