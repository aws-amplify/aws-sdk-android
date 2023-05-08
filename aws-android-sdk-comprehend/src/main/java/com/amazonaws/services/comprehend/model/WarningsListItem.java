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
 * The system identified one of the following warnings while processing the
 * input document:
 * </p>
 * <ul>
 * <li>
 * <p>
 * The document to classify is plain text, but the classifier is a native model.
 * </p>
 * </li>
 * <li>
 * <p>
 * The document to classify is semi-structured, but the classifier is a
 * plain-text model.
 * </p>
 * </li>
 * </ul>
 */
public class WarningsListItem implements Serializable {
    /**
     * <p>
     * Page number in the input document.
     * </p>
     */
    private Integer page;

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     */
    private String warnCode;

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String warnMessage;

    /**
     * <p>
     * Page number in the input document.
     * </p>
     *
     * @return <p>
     *         Page number in the input document.
     *         </p>
     */
    public Integer getPage() {
        return page;
    }

    /**
     * <p>
     * Page number in the input document.
     * </p>
     *
     * @param page <p>
     *            Page number in the input document.
     *            </p>
     */
    public void setPage(Integer page) {
        this.page = page;
    }

    /**
     * <p>
     * Page number in the input document.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param page <p>
     *            Page number in the input document.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WarningsListItem withPage(Integer page) {
        this.page = page;
        return this;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     *
     * @return <p>
     *         The type of warning.
     *         </p>
     * @see PageBasedWarningCode
     */
    public String getWarnCode() {
        return warnCode;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     *
     * @param warnCode <p>
     *            The type of warning.
     *            </p>
     * @see PageBasedWarningCode
     */
    public void setWarnCode(String warnCode) {
        this.warnCode = warnCode;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     *
     * @param warnCode <p>
     *            The type of warning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PageBasedWarningCode
     */
    public WarningsListItem withWarnCode(String warnCode) {
        this.warnCode = warnCode;
        return this;
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     *
     * @param warnCode <p>
     *            The type of warning.
     *            </p>
     * @see PageBasedWarningCode
     */
    public void setWarnCode(PageBasedWarningCode warnCode) {
        this.warnCode = warnCode.toString();
    }

    /**
     * <p>
     * The type of warning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>INFERENCING_PLAINTEXT_WITH_NATIVE_TRAINED_MODEL,
     * INFERENCING_NATIVE_DOCUMENT_WITH_PLAINTEXT_TRAINED_MODEL
     *
     * @param warnCode <p>
     *            The type of warning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see PageBasedWarningCode
     */
    public WarningsListItem withWarnCode(PageBasedWarningCode warnCode) {
        this.warnCode = warnCode.toString();
        return this;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return <p>
     *         Text message associated with the warning.
     *         </p>
     */
    public String getWarnMessage() {
        return warnMessage;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param warnMessage <p>
     *            Text message associated with the warning.
     *            </p>
     */
    public void setWarnMessage(String warnMessage) {
        this.warnMessage = warnMessage;
    }

    /**
     * <p>
     * Text message associated with the warning.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param warnMessage <p>
     *            Text message associated with the warning.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public WarningsListItem withWarnMessage(String warnMessage) {
        this.warnMessage = warnMessage;
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
        if (getPage() != null)
            sb.append("Page: " + getPage() + ",");
        if (getWarnCode() != null)
            sb.append("WarnCode: " + getWarnCode() + ",");
        if (getWarnMessage() != null)
            sb.append("WarnMessage: " + getWarnMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPage() == null) ? 0 : getPage().hashCode());
        hashCode = prime * hashCode + ((getWarnCode() == null) ? 0 : getWarnCode().hashCode());
        hashCode = prime * hashCode
                + ((getWarnMessage() == null) ? 0 : getWarnMessage().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WarningsListItem == false)
            return false;
        WarningsListItem other = (WarningsListItem) obj;

        if (other.getPage() == null ^ this.getPage() == null)
            return false;
        if (other.getPage() != null && other.getPage().equals(this.getPage()) == false)
            return false;
        if (other.getWarnCode() == null ^ this.getWarnCode() == null)
            return false;
        if (other.getWarnCode() != null && other.getWarnCode().equals(this.getWarnCode()) == false)
            return false;
        if (other.getWarnMessage() == null ^ this.getWarnMessage() == null)
            return false;
        if (other.getWarnMessage() != null
                && other.getWarnMessage().equals(this.getWarnMessage()) == false)
            return false;
        return true;
    }
}
