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

package com.amazonaws.services.ssm.model;

import java.io.Serializable;

/**
 * <p>
 * Information about the patches to use to update the instances, including
 * target operating systems and source repository. Applies to Linux instances
 * only.
 * </p>
 */
public class PatchSource implements Serializable {
    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,50}$<br/>
     */
    private String name;

    /**
     * <p>
     * The specific operating system versions a patch repository applies to,
     * such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2"
     * or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     */
    private java.util.List<String> products;

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     */
    private String configuration;

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,50}$<br/>
     *
     * @return <p>
     *         The name specified to identify the patch source.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,50}$<br/>
     *
     * @param name <p>
     *            The name specified to identify the patch source.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name specified to identify the patch source.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>^[a-zA-Z0-9_\-.]{3,50}$<br/>
     *
     * @param name <p>
     *            The name specified to identify the patch source.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchSource withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to,
     * such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2"
     * or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     *
     * @return <p>
     *         The specific operating system versions a patch repository applies
     *         to, such as "Ubuntu16.04", "AmazonLinux2016.09",
     *         "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of supported
     *         product values, see <a>PatchFilter</a>.
     *         </p>
     */
    public java.util.List<String> getProducts() {
        return products;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to,
     * such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2"
     * or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     *
     * @param products <p>
     *            The specific operating system versions a patch repository
     *            applies to, such as "Ubuntu16.04", "AmazonLinux2016.09",
     *            "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of
     *            supported product values, see <a>PatchFilter</a>.
     *            </p>
     */
    public void setProducts(java.util.Collection<String> products) {
        if (products == null) {
            this.products = null;
            return;
        }

        this.products = new java.util.ArrayList<String>(products);
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to,
     * such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2"
     * or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param products <p>
     *            The specific operating system versions a patch repository
     *            applies to, such as "Ubuntu16.04", "AmazonLinux2016.09",
     *            "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of
     *            supported product values, see <a>PatchFilter</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchSource withProducts(String... products) {
        if (getProducts() == null) {
            this.products = new java.util.ArrayList<String>(products.length);
        }
        for (String value : products) {
            this.products.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The specific operating system versions a patch repository applies to,
     * such as "Ubuntu16.04", "AmazonLinux2016.09", "RedhatEnterpriseLinux7.2"
     * or "Suse12.7". For lists of supported product values, see
     * <a>PatchFilter</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param products <p>
     *            The specific operating system versions a patch repository
     *            applies to, such as "Ubuntu16.04", "AmazonLinux2016.09",
     *            "RedhatEnterpriseLinux7.2" or "Suse12.7". For lists of
     *            supported product values, see <a>PatchFilter</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchSource withProducts(java.util.Collection<String> products) {
        setProducts(products);
        return this;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @return <p>
     *         The value of the yum repo configuration. For example:
     *         </p>
     *         <p>
     *         <code>[main]</code>
     *         </p>
     *         <p>
     *         <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *         </p>
     *         <p>
     *         <code>keepcache=0</code>
     *         </p>
     *         <p>
     *         <code>debuglevel=2</code>
     *         </p>
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param configuration <p>
     *            The value of the yum repo configuration. For example:
     *            </p>
     *            <p>
     *            <code>[main]</code>
     *            </p>
     *            <p>
     *            <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *            </p>
     *            <p>
     *            <code>keepcache=0</code>
     *            </p>
     *            <p>
     *            <code>debuglevel=2</code>
     *            </p>
     */
    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }

    /**
     * <p>
     * The value of the yum repo configuration. For example:
     * </p>
     * <p>
     * <code>[main]</code>
     * </p>
     * <p>
     * <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     * </p>
     * <p>
     * <code>keepcache=0</code>
     * </p>
     * <p>
     * <code>debuglevel=2</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     *
     * @param configuration <p>
     *            The value of the yum repo configuration. For example:
     *            </p>
     *            <p>
     *            <code>[main]</code>
     *            </p>
     *            <p>
     *            <code>cachedir=/var/cache/yum/$basesearch$releasever</code>
     *            </p>
     *            <p>
     *            <code>keepcache=0</code>
     *            </p>
     *            <p>
     *            <code>debuglevel=2</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PatchSource withConfiguration(String configuration) {
        this.configuration = configuration;
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
            sb.append("Name: " + getName() + ",");
        if (getProducts() != null)
            sb.append("Products: " + getProducts() + ",");
        if (getConfiguration() != null)
            sb.append("Configuration: " + getConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getProducts() == null) ? 0 : getProducts().hashCode());
        hashCode = prime * hashCode
                + ((getConfiguration() == null) ? 0 : getConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PatchSource == false)
            return false;
        PatchSource other = (PatchSource) obj;

        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getProducts() == null ^ this.getProducts() == null)
            return false;
        if (other.getProducts() != null && other.getProducts().equals(this.getProducts()) == false)
            return false;
        if (other.getConfiguration() == null ^ this.getConfiguration() == null)
            return false;
        if (other.getConfiguration() != null
                && other.getConfiguration().equals(this.getConfiguration()) == false)
            return false;
        return true;
    }
}
