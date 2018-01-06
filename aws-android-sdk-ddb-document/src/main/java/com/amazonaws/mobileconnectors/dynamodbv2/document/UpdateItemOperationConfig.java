
package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ReturnValue;

/**
 * Configuration for the Table.UpdateItem operation
 */
public class UpdateItemOperationConfig {

    // TODO: support conditional expressions

    private ReturnValue returnValue;

    /**
     * Flag specifying what values should be returned.
     *
     * @return Flag specifying what values should be returned.
     */
    public ReturnValue getReturnValue() {
        return returnValue;
    }

    /**
     * Flag specifying what values should be returned.
     *
     * @param returnValue Flag specifying what values should be returned.
     */
    public void setReturnValue(ReturnValue returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * Flag specifying what values should be returned.
     *
     * @param returnValue Flag specifying what values should be returned. See
     *            {@link ReturnValue}.
     * @return the current instance of {@link UpdateItemOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public UpdateItemOperationConfig withReturnValues(ReturnValue returnValue) {
        setReturnValue(returnValue);
        return this;
    }
}
