/*
 * Copyright 2010-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Provides information about a document classifier.
 * </p>
 */
public class ClassifierMetadata implements Serializable {
    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     */
    private Integer numberOfLabels;

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * classifier. Typically this is 80 to 90 percent of the input documents.
     * </p>
     */
    private Integer numberOfTrainedDocuments;

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * classifier. Typically this is 10 to 20 percent of the input documents.
     * </p>
     */
    private Integer numberOfTestDocuments;

    /**
     * <p>
     * Describes the result metrics for the test data associated with an
     * documentation classifier.
     * </p>
     */
    private ClassifierEvaluationMetrics evaluationMetrics;

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     *
     * @return <p>
     *         The number of labels in the input data.
     *         </p>
     */
    public Integer getNumberOfLabels() {
        return numberOfLabels;
    }

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     *
     * @param numberOfLabels <p>
     *            The number of labels in the input data.
     *            </p>
     */
    public void setNumberOfLabels(Integer numberOfLabels) {
        this.numberOfLabels = numberOfLabels;
    }

    /**
     * <p>
     * The number of labels in the input data.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfLabels <p>
     *            The number of labels in the input data.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierMetadata withNumberOfLabels(Integer numberOfLabels) {
        this.numberOfLabels = numberOfLabels;
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * classifier. Typically this is 80 to 90 percent of the input documents.
     * </p>
     *
     * @return <p>
     *         The number of documents in the input data that were used to train
     *         the classifier. Typically this is 80 to 90 percent of the input
     *         documents.
     *         </p>
     */
    public Integer getNumberOfTrainedDocuments() {
        return numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * classifier. Typically this is 80 to 90 percent of the input documents.
     * </p>
     *
     * @param numberOfTrainedDocuments <p>
     *            The number of documents in the input data that were used to
     *            train the classifier. Typically this is 80 to 90 percent of
     *            the input documents.
     *            </p>
     */
    public void setNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to train the
     * classifier. Typically this is 80 to 90 percent of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfTrainedDocuments <p>
     *            The number of documents in the input data that were used to
     *            train the classifier. Typically this is 80 to 90 percent of
     *            the input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierMetadata withNumberOfTrainedDocuments(Integer numberOfTrainedDocuments) {
        this.numberOfTrainedDocuments = numberOfTrainedDocuments;
        return this;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * classifier. Typically this is 10 to 20 percent of the input documents.
     * </p>
     *
     * @return <p>
     *         The number of documents in the input data that were used to test
     *         the classifier. Typically this is 10 to 20 percent of the input
     *         documents.
     *         </p>
     */
    public Integer getNumberOfTestDocuments() {
        return numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * classifier. Typically this is 10 to 20 percent of the input documents.
     * </p>
     *
     * @param numberOfTestDocuments <p>
     *            The number of documents in the input data that were used to
     *            test the classifier. Typically this is 10 to 20 percent of the
     *            input documents.
     *            </p>
     */
    public void setNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
    }

    /**
     * <p>
     * The number of documents in the input data that were used to test the
     * classifier. Typically this is 10 to 20 percent of the input documents.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param numberOfTestDocuments <p>
     *            The number of documents in the input data that were used to
     *            test the classifier. Typically this is 10 to 20 percent of the
     *            input documents.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierMetadata withNumberOfTestDocuments(Integer numberOfTestDocuments) {
        this.numberOfTestDocuments = numberOfTestDocuments;
        return this;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an
     * documentation classifier.
     * </p>
     *
     * @return <p>
     *         Describes the result metrics for the test data associated with an
     *         documentation classifier.
     *         </p>
     */
    public ClassifierEvaluationMetrics getEvaluationMetrics() {
        return evaluationMetrics;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an
     * documentation classifier.
     * </p>
     *
     * @param evaluationMetrics <p>
     *            Describes the result metrics for the test data associated with
     *            an documentation classifier.
     *            </p>
     */
    public void setEvaluationMetrics(ClassifierEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
    }

    /**
     * <p>
     * Describes the result metrics for the test data associated with an
     * documentation classifier.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param evaluationMetrics <p>
     *            Describes the result metrics for the test data associated with
     *            an documentation classifier.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public ClassifierMetadata withEvaluationMetrics(ClassifierEvaluationMetrics evaluationMetrics) {
        this.evaluationMetrics = evaluationMetrics;
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
        if (getNumberOfLabels() != null)
            sb.append("NumberOfLabels: " + getNumberOfLabels() + ",");
        if (getNumberOfTrainedDocuments() != null)
            sb.append("NumberOfTrainedDocuments: " + getNumberOfTrainedDocuments() + ",");
        if (getNumberOfTestDocuments() != null)
            sb.append("NumberOfTestDocuments: " + getNumberOfTestDocuments() + ",");
        if (getEvaluationMetrics() != null)
            sb.append("EvaluationMetrics: " + getEvaluationMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode
                + ((getNumberOfLabels() == null) ? 0 : getNumberOfLabels().hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfTrainedDocuments() == null) ? 0 : getNumberOfTrainedDocuments()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNumberOfTestDocuments() == null) ? 0 : getNumberOfTestDocuments().hashCode());
        hashCode = prime * hashCode
                + ((getEvaluationMetrics() == null) ? 0 : getEvaluationMetrics().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClassifierMetadata == false)
            return false;
        ClassifierMetadata other = (ClassifierMetadata) obj;

        if (other.getNumberOfLabels() == null ^ this.getNumberOfLabels() == null)
            return false;
        if (other.getNumberOfLabels() != null
                && other.getNumberOfLabels().equals(this.getNumberOfLabels()) == false)
            return false;
        if (other.getNumberOfTrainedDocuments() == null
                ^ this.getNumberOfTrainedDocuments() == null)
            return false;
        if (other.getNumberOfTrainedDocuments() != null
                && other.getNumberOfTrainedDocuments().equals(this.getNumberOfTrainedDocuments()) == false)
            return false;
        if (other.getNumberOfTestDocuments() == null ^ this.getNumberOfTestDocuments() == null)
            return false;
        if (other.getNumberOfTestDocuments() != null
                && other.getNumberOfTestDocuments().equals(this.getNumberOfTestDocuments()) == false)
            return false;
        if (other.getEvaluationMetrics() == null ^ this.getEvaluationMetrics() == null)
            return false;
        if (other.getEvaluationMetrics() != null
                && other.getEvaluationMetrics().equals(this.getEvaluationMetrics()) == false)
            return false;
        return true;
    }
}
