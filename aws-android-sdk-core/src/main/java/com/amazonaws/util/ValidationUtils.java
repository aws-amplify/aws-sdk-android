package com.amazonaws.util;

import java.util.Collection;

public class ValidationUtils {
    /**
     * Asserts that the given object is non-null and returns it.
     *
     * @param object Object to assert on
     * @param fieldName Field name to display in exception message if null
     * @return Object if non null
     * @throws IllegalArgumentException If object was null
     */
    public static <T> T assertNotNull(T object, String fieldName) throws IllegalArgumentException {
        if (object == null) {
            throw new IllegalArgumentException(String.format("%s cannot be null", fieldName));
        }
        return object;
    }

    /**
     * <p>
     * Asserts that the specified parameter value is not <code>null</code> and
     * if it is, throws an <code>IllegalArgumentException</code> with the
     * specified error message.
     * </p>
     *
     * @param parameterValue The parameter value being checked.
     * @param errorMessage The error message to include in the
     *            IllegalArgumentException if the specified parameter is null.
     */
    public static void assertParameterNotNull(Object parameterValue, String errorMessage) {
        if (parameterValue == null) {
            throw new IllegalArgumentException(errorMessage);
        }
    }

    /**
     * Asserts that all of the objects are null.
     *
     * @throws IllegalArgumentException if any object provided was NOT null.
     */
    public static void assertAllAreNull(String messageIfNull, Object... objects)
            throws IllegalArgumentException {
        for (final Object object : objects) {
            if (object != null) {
                throw new IllegalArgumentException(messageIfNull);
            }
        }
    }

    /**
     * Asserts that the given number is positive (non-negative and non-zero).
     *
     * @param num Number to validate
     * @param fieldName Field name to display in exception message if not
     *            positive.
     * @return Number if positive.
     */
    public static int assertIsPositive(int num, String fieldName) {
        if (num <= 0) {
            throw new IllegalArgumentException(String.format("%s must be positive", fieldName));
        }
        return num;
    }

    public static <T extends Collection<?>> T assertNotEmpty(T collection, String fieldName)
            throws IllegalArgumentException {
        assertNotNull(collection, fieldName);
        if (collection.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return collection;
    }

    public static <T> T[] assertNotEmpty(T[] array, String fieldName)
            throws IllegalArgumentException {
        assertNotNull(array, fieldName);
        if (array.length == 0) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return array;
    }

    public static String assertStringNotEmpty(String string, String fieldName)
            throws IllegalArgumentException {
        assertNotNull(string, fieldName);
        if (string.isEmpty()) {
            throw new IllegalArgumentException(String.format("%s cannot be empty", fieldName));
        }
        return string;
    }
}
