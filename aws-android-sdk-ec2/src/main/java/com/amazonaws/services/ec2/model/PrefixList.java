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

package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes prefixes for AWS services.
 * </p>
 */
public class PrefixList implements Serializable {
    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     */
    private java.util.List<String> cidrs;

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     */
    private String prefixListId;

    /**
     * <p>
     * The name of the prefix.
     * </p>
     */
    private String prefixListName;

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     *
     * @return <p>
     *         The IP address range of the AWS service.
     *         </p>
     */
    public java.util.List<String> getCidrs() {
        return cidrs;
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     *
     * @param cidrs <p>
     *            The IP address range of the AWS service.
     *            </p>
     */
    public void setCidrs(java.util.Collection<String> cidrs) {
        if (cidrs == null) {
            this.cidrs = null;
            return;
        }

        this.cidrs = new java.util.ArrayList<String>(cidrs);
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            The IP address range of the AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrefixList withCidrs(String... cidrs) {
        if (getCidrs() == null) {
            this.cidrs = new java.util.ArrayList<String>(cidrs.length);
        }
        for (String value : cidrs) {
            this.cidrs.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The IP address range of the AWS service.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param cidrs <p>
     *            The IP address range of the AWS service.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrefixList withCidrs(java.util.Collection<String> cidrs) {
        setCidrs(cidrs);
        return this;
    }

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     *
     * @return <p>
     *         The ID of the prefix.
     *         </p>
     */
    public String getPrefixListId() {
        return prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     *
     * @param prefixListId <p>
     *            The ID of the prefix.
     *            </p>
     */
    public void setPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
    }

    /**
     * <p>
     * The ID of the prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListId <p>
     *            The ID of the prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrefixList withPrefixListId(String prefixListId) {
        this.prefixListId = prefixListId;
        return this;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     *
     * @return <p>
     *         The name of the prefix.
     *         </p>
     */
    public String getPrefixListName() {
        return prefixListName;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     *
     * @param prefixListName <p>
     *            The name of the prefix.
     *            </p>
     */
    public void setPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
    }

    /**
     * <p>
     * The name of the prefix.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param prefixListName <p>
     *            The name of the prefix.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public PrefixList withPrefixListName(String prefixListName) {
        this.prefixListName = prefixListName;
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
        if (getCidrs() != null)
            sb.append("Cidrs: " + getCidrs() + ",");
        if (getPrefixListId() != null)
            sb.append("PrefixListId: " + getPrefixListId() + ",");
        if (getPrefixListName() != null)
            sb.append("PrefixListName: " + getPrefixListName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCidrs() == null) ? 0 : getCidrs().hashCode());
        hashCode = prime * hashCode
                + ((getPrefixListId() == null) ? 0 : getPrefixListId().hashCode());
        hashCode = prime * hashCode
                + ((getPrefixListName() == null) ? 0 : getPrefixListName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PrefixList == false)
            return false;
        PrefixList other = (PrefixList) obj;

        if (other.getCidrs() == null ^ this.getCidrs() == null)
            return false;
        if (other.getCidrs() != null && other.getCidrs().equals(this.getCidrs()) == false)
            return false;
        if (other.getPrefixListId() == null ^ this.getPrefixListId() == null)
            return false;
        if (other.getPrefixListId() != null
                && other.getPrefixListId().equals(this.getPrefixListId()) == false)
            return false;
        if (other.getPrefixListName() == null ^ this.getPrefixListName() == null)
            return false;
        if (other.getPrefixListName() != null
                && other.getPrefixListName().equals(this.getPrefixListName()) == false)
            return false;
        return true;
    }
}
