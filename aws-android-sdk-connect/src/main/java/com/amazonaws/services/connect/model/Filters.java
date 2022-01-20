/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Contains the filter to apply when retrieving metrics.
 * </p>
 */
public class Filters implements Serializable {
    /**
     * <p>
     * The queues to use to filter the metrics. You should specify at least one
     * queue, and can specify up to 100 queues per request. The
     * <code>GetCurrentMetricsData</code> API in particular requires a queue
     * when you include a <code>Filter</code> in your request.
     * </p>
     */
    private java.util.List<String> queues;

    /**
     * <p>
     * The channel to use to filter the metrics.
     * </p>
     */
    private java.util.List<String> channels;

    /**
     * <p>
     * The queues to use to filter the metrics. You should specify at least one
     * queue, and can specify up to 100 queues per request. The
     * <code>GetCurrentMetricsData</code> API in particular requires a queue
     * when you include a <code>Filter</code> in your request.
     * </p>
     *
     * @return <p>
     *         The queues to use to filter the metrics. You should specify at
     *         least one queue, and can specify up to 100 queues per request.
     *         The <code>GetCurrentMetricsData</code> API in particular requires
     *         a queue when you include a <code>Filter</code> in your request.
     *         </p>
     */
    public java.util.List<String> getQueues() {
        return queues;
    }

    /**
     * <p>
     * The queues to use to filter the metrics. You should specify at least one
     * queue, and can specify up to 100 queues per request. The
     * <code>GetCurrentMetricsData</code> API in particular requires a queue
     * when you include a <code>Filter</code> in your request.
     * </p>
     *
     * @param queues <p>
     *            The queues to use to filter the metrics. You should specify at
     *            least one queue, and can specify up to 100 queues per request.
     *            The <code>GetCurrentMetricsData</code> API in particular
     *            requires a queue when you include a <code>Filter</code> in
     *            your request.
     *            </p>
     */
    public void setQueues(java.util.Collection<String> queues) {
        if (queues == null) {
            this.queues = null;
            return;
        }

        this.queues = new java.util.ArrayList<String>(queues);
    }

    /**
     * <p>
     * The queues to use to filter the metrics. You should specify at least one
     * queue, and can specify up to 100 queues per request. The
     * <code>GetCurrentMetricsData</code> API in particular requires a queue
     * when you include a <code>Filter</code> in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            The queues to use to filter the metrics. You should specify at
     *            least one queue, and can specify up to 100 queues per request.
     *            The <code>GetCurrentMetricsData</code> API in particular
     *            requires a queue when you include a <code>Filter</code> in
     *            your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filters withQueues(String... queues) {
        if (getQueues() == null) {
            this.queues = new java.util.ArrayList<String>(queues.length);
        }
        for (String value : queues) {
            this.queues.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The queues to use to filter the metrics. You should specify at least one
     * queue, and can specify up to 100 queues per request. The
     * <code>GetCurrentMetricsData</code> API in particular requires a queue
     * when you include a <code>Filter</code> in your request.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param queues <p>
     *            The queues to use to filter the metrics. You should specify at
     *            least one queue, and can specify up to 100 queues per request.
     *            The <code>GetCurrentMetricsData</code> API in particular
     *            requires a queue when you include a <code>Filter</code> in
     *            your request.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filters withQueues(java.util.Collection<String> queues) {
        setQueues(queues);
        return this;
    }

    /**
     * <p>
     * The channel to use to filter the metrics.
     * </p>
     *
     * @return <p>
     *         The channel to use to filter the metrics.
     *         </p>
     */
    public java.util.List<String> getChannels() {
        return channels;
    }

    /**
     * <p>
     * The channel to use to filter the metrics.
     * </p>
     *
     * @param channels <p>
     *            The channel to use to filter the metrics.
     *            </p>
     */
    public void setChannels(java.util.Collection<String> channels) {
        if (channels == null) {
            this.channels = null;
            return;
        }

        this.channels = new java.util.ArrayList<String>(channels);
    }

    /**
     * <p>
     * The channel to use to filter the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The channel to use to filter the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filters withChannels(String... channels) {
        if (getChannels() == null) {
            this.channels = new java.util.ArrayList<String>(channels.length);
        }
        for (String value : channels) {
            this.channels.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The channel to use to filter the metrics.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param channels <p>
     *            The channel to use to filter the metrics.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Filters withChannels(java.util.Collection<String> channels) {
        setChannels(channels);
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
        if (getQueues() != null)
            sb.append("Queues: " + getQueues() + ",");
        if (getChannels() != null)
            sb.append("Channels: " + getChannels());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getQueues() == null) ? 0 : getQueues().hashCode());
        hashCode = prime * hashCode + ((getChannels() == null) ? 0 : getChannels().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Filters == false)
            return false;
        Filters other = (Filters) obj;

        if (other.getQueues() == null ^ this.getQueues() == null)
            return false;
        if (other.getQueues() != null && other.getQueues().equals(this.getQueues()) == false)
            return false;
        if (other.getChannels() == null ^ this.getChannels() == null)
            return false;
        if (other.getChannels() != null && other.getChannels().equals(this.getChannels()) == false)
            return false;
        return true;
    }
}
