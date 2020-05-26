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

/**
 * <p>
 * The classification type that Amazon Macie Classic applies to the associated
 * S3 resources. At least one of the classification types (oneTime or
 * continuous) must be specified.
 * </p>
 */
public class ClassificationTypeUpdate implements Serializable {
    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     */
    private String oneTime;

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     */
    private String continuous;

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     *
     * @return <p>
     *         A one-time classification of all of the existing objects in a
     *         specified S3 bucket.
     *         </p>
     * @see S3OneTimeClassificationType
     */
    public String getOneTime() {
        return oneTime;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     *
     * @param oneTime <p>
     *            A one-time classification of all of the existing objects in a
     *            specified S3 bucket.
     *            </p>
     * @see S3OneTimeClassificationType
     */
    public void setOneTime(String oneTime) {
        this.oneTime = oneTime;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     *
     * @param oneTime <p>
     *            A one-time classification of all of the existing objects in a
     *            specified S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3OneTimeClassificationType
     */
    public ClassificationTypeUpdate withOneTime(String oneTime) {
        this.oneTime = oneTime;
        return this;
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     *
     * @param oneTime <p>
     *            A one-time classification of all of the existing objects in a
     *            specified S3 bucket.
     *            </p>
     * @see S3OneTimeClassificationType
     */
    public void setOneTime(S3OneTimeClassificationType oneTime) {
        this.oneTime = oneTime.toString();
    }

    /**
     * <p>
     * A one-time classification of all of the existing objects in a specified
     * S3 bucket.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL, NONE
     *
     * @param oneTime <p>
     *            A one-time classification of all of the existing objects in a
     *            specified S3 bucket.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3OneTimeClassificationType
     */
    public ClassificationTypeUpdate withOneTime(S3OneTimeClassificationType oneTime) {
        this.oneTime = oneTime.toString();
        return this;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     *
     * @return <p>
     *         A continuous classification of the objects that are added to a
     *         specified S3 bucket. Amazon Macie Classic begins performing
     *         continuous classification after a bucket is successfully
     *         associated with Amazon Macie Classic.
     *         </p>
     * @see S3ContinuousClassificationType
     */
    public String getContinuous() {
        return continuous;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     *
     * @param continuous <p>
     *            A continuous classification of the objects that are added to a
     *            specified S3 bucket. Amazon Macie Classic begins performing
     *            continuous classification after a bucket is successfully
     *            associated with Amazon Macie Classic.
     *            </p>
     * @see S3ContinuousClassificationType
     */
    public void setContinuous(String continuous) {
        this.continuous = continuous;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     *
     * @param continuous <p>
     *            A continuous classification of the objects that are added to a
     *            specified S3 bucket. Amazon Macie Classic begins performing
     *            continuous classification after a bucket is successfully
     *            associated with Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ContinuousClassificationType
     */
    public ClassificationTypeUpdate withContinuous(String continuous) {
        this.continuous = continuous;
        return this;
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     *
     * @param continuous <p>
     *            A continuous classification of the objects that are added to a
     *            specified S3 bucket. Amazon Macie Classic begins performing
     *            continuous classification after a bucket is successfully
     *            associated with Amazon Macie Classic.
     *            </p>
     * @see S3ContinuousClassificationType
     */
    public void setContinuous(S3ContinuousClassificationType continuous) {
        this.continuous = continuous.toString();
    }

    /**
     * <p>
     * A continuous classification of the objects that are added to a specified
     * S3 bucket. Amazon Macie Classic begins performing continuous
     * classification after a bucket is successfully associated with Amazon
     * Macie Classic.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FULL
     *
     * @param continuous <p>
     *            A continuous classification of the objects that are added to a
     *            specified S3 bucket. Amazon Macie Classic begins performing
     *            continuous classification after a bucket is successfully
     *            associated with Amazon Macie Classic.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see S3ContinuousClassificationType
     */
    public ClassificationTypeUpdate withContinuous(S3ContinuousClassificationType continuous) {
        this.continuous = continuous.toString();
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
        if (getOneTime() != null)
            sb.append("oneTime: " + getOneTime() + ",");
        if (getContinuous() != null)
            sb.append("continuous: " + getContinuous());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOneTime() == null) ? 0 : getOneTime().hashCode());
        hashCode = prime * hashCode + ((getContinuous() == null) ? 0 : getContinuous().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassificationTypeUpdate == false)
            return false;
        ClassificationTypeUpdate other = (ClassificationTypeUpdate) obj;

        if (other.getOneTime() == null ^ this.getOneTime() == null)
            return false;
        if (other.getOneTime() != null && other.getOneTime().equals(this.getOneTime()) == false)
            return false;
        if (other.getContinuous() == null ^ this.getContinuous() == null)
            return false;
        if (other.getContinuous() != null
                && other.getContinuous().equals(this.getContinuous()) == false)
            return false;
        return true;
    }
}
