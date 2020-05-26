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

package com.amazonaws.services.macie.model;

import java.io.Serializable;

public class ListS3ResourcesResult implements Serializable {
    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     */
    private java.util.List<S3ResourceClassification> s3Resources;

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     */
    private String nextToken;

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     *
     * @return <p>
     *         A list of the associated S3 resources returned by the action.
     *         </p>
     */
    public java.util.List<S3ResourceClassification> getS3Resources() {
        return s3Resources;
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     *
     * @param s3Resources <p>
     *            A list of the associated S3 resources returned by the action.
     *            </p>
     */
    public void setS3Resources(java.util.Collection<S3ResourceClassification> s3Resources) {
        if (s3Resources == null) {
            this.s3Resources = null;
            return;
        }

        this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources);
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            A list of the associated S3 resources returned by the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListS3ResourcesResult withS3Resources(S3ResourceClassification... s3Resources) {
        if (getS3Resources() == null) {
            this.s3Resources = new java.util.ArrayList<S3ResourceClassification>(s3Resources.length);
        }
        for (S3ResourceClassification value : s3Resources) {
            this.s3Resources.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the associated S3 resources returned by the action.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param s3Resources <p>
     *            A list of the associated S3 resources returned by the action.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListS3ResourcesResult withS3Resources(
            java.util.Collection<S3ResourceClassification> s3Resources) {
        setS3Resources(s3Resources);
        return this;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @return <p>
     *         When a response is generated, if there is more data to be listed,
     *         this parameter is present in the response and contains the value
     *         to use for the nextToken parameter in a subsequent pagination
     *         request. If there is no more data to be listed, this parameter is
     *         set to null.
     *         </p>
     */
    public String getNextToken() {
        return nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            When a response is generated, if there is more data to be
     *            listed, this parameter is present in the response and contains
     *            the value to use for the nextToken parameter in a subsequent
     *            pagination request. If there is no more data to be listed,
     *            this parameter is set to null.
     *            </p>
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * When a response is generated, if there is more data to be listed, this
     * parameter is present in the response and contains the value to use for
     * the nextToken parameter in a subsequent pagination request. If there is
     * no more data to be listed, this parameter is set to null.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 500<br/>
     *
     * @param nextToken <p>
     *            When a response is generated, if there is more data to be
     *            listed, this parameter is present in the response and contains
     *            the value to use for the nextToken parameter in a subsequent
     *            pagination request. If there is no more data to be listed,
     *            this parameter is set to null.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ListS3ResourcesResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getS3Resources() != null)
            sb.append("s3Resources: " + getS3Resources() + ",");
        if (getNextToken() != null)
            sb.append("nextToken: " + getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getS3Resources() == null) ? 0 : getS3Resources().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListS3ResourcesResult == false)
            return false;
        ListS3ResourcesResult other = (ListS3ResourcesResult) obj;

        if (other.getS3Resources() == null ^ this.getS3Resources() == null)
            return false;
        if (other.getS3Resources() != null
                && other.getS3Resources().equals(this.getS3Resources()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null
                && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }
}
