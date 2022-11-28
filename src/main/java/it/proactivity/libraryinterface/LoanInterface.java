package it.proactivity.libraryinterface;

import it.proactivity.model.Client;
import it.proactivity.model.LibraryItem;
import it.proactivity.model.Loan;

public interface LoanInterface {

    // method for initialize a loan
    Loan loanItem(Client client, LibraryItem item);

    // method for check status of item's copy
    Boolean checkItemAfterLoan(Loan loan);

    void finalizeLoan(Loan loan);
}


