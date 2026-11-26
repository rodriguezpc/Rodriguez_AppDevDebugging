package com.example.appdev_debugging.data;

import com.example.appdev_debugging.data.model.User;

public class UserRepository {
    /** @return the user with this email, or null if none exists. Email lookup is case-insensitive. */
    User findByEmail(String email);

    /** @return true if a user with this email already exists. */
    boolean exists(String email);

    /**
     * Adds a new user.
     * @return true if saved, false if a user with the same email already exists.
     */
    boolean add(User user);
}
