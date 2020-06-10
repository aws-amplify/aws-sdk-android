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

package com.amazonaws.services.shield.model;

import java.io.Serializable;

public class DescribeDRTAccessResult implements Serializable {
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     */
    private String roleArn;

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     */
    private java.util.List<String> logBucketList;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @return <p>
     *         The Amazon Resource Name (ARN) of the role the DRT used to access
     *         your AWS account.
     *         </p>
     */
    public String getRoleArn() {
        return roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your
     * AWS account.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role the DRT used to
     *            access your AWS account.
     *            </p>
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role the DRT used to access your
     * AWS account.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>^arn:aws:iam::\d{12}:role/?[a-zA-Z_0-9+=,.@\-_/]+<br/>
     *
     * @param roleArn <p>
     *            The Amazon Resource Name (ARN) of the role the DRT used to
     *            access your AWS account.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDRTAccessResult withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     *
     * @return <p>
     *         The list of Amazon S3 buckets accessed by the DRT.
     *         </p>
     */
    public java.util.List<String> getLogBucketList() {
        return logBucketList;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     *
     * @param logBucketList <p>
     *            The list of Amazon S3 buckets accessed by the DRT.
     *            </p>
     */
    public void setLogBucketList(java.util.Collection<String> logBucketList) {
        if (logBucketList == null) {
            this.logBucketList = null;
            return;
        }

        this.logBucketList = new java.util.ArrayList<String>(logBucketList);
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logBucketList <p>
     *            The list of Amazon S3 buckets accessed by the DRT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDRTAccessResult withLogBucketList(String... logBucketList) {
        if (getLogBucketList() == null) {
            this.logBucketList = new java.util.ArrayList<String>(logBucketList.length);
        }
        for (String value : logBucketList) {
            this.logBucketList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The list of Amazon S3 buckets accessed by the DRT.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logBucketList <p>
     *            The list of Amazon S3 buckets accessed by the DRT.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DescribeDRTAccessResult withLogBucketList(java.util.Collection<String> logBucketList) {
        setLogBucketList(logBucketList);
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
        if (getRoleArn() != null)
            sb.append("RoleArn: " + getRoleArn() + ",");
        if (getLogBucketList() != null)
            sb.append("LogBucketList: " + getLogBucketList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode
                + ((getLogBucketList() == null) ? 0 : getLogBucketList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeDRTAccessResult == false)
            return false;
        DescribeDRTAccessResult other = (DescribeDRTAccessResult) obj;

        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getLogBucketList() == null ^ this.getLogBucketList() == null)
            return false;
        if (other.getLogBucketList() != null
                && other.getLogBucketList().equals(this.getLogBucketList()) == false)
            return false;
        return true;
    }
}
