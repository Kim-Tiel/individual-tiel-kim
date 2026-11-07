package com.joysistvi.day21.encap.activity14tiel.register;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // ===================== CONSTRUCTOR =====================
    public UserAccount(String firstName, String middleName, String lastName,
                       String address, String email, String password) {
        this.firstName = validateEmpty(firstName, "First name");
        this.middleName = middleName == null ? "" : middleName.trim();
        this.lastName = validateEmpty(lastName, "Last name");
        this.address = validateEmpty(address, "Address");
        this.email = validateEmail(email);
        this.password = validatePassword(password);
    }

    // ===================== VALIDATION =====================
    // Used for first name, last name, and address
    public static String validateEmpty(String value, String label) {
        if (value == null || value.trim().isEmpty()) {
            throw new IllegalArgumentException(label + " is required.");
        }
        return value.trim();
    }

    // Email rules:
    //   - no spaces
    //   - has exactly one @, not at the start
    //   - has a dot after the @, with at least one character in between
    //   - does not end with a dot
    public static String validateEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email is required.");
        }

        if (email.contains(" ")) {
            throw new IllegalArgumentException("Email must not contain spaces.");
        }

        int atIndex = email.indexOf('@');

        if (atIndex == -1) {
            throw new IllegalArgumentException("Email must contain an @ symbol.");
        }

        if (atIndex == 0) {
            throw new IllegalArgumentException("Email must have a name before the @ symbol.");
        }

        if (atIndex != email.lastIndexOf('@')) {
            throw new IllegalArgumentException("Email must have only one @ symbol.");
        }

        int dotIndex = email.lastIndexOf('.');

        if (dotIndex < atIndex + 2) {
            throw new IllegalArgumentException("Email must have a domain, like @gmail.com.");
        }

        if (dotIndex == email.length() - 1) {
            throw new IllegalArgumentException("Email must not end with a dot.");
        }

        return email;
    }

    // Password rules:
    //   - at least 8 characters
    //   - no spaces
    //   - at least 1 uppercase, 1 lowercase, 1 number, 1 special character
    public static String validatePassword(String password) {
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters.");
        }

        if (password.contains(" ")) {
            throw new IllegalArgumentException("Password must not contain spaces.");
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);

            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else {
                hasSpecial = true;
            }
        }

        if (!hasUpper) {
            throw new IllegalArgumentException("Password must have at least 1 uppercase letter.");
        }

        if (!hasLower) {
            throw new IllegalArgumentException("Password must have at least 1 lowercase letter.");
        }

        if (!hasDigit) {
            throw new IllegalArgumentException("Password must have at least 1 number.");
        }

        if (!hasSpecial) {
            throw new IllegalArgumentException("Password must have at least 1 special character (e.g. @, #, !).");
        }

        return password;
    }

    // Joins first, middle, and last name
    public String getFullName() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    // ===================== toString =====================
    @Override
    public String toString() {
        return "Full Name: " + getFullName() + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }
}