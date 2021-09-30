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
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     */
    private String split;

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
     * The S3 prefix to the annotation files that are referred in the augmented
     * manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String annotationDataS3Uri;

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the
     * augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     */
    private String sourceDocumentsS3Uri;

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     */
    private String documentType;

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
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @return <p>
     *         The purpose of the data you've provided in the augmented
     *         manifest. You can either train or test this data. If you don't
     *         specify, the default is train.
     *         </p>
     *         <p>
     *         TRAIN - all of the documents in the manifest will be used for
     *         training. If no test documents are provided, Amazon Comprehend
     *         will automatically reserve a portion of the training documents
     *         for testing.
     *         </p>
     *         <p>
     *         TEST - all of the documents in the manifest will be used for
     *         testing.
     *         </p>
     * @see Split
     */
    public String getSplit() {
        return split;
    }

    /**
     * <p>
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param split <p>
     *            The purpose of the data you've provided in the augmented
     *            manifest. You can either train or test this data. If you don't
     *            specify, the default is train.
     *            </p>
     *            <p>
     *            TRAIN - all of the documents in the manifest will be used for
     *            training. If no test documents are provided, Amazon Comprehend
     *            will automatically reserve a portion of the training documents
     *            for testing.
     *            </p>
     *            <p>
     *            TEST - all of the documents in the manifest will be used for
     *            testing.
     *            </p>
     * @see Split
     */
    public void setSplit(String split) {
        this.split = split;
    }

    /**
     * <p>
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param split <p>
     *            The purpose of the data you've provided in the augmented
     *            manifest. You can either train or test this data. If you don't
     *            specify, the default is train.
     *            </p>
     *            <p>
     *            TRAIN - all of the documents in the manifest will be used for
     *            training. If no test documents are provided, Amazon Comprehend
     *            will automatically reserve a portion of the training documents
     *            for testing.
     *            </p>
     *            <p>
     *            TEST - all of the documents in the manifest will be used for
     *            testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Split
     */
    public AugmentedManifestsListItem withSplit(String split) {
        this.split = split;
        return this;
    }

    /**
     * <p>
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param split <p>
     *            The purpose of the data you've provided in the augmented
     *            manifest. You can either train or test this data. If you don't
     *            specify, the default is train.
     *            </p>
     *            <p>
     *            TRAIN - all of the documents in the manifest will be used for
     *            training. If no test documents are provided, Amazon Comprehend
     *            will automatically reserve a portion of the training documents
     *            for testing.
     *            </p>
     *            <p>
     *            TEST - all of the documents in the manifest will be used for
     *            testing.
     *            </p>
     * @see Split
     */
    public void setSplit(Split split) {
        this.split = split.toString();
    }

    /**
     * <p>
     * The purpose of the data you've provided in the augmented manifest. You
     * can either train or test this data. If you don't specify, the default is
     * train.
     * </p>
     * <p>
     * TRAIN - all of the documents in the manifest will be used for training.
     * If no test documents are provided, Amazon Comprehend will automatically
     * reserve a portion of the training documents for testing.
     * </p>
     * <p>
     * TEST - all of the documents in the manifest will be used for testing.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TRAIN, TEST
     *
     * @param split <p>
     *            The purpose of the data you've provided in the augmented
     *            manifest. You can either train or test this data. If you don't
     *            specify, the default is train.
     *            </p>
     *            <p>
     *            TRAIN - all of the documents in the manifest will be used for
     *            training. If no test documents are provided, Amazon Comprehend
     *            will automatically reserve a portion of the training documents
     *            for testing.
     *            </p>
     *            <p>
     *            TEST - all of the documents in the manifest will be used for
     *            testing.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see Split
     */
    public AugmentedManifestsListItem withSplit(Split split) {
        this.split = split.toString();
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
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented
     * manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The S3 prefix to the annotation files that are referred in the
     *         augmented manifest file.
     *         </p>
     */
    public String getAnnotationDataS3Uri() {
        return annotationDataS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented
     * manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param annotationDataS3Uri <p>
     *            The S3 prefix to the annotation files that are referred in the
     *            augmented manifest file.
     *            </p>
     */
    public void setAnnotationDataS3Uri(String annotationDataS3Uri) {
        this.annotationDataS3Uri = annotationDataS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the annotation files that are referred in the augmented
     * manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param annotationDataS3Uri <p>
     *            The S3 prefix to the annotation files that are referred in the
     *            augmented manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AugmentedManifestsListItem withAnnotationDataS3Uri(String annotationDataS3Uri) {
        this.annotationDataS3Uri = annotationDataS3Uri;
        return this;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the
     * augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @return <p>
     *         The S3 prefix to the source files (PDFs) that are referred to in
     *         the augmented manifest file.
     *         </p>
     */
    public String getSourceDocumentsS3Uri() {
        return sourceDocumentsS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the
     * augmented manifest file.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param sourceDocumentsS3Uri <p>
     *            The S3 prefix to the source files (PDFs) that are referred to
     *            in the augmented manifest file.
     *            </p>
     */
    public void setSourceDocumentsS3Uri(String sourceDocumentsS3Uri) {
        this.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
    }

    /**
     * <p>
     * The S3 prefix to the source files (PDFs) that are referred to in the
     * augmented manifest file.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b> - 1024<br/>
     * <b>Pattern: </b>s3://[a-z0-9][\.\-a-z0-9]{1,61}[a-z0-9](/.*)?<br/>
     *
     * @param sourceDocumentsS3Uri <p>
     *            The S3 prefix to the source files (PDFs) that are referred to
     *            in the augmented manifest file.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public AugmentedManifestsListItem withSourceDocumentsS3Uri(String sourceDocumentsS3Uri) {
        this.sourceDocumentsS3Uri = sourceDocumentsS3Uri;
        return this;
    }

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     *
     * @return <p>
     *         The type of augmented manifest. PlainTextDocument or
     *         SemiStructuredDocument. If you don't specify, the default is
     *         PlainTextDocument.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents
     *         any unicode text that is encoded in UTF-8.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with
     *         positional and structural context, like a PDF. For training with
     *         Amazon Comprehend, only PDFs are supported. For inference, Amazon
     *         Comprehend support PDFs, DOCX and TXT.
     *         </p>
     *         </li>
     *         </ul>
     * @see AugmentedManifestsDocumentTypeFormat
     */
    public String getDocumentType() {
        return documentType;
    }

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     *
     * @param documentType <p>
     *            The type of augmented manifest. PlainTextDocument or
     *            SemiStructuredDocument. If you don't specify, the default is
     *            PlainTextDocument.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PLAIN_TEXT_DOCUMENT</code> A document type that
     *            represents any unicode text that is encoded in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with
     *            positional and structural context, like a PDF. For training
     *            with Amazon Comprehend, only PDFs are supported. For
     *            inference, Amazon Comprehend support PDFs, DOCX and TXT.
     *            </p>
     *            </li>
     *            </ul>
     * @see AugmentedManifestsDocumentTypeFormat
     */
    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     *
     * @param documentType <p>
     *            The type of augmented manifest. PlainTextDocument or
     *            SemiStructuredDocument. If you don't specify, the default is
     *            PlainTextDocument.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PLAIN_TEXT_DOCUMENT</code> A document type that
     *            represents any unicode text that is encoded in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with
     *            positional and structural context, like a PDF. For training
     *            with Amazon Comprehend, only PDFs are supported. For
     *            inference, Amazon Comprehend support PDFs, DOCX and TXT.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AugmentedManifestsDocumentTypeFormat
     */
    public AugmentedManifestsListItem withDocumentType(String documentType) {
        this.documentType = documentType;
        return this;
    }

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     *
     * @param documentType <p>
     *            The type of augmented manifest. PlainTextDocument or
     *            SemiStructuredDocument. If you don't specify, the default is
     *            PlainTextDocument.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PLAIN_TEXT_DOCUMENT</code> A document type that
     *            represents any unicode text that is encoded in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with
     *            positional and structural context, like a PDF. For training
     *            with Amazon Comprehend, only PDFs are supported. For
     *            inference, Amazon Comprehend support PDFs, DOCX and TXT.
     *            </p>
     *            </li>
     *            </ul>
     * @see AugmentedManifestsDocumentTypeFormat
     */
    public void setDocumentType(AugmentedManifestsDocumentTypeFormat documentType) {
        this.documentType = documentType.toString();
    }

    /**
     * <p>
     * The type of augmented manifest. PlainTextDocument or
     * SemiStructuredDocument. If you don't specify, the default is
     * PlainTextDocument.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PLAIN_TEXT_DOCUMENT</code> A document type that represents any
     * unicode text that is encoded in UTF-8.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with positional and
     * structural context, like a PDF. For training with Amazon Comprehend, only
     * PDFs are supported. For inference, Amazon Comprehend support PDFs, DOCX
     * and TXT.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>PLAIN_TEXT_DOCUMENT, SEMI_STRUCTURED_DOCUMENT
     *
     * @param documentType <p>
     *            The type of augmented manifest. PlainTextDocument or
     *            SemiStructuredDocument. If you don't specify, the default is
     *            PlainTextDocument.
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>PLAIN_TEXT_DOCUMENT</code> A document type that
     *            represents any unicode text that is encoded in UTF-8.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>SEMI_STRUCTURED_DOCUMENT</code> A document type with
     *            positional and structural context, like a PDF. For training
     *            with Amazon Comprehend, only PDFs are supported. For
     *            inference, Amazon Comprehend support PDFs, DOCX and TXT.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see AugmentedManifestsDocumentTypeFormat
     */
    public AugmentedManifestsListItem withDocumentType(
            AugmentedManifestsDocumentTypeFormat documentType) {
        this.documentType = documentType.toString();
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
        if (getSplit() != null)
            sb.append("Split: " + getSplit() + ",");
        if (getAttributeNames() != null)
            sb.append("AttributeNames: " + getAttributeNames() + ",");
        if (getAnnotationDataS3Uri() != null)
            sb.append("AnnotationDataS3Uri: " + getAnnotationDataS3Uri() + ",");
        if (getSourceDocumentsS3Uri() != null)
            sb.append("SourceDocumentsS3Uri: " + getSourceDocumentsS3Uri() + ",");
        if (getDocumentType() != null)
            sb.append("DocumentType: " + getDocumentType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getS3Uri() == null) ? 0 : getS3Uri().hashCode());
        hashCode = prime * hashCode + ((getSplit() == null) ? 0 : getSplit().hashCode());
        hashCode = prime * hashCode
                + ((getAttributeNames() == null) ? 0 : getAttributeNames().hashCode());
        hashCode = prime * hashCode
                + ((getAnnotationDataS3Uri() == null) ? 0 : getAnnotationDataS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getSourceDocumentsS3Uri() == null) ? 0 : getSourceDocumentsS3Uri().hashCode());
        hashCode = prime * hashCode
                + ((getDocumentType() == null) ? 0 : getDocumentType().hashCode());
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
        if (other.getSplit() == null ^ this.getSplit() == null)
            return false;
        if (other.getSplit() != null && other.getSplit().equals(this.getSplit()) == false)
            return false;
        if (other.getAttributeNames() == null ^ this.getAttributeNames() == null)
            return false;
        if (other.getAttributeNames() != null
                && other.getAttributeNames().equals(this.getAttributeNames()) == false)
            return false;
        if (other.getAnnotationDataS3Uri() == null ^ this.getAnnotationDataS3Uri() == null)
            return false;
        if (other.getAnnotationDataS3Uri() != null
                && other.getAnnotationDataS3Uri().equals(this.getAnnotationDataS3Uri()) == false)
            return false;
        if (other.getSourceDocumentsS3Uri() == null ^ this.getSourceDocumentsS3Uri() == null)
            return false;
        if (other.getSourceDocumentsS3Uri() != null
                && other.getSourceDocumentsS3Uri().equals(this.getSourceDocumentsS3Uri()) == false)
            return false;
        if (other.getDocumentType() == null ^ this.getDocumentType() == null)
            return false;
        if (other.getDocumentType() != null
                && other.getDocumentType().equals(this.getDocumentType()) == false)
            return false;
        return true;
    }
}
