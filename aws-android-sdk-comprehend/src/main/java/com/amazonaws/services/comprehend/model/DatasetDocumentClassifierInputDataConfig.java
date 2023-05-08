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

package com.amazonaws.services.comprehend.model;

import java.io.Serializable;

/**
 * <p>
 * Describes the dataset input data configuration for a document classifier
 * model.
 * </p>
 * <p>
 * For more information on how the input file is formatted, see <a href=
 * "https://docs.aws.amazon.com/comprehend/latest/dg/prep-classifier-data.html"
 * >Preparing training data</a> in the Comprehend Developer Guide.
 * </p>
 */
public class DatasetDocumentClassifierInputDataConfig implements Serializable {
    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * Region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String s3Uri;

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     */
    private String labelDelimiter;

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * Region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The Amazon S3 URI for the input data. The S3 bucket must be in
     *         the same Region as the API endpoint that you are calling. The URI
     *         can point to a single input file or it can provide the prefix for
     *         a collection of input files.
     *         </p>
     *         <p>
     *         For example, if you use the URI
     *         <code>S3://bucketName/prefix</code>, if the prefix is a single
     *         file, Amazon Comprehend uses that file as input. If more than one
     *         file begins with the prefix, Amazon Comprehend uses all of them
     *         as input.
     *         </p>
     *         <p>
     *         This parameter is required if you set <code>DataFormat</code> to
     *         <code>COMPREHEND_CSV</code>.
     *         </p>
     */
    public String getS3Uri() {
        return s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * Region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param s3Uri <p>
     *            The Amazon S3 URI for the input data. The S3 bucket must be in
     *            the same Region as the API endpoint that you are calling. The
     *            URI can point to a single input file or it can provide the
     *            prefix for a collection of input files.
     *            </p>
     *            <p>
     *            For example, if you use the URI
     *            <code>S3://bucketName/prefix</code>, if the prefix is a single
     *            file, Amazon Comprehend uses that file as input. If more than
     *            one file begins with the prefix, Amazon Comprehend uses all of
     *            them as input.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>COMPREHEND_CSV</code>.
     *            </p>
     */
    public void setS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
    }

    /**
     * <p>
     * The Amazon S3 URI for the input data. The S3 bucket must be in the same
     * Region as the API endpoint that you are calling. The URI can point to a
     * single input file or it can provide the prefix for a collection of input
     * files.
     * </p>
     * <p>
     * For example, if you use the URI <code>S3://bucketName/prefix</code>, if
     * the prefix is a single file, Amazon Comprehend uses that file as input.
     * If more than one file begins with the prefix, Amazon Comprehend uses all
     * of them as input.
     * </p>
     * <p>
     * This parameter is required if you set <code>DataFormat</code> to
     * <code>COMPREHEND_CSV</code>.
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
     *            The Amazon S3 URI for the input data. The S3 bucket must be in
     *            the same Region as the API endpoint that you are calling. The
     *            URI can point to a single input file or it can provide the
     *            prefix for a collection of input files.
     *            </p>
     *            <p>
     *            For example, if you use the URI
     *            <code>S3://bucketName/prefix</code>, if the prefix is a single
     *            file, Amazon Comprehend uses that file as input. If more than
     *            one file begins with the prefix, Amazon Comprehend uses all of
     *            them as input.
     *            </p>
     *            <p>
     *            This parameter is required if you set <code>DataFormat</code>
     *            to <code>COMPREHEND_CSV</code>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDocumentClassifierInputDataConfig withS3Uri(String s3Uri) {
        this.s3Uri = s3Uri;
        return this;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @return <p>
     *         Indicates the delimiter used to separate each label for training
     *         a multi-label classifier. The default delimiter between labels is
     *         a pipe (|). You can use a different character as a delimiter (if
     *         it's an allowed character) by specifying it under Delimiter for
     *         labels. If the training documents use a delimiter other than the
     *         default or the delimiter you specify, the labels on that line
     *         will be combined to make a single unique label, such as
     *         LABELLABELLABEL.
     *         </p>
     */
    public String getLabelDelimiter() {
        return labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @param labelDelimiter <p>
     *            Indicates the delimiter used to separate each label for
     *            training a multi-label classifier. The default delimiter
     *            between labels is a pipe (|). You can use a different
     *            character as a delimiter (if it's an allowed character) by
     *            specifying it under Delimiter for labels. If the training
     *            documents use a delimiter other than the default or the
     *            delimiter you specify, the labels on that line will be
     *            combined to make a single unique label, such as
     *            LABELLABELLABEL.
     *            </p>
     */
    public void setLabelDelimiter(String labelDelimiter) {
        this.labelDelimiter = labelDelimiter;
    }

    /**
     * <p>
     * Indicates the delimiter used to separate each label for training a
     * multi-label classifier. The default delimiter between labels is a pipe
     * (|). You can use a different character as a delimiter (if it's an allowed
     * character) by specifying it under Delimiter for labels. If the training
     * documents use a delimiter other than the default or the delimiter you
     * specify, the labels on that line will be combined to make a single unique
     * label, such as LABELLABELLABEL.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1<br/>
     * <b>Pattern: </b>^[ ~!@#$%^*\-_+=|\\:;\t>?/]$<br/>
     *
     * @param labelDelimiter <p>
     *            Indicates the delimiter used to separate each label for
     *            training a multi-label classifier. The default delimiter
     *            between labels is a pipe (|). You can use a different
     *            character as a delimiter (if it's an allowed character) by
     *            specifying it under Delimiter for labels. If the training
     *            documents use a delimiter other than the default or the
     *            delimiter you specify, the labels on that line will be
     *            combined to make a single unique label, such as
     *            LABELLABELLABEL.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public DatasetDocumentClassifierInputDataConfig withLabelDelimiter(String labelDelimiter) {
        this.labelDelimiter = labelDelimiter;
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
        if (getLabelDelimiter() != null)
            sb.append("LabelDelimiter: " + getLabelDelimiter());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getLabelDelimiter() == null) ? 0 : getLabelDelimiter().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DatasetDocumentClassifierInputDataConfig == false)
            return false;
        DatasetDocumentClassifierInputDataConfig other = (DatasetDocumentClassifierInputDataConfig) obj;

        if (other.getS3Uri() == null ^ this.getS3Uri() == null)
            return false;
        if (other.getS3Uri() != null && other.getS3Uri().equals(this.getS3Uri()) == false)
            return false;
        if (other.getLabelDelimiter() == null ^ this.getLabelDelimiter() == null)
            return false;
        if (other.getLabelDelimiter() != null
                && other.getLabelDelimiter().equals(this.getLabelDelimiter()) == false)
            return false;
        return true;
    }
}
