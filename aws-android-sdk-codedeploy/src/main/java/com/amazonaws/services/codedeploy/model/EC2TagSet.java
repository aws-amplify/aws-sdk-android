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
 * Information about groups of EC2 instance tags.
 * </p>
 */
public class EC2TagSet implements Serializable {
    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an
     * instance to be included in the deployment group, it must be identified by
     * all of the tag groups in the list.
     * </p>
     */
    private java.util.List<java.util.List<EC2TagFilter>> ec2TagSetList;

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an
     * instance to be included in the deployment group, it must be identified by
     * all of the tag groups in the list.
     * </p>
     *
     * @return <p>
     *         A list that contains other lists of EC2 instance tag groups. For
     *         an instance to be included in the deployment group, it must be
     *         identified by all of the tag groups in the list.
     *         </p>
     */
    public java.util.List<java.util.List<EC2TagFilter>> getEc2TagSetList() {
        return ec2TagSetList;
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an
     * instance to be included in the deployment group, it must be identified by
     * all of the tag groups in the list.
     * </p>
     *
     * @param ec2TagSetList <p>
     *            A list that contains other lists of EC2 instance tag groups.
     *            For an instance to be included in the deployment group, it
     *            must be identified by all of the tag groups in the list.
     *            </p>
     */
    public void setEc2TagSetList(java.util.Collection<java.util.List<EC2TagFilter>> ec2TagSetList) {
        if (ec2TagSetList == null) {
            this.ec2TagSetList = null;
            return;
        }

        this.ec2TagSetList = new java.util.ArrayList<java.util.List<EC2TagFilter>>(ec2TagSetList);
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an
     * instance to be included in the deployment group, it must be identified by
     * all of the tag groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSetList <p>
     *            A list that contains other lists of EC2 instance tag groups.
     *            For an instance to be included in the deployment group, it
     *            must be identified by all of the tag groups in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2TagSet withEc2TagSetList(java.util.List<EC2TagFilter>... ec2TagSetList) {
        if (getEc2TagSetList() == null) {
            this.ec2TagSetList = new java.util.ArrayList<java.util.List<EC2TagFilter>>(
                    ec2TagSetList.length);
        }
        for (java.util.List<EC2TagFilter> value : ec2TagSetList) {
            this.ec2TagSetList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains other lists of EC2 instance tag groups. For an
     * instance to be included in the deployment group, it must be identified by
     * all of the tag groups in the list.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param ec2TagSetList <p>
     *            A list that contains other lists of EC2 instance tag groups.
     *            For an instance to be included in the deployment group, it
     *            must be identified by all of the tag groups in the list.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public EC2TagSet withEc2TagSetList(
            java.util.Collection<java.util.List<EC2TagFilter>> ec2TagSetList) {
        setEc2TagSetList(ec2TagSetList);
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
        if (getEc2TagSetList() != null)
            sb.append("ec2TagSetList: " + getEc2TagSetList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getEc2TagSetList() == null) ? 0 : getEc2TagSetList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2TagSet == false)
            return false;
        EC2TagSet other = (EC2TagSet) obj;

        if (other.getEc2TagSetList() == null ^ this.getEc2TagSetList() == null)
            return false;
        if (other.getEc2TagSetList() != null
                && other.getEc2TagSetList().equals(this.getEc2TagSetList()) == false)
            return false;
        return true;
    }
}
