
package com.amazonaws.mobileconnectors.pinpoint.internal.core.util;

import org.junit.Test;

public class PreconditionsTest {

    private static Object msgObject = new Object() {

        @Override
        public String toString() {
            return "msgObject1";
        }

    };

    @Test
    public void testCheckArguments() {
        Preconditions.checkArgument(true);
        Preconditions.checkArgument(true, msgObject);
        Preconditions.checkArgument(true, "one %s two %s", msgObject, msgObject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseCheckArguments() {
        Preconditions.checkArgument(false);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseCheckArgumentsSingleMsg() {
        Preconditions.checkArgument(false, msgObject);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testFalseCheckArgumentsMultiMessage() {
        Preconditions.checkArgument(false, "one %s two %s", msgObject, msgObject);
    }

    @Test
    public void testCheckElementIndexs() {
        Preconditions.checkElementIndex(5, 10);
        Preconditions.checkElementIndex(5, 10, "msg");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFalseCheckElementIndexs() {
        Preconditions.checkElementIndex(15, 10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFalseCheckElementIndexsWithMessage() {
        Preconditions.checkElementIndex(15, 10, "msg");
    }

    @Test
    public void testNotNulls() {
        Preconditions.checkNotNull(msgObject);
        Preconditions.checkNotNull(msgObject, msgObject);
        Preconditions.checkNotNull(msgObject, "one %s two%s", msgObject, msgObject);
    }

    @Test(expected = NullPointerException.class)
    public void testFalseNotNull() {
        Preconditions.checkNotNull(null);
    }

    @Test(expected = NullPointerException.class)
    public void testFalseNotNullSingleMessage() {
        Preconditions.checkNotNull(null, msgObject);
    }

    @Test(expected = NullPointerException.class)
    public void testFalseNotNullMultiMessage() {
        Preconditions.checkNotNull(null, "one %s two%s", msgObject, msgObject);
    }

    @Test
    public void testCheckPositionsIndex() {
        Preconditions.checkPositionIndex(5, 10);
        Preconditions.checkPositionIndex(5, 10, "true");
        Preconditions.checkPositionIndexes(5, 7, 10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFalseCheckPositionsIndex() {
        Preconditions.checkPositionIndex(15, 10);
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFalseCheckPositionsIndexWithMessage() {
        Preconditions.checkPositionIndex(15, 10, "false");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testFalseCheckPositionsIndexWithWrongStartAndEnd() {
        Preconditions.checkPositionIndexes(3, 1, 10);
    }

    @Test
    public void testStates() {
        Preconditions.checkState(true);
        Preconditions.checkState(true, "msg");
        Preconditions.checkState(true, " one %s two %s", msgObject, msgObject);
    }

    @Test(expected = IllegalStateException.class)
    public void testFalseState() {
        Preconditions.checkState(false);
    }

    @Test(expected = IllegalStateException.class)
    public void testFalseStateSingleMessage() {
        Preconditions.checkState(false, "msg");
    }

    @Test(expected = IllegalStateException.class)
    public void testFalseStateMultiMessage() {
        Preconditions.checkState(false, " one %s two %s", msgObject, msgObject);
    }

}
