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

package com.amazonaws.services.awselementalmediaconvert.model;

import java.io.Serializable;

/**
 * Settings for Teletext caption output
 */
public class TeletextDestinationSettings implements Serializable {
    /**
     * Set pageNumber to the Teletext page number for the destination captions
     * for this output. This value must be a three-digit hexadecimal string;
     * strings ending in -FF are invalid. If you are passing through the entire
     * set of Teletext data, do not use this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[1-8][0-9a-fA-F][0-9a-eA-E]$<br/>
     */
    private String pageNumber;

    /**
     * Specify the page types for this Teletext page. If you don't specify a
     * value here, the service sets the page type to the default value Subtitle
     * (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext
     * data, don't use this field. When you pass through a set of Teletext
     * pages, your output has the same page types as your input.
     */
    private java.util.List<String> pageTypes;

    /**
     * Set pageNumber to the Teletext page number for the destination captions
     * for this output. This value must be a three-digit hexadecimal string;
     * strings ending in -FF are invalid. If you are passing through the entire
     * set of Teletext data, do not use this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[1-8][0-9a-fA-F][0-9a-eA-E]$<br/>
     *
     * @return Set pageNumber to the Teletext page number for the destination
     *         captions for this output. This value must be a three-digit
     *         hexadecimal string; strings ending in -FF are invalid. If you are
     *         passing through the entire set of Teletext data, do not use this
     *         field.
     */
    public String getPageNumber() {
        return pageNumber;
    }

    /**
     * Set pageNumber to the Teletext page number for the destination captions
     * for this output. This value must be a three-digit hexadecimal string;
     * strings ending in -FF are invalid. If you are passing through the entire
     * set of Teletext data, do not use this field.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[1-8][0-9a-fA-F][0-9a-eA-E]$<br/>
     *
     * @param pageNumber Set pageNumber to the Teletext page number for the
     *            destination captions for this output. This value must be a
     *            three-digit hexadecimal string; strings ending in -FF are
     *            invalid. If you are passing through the entire set of Teletext
     *            data, do not use this field.
     */
    public void setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
    }

    /**
     * Set pageNumber to the Teletext page number for the destination captions
     * for this output. This value must be a three-digit hexadecimal string;
     * strings ending in -FF are invalid. If you are passing through the entire
     * set of Teletext data, do not use this field.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>3 - 3<br/>
     * <b>Pattern: </b>^[1-8][0-9a-fA-F][0-9a-eA-E]$<br/>
     *
     * @param pageNumber Set pageNumber to the Teletext page number for the
     *            destination captions for this output. This value must be a
     *            three-digit hexadecimal string; strings ending in -FF are
     *            invalid. If you are passing through the entire set of Teletext
     *            data, do not use this field.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TeletextDestinationSettings withPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }

    /**
     * Specify the page types for this Teletext page. If you don't specify a
     * value here, the service sets the page type to the default value Subtitle
     * (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext
     * data, don't use this field. When you pass through a set of Teletext
     * pages, your output has the same page types as your input.
     *
     * @return Specify the page types for this Teletext page. If you don't
     *         specify a value here, the service sets the page type to the
     *         default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through
     *         the entire set of Teletext data, don't use this field. When you
     *         pass through a set of Teletext pages, your output has the same
     *         page types as your input.
     */
    public java.util.List<String> getPageTypes() {
        return pageTypes;
    }

    /**
     * Specify the page types for this Teletext page. If you don't specify a
     * value here, the service sets the page type to the default value Subtitle
     * (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext
     * data, don't use this field. When you pass through a set of Teletext
     * pages, your output has the same page types as your input.
     *
     * @param pageTypes Specify the page types for this Teletext page. If you
     *            don't specify a value here, the service sets the page type to
     *            the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass
     *            through the entire set of Teletext data, don't use this field.
     *            When you pass through a set of Teletext pages, your output has
     *            the same page types as your input.
     */
    public void setPageTypes(java.util.Collection<String> pageTypes) {
        if (pageTypes == null) {
            this.pageTypes = null;
            return;
        }

        this.pageTypes = new java.util.ArrayList<String>(pageTypes);
    }

    /**
     * Specify the page types for this Teletext page. If you don't specify a
     * value here, the service sets the page type to the default value Subtitle
     * (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext
     * data, don't use this field. When you pass through a set of Teletext
     * pages, your output has the same page types as your input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageTypes Specify the page types for this Teletext page. If you
     *            don't specify a value here, the service sets the page type to
     *            the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass
     *            through the entire set of Teletext data, don't use this field.
     *            When you pass through a set of Teletext pages, your output has
     *            the same page types as your input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TeletextDestinationSettings withPageTypes(String... pageTypes) {
        if (getPageTypes() == null) {
            this.pageTypes = new java.util.ArrayList<String>(pageTypes.length);
        }
        for (String value : pageTypes) {
            this.pageTypes.add(value);
        }
        return this;
    }

    /**
     * Specify the page types for this Teletext page. If you don't specify a
     * value here, the service sets the page type to the default value Subtitle
     * (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext
     * data, don't use this field. When you pass through a set of Teletext
     * pages, your output has the same page types as your input.
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param pageTypes Specify the page types for this Teletext page. If you
     *            don't specify a value here, the service sets the page type to
     *            the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass
     *            through the entire set of Teletext data, don't use this field.
     *            When you pass through a set of Teletext pages, your output has
     *            the same page types as your input.
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public TeletextDestinationSettings withPageTypes(java.util.Collection<String> pageTypes) {
        setPageTypes(pageTypes);
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
        if (getPageNumber() != null)
            sb.append("PageNumber: " + getPageNumber() + ",");
        if (getPageTypes() != null)
            sb.append("PageTypes: " + getPageTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPageNumber() == null) ? 0 : getPageNumber().hashCode());
        hashCode = prime * hashCode + ((getPageTypes() == null) ? 0 : getPageTypes().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TeletextDestinationSettings == false)
            return false;
        TeletextDestinationSettings other = (TeletextDestinationSettings) obj;

        if (other.getPageNumber() == null ^ this.getPageNumber() == null)
            return false;
        if (other.getPageNumber() != null
                && other.getPageNumber().equals(this.getPageNumber()) == false)
            return false;
        if (other.getPageTypes() == null ^ this.getPageTypes() == null)
            return false;
        if (other.getPageTypes() != null
                && other.getPageTypes().equals(this.getPageTypes()) == false)
            return false;
        return true;
    }
}
