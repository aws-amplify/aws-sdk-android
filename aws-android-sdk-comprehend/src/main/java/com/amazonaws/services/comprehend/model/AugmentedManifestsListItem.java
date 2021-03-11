/*
 * Copyright 2010-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * An augmented manifest file that provides training data for your custom model.
 * An augmented manifest file is a labeled dataset that is produced by Amazon
 * SageMaker Ground Truth.
 * </p>
 */
public class AugmentedManifestsListItem implements Serializable {
    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training
     * documents. The number of attribute names that you specify depends on
     * whether your augmented manifest file is the output of a single labeling
     * job or a chained labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the
     * LabelAttributeName key that was used when the job was created in Ground
     * Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the
     * LabelAttributeName key for one or more jobs in the chain. Each
     * LabelAttributeName key provides the annotations from an individual job.
     * </p>
     */
    private java.util.List<String> attributeNames;

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The Amazon S3 location of the augmented manifest file.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 location of the augmented manifest file.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 location of the augmented manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 location of the augmented manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AugmentedManifestsListItem withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training
     * documents. The number of attribute names that you specify depends on
     * whether your augmented manifest file is the output of a single labeling
     * job or a chained labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the
     * LabelAttributeName key that was used when the job was created in Ground
     * Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the
     * LabelAttributeName key for one or more jobs in the chain. Each
     * LabelAttributeName key provides the annotations from an individual job.
     * </p>
     *
     * @return <p>
     *         The JSON attribute that contains the annotations for your
     *         training documents. The number of attribute names that you
     *         specify depends on whether your augmented manifest file is the
     *         output of a single labeling job or a chained labeling job.
     *         </p>
     *         <p>
     *         If your file is the output of a single labeling job, specify the
     *         LabelAttributeName key that was used when the job was created in
     *         Ground Truth.
     *         </p>
     *         <p>
     *         If your file is the output of a chained labeling job, specify the
     *         LabelAttributeName key for one or more jobs in the chain. Each
     *         LabelAttributeName key provides the annotations from an
     *         individual job.
     *         </p>
     */
    public java.util.List<String> getAttributeNames() {
        return attributeNames;
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training
     * documents. The number of attribute names that you specify depends on
     * whether your augmented manifest file is the output of a single labeling
     * job or a chained labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the
     * LabelAttributeName key that was used when the job was created in Ground
     * Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the
     * LabelAttributeName key for one or more jobs in the chain. Each
     * LabelAttributeName key provides the annotations from an individual job.
     * </p>
     *
     * @param attributeNames <p>
     *            The JSON attribute that contains the annotations for your
     *            training documents. The number of attribute names that you
     *            specify depends on whether your augmented manifest file is the
     *            output of a single labeling job or a chained labeling job.
     *            </p>
     *            <p>
     *            If your file is the output of a single labeling job, specify
     *            the LabelAttributeName key that was used when the job was
     *            created in Ground Truth.
     *            </p>
     *            <p>
     *            If your file is the output of a chained labeling job, specify
     *            the LabelAttributeName key for one or more jobs in the chain.
     *            Each LabelAttributeName key provides the annotations from an
     *            individual job.
     *            </p>
     */
    public void setAttributeNames(java.util.Collection<String> attributeNames) {
        if (attributeNames == null) {
            this.attributeNames = null;
            return;
        }

        this.attributeNames = new java.util.ArrayList<String>(attributeNames);
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training
     * documents. The number of attribute names that you specify depends on
     * whether your augmented manifest file is the output of a single labeling
     * job or a chained labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the
     * LabelAttributeName key that was used when the job was created in Ground
     * Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the
     * LabelAttributeName key for one or more jobs in the chain. Each
     * LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            The JSON attribute that contains the annotations for your
     *            training documents. The number of attribute names that you
     *            specify depends on whether your augmented manifest file is the
     *            output of a single labeling job or a chained labeling job.
     *            </p>
     *            <p>
     *            If your file is the output of a single labeling job, specify
     *            the LabelAttributeName key that was used when the job was
     *            created in Ground Truth.
     *            </p>
     *            <p>
     *            If your file is the output of a chained labeling job, specify
     *            the LabelAttributeName key for one or more jobs in the chain.
     *            Each LabelAttributeName key provides the annotations from an
     *            individual job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AugmentedManifestsListItem withAttributeNames(String... attributeNames) {
        if (getAttributeNames() == null) {
            this.attributeNames = new java.util.ArrayList<String>(attributeNames.length);
        }
        for (String value : attributeNames) {
            this.attributeNames.add(value);
        }
        return this;
    }

    /**
     * <p>
     * The JSON attribute that contains the annotations for your training
     * documents. The number of attribute names that you specify depends on
     * whether your augmented manifest file is the output of a single labeling
     * job or a chained labeling job.
     * </p>
     * <p>
     * If your file is the output of a single labeling job, specify the
     * LabelAttributeName key that was used when the job was created in Ground
     * Truth.
     * </p>
     * <p>
     * If your file is the output of a chained labeling job, specify the
     * LabelAttributeName key for one or more jobs in the chain. Each
     * LabelAttributeName key provides the annotations from an individual job.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param attributeNames <p>
     *            The JSON attribute that contains the annotations for your
     *            training documents. The number of attribute names that you
     *            specify depends on whether your augmented manifest file is the
     *            output of a single labeling job or a chained labeling job.
     *            </p>
     *            <p>
     *            If your file is the output of a single labeling job, specify
     *            the LabelAttributeName key that was used when the job was
     *            created in Ground Truth.
     *            </p>
     *            <p>
     *            If your file is the output of a chained labeling job, specify
     *            the LabelAttributeName key for one or more jobs in the chain.
     *            Each LabelAttributeName key provides the annotations from an
     *            individual job.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AugmentedManifestsListItem withAttributeNames(java.util.Collection<String> attributeNames) {
        setAttributeNames(attributeNames);
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
        if (getS3Uri() != null)
            sb.append("S3Uri: " + getS3Uri() + ",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AugmentedManifestsListItem == false)
            return false;
        AugmentedManifestsListItem other = (AugmentedManifestsListItem) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        return true;
    }
}
