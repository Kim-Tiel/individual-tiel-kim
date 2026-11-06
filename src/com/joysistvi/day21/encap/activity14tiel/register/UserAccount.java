package com.joysistvi.day21.encap.activity14tiel.register;

public class UserAccount {

    private String firstName;
    private String middleName;
    private String lastName;
    private String address;
    private String email;
    private String password;

    // ===================== CONSTRUCTOR =====================
    public UserAccount(String firstName, String middleName, String lastName, String address, String email, String password) {
        try {
            this.setFirstName(firstName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        this.setMiddleName(middleName);

        try {
            this.setLastName(lastName);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setAddress(address);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setEmail(email);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            this.setPassword(password);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty()) {
            throw new IllegalArgumentException("First name is required.");
        }
        this.firstName = firstName;
    }

    // Middle name is optional, so empty is allowed
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty()) {
            throw new IllegalArgumentException("Last name is required.");
        }
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        if (address.isEmpty()) {
            throw new IllegalArgumentException("Address is required.");
        }
        this.address = address;
    }

    // Email rules:
    //   - no spaces
    //   - has exactly one @, not at the start
    //   - has a dot after the @, with at least one character in between
    //   - does not end with a dot
    public void setEmail(String email) {
        if (email.isEmpty()) {
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

        this.email = email;
    }

    // Password rules:
    //   - at least 8 characters
    //   - no spaces
    //   - at least 1 uppercase, 1 lowercase, 1 number, 1 special character
    public void setPassword(String password) {
        if (password.length() < 8) {
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

        this.password = password;
    }

    // Joins first, middle, and last name
    public String getFullName() {
        if (middleName.isEmpty()) {
            return firstName + " " + lastName;
        }
        return firstName + " " + middleName + " " + lastName;
    }

    // Returns true only if all required fields passed validation
    public boolean isValid() {
        return firstName != null && lastName != null && address != null && email != null && password != null;
    }

    // ===================== toString =====================
    @Override
    public String toString() {
        return "Full Name: " + getFullName() + "\n"
                + "Email: " + email + "\n"
                + "Address: " + address;
    }
}