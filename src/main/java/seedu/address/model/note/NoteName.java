package seedu.address.model.note;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.util.AppUtil.checkArgument;

/**
 * Represents a Person's name in the UltiStudent.
 * Guarantees: immutable; is valid as declared in {@link #isValidNoteName(String)}
 */
public class NoteName {

    public static final String MESSAGE_CONSTRAINTS = "Note names should only "
            + "contain alphanumeric characters and spaces, and it should not be "
            + "blank";

    /*
     * The first character of the address must not be a whitespace,
     * otherwise " " (a blank string) becomes a valid input.
     */
    public static final String VALIDATION_REGEX = "[\\p{Alnum}][\\p{Alnum} ]*";

    public final String fullName;

    /**
     * Constructs a {@code Name}.
     *
     * @param name A valid name.
     */
    public NoteName(String name) {
        requireNonNull(name);
        checkArgument(isValidNoteName(name), MESSAGE_CONSTRAINTS);
        fullName = name;
    }

    /**
     * Returns true if a given string is a valid note name.
     */
    public static boolean isValidNoteName(String test) {
        return test.matches(VALIDATION_REGEX);
    }


    @Override
    public String toString() {
        return fullName;
    }

    @Override
    public boolean equals(Object other) {
        return other == this // short circuit if same object
                || (other instanceof NoteName // instanceof handles nulls
                && fullName.equals(((NoteName) other).fullName)); // state check
    }

    @Override
    public int hashCode() {
        return fullName.hashCode();
    }

}
