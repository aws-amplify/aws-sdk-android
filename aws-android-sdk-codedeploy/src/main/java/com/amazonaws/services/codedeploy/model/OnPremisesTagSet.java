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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about groups of on-premises instance tags.
 * </p>
 */
public class OnPremisesTagSet implements Serializable {
    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For
     * an instance to be included in the deployment group, it must be identified
     * by all of the tag groups in the list.
     * </p>
     */
    private java.util.List<java.util.List<TagFilter>> onPremisesTagSetList;

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For
     * an instance to be included in the deployment group, it must be identified
     * by all of the tag groups in the list.
     * </p>
     *
     * @return <p>
     *         A list that contains other lists of on-premises instance tag
     *         groups. For an instance to be included in the deployment group,
     *         it must be identified by all of the tag groups in the list.
     *         </p>
     */
    public java.util.List<java.util.List<TagFilter>> getOnPremisesTagSetList() {
        return onPremisesTagSetList;
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For
     * an instance to be included in the deployment group, it must be identified
     * by all of the tag groups in the list.
     * </p>
     *
     * @param onPremisesTagSetList <p>
     *            A list that contains other lists of on-premises instance tag
     *            groups. For an instance to be included in the deployment
     *            group, it must be identified by all of the tag groups in the
     *            list.
     *            </p>
     */
    public void setOnPremisesTagSetList(
            java.util.Collection<java.util.List<TagFilter>> onPremisesTagSetList) {
        if (onPremisesTagSetList == null) {
            this.onPremisesTagSetList = null;
            return;
        }

        this.onPremisesTagSetList = new java.util.ArrayList<java.util.List<TagFilter>>(
                onPremisesTagSetList);
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For
     * an instance to be included in the deployment group, it must be identified
     * by all of the tag groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesTagSetList <p>
     *            A list that contains other lists of on-premises instance tag
     *            groups. For an instance to be included in the deployment
     *            group, it must be identified by all of the tag groups in the
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnPremisesTagSet withOnPremisesTagSetList(
            java.util.List<TagFilter>... onPremisesTagSetList) {
        if (getOnPremisesTagSetList() == null) {
            this.onPremisesTagSetList = new java.util.ArrayList<java.util.List<TagFilter>>(
                    onPremisesTagSetList.length);
        }
        for (java.util.List<TagFilter> value : onPremisesTagSetList) {
            this.onPremisesTagSetList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains other lists of on-premises instance tag groups. For
     * an instance to be included in the deployment group, it must be identified
     * by all of the tag groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param onPremisesTagSetList <p>
     *            A list that contains other lists of on-premises instance tag
     *            groups. For an instance to be included in the deployment
     *            group, it must be identified by all of the tag groups in the
     *            list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public OnPremisesTagSet withOnPremisesTagSetList(
            java.util.Collection<java.util.List<TagFilter>> onPremisesTagSetList) {
        setOnPremisesTagSetList(onPremisesTagSetList);
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
        if (getOnPremisesTagSetList() != null)
            sb.append("onPremisesTagSetList: " + getOnPremisesTagSetList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getOnPremisesTagSetList() == null) ? 0 : getOnPremisesTagSetList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OnPremisesTagSet == false)
            return false;
        OnPremisesTagSet other = (OnPremisesTagSet) obj;

        if (other.getOnPremisesTagSetList() == null ^ this.getOnPremisesTagSetList() == null)
            return false;
        if (other.getOnPremisesTagSetList() != null
                && other.getOnPremisesTagSetList().equals(this.getOnPremisesTagSetList()) == false)
            return false;
        return true;
    }
}
