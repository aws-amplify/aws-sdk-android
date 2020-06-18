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
 * A code and name pair that represents the severity level of a support case.
 * The available values depend on the support plan for the account. For more
 * information, see <a href=
 * "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
 * >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
 * </p>
 */
public class SeverityLevel implements Serializable {
    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code>
     * | <code>urgent</code> | <code>critical</code>
     * </p>
     */
    private String code;

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level
     * code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API differ from the values that are displayed
     * in the AWS Support Center. For example, for the code "low", the API name
     * is "Low", but the name in the Support Center is "General guidance". These
     * are the Support Center code/name mappings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code>: General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code>: System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code>: Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code>: Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     * >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     */
    private String name;

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code>
     * | <code>urgent</code> | <code>critical</code>
     * </p>
     *
     * @return <p>
     *         The code for case severity level.
     *         </p>
     *         <p>
     *         Valid values: <code>low</code> | <code>normal</code> |
     *         <code>high</code> | <code>urgent</code> | <code>critical</code>
     *         </p>
     */
    public String getCode() {
        return code;
    }

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code>
     * | <code>urgent</code> | <code>critical</code>
     * </p>
     *
     * @param code <p>
     *            The code for case severity level.
     *            </p>
     *            <p>
     *            Valid values: <code>low</code> | <code>normal</code> |
     *            <code>high</code> | <code>urgent</code> |
     *            <code>critical</code>
     *            </p>
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * <p>
     * The code for case severity level.
     * </p>
     * <p>
     * Valid values: <code>low</code> | <code>normal</code> | <code>high</code>
     * | <code>urgent</code> | <code>critical</code>
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param code <p>
     *            The code for case severity level.
     *            </p>
     *            <p>
     *            Valid values: <code>low</code> | <code>normal</code> |
     *            <code>high</code> | <code>urgent</code> |
     *            <code>critical</code>
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeverityLevel withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level
     * code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API differ from the values that are displayed
     * in the AWS Support Center. For example, for the code "low", the API name
     * is "Low", but the name in the Support Center is "General guidance". These
     * are the Support Center code/name mappings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code>: General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code>: System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code>: Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code>: Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     * >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     *
     * @return <p>
     *         The name of the severity level that corresponds to the severity
     *         level code.
     *         </p>
     *         <note>
     *         <p>
     *         The values returned by the API differ from the values that are
     *         displayed in the AWS Support Center. For example, for the code
     *         "low", the API name is "Low", but the name in the Support Center
     *         is "General guidance". These are the Support Center code/name
     *         mappings:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>low</code>: General guidance
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>normal</code>: System impaired
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>high</code>: Production system impaired
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>urgent</code>: Production system down
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>critical</code>: Business-critical system down
     *         </p>
     *         </li>
     *         </ul>
     *         </note>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     *         >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     *         </p>
     */
    public String getName() {
        return name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level
     * code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API differ from the values that are displayed
     * in the AWS Support Center. For example, for the code "low", the API name
     * is "Low", but the name in the Support Center is "General guidance". These
     * are the Support Center code/name mappings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code>: General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code>: System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code>: Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code>: Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     * >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     *
     * @param name <p>
     *            The name of the severity level that corresponds to the
     *            severity level code.
     *            </p>
     *            <note>
     *            <p>
     *            The values returned by the API differ from the values that are
     *            displayed in the AWS Support Center. For example, for the code
     *            "low", the API name is "Low", but the name in the Support
     *            Center is "General guidance". These are the Support Center
     *            code/name mappings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>low</code>: General guidance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>normal</code>: System impaired
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>high</code>: Production system impaired
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>urgent</code>: Production system down
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>critical</code>: Business-critical system down
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     *            >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     *            </p>
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the severity level that corresponds to the severity level
     * code.
     * </p>
     * <note>
     * <p>
     * The values returned by the API differ from the values that are displayed
     * in the AWS Support Center. For example, for the code "low", the API name
     * is "Low", but the name in the Support Center is "General guidance". These
     * are the Support Center code/name mappings:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>low</code>: General guidance
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>normal</code>: System impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>high</code>: Production system impaired
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>urgent</code>: Production system down
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>critical</code>: Business-critical system down
     * </p>
     * </li>
     * </ul>
     * </note>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     * >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param name <p>
     *            The name of the severity level that corresponds to the
     *            severity level code.
     *            </p>
     *            <note>
     *            <p>
     *            The values returned by the API differ from the values that are
     *            displayed in the AWS Support Center. For example, for the code
     *            "low", the API name is "Low", but the name in the Support
     *            Center is "General guidance". These are the Support Center
     *            code/name mappings:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            <code>low</code>: General guidance
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>normal</code>: System impaired
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>high</code>: Production system impaired
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>urgent</code>: Production system down
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            <code>critical</code>: Business-critical system down
     *            </p>
     *            </li>
     *            </ul>
     *            </note>
     *            <p>
     *            For more information, see <a href=
     *            "https://docs.aws.amazon.com/awssupport/latest/user/case-management.html#choosing-severity"
     *            >Choosing a severity</a> in the <i>AWS Support User Guide</i>.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public SeverityLevel withName(String name) {
        this.name = name;
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
            sb.append("name: " + getName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCode() == null) ? 0 : getCode().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SeverityLevel == false)
            return false;
        SeverityLevel other = (SeverityLevel) obj;

        if (other.getCode() == null ^ this.getCode() == null)
            return false;
        if (other.getCode() != null && other.getCode().equals(this.getCode()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        return true;
    }
}
