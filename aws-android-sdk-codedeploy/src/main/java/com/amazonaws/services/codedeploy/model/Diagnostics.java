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

package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Diagnostic information about executable scripts that are part of a
 * deployment.
 * </p>
 */
public class Diagnostics implements Serializable {
    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     */
    private String errorCode;

    /**
     * <p>
     * The name of the script.
     * </p>
     */
    private String scriptName;

    /**
     * <p>
     * The message associated with the error.
     * </p>
     */
    private String message;

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the
     * diagnostic log.
     * </p>
     */
    private String logTail;

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @return <p>
     *         The associated error code:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Success: The specified script ran.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptMissing: The specified script was not found in the
     *         specified location.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptNotExecutable: The specified script is not a recognized
     *         executable file type.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptTimedOut: The specified script did not finish running in
     *         the specified time period.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ScriptFailed: The specified script failed to run as expected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         UnknownError: The specified script did not run for an unknown
     *         reason.
     *         </p>
     *         </li>
     *         </ul>
     * @see LifecycleErrorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode <p>
     *            The associated error code:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Success: The specified script ran.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptMissing: The specified script was not found in the
     *            specified location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptNotExecutable: The specified script is not a recognized
     *            executable file type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptTimedOut: The specified script did not finish running in
     *            the specified time period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptFailed: The specified script failed to run as expected.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UnknownError: The specified script did not run for an unknown
     *            reason.
     *            </p>
     *            </li>
     *            </ul>
     * @see LifecycleErrorCode
     */
    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode <p>
     *            The associated error code:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Success: The specified script ran.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptMissing: The specified script was not found in the
     *            specified location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptNotExecutable: The specified script is not a recognized
     *            executable file type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptTimedOut: The specified script did not finish running in
     *            the specified time period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptFailed: The specified script failed to run as expected.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UnknownError: The specified script did not run for an unknown
     *            reason.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleErrorCode
     */
    public Diagnostics withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode <p>
     *            The associated error code:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Success: The specified script ran.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptMissing: The specified script was not found in the
     *            specified location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptNotExecutable: The specified script is not a recognized
     *            executable file type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptTimedOut: The specified script did not finish running in
     *            the specified time period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptFailed: The specified script failed to run as expected.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UnknownError: The specified script did not run for an unknown
     *            reason.
     *            </p>
     *            </li>
     *            </ul>
     * @see LifecycleErrorCode
     */
    public void setErrorCode(LifecycleErrorCode errorCode) {
        this.errorCode = errorCode.toString();
    }

    /**
     * <p>
     * The associated error code:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Success: The specified script ran.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptMissing: The specified script was not found in the specified
     * location.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptNotExecutable: The specified script is not a recognized executable
     * file type.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptTimedOut: The specified script did not finish running in the
     * specified time period.
     * </p>
     * </li>
     * <li>
     * <p>
     * ScriptFailed: The specified script failed to run as expected.
     * </p>
     * </li>
     * <li>
     * <p>
     * UnknownError: The specified script did not run for an unknown reason.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Success, ScriptMissing, ScriptNotExecutable,
     * ScriptTimedOut, ScriptFailed, UnknownError
     *
     * @param errorCode <p>
     *            The associated error code:
     *            </p>
     *            <ul>
     *            <li>
     *            <p>
     *            Success: The specified script ran.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptMissing: The specified script was not found in the
     *            specified location.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptNotExecutable: The specified script is not a recognized
     *            executable file type.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptTimedOut: The specified script did not finish running in
     *            the specified time period.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            ScriptFailed: The specified script failed to run as expected.
     *            </p>
     *            </li>
     *            <li>
     *            <p>
     *            UnknownError: The specified script did not run for an unknown
     *            reason.
     *            </p>
     *            </li>
     *            </ul>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     * @see LifecycleErrorCode
     */
    public Diagnostics withErrorCode(LifecycleErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     *
     * @return <p>
     *         The name of the script.
     *         </p>
     */
    public String getScriptName() {
        return scriptName;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     *
     * @param scriptName <p>
     *            The name of the script.
     *            </p>
     */
    public void setScriptName(String scriptName) {
        this.scriptName = scriptName;
    }

    /**
     * <p>
     * The name of the script.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param scriptName <p>
     *            The name of the script.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Diagnostics withScriptName(String scriptName) {
        this.scriptName = scriptName;
        return this;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     *
     * @return <p>
     *         The message associated with the error.
     *         </p>
     */
    public String getMessage() {
        return message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     *
     * @param message <p>
     *            The message associated with the error.
     *            </p>
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * The message associated with the error.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param message <p>
     *            The message associated with the error.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Diagnostics withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the
     * diagnostic log.
     * </p>
     *
     * @return <p>
     *         The last portion of the diagnostic log.
     *         </p>
     *         <p>
     *         If available, AWS CodeDeploy returns up to the last 4 KB of the
     *         diagnostic log.
     *         </p>
     */
    public String getLogTail() {
        return logTail;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the
     * diagnostic log.
     * </p>
     *
     * @param logTail <p>
     *            The last portion of the diagnostic log.
     *            </p>
     *            <p>
     *            If available, AWS CodeDeploy returns up to the last 4 KB of
     *            the diagnostic log.
     *            </p>
     */
    public void setLogTail(String logTail) {
        this.logTail = logTail;
    }

    /**
     * <p>
     * The last portion of the diagnostic log.
     * </p>
     * <p>
     * If available, AWS CodeDeploy returns up to the last 4 KB of the
     * diagnostic log.
     * </p>
     * <p>
     * Returns a reference to this object so that method calls can be chained
     * together.
     *
     * @param logTail <p>
     *            The last portion of the diagnostic log.
     *            </p>
     *            <p>
     *            If available, AWS CodeDeploy returns up to the last 4 KB of
     *            the diagnostic log.
     *            </p>
     * @return A reference to this updated object so that method calls can be
     *         chained together.
     */
    public Diagnostics withLogTail(String logTail) {
        this.logTail = logTail;
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
            sb.append("errorCode: " + getErrorCode() + ",");
        if (getScriptName() != null)
            sb.append("scriptName: " + getScriptName() + ",");
        if (getMessage() != null)
            sb.append("message: " + getMessage() + ",");
        if (getLogTail() != null)
            sb.append("logTail: " + getLogTail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getScriptName() == null) ? 0 : getScriptName().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getLogTail() == null) ? 0 : getLogTail().hashCode());
        return hashCode;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Diagnostics == false)
            return false;
        Diagnostics other = (Diagnostics) obj;

        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null
                && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getScriptName() == null ^ this.getScriptName() == null)
            return false;
        if (other.getScriptName() != null
                && other.getScriptName().equals(this.getScriptName()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getLogTail() == null ^ this.getLogTail() == null)
            return false;
        if (other.getLogTail() != null && other.getLogTail().equals(this.getLogTail()) == false)
            return false;
        return true;
    }
}
