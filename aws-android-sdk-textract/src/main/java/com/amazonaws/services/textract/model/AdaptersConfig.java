/*
 * Copyright 2010-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * Contains information about adapters used when analyzing a document, with each
 * adapter specified using an AdapterId and version
 * </p>
 */
public class AdaptersConfig implements Serializable {
    /**
     * <p>
     * A list of adapters to be used when analyzing the specified document.
     * </p>
     */
    private java.util.List<Adapter> adapters;

    /**
     * <p>
     * A list of adapters to be used when analyzing the specified document.
     * </p>
     *
     * @return <p>
     *         A list of adapters to be used when analyzing the specified
     *         document.
     *         </p>
     */
    public java.util.List<Adapter> getAdapters() {
        return adapters;
    }

    /**
     * <p>
     * A list of adapters to be used when analyzing the specified document.
     * </p>
     *
     * @param adapters <p>
     *            A list of adapters to be used when analyzing the specified
     *            document.
     *            </p>
     */
    public void setAdapters(java.util.Collection<Adapter> adapters) {
        if (adapters == null) {
            this.adapters = null;
            return;
        }

        this.adapters = new java.util.ArrayList<Adapter>(adapters);
    }

    /**
     * <p>
     * A list of adapters to be used when analyzing the specified document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapters <p>
     *            A list of adapters to be used when analyzing the specified
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdaptersConfig withAdapters(Adapter... adapters) {
        if (getAdapters() == null) {
            this.adapters = new java.util.ArrayList<Adapter>(adapters.length);
        }
        for (Adapter value : adapters) {
            this.adapters.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of adapters to be used when analyzing the specified document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param adapters <p>
     *            A list of adapters to be used when analyzing the specified
     *            document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AdaptersConfig withAdapters(java.util.Collection<Adapter> adapters) {
        setAdapters(adapters);
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
        if (getAdapters() != null)
            sb.append("Adapters: " + getAdapters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdapters() == null) ? 0 : getAdapters().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AdaptersConfig == false)
            return false;
        AdaptersConfig other = (AdaptersConfig) obj;

        if (other.getAdapters() == null ^ this.getAdapters() == null)
            return false;
        if (other.getAdapters() != null && other.getAdapters().equals(this.getAdapters()) == false)
            return false;
        return true;
    }
}
