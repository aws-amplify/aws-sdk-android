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

public class BatchDetectSyntaxResult implements Serializable {
    /**
     * <p>
     * A list of objects containing the results of the operation. The results
     * are sorted in ascending order by the <code>Index</code> field and match
     * the order of the documents in the input list. If all of the documents
     * contain an error, the <code>ResultList</code> is empty.
     * </p>
     */
    private java.util.List<BatchDetectSyntaxItemResult> resultList;

    /**
     * <p>
     * A list containing one object for each document that contained an error.
     * The results are sorted in ascending order by the <code>Index</code> field
     * and match the order of the documents in the input list. If there are no
     * errors in the batch, the <code>ErrorList</code> is empty.
     * </p>
     */
    private java.util.List<BatchItemError> errorList;

    /**
     * <p>
     * A list of objects containing the results of the operation. The results
     * are sorted in ascending order by the <code>Index</code> field and match
     * the order of the documents in the input list. If all of the documents
     * contain an error, the <code>ResultList</code> is empty.
     * </p>
     *
     * @return <p>
     *         A list of objects containing the results of the operation. The
     *         results are sorted in ascending order by the <code>Index</code>
     *         field and match the order of the documents in the input list. If
     *         all of the documents contain an error, the
     *         <code>ResultList</code> is empty.
     *         </p>
     */
    public java.util.List<BatchDetectSyntaxItemResult> getResultList() {
        return resultList;
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results
     * are sorted in ascending order by the <code>Index</code> field and match
     * the order of the documents in the input list. If all of the documents
     * contain an error, the <code>ResultList</code> is empty.
     * </p>
     *
     * @param resultList <p>
     *            A list of objects containing the results of the operation. The
     *            results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If all of the documents contain an error,
     *            the <code>ResultList</code> is empty.
     *            </p>
     */
    public void setResultList(java.util.Collection<BatchDetectSyntaxItemResult> resultList) {
        if (resultList == null) {
            this.resultList = null;
            return;
        }

        this.resultList = new java.util.ArrayList<BatchDetectSyntaxItemResult>(resultList);
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results
     * are sorted in ascending order by the <code>Index</code> field and match
     * the order of the documents in the input list. If all of the documents
     * contain an error, the <code>ResultList</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultList <p>
     *            A list of objects containing the results of the operation. The
     *            results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If all of the documents contain an error,
     *            the <code>ResultList</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxResult withResultList(BatchDetectSyntaxItemResult... resultList) {
        if (getResultList() == null) {
            this.resultList = new java.util.ArrayList<BatchDetectSyntaxItemResult>(
                    resultList.length);
        }
        for (BatchDetectSyntaxItemResult value : resultList) {
            this.resultList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of objects containing the results of the operation. The results
     * are sorted in ascending order by the <code>Index</code> field and match
     * the order of the documents in the input list. If all of the documents
     * contain an error, the <code>ResultList</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param resultList <p>
     *            A list of objects containing the results of the operation. The
     *            results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If all of the documents contain an error,
     *            the <code>ResultList</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxResult withResultList(
            java.util.Collection<BatchDetectSyntaxItemResult> resultList) {
        setResultList(resultList);
        return this;
    }

    /**
     * <p>
     * A list containing one object for each document that contained an error.
     * The results are sorted in ascending order by the <code>Index</code> field
     * and match the order of the documents in the input list. If there are no
     * errors in the batch, the <code>ErrorList</code> is empty.
     * </p>
     *
     * @return <p>
     *         A list containing one object for each document that contained an
     *         error. The results are sorted in ascending order by the
     *         <code>Index</code> field and match the order of the documents in
     *         the input list. If there are no errors in the batch, the
     *         <code>ErrorList</code> is empty.
     *         </p>
     */
    public java.util.List<BatchItemError> getErrorList() {
        return errorList;
    }

    /**
     * <p>
     * A list containing one object for each document that contained an error.
     * The results are sorted in ascending order by the <code>Index</code> field
     * and match the order of the documents in the input list. If there are no
     * errors in the batch, the <code>ErrorList</code> is empty.
     * </p>
     *
     * @param errorList <p>
     *            A list containing one object for each document that contained
     *            an error. The results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If there are no errors in the batch, the
     *            <code>ErrorList</code> is empty.
     *            </p>
     */
    public void setErrorList(java.util.Collection<BatchItemError> errorList) {
        if (errorList == null) {
            this.errorList = null;
            return;
        }

        this.errorList = new java.util.ArrayList<BatchItemError>(errorList);
    }

    /**
     * <p>
     * A list containing one object for each document that contained an error.
     * The results are sorted in ascending order by the <code>Index</code> field
     * and match the order of the documents in the input list. If there are no
     * errors in the batch, the <code>ErrorList</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorList <p>
     *            A list containing one object for each document that contained
     *            an error. The results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If there are no errors in the batch, the
     *            <code>ErrorList</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxResult withErrorList(BatchItemError... errorList) {
        if (getErrorList() == null) {
            this.errorList = new java.util.ArrayList<BatchItemError>(errorList.length);
        }
        for (BatchItemError value : errorList) {
            this.errorList.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list containing one object for each document that contained an error.
     * The results are sorted in ascending order by the <code>Index</code> field
     * and match the order of the documents in the input list. If there are no
     * errors in the batch, the <code>ErrorList</code> is empty.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorList <p>
     *            A list containing one object for each document that contained
     *            an error. The results are sorted in ascending order by the
     *            <code>Index</code> field and match the order of the documents
     *            in the input list. If there are no errors in the batch, the
     *            <code>ErrorList</code> is empty.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public BatchDetectSyntaxResult withErrorList(java.util.Collection<BatchItemError> errorList) {
        setErrorList(errorList);
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
        if (getResultList() != null)
            sb.append("ResultList: " + getResultList() + ",");
        if (getErrorList() != null)
            sb.append("ErrorList: " + getErrorList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResultList() == null) ? 0 : getResultList().hashCode());
        hashCode = prime * hashCode + ((getErrorList() == null) ? 0 : getErrorList().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDetectSyntaxResult == false)
            return false;
        BatchDetectSyntaxResult other = (BatchDetectSyntaxResult) obj;

        if (other.getResultList() == null ^ this.getResultList() == null)
            return false;
        if (other.getResultList() != null
                && other.getResultList().equals(this.getResultList()) == false)
            return false;
        if (other.getErrorList() == null ^ this.getErrorList() == null)
            return false;
        if (other.getErrorList() != null
                && other.getErrorList().equals(this.getErrorList()) == false)
            return false;
        return true;
    }
}
