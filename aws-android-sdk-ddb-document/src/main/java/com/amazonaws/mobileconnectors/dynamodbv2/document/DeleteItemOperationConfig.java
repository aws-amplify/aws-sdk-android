package com.amazonaws.mobileconnectors.dynamodbv2.document;

import com.amazonaws.services.dynamodbv2.model.ReturnValue;

/**
 * Configuration for the Table.DeleteItem operation
 */
public class DeleteItemOperationConfig {
    // TODO: support conditional expressions

    private ReturnValue returnValue;

    /**
     * Flag specifying what values should be returned. DeleteItem only supports
     * ReturnValues.AllOldAttributes and ReturnValues.None
     *
     * @return {@link ReturnValue}.
     */
    public ReturnValue getReturnValue() {
        return returnValue;
    }

    /**
     * Flag specifying what values should be returned. DeleteItem only supports
     * ReturnValues.AllOldAttributes and ReturnValues.None .
     *
     * @param returnValue {@link ReturnValue}.
     */
    public void setReturnValue(ReturnValue returnValue) {
        this.returnValue = returnValue;
    }

    /**
     * Flag specifying what values should be returned. DeleteItem only supports
     * ReturnValues.AllOldAttributes and ReturnValues.None
     *
     * @param returnValue Flag specifying what values should be returned.
     * @return {@link DeleteItemOperationConfig}.
     */
    @SuppressWarnings("checkstyle:hiddenfield")
    public DeleteItemOperationConfig withReturnValues(ReturnValue returnValue) {
        setReturnValue(returnValue);
        return this;
    }
}
