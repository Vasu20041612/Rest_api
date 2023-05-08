package org.crud.app.repository;

import org.crud.app.model.LoanApplicationModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanApplicationRepo extends JpaRepository<LoanApplicationModel, Integer> {

}
