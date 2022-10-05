package com.mytests.spring.data.mappedsuperclass.data;

import java.io.Serializable;

public interface EntityId<T> extends Serializable {

    /**
     * Returns the underlying value of the entity id
     *
     * @return the value
     */
    T getValue();

    /**
     * Returns the value as a String that is suitable for use in a URL for example.
     *
     * @return a nice String representation of the value (as opposed to {@link #toString()} that is for debugging)
     */
    String asString();
}
