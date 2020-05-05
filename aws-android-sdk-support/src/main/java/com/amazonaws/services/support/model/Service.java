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

package com.amazonaws.services.support.model;

import java.io.Serializable;

/**
 * <p>
 * Information about an AWS service returned by the <a>DescribeServices</a>
 * operation.
 * </p>
 */
public class Service implements Serializable {
    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a>
     * response. The <code>name</code> element contains the corresponding
     * friendly name.
     * </p>
     */
    private String code;

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element
     * contains the corresponding code.
     * </p>
     */
    private String name;

    /**
     * <p>
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * </p>
     */
    private java.util.List<Category> categories;

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a>
     * response. The <code>name</code> element contains the corresponding
     * friendly name.
     * </p>
     *
     * @return <p>
     *         The code for an AWS service returned by the
     *         <a>DescribeServices</a> response. The <code>name</code> element
     *         contains the corresponding friendly name.
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a>
     * response. The <code>name</code> element contains the corresponding
     * friendly name.
     * </p>
     *
     * @param code <p>
     *            The code for an AWS service returned by the
     *            <a>DescribeServices</a> response. The <code>name</code>
     *            element contains the corresponding friendly name.
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for an AWS service returned by the <a>DescribeServices</a>
     * response. The <code>name</code> element contains the corresponding
     * friendly name.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The code for an AWS service returned by the
     *            <a>DescribeServices</a> response. The <code>name</code>
     *            element contains the corresponding friendly name.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element
     * contains the corresponding code.
     * </p>
     *
     * @return <p>
     *         The friendly name for an AWS service. The <code>code</code>
     *         element contains the corresponding code.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element
     * contains the corresponding code.
     * </p>
     *
     * @param name <p>
     *            The friendly name for an AWS service. The <code>code</code>
     *            element contains the corresponding code.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The friendly name for an AWS service. The <code>code</code> element
     * contains the corresponding code.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The friendly name for an AWS service. The <code>code</code>
     *            element contains the corresponding code.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * </p>
     *
     * @return <p>
     *         A list of categories that describe the type of support issue a
     *         case describes. Categories consist of a category name and a
     *         category code. Category names and codes are passed to AWS Support
     *         when you call <a>CreateCase</a>.
     *         </p>
     */
    public java.util.List<Category> getCategories() {
        return categories;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * </p>
     *
     * @param categories <p>
     *            A list of categories that describe the type of support issue a
     *            case describes. Categories consist of a category name and a
     *            category code. Category names and codes are passed to AWS
     *            Support when you call <a>CreateCase</a>.
     *            </p>
     */
    public void setCategories(java.util.Collection<Category> categories) {
        if (categories == null) {
            this.categories = null;
            return;
        }

        this.categories = new java.util.ArrayList<Category>(categories);
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of categories that describe the type of support issue a
     *            case describes. Categories consist of a category name and a
     *            category code. Category names and codes are passed to AWS
     *            Support when you call <a>CreateCase</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCategories(Category... categories) {
        if (getCategories() == null) {
            this.categories = new java.util.ArrayList<Category>(categories.length);
        }
        for (Category value : categories) {
            this.categories.add(value);
        }
        return this;
    }

    /**
     * <p>
     * A list of categories that describe the type of support issue a case
     * describes. Categories consist of a category name and a category code.
     * Category names and codes are passed to AWS Support when you call
     * <a>CreateCase</a>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param categories <p>
     *            A list of categories that describe the type of support issue a
     *            case describes. Categories consist of a category name and a
     *            category code. Category names and codes are passed to AWS
     *            Support when you call <a>CreateCase</a>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Service withCategories(java.util.Collection<Category> categories) {
        setCategories(categories);
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
        if (getCode() != null)
            sb.append("code: " + getCode() + ",");
        if (getName() != null)
            sb.append("name: " + getName() + ",");
        if (getCategories() != null)
            sb.append("categories: " + getCategories());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getCategories() == null) ? 0 : getCategories().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Service == false)
            return false;
        Service other = (Service) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getCategories() == null ^ this.getCategories() == null)
            return false;
        if (other.getCategories() != null
                && other.getCategories().equals(this.getCategories()) == false)
            return false;
        return true;
    }
}
