package it.proactivity.model;

import java.time.LocalDate;
import java.util.Objects;

public class Loan {

    private Long id;
    private LibraryItem item;
    private Client client;
    private LocalDate startLoan;
    private LocalDate endLoan;
    private Boolean safeLoan;
    private String notes;

    public Loan() {}

    public Loan(Long id, LibraryItem item, Client client, LocalDate startLoan, LocalDate endLoan, Boolean safeLoan,
                String notes) {
        this.id = id;
        this.item = item;
        this.client = client;
        this.startLoan = startLoan;
        this.endLoan = endLoan;
        this.safeLoan = safeLoan;
        this.notes = notes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LibraryItem getItem() {
        return item;
    }

    public void setItem(LibraryItem item) {
        this.item = item;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getStartLoan() {
        return startLoan;
    }

    public void setStartLoan(LocalDate startLoan) {
        this.startLoan = startLoan;
    }

    public LocalDate getEndLoan() {
        return endLoan;
    }

    public void setEndLoan(LocalDate endLoan) {
        this.endLoan = endLoan;
    }

    public Boolean getSafeLoan() {
        return safeLoan;
    }

    public void setSafeLoan(Boolean safeLoan) {
        this.safeLoan = safeLoan;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Loan loan = (Loan) o;
        return Objects.equals(id, loan.id) && Objects.equals(item, loan.item) && Objects.equals(client, loan.client)
                && Objects.equals(startLoan, loan.startLoan) && Objects.equals(endLoan, loan.endLoan)
                && Objects.equals(safeLoan, loan.safeLoan) && Objects.equals(notes, loan.notes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, item, client, startLoan, endLoan, safeLoan, notes);
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", item=" + item +
                ", client=" + client +
                ", startLoan=" + startLoan +
                ", endLoan=" + endLoan +
                ", safeLoan=" + safeLoan +
                ", notes='" + notes + '\'' +
                '}';
    }
}
