/*
 * Copyright 2010-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

package com.amazonaws.services.textract.model;

import java.io.Serializable;

/**
 * <p>
 * A warning about an issue that occurred during asynchronous text analysis
 * (<a>StartDocumentAnalysis</a>) or asynchronous document text detection
 * (<a>StartDocumentTextDetection</a>).
 * </p>
 */
public class Warning implements Serializable {
    /**
     * <p>
     * The error code for the warning.
     * </p>
     */
    private String errorCode;

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     */
    private java.util.List<Integer> pages;

    /**
     * <p>
     * The error code for the warning.
     * </p>
     *
     * @return <p>
     *         The error code for the warning.
     *         </p>
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The error code for the warning.
     * </p>
     *
     * @param errorCode <p>
     *            The error code for the warning.
     *            </p>
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code for the warning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param errorCode <p>
     *            The error code for the warning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     *
     * @return <p>
     *         A list of the pages that the warning applies to.
     *         </p>
     */
    public java.util.List<Integer> getPages() {
        return pages;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     *
     * @param pages <p>
     *            A list of the pages that the warning applies to.
     *            </p>
     */
    public void setPages(java.util.Collection<Integer> pages) {
        if (pages == null) {
            this.pages = null;
            return;
        }

        this.pages = new java.util.ArrayList<Integer>(pages);
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            A list of the pages that the warning applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withPages(Integer... pages) {
        if (getPages() == null) {
            this.pages = new java.util.ArrayList<Integer>(pages.length);
        }
        for (Integer value : pages) {
            this.pages.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of the pages that the warning applies to.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pages <p>
     *            A list of the pages that the warning applies to.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Warning withPages(java.util.Collection<Integer> pages) {
        setPages(pages);
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: " + getErrorCode() + ",");
        if (getPages() != null)
            sb.append("Pages: " + getPages());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getPages() == null) ? 0 : getPages().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Warning == false)
            return false;
        Warning other = (Warning) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getPages() == null ^ this.getPages() == null)
            return false;
        if (other.getPages() != null && other.getPages().equals(this.getPages()) == false)
            return false;
        return true;
    }
}
