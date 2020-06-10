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

package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;

/**
 * <p>
 * Contains details about a package version asset.
 * </p>
 */
public class AssetSummary implements Serializable {
    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     */
    private String name;

    /**
     * <p>
     * The size of the asset.
     * </p>
     */
    private Long size;

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     */
    private java.util.Map<String, String> hashes;

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @return <p>
     *         The name of the asset.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param name <p>
     *            The name of the asset.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 255<br/>
     * <b>Pattern: </b>\P{C}+<br/>
     *
     * @param name <p>
     *            The name of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSummary withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     *
     * @return <p>
     *         The size of the asset.
     *         </p>
     */
    public Long getSize() {
        return size;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     *
     * @param size <p>
     *            The size of the asset.
     *            </p>
     */
    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param size <p>
     *            The size of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSummary withSize(Long size) {
        this.size = size;
        return this;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     *
     * @return <p>
     *         The hashes of the asset.
     *         </p>
     */
    public java.util.Map<String, String> getHashes() {
        return hashes;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     *
     * @param hashes <p>
     *            The hashes of the asset.
     *            </p>
     */
    public void setHashes(java.util.Map<String, String> hashes) {
        this.hashes = hashes;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param hashes <p>
     *            The hashes of the asset.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSummary withHashes(java.util.Map<String, String> hashes) {
        this.hashes = hashes;
        return this;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     * <p>
     * The method adds a new key-value pair into hashes parameter, and returns a
     * reference to this object so that method calls can be chained together.
     *
     * @param key The key of the entry to be added into hashes.
     * @param value The corresponding value of the entry to be added into
     *            hashes.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AssetSummary addhashesEntry(String key, String value) {
        if (null == this.hashes) {
            this.hashes = new java.util.HashMap<String, String>();
        }
        if (this.hashes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString()
                    + ") are provided.");
        this.hashes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into hashes.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     */
    public AssetSummary clearhashesEntries() {
        this.hashes = null;
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
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getSize() != null)
            sb.append("size: " + getSize() + ",");
        if (getHashes() != null)
            sb.append("hashes: " + getHashes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getHashes() == null) ? 0 : getHashes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetSummary == false)
            return false;
        AssetSummary other = (AssetSummary) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getHashes() == null ^ this.getHashes() == null)
            return false;
        if (other.getHashes() != null && other.getHashes().equals(this.getHashes()) == false)
            return false;
        return true;
    }
}
