package seedu.ultistudent.model;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import seedu.ultistudent.model.cap.CapEntry;
import seedu.ultistudent.model.cap.ModuleSemester;
import seedu.ultistudent.model.homework.Homework;
import seedu.ultistudent.model.modulecode.ModuleCode;
import seedu.ultistudent.model.note.Note;
import seedu.ultistudent.model.person.Person;

/**
 * Unmodifiable view of an UltiStudent
 */
public interface ReadOnlyUltiStudent extends Observable {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

    /**
     * Returns an unmodifiable view of the cap entries list.
     * This list will not contain any duplicate cap entries.
     */
    ObservableList<CapEntry> getCapEntryList();

    /**
     * Returns an unmodifiable view of the module semesters list.
     * This list will not contain any duplicate module semesters.
     */
    ObservableList<ModuleSemester> getModuleSemesterList();

    /**
     * Returns an unmodifiable view of the homework list.
     * This list will not contain any duplicate homework.
     */
    ObservableList<Homework> getHomeworkList();

    /**
     * Returns an unmodifiable view of the homework list.
     * This list will not contain any duplicate homework.
     */
    ObservableList<Note> getNoteList();

    /**
     * Returns an unmodifiable view of the module code list.
     * This list will not contain any duplicate module code.
     */
    ObservableList<ModuleCode> getModuleCodeList();

}
